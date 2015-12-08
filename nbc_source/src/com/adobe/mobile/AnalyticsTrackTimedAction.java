// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            AbstractDatabaseBacking, StaticMethods, AnalyticsTimedAction, AnalyticsTrackAction

final class AnalyticsTrackTimedAction extends AbstractDatabaseBacking
{

    private static final String TIMED_ACTION_IN_APP_TIME_KEY = "a.action.time.inapp";
    private static final String TIMED_ACTION_TOTAL_TIME_KEY = "a.action.time.total";
    private static AnalyticsTrackTimedAction _instance = null;
    private static final Object _instanceMutex = new Object();
    private SQLiteStatement sqlDeleteAction;
    private SQLiteStatement sqlDeleteContextDataForAction;
    private String sqlExistsAction;
    private String sqlExistsContextDataByActionAndKey;
    private SQLiteStatement sqlInsertAction;
    private SQLiteStatement sqlInsertContextData;
    private String sqlSelectAction;
    private String sqlSelectContextDataForAction;
    private SQLiteStatement sqlUpdateAction;
    private SQLiteStatement sqlUpdateActionsClearAdjustedTime;
    private SQLiteStatement sqlUpdateContextData;

    private AnalyticsTrackTimedAction()
    {
        initDatabaseBacking(new File(StaticMethods.getCacheDirectory(), "ADBMobileTimedActionsCache.sqlite"));
    }

    private void deleteTimedAction(int i)
    {
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        sqlDeleteContextDataForAction.bindLong(1, i);
        sqlDeleteContextDataForAction.execute();
        sqlDeleteAction.bindLong(1, i);
        sqlDeleteAction.execute();
        sqlDeleteContextDataForAction.clearBindings();
        sqlDeleteAction.clearBindings();
_L1:
        return;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to delete the timed action (ID = %d, Exception: %s)", new Object[] {
            Integer.valueOf(i), ((SQLException) (obj1)).getMessage()
        });
        resetDatabase(((Exception) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unknown error deleting timed action (%s)", new Object[] {
            ((Exception) (obj1)).getMessage()
        });
          goto _L1
    }

    private AnalyticsTimedAction getTimedAction(String s)
    {
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to get timed action (timed action name was null or empty)", new Object[0]);
            return null;
        }
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        if (database == null)
        {
            return null;
        }
          goto _L1
        s;
_L11:
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L1:
        Cursor cursor = database.rawQuery(sqlSelectAction, new String[] {
            s
        });
        if (!cursor.moveToFirst()) goto _L3; else goto _L2
_L2:
        s = new AnalyticsTimedAction(null, cursor.getLong(1), cursor.getLong(2), cursor.getInt(0));
        String s1;
        String s2;
        s1 = s;
        s2 = s;
        Cursor cursor1 = database.rawQuery(sqlSelectContextDataForAction, new String[] {
            String.valueOf(((AnalyticsTimedAction) (s)).databaseID)
        });
        s1 = s;
        s2 = s;
        if (!cursor1.moveToFirst()) goto _L5; else goto _L4
_L4:
        s1 = s;
        s2 = s;
        s.contextData = new HashMap();
_L6:
        s1 = s;
        s2 = s;
        ((AnalyticsTimedAction) (s)).contextData.put(cursor1.getString(0), cursor1.getString(1));
        s1 = s;
        s2 = s;
        if (cursor1.moveToNext()) goto _L6; else goto _L5
_L5:
        s1 = s;
        s2 = s;
        cursor1.close();
_L10:
        s1 = s;
        s2 = s;
        cursor.close();
_L7:
        obj;
        JVM INSTR monitorexit ;
        return s;
_L9:
        StaticMethods.logErrorFormat("Analytics - Unable to read from timed actions database (%s)", new Object[] {
            s.getMessage()
        });
        resetDatabase(s);
        s = s2;
          goto _L7
_L8:
        StaticMethods.logErrorFormat("Analytics - Unknown error reading from timed actions database (%s)", new Object[] {
            s.getMessage()
        });
        s = s1;
          goto _L7
        s;
          goto _L8
        s;
          goto _L9
_L3:
        s = null;
          goto _L10
        s;
          goto _L11
        s;
        s2 = null;
          goto _L9
        s;
        s1 = null;
          goto _L8
    }

    private void insertTimedAction(String s, Map map, long l)
    {
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to insert timed action (timed action name was null or empty)", new Object[0]);
            return;
        }
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        sqlInsertAction.bindString(1, s);
        sqlInsertAction.bindLong(2, l);
        if (sqlInsertAction.executeInsert() == -1L)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to insert the timed action (%s)", new Object[] {
                s
            });
        }
        sqlInsertAction.clearBindings();
