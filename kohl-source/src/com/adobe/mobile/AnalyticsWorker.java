// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import java.io.File;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.adobe.mobile:
//            AbstractDatabaseBacking, StaticMethods, MobileConfig, ReferrerHandler, 
//            MobilePrivacyStatus, RequestHandler

final class AnalyticsWorker extends AbstractDatabaseBacking
{
    protected static class Hit
    {

        String identifier;
        long timestamp;
        String urlFragment;

        protected Hit()
        {
        }
    }

    protected class ReferrerTimeoutTask extends TimerTask
    {

        private boolean kickFlag;
        final AnalyticsWorker this$0;

        public void run()
        {
            ReferrerHandler.setReferrerProcessed(true);
            StaticMethods.logDebugFormat("Analytics - Referrer timeout has expired without referrer data", new Object[0]);
            kick(kickFlag);
        }

        ReferrerTimeoutTask(boolean flag)
        {
            this$0 = AnalyticsWorker.this;
            super();
            kickFlag = false;
            kickFlag = flag;
        }
    }

    private static class WorkerThreadRunner
        implements Runnable
    {

        public void run()
        {
            AnalyticsWorker analyticsworker;
            HashMap hashmap;
            analyticsworker = AnalyticsWorker.sharedInstance();
            Process.setThreadPriority(10);
            hashmap = new HashMap();
            hashmap.put("Accept-Language", StaticMethods.getDefaultAcceptLanguage());
            hashmap.put("User-Agent", StaticMethods.getDefaultUserAgent());
_L9:
            if (MobileConfig.getInstance().getPrivacyStatus() != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN || !AnalyticsWorker.networkAvailable) goto _L2; else goto _L1
_L1:
            Hit hit = analyticsworker.getFirstHitInQueue();
            if (hit != null) goto _L3; else goto _L2
_L2:
            AnalyticsWorker.bgThreadActive = false;
            return;
_L3:
            String s1;
            String s3;
            if (MobileConfig.getInstance().getOfflineTrackingEnabled())
            {
                if (hit.timestamp - analyticsworker.lastHitTimestamp < 0L)
                {
                    long l = analyticsworker.lastHitTimestamp + 1L;
                    String s = (new StringBuilder()).append("&ts=").append(Long.toString(hit.timestamp)).toString();
                    String s2 = (new StringBuilder()).append("&ts=").append(Long.toString(l)).toString();
                    hit.urlFragment = hit.urlFragment.replaceFirst(s, s2);
                    StaticMethods.logDebugFormat("Analytics - Adjusting out of order hit timestamp(%d->%d)", new Object[] {
                        Long.valueOf(hit.timestamp), Long.valueOf(l)
                    });
                    hit.timestamp = l;
                }
            } else
            if (hit.timestamp < StaticMethods.getTimeSince1970() - 60L)
            {
                try
                {
                    analyticsworker.deleteHit(hit.identifier);
                }
                catch (AbstractDatabaseBacking.CorruptedDatabaseException corrupteddatabaseexception)
                {
                    AnalyticsWorker.sharedInstance().resetDatabase(corrupteddatabaseexception);
                    continue; /* Loop/switch isn't completed */
                }
                continue; /* Loop/switch isn't completed */
            }
            s3 = hit.urlFragment;
            s1 = s3;
            if (!s3.startsWith("ndh"))
            {
                s1 = s3.substring(s3.indexOf('?') + 1);
            }
            if (RequestHandler.sendAnalyticsRequest((new StringBuilder()).append(AnalyticsWorker.getBaseURL()).append(AnalyticsWorker.randomGen.nextInt(0x5f5e100)).toString(), s1, hashmap, 5000))
            {
                try
                {
                    analyticsworker.deleteHit(hit.identifier);
                }
                catch (AbstractDatabaseBacking.CorruptedDatabaseException corrupteddatabaseexception1)
                {
                    AnalyticsWorker.sharedInstance().resetDatabase(corrupteddatabaseexception1);
                    continue; /* Loop/switch isn't completed */
                }
                analyticsworker.lastHitTimestamp = hit.timestamp;
                continue; /* Loop/switch isn't completed */
            }
            StaticMethods.logWarningFormat("Analytics - Unable to send hit", new Object[0]);
            if (!MobileConfig.getInstance().getOfflineTrackingEnabled()) goto _L5; else goto _L4
_L4:
            int i;
            StaticMethods.logDebugFormat("Analytics - Network error, imposing internal cooldown(%d seconds)", new Object[] {
                Long.valueOf(30L)
            });
            i = 0;
_L6:
            if ((long)i >= 30L)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!AnalyticsWorker.networkAvailable)
            {
                continue; /* Loop/switch isn't completed */
            }
            Thread.sleep(1000L);
            i++;
            if (true) goto _L6; else goto _L5
_L5:
            try
            {
                analyticsworker.deleteHit(hit.identifier);
                continue; /* Loop/switch isn't completed */
            }
            catch (AbstractDatabaseBacking.CorruptedDatabaseException corrupteddatabaseexception2)
            {
                AnalyticsWorker.sharedInstance().resetDatabase(corrupteddatabaseexception2);
            }
            if (true) goto _L2; else goto _L7
_L7:
            Exception exception;
            exception;
            StaticMethods.logWarningFormat("Analytics - Background Thread Interrupted(%s)", new Object[] {
                exception.getMessage()
            });
            if (true) goto _L9; else goto _L8
_L8:
        }