_L1:
        saveContextDataForTimedAction(s, map);
        return;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to bind prepared statement values for inserting the timed action (%s)", new Object[] {
            s
        });
        resetDatabase(((Exception) (obj1)));
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj1;
        StaticMethods.logErrorFormat("Analyitcs - Unknown error when inserting timed action (%s)", new Object[] {
            ((Exception) (obj1)).getMessage()
        });
          goto _L1
    }

    private void saveContextDataForTimedAction(String s, Map map)
    {
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to save context data (timed action name was null or empty)", new Object[0]);
            return;
        }
        if (map == null || map.isEmpty())
        {
            StaticMethods.logWarningFormat("Analytics - Unable to save context data (context data was null or empty)", new Object[0]);
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorenter ;
_L2:
        synchronized (dbMutex)
        {
            if (database != null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            StaticMethods.logErrorFormat("Analytics - Null Database Object, unable to save context data for timed action", new Object[0]);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        Object obj1 = database.rawQuery(sqlSelectAction, new String[] {
            s
        });
        if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L3
_L3:
        int i;
        i = ((Cursor) (obj1)).getInt(0);
        ((Cursor) (obj1)).close();
        obj1 = map.entrySet().iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        java.util.Map.Entry entry;
        Object obj2;
        entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        obj2 = (String)entry.getKey();
        map = ((Map) (entry.getValue()));
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        if (((String) (obj2)).length() <= 0) goto _L8; else goto _L9
_L9:
        obj2 = database.rawQuery(sqlExistsContextDataByActionAndKey, new String[] {
            String.valueOf(i), (String)entry.getKey()
        });
        if (map != null) goto _L11; else goto _L10
_L10:
        map = "";
_L14:
        if (!((Cursor) (obj2)).moveToFirst() || ((Cursor) (obj2)).getInt(0) <= 0) goto _L13; else goto _L12
_L12:
        sqlUpdateContextData.bindString(1, map);
        sqlUpdateContextData.bindLong(2, i);
        sqlUpdateContextData.bindString(3, (String)entry.getKey());
        sqlUpdateContextData.execute();
        sqlUpdateContextData.clearBindings();
_L15:
        ((Cursor) (obj2)).close();
          goto _L8
        s;
        StaticMethods.logErrorFormat("Analytics - SQL exception when attempting to update context data for timed action (%s)", new Object[] {
            s.getMessage()
        });
_L6:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        ((Cursor) (obj1)).close();
        StaticMethods.logWarningFormat("Analytics - Unable to save context data (no timed action was found matching the name %s)", new Object[] {
            s
        });
        obj;
        JVM INSTR monitorexit ;
        return;
_L11:
        map = map.toString();
          goto _L14
_L13:
        sqlInsertContextData.bindLong(1, i);
        sqlInsertContextData.bindString(2, (String)entry.getKey());
        sqlInsertContextData.bindString(3, map);
        if (sqlInsertContextData.executeInsert() == -1L)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to insert the timed action's context data (%s)", new Object[] {
                s
            });
        }
        sqlInsertContextData.clearBindings();
          goto _L15
        s;
        StaticMethods.logErrorFormat("Analytics - Unexpected exception when attempting to update context data for timed action (%s)", new Object[] {
            s.getMessage()
        });
          goto _L6
    }

    public static AnalyticsTrackTimedAction sharedInstance()
    {
        AnalyticsTrackTimedAction analyticstracktimedaction;
        synchronized (_instanceMutex)
        {
            if (_instance == null)
            {
                _instance = new AnalyticsTrackTimedAction();
            }
            analyticstracktimedaction = _instance;
        }
        return analyticstracktimedaction;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void initializeDatabase()
    {
        try
        {
            database.execSQL("CREATE TABLE IF NOT EXISTS TIMEDACTIONS (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, STARTTIME INTEGER, ADJSTARTTIME INTEGER)");
            database.execSQL("CREATE TABLE IF NOT EXISTS CONTEXTDATA (ID INTEGER PRIMARY KEY AUTOINCREMENT, ACTIONID INTEGER, KEY TEXT, VALUE TEXT, FOREIGN KEY(ACTIONID) REFERENCES TIMEDACTIONS(ID))");
            return;
        }
        catch (SQLException sqlexception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to open or create timed actions database (%s)", new Object[] {
                sqlexception.getMessage()
            });
            return;
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Uknown error creating timed actions database (%s)", new Object[] {
                exception.getMessage()
            });
        }
    }

    protected void preMigrate()
    {
        File file;
        File file1;
        file = new File((new StringBuilder()).append(StaticMethods.getCacheDirectory()).append("ADBMobileDataCache.sqlite").append("ADBMobileTimedActionsCache.sqlite").toString());
        file1 = new File(StaticMethods.getCacheDirectory(), "ADBMobileTimedActionsCache.sqlite");
        if (!file.exists() || file1.exists())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (!file.renameTo(file1))
        {
            StaticMethods.logWarningFormat("Analytics - Unable to migrate old Timed Actions db, creating new Timed Actions db (move file returned false)", new Object[0]);
        }
        return;
        Exception exception;
        exception;
        StaticMethods.logWarningFormat("Analytics - Unable to migrate old Timed Actions db, creating new Timed Actions db (%s)", new Object[] {
            exception.getLocalizedMessage()
        });
        return;
    }

    protected void prepareStatements()
    {
        sqlSelectAction = "SELECT ID, STARTTIME, ADJSTARTTIME FROM TIMEDACTIONS WHERE NAME=?";
        sqlExistsAction = "SELECT COUNT(*) FROM TIMEDACTIONS WHERE NAME=?";
        sqlSelectContextDataForAction = "SELECT KEY, VALUE FROM CONTEXTDATA WHERE ACTIONID=?";
        sqlExistsContextDataByActionAndKey = "SELECT COUNT(*) FROM CONTEXTDATA WHERE ACTIONID=? AND KEY=?";
        try
        {
            sqlInsertAction = database.compileStatement("INSERT INTO TIMEDACTIONS (NAME, STARTTIME, ADJSTARTTIME) VALUES (@NAME, @START, @START)");
            sqlUpdateAction = database.compileStatement("UPDATE TIMEDACTIONS SET ADJSTARTTIME=ADJSTARTTIME+@DELTA WHERE ADJSTARTTIME!=0");
            sqlUpdateActionsClearAdjustedTime = database.compileStatement("UPDATE TIMEDACTIONS SET ADJSTARTTIME=0");
            sqlDeleteAction = database.compileStatement("DELETE FROM TIMEDACTIONS WHERE ID=@ID");
            sqlInsertContextData = database.compileStatement("INSERT INTO CONTEXTDATA(ACTIONID, KEY, VALUE) VALUES (@ACTIONID, @KEY, @VALUE)");
            sqlUpdateContextData = database.compileStatement("UPDATE CONTEXTDATA SET VALUE=@VALUE WHERE ACTIONID=@ACTIONID AND KEY=@KEY");
            sqlDeleteContextDataForAction = database.compileStatement("DELETE FROM CONTEXTDATA WHERE ACTIONID=@ACTIONID");
            return;
        }
        catch (SQLException sqlexception)
        {
            StaticMethods.logErrorFormat("Analytics - unable to prepare the needed SQL statements for interacting with the timed actions database (%s)", new Object[] {
                sqlexception.getMessage()
            });
            return;
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unknown error preparing sql statements (%s)", new Object[] {
                exception.getMessage()
            });
        }
    }

    protected void trackTimedActionEnd(final String timedActionName, Analytics.TimedActionBlock timedactionblock)
    {
        if (timedActionName == null || timedActionName.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to end the timed action (timed action name was null or empty)", new Object[0]);
            return;
        }
        AnalyticsTimedAction analyticstimedaction = getTimedAction(timedActionName);
        if (analyticstimedaction != null)
        {
            final Object contextData = Long.valueOf(StaticMethods.getTimeSince1970());
            long l;
            long l1;
            if (analyticstimedaction.adjustedStartTime == 0L)
            {
                l = 0L;
            } else
            {
                l = ((Long) (contextData)).longValue() - analyticstimedaction.adjustedStartTime;
            }
            l1 = ((Long) (contextData)).longValue() - analyticstimedaction.startTime;
            if (analyticstimedaction.contextData != null)
            {
                contextData = new HashMap(analyticstimedaction.contextData);
            } else
            {
                contextData = new HashMap();
            }
            if (timedactionblock == null || ((Boolean)timedactionblock.call(l, l1, ((Map) (contextData)))).booleanValue())
            {
                ((HashMap) (contextData)).put("a.action.time.total", String.valueOf(l1));
                if (analyticstimedaction.adjustedStartTime != 0L)
                {
                    ((HashMap) (contextData)).put("a.action.time.inapp", String.valueOf(l));
                }
                StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

                    final AnalyticsTrackTimedAction this$0;
                    final HashMap val$contextData;
                    final String val$timedActionName;

                    public void run()
                    {
                        AnalyticsTrackAction.trackAction(timedActionName, contextData);
                    }

            
            {
                this$0 = AnalyticsTrackTimedAction.this;
                timedActionName = s;
                contextData = hashmap;
                super();
            }
                });
            } else
            {
                StaticMethods.logDebugFormat("Analytics - Not sending hit for timed action due to block cancellation (%s)", new Object[] {
                    timedActionName
                });
            }
            deleteTimedAction(analyticstimedaction.databaseID);
            return;
        } else
        {
            StaticMethods.logWarningFormat("Analytics - Unable to end a timed action that has not yet begun (no timed action was found matching the name %s)", new Object[] {
                timedActionName
            });
            return;
        }
    }

    protected boolean trackTimedActionExists(String s)
    {
        boolean flag;
        boolean flag3;
        boolean flag4;
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to verify the existence of timed action (timed action name was null or empty)", new Object[0]);
            return false;
        }
        flag3 = false;
        flag4 = false;
        flag = false;
        synchronized (dbMutex)
        {
            if (database != null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
        }
        return false;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        boolean flag1;
        boolean flag2;
        flag1 = flag3;
        flag2 = flag4;
        s = database.rawQuery(sqlExistsAction, new String[] {
            s
        });
        flag1 = flag3;
        flag2 = flag4;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag1 = flag3;
        flag2 = flag4;
        if (s.getInt(0) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        flag2 = flag;
        s.close();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s;
        StaticMethods.logErrorFormat("Analytics - Unable to query timed actions database (%s)", new Object[] {
            s.getMessage()
        });
        flag = flag1;
          goto _L1
        s;
        StaticMethods.logErrorFormat("Analytics - Unknown error checking for timed action (%s)", new Object[] {
            s.getMessage()
        });
        flag = flag2;
          goto _L1
    }

    protected void trackTimedActionStart(String s, Map map)
    {
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - trackTimedActionStart() failed(the required parameter actionName was null or empty.)", new Object[0]);
            return;
        }
        long l = StaticMethods.getTimeSince1970();
        AnalyticsTimedAction analyticstimedaction = getTimedAction(s);
        if (analyticstimedaction != null)
        {
            deleteTimedAction(analyticstimedaction.databaseID);
        }
        insertTimedAction(s, map, l);
    }

    protected void trackTimedActionUpdate(String s, Map map)
    {
        if (s == null || s.trim().length() == 0)
        {
            StaticMethods.logWarningFormat("Analytics - Unable to update the timed action (timed action name was null or empty)", new Object[0]);
            return;
        }
        if (map == null || map.isEmpty())
        {
            StaticMethods.logWarningFormat("Analytics - Unable to update the timed action (context data was null or empty)", new Object[0]);
            return;
        } else
        {
            saveContextDataForTimedAction(s, map);
            return;
        }
    }

    protected void trackTimedActionUpdateActionsClearAdjustedStartTime()
    {
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        sqlUpdateActionsClearAdjustedTime.execute();
        sqlUpdateActionsClearAdjustedTime.clearBindings();
_L1:
        return;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to update adjusted time for timed actions after crash (%s)", new Object[] {
            ((SQLException) (obj1)).getMessage()
        });
        resetDatabase(((Exception) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unknown error clearing adjusted start times for timed actions (%s)", new Object[] {
            ((Exception) (obj1)).getMessage()
        });
        resetDatabase(((Exception) (obj1)));
          goto _L1
    }

    protected void trackTimedActionUpdateAdjustedStartTime(long l)
    {
        Object obj = dbMutex;
        obj;
        JVM INSTR monitorenter ;
        sqlUpdateAction.bindLong(1, l);
        sqlUpdateAction.execute();
        sqlUpdateAction.clearBindings();
_L1:
        return;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to bind prepared statement values for updating the adjusted start time for timed action (%s)", new Object[] {
            ((SQLException) (obj1)).getLocalizedMessage()
        });
        resetDatabase(((Exception) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        StaticMethods.logErrorFormat("Analytics - Unable to adjust start times for timed actions (%s)", new Object[] {
            ((Exception) (obj1)).getMessage()
        });
          goto _L1
    }

}