        private WorkerThreadRunner()
        {
        }

    }


    private static final int CONNECTION_TIMEOUT_MSEC = 5000;
    private static final int TIMESTAMP_DISABLED_WAIT_THRESHOLD = 60;
    private static AnalyticsWorker _instance = null;
    private static final Object _instanceMutex = new Object();
    private static volatile boolean analyticsGetBaseURL_pred = true;
    private static final Object backgroundMutex = new Object();
    private static String baseURL;
    private static boolean bgThreadActive = false;
    private static boolean networkAvailable = false;
    private static final SecureRandom randomGen = new SecureRandom();
    private static final Object referrerTimerMutex = new Object();
    private SQLiteStatement _preparedInsertStatement;
    private long lastHitTimestamp;
    private long numberOfUnsentHits;
    private TimerTask referrerTask;
    private Timer referrerTimer;

    protected AnalyticsWorker()
    {
        _preparedInsertStatement = null;
        lastHitTimestamp = 0L;
        initDatabaseBacking(new File(StaticMethods.getCacheDirectory(), "ADBMobileDataCache.sqlite"));
        startNotifier();
        numberOfUnsentHits = getTrackingQueueSize();
    }

    private void bringOnline()
    {
        if (!bgThreadActive)
        {
            bgThreadActive = true;
            synchronized (backgroundMutex)
            {
                (new Thread(new WorkerThreadRunner())).start();
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void deleteHit(String s)
        throws AbstractDatabaseBacking.CorruptedDatabaseException
    {
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logDebugFormat("Analytics - Unable to delete hit due to an invalid parameter", new Object[0]);
            return;
        }
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        database.delete("HITS", (new StringBuilder()).append("ID=").append(s).toString(), null);
        numberOfUnsentHits = numberOfUnsentHits - 1L;
_L1:
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        StaticMethods.logErrorFormat("Analytics - Unable to delete hit due to an unopened database (%s)", new Object[] {
            s.getLocalizedMessage()
        });
          goto _L1
        s;
        StaticMethods.logErrorFormat("Analytics - Unable to delete hit due to a sql error (%s)", new Object[] {
            s.getLocalizedMessage()
        });
        throw new AbstractDatabaseBacking.CorruptedDatabaseException((new StringBuilder()).append("Unable to delete, database probably corrupted (").append(s.getLocalizedMessage()).append(")").toString());
        s;
        StaticMethods.logErrorFormat("Analytics - Unable to delete hit due to an unexpected error (%s)", new Object[] {
            s.getLocalizedMessage()
        });
        throw new AbstractDatabaseBacking.CorruptedDatabaseException((new StringBuilder()).append("Unexpected exception, database probably corrupted (").append(s.getLocalizedMessage()).append(")").toString());
    }

    private static String getBaseURL()
    {
        if (analyticsGetBaseURL_pred)
        {
            analyticsGetBaseURL_pred = false;
            StringBuilder stringbuilder = new StringBuilder();
            String s;
            if (MobileConfig.getInstance().getSSL())
            {
                s = "https://";
            } else
            {
                s = "http://";
            }
            baseURL = stringbuilder.append(s).append(MobileConfig.getInstance().getTrackingServer()).append("/b/ss/").append(StaticMethods.URLEncode(MobileConfig.getInstance().getReportSuiteIds())).append("/0/JAVA-").append("4.4.1-AN").append("/s").toString();
            StaticMethods.logDebugFormat("Analytics - Setting base request URL(%s)", new Object[] {
                baseURL
            });
        }
        return baseURL;
    }

    private Hit getFirstHitInQueue()
    {
        Object obj4;
        Object obj5;
        Object obj6;
        obj5 = null;
        obj6 = null;
        obj4 = null;
        Object obj7 = dbMutex;
        obj7;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj1 = null;
        obj2 = null;
        Object obj = database.query("HITS", new String[] {
            "ID", "URL", "TIMESTAMP"
        }, null, null, null, null, "ID ASC", "1");
        obj2 = obj;
        obj3 = obj;
        obj1 = obj;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj2 = obj;
        obj3 = obj;
        obj1 = obj;
        obj4 = new Hit();
        obj4.identifier = ((Cursor) (obj)).getString(0);
        obj4.urlFragment = ((Cursor) (obj)).getString(1);
        obj4.timestamp = ((Cursor) (obj)).getLong(2);
        obj1 = obj4;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        ((Cursor) (obj)).close();
        obj1 = obj4;
_L2:
        obj7;
        JVM INSTR monitorexit ;
        return ((Hit) (obj1));
        obj4;
        obj3 = obj5;
        obj = obj2;
_L6:
        obj1 = obj;
        StaticMethods.logErrorFormat("Analytics - Unable to read from database (%s)", new Object[] {
            ((SQLException) (obj4)).getMessage()
        });
        obj1 = obj3;
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
        obj1 = obj3;
          goto _L2
        obj;
        obj7;
        JVM INSTR monitorexit ;
        throw obj;
        obj4;
        obj2 = obj6;
        obj = obj3;
_L5:
        obj1 = obj;
        StaticMethods.logErrorFormat("Analytics - Unknown error reading from database (%s)", new Object[] {
            ((Exception) (obj4)).getMessage()
        });
        obj1 = obj2;
        if (obj == null) goto _L2; else goto _L3
_L3:
        ((Cursor) (obj)).close();
        obj1 = obj2;
          goto _L2
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        ((Cursor) (obj)).close();
        Exception exception;
        throw exception;
        exception;
          goto _L4
        obj1;
        exception = ((Exception) (obj4));
        obj4 = obj1;
          goto _L5
        obj1;
        obj3 = obj4;
        obj4 = obj1;
          goto _L6
        exception;
        obj = obj1;
          goto _L4
    }

    protected static boolean networkConnectivity(Context context)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = true;
        flag = true;
        flag3 = true;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        flag1 = flag3;
        flag2 = flag4;
        flag = flag5;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        flag1 = flag3;
        flag2 = flag4;
        flag = flag5;
        context = context.getActiveNetworkInfo();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        flag1 = flag3;
        flag2 = flag4;
        flag = flag5;
        if (!context.isAvailable())
        {
            break MISSING_BLOCK_LABEL_190;
        }
        flag1 = flag3;
        flag2 = flag4;
        flag = flag5;
        if (context.isConnected())
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_190;
        flag2 = false;
        flag = false;
        flag1 = false;
        StaticMethods.logWarningFormat("Analytics - Unable to determine connectivity status due to there being no default network currently active", new Object[0]);
        return false;
        context;
        StaticMethods.logWarningFormat("Analytics - Unable to determine connectivity status due to an unexpected error (%s)", new Object[] {
            context.getLocalizedMessage()
        });
        return flag1;
        flag1 = flag3;
        flag2 = flag4;
        flag = flag5;
        StaticMethods.logWarningFormat("Analytics - Unable to determine connectivity status due to the system service requested being unrecognized", new Object[0]);
        return true;
        context;
        StaticMethods.logErrorFormat("Analytics - Unable to access connectivity status due to a security error (%s)", new Object[] {
            context.getLocalizedMessage()
        });
        return flag2;
        context;
        StaticMethods.logWarningFormat("Analytics - Unable to access connectivity status due to an unexpected error (%s)", new Object[] {
            context.getLocalizedMessage()
        });
        return flag;
        return false;
    }

    public static AnalyticsWorker sharedInstance()
    {
        AnalyticsWorker analyticsworker;
        synchronized (_instanceMutex)
        {
            if (_instance == null)
            {
                _instance = new AnalyticsWorker();
            }
            analyticsworker = _instance;
        }
        return analyticsworker;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void updateHitInDatabase(Hit hit)
    {
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("URL", hit.urlFragment);
        database.update("HITS", contentvalues, (new StringBuilder()).append("id=").append(hit.identifier).toString(), null);
_L1:
        return;
        hit;
        StaticMethods.logErrorFormat("Analytics - Unable to update url in database (%s)", new Object[] {
            hit.getMessage()
        });
          goto _L1
        hit;
        obj;
        JVM INSTR monitorexit ;
        throw hit;
        hit;
        StaticMethods.logErrorFormat("Analytics - Unknown error updating url in database (%s)", new Object[] {
            hit.getMessage()
        });
          goto _L1
    }

    protected void clearTrackingQueue()
    {
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        database.delete("HITS", null, null);
        numberOfUnsentHits = 0L;
_L1:
        return;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to clear tracking queue due to an unopened database (%s)", new Object[] {
            ((NullPointerException) (obj1)).getLocalizedMessage()
        });
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to clear tracking queue due to a sql error (%s)", new Object[] {
            ((SQLException) (obj1)).getLocalizedMessage()
        });
          goto _L1
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to clear tracking queue due to an unexpected error (%s)", new Object[] {
            ((Exception) (obj1)).getLocalizedMessage()
        });
          goto _L1
    }

    protected void forceKick()
    {
        kick(true);
    }

    protected long getTrackingQueueSize()
    {
        long l = 0L;
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        long l1 = DatabaseUtils.queryNumEntries(database, "HITS");
        l = l1;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return l;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to get tracking queue size due to an unopened database (%s)", new Object[] {
            ((NullPointerException) (obj1)).getLocalizedMessage()
        });
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to get tracking queue size due to a sql error (%s)", new Object[] {
            ((SQLException) (obj1)).getLocalizedMessage()
        });
          goto _L1
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to get tracking queue size due to an unexpected error (%s)", new Object[] {
            ((Exception) (obj1)).getLocalizedMessage()
        });
          goto _L1
    }

    protected void initializeDatabase()
    {
        try
        {
            database.execSQL("CREATE TABLE IF NOT EXISTS HITS (ID INTEGER PRIMARY KEY AUTOINCREMENT, URL TEXT, TIMESTAMP INTEGER)");
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to create database due to an invalid path (%s)", new Object[] {
                nullpointerexception.getLocalizedMessage()
            });
            return;
        }
        catch (SQLException sqlexception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to create database due to a sql error (%s)", new Object[] {
                sqlexception.getLocalizedMessage()
            });
            return;
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to create database due to an unexpected error (%s)", new Object[] {
                exception.getLocalizedMessage()
            });
        }
    }

    protected void kick(boolean flag)
    {
        Object obj1;
        boolean flag1;
        flag1 = false;
        obj1 = MobileConfig.getInstance();
        if (ReferrerHandler.getReferrerProcessed() || ((MobileConfig) (obj1)).getReferrerTimeout() <= 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        Object obj = referrerTimerMutex;
        obj;
        JVM INSTR monitorenter ;
        obj1 = referrerTask;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        referrerTask = new ReferrerTimeoutTask(flag);
        referrerTimer = new Timer();
        referrerTimer.schedule(referrerTask, MobileConfig.getInstance().getReferrerTimeout() * 1000);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Error creating referrer timer (%s)", new Object[] {
            ((Exception) (obj1)).getMessage()
        });
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (referrerTimer == null) goto _L3; else goto _L2
_L2:
        obj = referrerTimerMutex;
        obj;
        JVM INSTR monitorenter ;
        referrerTimer.cancel();
_L4:
        referrerTask = null;
_L3:
        if (((MobileConfig) (obj1)).getPrivacyStatus() == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN)
        {
            if (!((MobileConfig) (obj1)).getOfflineTrackingEnabled() || numberOfUnsentHits > (long)((MobileConfig) (obj1)).getBatchLimit())
            {
                flag1 = true;
            }
            if (flag1 || flag)
            {
                bringOnline();
                return;
            }
        }
        break MISSING_BLOCK_LABEL_212;
        Exception exception1;
        exception1;
        StaticMethods.logErrorFormat("Analytics - Error cancelling referrer timer (%s)", new Object[] {
            exception1.getMessage()
        });
          goto _L4
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void kickWithReferrerData(Map map)
    {
        Hit hit = getFirstHitInQueue();
        if (hit != null && hit.urlFragment != null)
        {
            StringBuilder stringbuilder = new StringBuilder(hit.urlFragment);
            StaticMethods.serializeToQueryString(map, stringbuilder);
            hit.urlFragment = stringbuilder.toString();
            updateHitInDatabase(hit);
            ReferrerHandler.setReferrerProcessed(true);
        }
        kick(false);
    }

    protected void postReset()
    {
        numberOfUnsentHits = 0L;
    }

    protected void preMigrate()
    {
        File file;
        File file1;
        file = new File((new StringBuilder()).append(StaticMethods.getCacheDirectory()).append("ADBMobileDataCache.sqlite").toString());
        file1 = new File(StaticMethods.getCacheDirectory(), "ADBMobileDataCache.sqlite");
        if (!file.exists() || file1.exists())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (!file.renameTo(file1))
        {
            StaticMethods.logWarningFormat("Analytics - Unable to migrate old hits db, creating new hits db (move file returned false)", new Object[0]);
        }
        return;
        Exception exception;
        exception;
        StaticMethods.logWarningFormat("Analytics - Unable to migrate old hits db, creating new hits db (%s)", new Object[] {
            exception.getLocalizedMessage()
        });
        return;
    }

    protected void prepareStatements()
    {
        try
        {
            _preparedInsertStatement = database.compileStatement("INSERT INTO HITS (URL, TIMESTAMP) VALUES (?, ?)");
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to create database due to an invalid path (%s)", new Object[] {
                nullpointerexception.getLocalizedMessage()
            });
            return;
        }
        catch (SQLException sqlexception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to create database due to a sql error (%s)", new Object[] {
                sqlexception.getLocalizedMessage()
            });
            return;
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to create database due to an unexpected error (%s)", new Object[] {
                exception.getLocalizedMessage()
            });
        }
    }

    protected void queue(String s, long l)
    {
        MobileConfig mobileconfig = MobileConfig.getInstance();
        if (mobileconfig == null)
        {
            StaticMethods.logErrorFormat("Analytics - Cannot send hit, MobileConfig is null (this really shouldn't happen)", new Object[0]);
            return;
        }
        if (mobileconfig.getPrivacyStatus() == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT)
        {
            StaticMethods.logDebugFormat("Analytics - Ignoring hit due to privacy status being opted out", new Object[0]);
            return;
        }
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        _preparedInsertStatement.bindString(1, s);
        _preparedInsertStatement.bindLong(2, l);
        _preparedInsertStatement.execute();
        StaticMethods.updateLastKnownTimestamp(Long.valueOf(l));
        numberOfUnsentHits = numberOfUnsentHits + 1L;
        _preparedInsertStatement.clearBindings();
_L1:
        kick(false);
        return;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to insert url (%s)", new Object[] {
            s
        });
        resetDatabase(((Exception) (obj1)));
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unknown error while inserting url (%s)", new Object[] {
            s
        });
        resetDatabase(((Exception) (obj1)));
          goto _L1
    }

    protected void startNotifier()
    {
        Context context;
        IntentFilter intentfilter;
        intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        context = null;
        Context context1 = StaticMethods.getSharedContext().getApplicationContext();
        context = context1;
_L1:
        StaticMethods.NullContextException nullcontextexception;
        if (context == null)
        {
            return;
        } else
        {
            context.registerReceiver(new BroadcastReceiver() {

                final AnalyticsWorker this$0;

                public void onReceive(Context context2, Intent intent)
                {
                    AnalyticsWorker.networkAvailable = AnalyticsWorker.networkConnectivity(context2);
                    if (AnalyticsWorker.networkAvailable)
                    {
                        StaticMethods.logDebugFormat("Analytics - Network status changed (reachable)", new Object[0]);
                        AnalyticsWorker.sharedInstance().kick(false);
                        return;
                    } else
                    {
                        StaticMethods.logDebugFormat("Analytics - Network status changed (unreachable)", new Object[0]);
                        return;
                    }
                }

            
            {
                this$0 = AnalyticsWorker.this;
                super();
            }
            }, intentfilter);
            return;
        }
        nullcontextexception;
        StaticMethods.logErrorFormat("Analytics - Error registering network receiver (%s)", new Object[] {
            nullcontextexception.getMessage()
        });
          goto _L1
    }




/*
    static boolean access$002(boolean flag)
    {
        networkAvailable = flag;
        return flag;
    }

*/




/*
    static long access$202(AnalyticsWorker analyticsworker, long l)
    {
        analyticsworker.lastHitTimestamp = l;
        return l;
    }

*/





/*
    static boolean access$602(boolean flag)
    {
        bgThreadActive = flag;
        return flag;
    }

*/
}
