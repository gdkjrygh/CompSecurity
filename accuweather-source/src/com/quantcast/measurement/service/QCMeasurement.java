// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.quantcast.measurement.service:
//            QCNotificationListener, QCEventHandler, QCNotificationCenter, QCLog, 
//            QCUtility, QCPolicy, QCReachability, QCEvent, 
//            QCDataManager, QCOptOutUtility

final class QCMeasurement extends Enum
    implements QCNotificationListener
{

    private static final QCMeasurement $VALUES[];
    static final long DEFAULT_SESSION_TIMEOUT = 0x1b7740L;
    public static final QCMeasurement INSTANCE;
    public static final String QC_NOTIF_APP_START = "QC_START";
    public static final String QC_NOTIF_APP_STOP = "QC_STOP";
    private static final String QC_SESSION_FILE = "QC-SessionId";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCMeasurement);
    private String m_apiKey;
    private String m_appLabels[];
    private Context m_context;
    private String m_deviceId;
    private final QCEventHandler m_eventHandler = new QCEventHandler();
    private QCDataManager m_manager;
    private String m_netLabels[];
    private String m_networkCode;
    private int m_numActiveContext;
    private boolean m_optedOut;
    private QCPolicy m_policy;
    private String m_sessionId;
    private int m_uploadCount;
    private String m_userId;
    private boolean m_usesSecureConnection;

    private QCMeasurement(String s, int i)
    {
        super(s, i);
        m_usesSecureConnection = false;
        m_eventHandler.start();
        QCNotificationCenter.INSTANCE.addListener("QC_PU", this);
        QCNotificationCenter.INSTANCE.addListener("QC_OUC", this);
        m_numActiveContext = 0;
        m_optedOut = false;
        m_uploadCount = 25;
    }

    private boolean hasAdvertisingId()
    {
        try
        {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient.Info");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            QCLog.i(TAG, "Could not find advertising ID class.");
            return false;
        }
        return true;
    }

    private void saveSessionID(String s)
    {
        FileOutputStream fileoutputstream;
        FileOutputStream fileoutputstream1;
        fileoutputstream1 = null;
        fileoutputstream = null;
        FileOutputStream fileoutputstream2 = m_context.openFileOutput("QC-SessionId", 0);
        fileoutputstream = fileoutputstream2;
        fileoutputstream1 = fileoutputstream2;
        fileoutputstream2.write(s.getBytes());
        if (fileoutputstream2 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        fileoutputstream2.close();
_L2:
        return;
        s;
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            catch (IOException ioexception) { }
        }
        throw s;
        s;
    }

    private void updateSessionTimestamp()
    {
        File file = m_context.getFileStreamPath("QC-SessionId");
        if (file != null)
        {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    public static QCMeasurement valueOf(String s)
    {
        return (QCMeasurement)Enum.valueOf(com/quantcast/measurement/service/QCMeasurement, s);
    }

    public static QCMeasurement[] values()
    {
        return (QCMeasurement[])$VALUES.clone();
    }

    final boolean checkAdvertisingId(Context context)
    {
        boolean flag2 = false;
        boolean flag = false;
        if (!hasAdvertisingId())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        boolean flag1 = flag2;
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        boolean flag3;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        }
        catch (Throwable throwable)
        {
            m_deviceId = getAndroidId(context);
            QCLog.w(TAG, "Exception thrown while getting advertising id, reverting to device Id", throwable);
            return flag1;
        }
        flag1 = flag2;
        flag3 = info.isLimitAdTrackingEnabled();
        flag1 = flag2;
        if (!hasUserAdPrefChanged(context, flag3))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        flag1 = flag2;
        QCUtility.dumpAppInstallID(context);
        flag = true;
        flag1 = flag;
        QCUtility.saveUserAdPref(context, flag3);
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag1 = flag;
        m_deviceId = null;
        return flag;
        flag1 = flag;
        m_deviceId = info.getId();
        return flag;
        m_deviceId = getAndroidId(context);
        return false;
    }

    final boolean checkSessionId(Context context)
    {
        long l;
        boolean flag1;
        flag1 = false;
        File file = context.getFileStreamPath("QC-SessionId");
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        l = file.lastModified();
        if (System.currentTimeMillis() - l <= getSessionTimeoutInMs()) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (m_sessionId != null) goto _L4; else goto _L3
_L3:
        FileInputStream fileinputstream;
        FileInputStream fileinputstream1;
        FileInputStream fileinputstream2;
        Object obj;
        obj = null;
        fileinputstream2 = null;
        fileinputstream1 = fileinputstream2;
        fileinputstream = obj;
        byte abyte0[] = new byte[256];
        fileinputstream1 = fileinputstream2;
        fileinputstream = obj;
        fileinputstream2 = context.openFileInput("QC-SessionId");
        fileinputstream1 = fileinputstream2;
        fileinputstream = fileinputstream2;
        m_sessionId = new String(abyte0, 0, context.openFileInput("QC-SessionId").read(abyte0));
        flag = flag1;
        if (fileinputstream2 != null)
        {
            try
            {
                fileinputstream2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return false;
        }
          goto _L4
        context;
        fileinputstream = fileinputstream1;
        QCLog.e(TAG, "Error reading session file ", context);
        fileinputstream = fileinputstream1;
        logSDKError("session-read-failure", context.toString(), null);
        flag = true;
        if (fileinputstream1 == null) goto _L4; else goto _L5
_L5:
        try
        {
            fileinputstream1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return true;
        }
        return true;
        context;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            catch (IOException ioexception) { }
        }
        throw context;
        return true;
    }

    final void clearSession()
    {
        if (m_context != null)
        {
            m_context.deleteDatabase("Quantcast.db");
        }
        m_numActiveContext = 0;
        m_sessionId = null;
        m_manager = null;
        m_policy = null;
        m_context = null;
    }

    final String createSessionId()
    {
        String s = QCUtility.generateUniqueId();
        saveSessionID(s);
        return s;
    }

    final void end(final String appLabels[], final String networkLabels[])
    {
        if (m_optedOut)
        {
            return;
        } else
        {
            m_eventHandler.post(new Runnable() {

                final QCMeasurement this$0;
                final String val$appLabels[];
                final String val$networkLabels[];

                public void run()
                {
                    if (isMeasurementActive())
                    {
                        QCLog.i(QCMeasurement.TAG, "Calling end.");
                        updateSessionTimestamp();
                        String as[] = QCUtility.combineLabels(m_appLabels, appLabels);
                        String as1[] = QCUtility.combineLabels(m_netLabels, networkLabels);
                        m_manager.postEvent(QCEvent.closeSessionEvent(m_context, m_sessionId, as, as1), m_policy);
                        m_sessionId = null;
                        m_numActiveContext = 0;
                        return;
                    } else
                    {
                        QCLog.e(QCMeasurement.TAG, "End event called without first calling startActivity");
                        return;
                    }
                }

            
            {
                this$0 = QCMeasurement.this;
                appLabels = as;
                networkLabels = as1;
                super();
            }
            });
            return;
        }
    }

    final String getAndroidId(Context context)
    {
label0:
        {
            String s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (s != null)
            {
                context = s;
                if (!s.equals("9774d56d682e549c"))
                {
                    break label0;
                }
            }
            context = null;
        }
        return context;
    }

    public String getApiKey()
    {
        return m_apiKey;
    }

    final Context getAppContext()
    {
        return m_context;
    }

    final QCEventHandler getHandler()
    {
        return m_eventHandler;
    }

    final QCDataManager getManager()
    {
        return m_manager;
    }

    final long getSessionTimeoutInMs()
    {
        long l1 = 0x1b7740L;
        long l = l1;
        if (m_policy != null)
        {
            l = l1;
            if (m_policy.policyIsLoaded())
            {
                l = l1;
                if (m_policy.hasSessionTimeout())
                {
                    l = m_policy.getSessionTimeout().longValue() * 1000L;
                }
            }
        }
        return l;
    }

    final boolean hasNetworkCode()
    {
        return m_networkCode != null;
    }

    final boolean hasUserAdPrefChanged(Context context, boolean flag)
    {
        return flag ^ QCUtility.getUserAdPref(context);
    }

    final boolean isConnected()
    {
        return QCReachability.isConnected(m_context);
    }

    public final boolean isMeasurementActive()
    {
        return m_sessionId != null;
    }

    final void logBeginSessionEvent(String s, String as[], String as1[])
    {
        if (m_optedOut)
        {
            return;
        } else
        {
            m_sessionId = createSessionId();
            as = QCUtility.combineLabels(m_appLabels, as);
            as1 = QCUtility.combineLabels(m_netLabels, as1);
            m_manager.postEvent(QCEvent.beginSessionEvent(m_context, m_userId, s, m_sessionId, m_apiKey, m_networkCode, m_deviceId, as, as1), m_policy);
            return;
        }
    }

    final void logEvent(String s, String as[])
    {
        logEvent(s, as, null);
    }

    final void logEvent(final String name, final String appLabels[], final String networkLabel[])
    {
        if (m_optedOut)
        {
            return;
        } else
        {
            m_eventHandler.post(new Runnable() {

                final QCMeasurement this$0;
                final String val$appLabels[];
                final String val$name;
                final String val$networkLabel[];

                public void run()
                {
                    if (isMeasurementActive())
                    {
                        String as[] = QCUtility.combineLabels(m_appLabels, appLabels);
                        String as1[] = QCUtility.combineLabels(m_netLabels, networkLabel);
                        m_manager.postEvent(QCEvent.logEvent(m_context, m_sessionId, name, as, as1), m_policy);
                        return;
                    } else
                    {
                        QCLog.e(QCMeasurement.TAG, "Log event called without first calling startActivity");
                        return;
                    }
                }

            
            {
                this$0 = QCMeasurement.this;
                appLabels = as;
                networkLabel = as1;
                name = s;
                super();
            }
            });
            return;
        }
    }

    final void logLatency(String s, long l)
    {
        if (m_optedOut || m_manager == null)
        {
            return;
        } else
        {
            m_manager.postEvent(QCEvent.logLatency(m_context, m_sessionId, s, Long.toString(l)), m_policy);
            return;
        }
    }

    final void logOptionalEvent(final Map params, final String appLabels[], final String networkLabels[])
    {
        if (m_optedOut)
        {
            return;
        } else
        {
            m_eventHandler.post(new Runnable() {

                final QCMeasurement this$0;
                final String val$appLabels[];
                final String val$networkLabels[];
                final Map val$params;

                public void run()
                {
                    if (isMeasurementActive())
                    {
                        String as[] = QCUtility.combineLabels(m_appLabels, appLabels);
                        String as1[] = QCUtility.combineLabels(m_netLabels, networkLabels);
                        m_manager.postEvent(QCEvent.logOptionalEvent(m_context, m_sessionId, params, as, as1), m_policy);
                        return;
                    } else
                    {
                        QCLog.e(QCMeasurement.TAG, "Log event called without first calling startActivity");
                        return;
                    }
                }

            
            {
                this$0 = QCMeasurement.this;
                appLabels = as;
                networkLabels = as1;
                params = map;
                super();
            }
            });
            return;
        }
    }

    final void logResumeSessionEvent(String as[], String as1[])
    {
        as = QCUtility.combineLabels(m_appLabels, as);
        as1 = QCUtility.combineLabels(m_netLabels, as1);
        m_manager.postEvent(QCEvent.resumeSession(m_context, m_sessionId, as, as1), m_policy);
    }

    final void logSDKError(String s, String s1, String s2)
    {
        if (m_optedOut || m_manager == null)
        {
            return;
        } else
        {
            m_manager.postEvent(QCEvent.logSDKError(m_sessionId, s, s1, s2), m_policy);
            return;
        }
    }

    public void notificationCallback(String s, Object obj)
    {
        if (s.equals("QC_OUC"))
        {
            m_optedOut = ((Boolean)obj).booleanValue();
            if (!m_optedOut)
            {
                m_policy.updatePolicy(m_context);
                logBeginSessionEvent("launch", new String[] {
                    "_OPT-IN"
                }, null);
            } else
            {
                QCUtility.dumpAppInstallID(m_context);
                m_context.deleteDatabase("Quantcast.db");
            }
            setOptOutCookie(m_optedOut);
        }
    }

    final String recordUserIdentifier(String s, String as[])
    {
        return recordUserIdentifier(s, as, null);
    }

    final String recordUserIdentifier(final String hashedId, final String appLabels[], final String networkLabels[])
    {
        if (m_optedOut)
        {
            return null;
        } else
        {
            hashedId = QCUtility.applyHash(hashedId);
            m_eventHandler.post(new Runnable() {

                final QCMeasurement this$0;
                final String val$appLabels[];
                final String val$hashedId;
                final String val$networkLabels[];

                public void run()
                {
                    if (!isMeasurementActive())
                    {
                        m_userId = hashedId;
                    } else
                    {
                        String s = m_userId;
                        m_userId = hashedId;
                        if (m_userId == null && s != null || m_userId != null && !m_userId.equals(s))
                        {
                            logBeginSessionEvent("userhash", appLabels, networkLabels);
                            return;
                        }
                    }
                }

            
            {
                this$0 = QCMeasurement.this;
                hashedId = s;
                appLabels = as;
                networkLabels = as1;
                super();
            }
            });
            return hashedId;
        }
    }

    final void setAppLabels(String as[])
    {
        m_appLabels = as;
    }

    final void setNetworkLabels(String as[])
    {
        m_netLabels = as;
    }

    void setOptOut(final boolean optOut)
    {
        m_eventHandler.post(new Runnable() {

            final QCMeasurement this$0;
            final boolean val$optOut;

            public void run()
            {
                QCOptOutUtility.saveOptOutStatus(m_context, optOut);
            }

            
            {
                this$0 = QCMeasurement.this;
                optOut = flag;
                super();
            }
        });
    }

    void setOptOutCookie(boolean flag)
    {
        CookieSyncManager.createInstance(m_context);
        Object obj = CookieManager.getInstance();
        Calendar calendar = GregorianCalendar.getInstance();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd-MMM-yyyy H:m:s z", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        if (flag)
        {
            calendar.add(1, 10);
        } else
        {
            calendar.add(13, 1);
        }
        ((CookieManager) (obj)).setCookie("quantserve.com", (new StringBuilder()).append("qoo=OPT_OUT;domain=.quantserve.com;path=/;expires=").append(simpledateformat.format(calendar.getTime())).toString());
        obj = CookieSyncManager.getInstance();
        if (obj != null)
        {
            ((CookieSyncManager) (obj)).sync();
        }
    }

    public final void setUploadEventCount(int i)
    {
        m_uploadCount = i;
        if (isMeasurementActive())
        {
            m_manager.setUploadCount(i);
        }
    }

    final void setUsesSecureConnection(boolean flag)
    {
        m_usesSecureConnection = flag;
    }

    final String startUp(final Context hashedId, final String apiKey, final String networkCode, String s, final String appLabelsOrNull[], final String networkLabels[], final boolean isDirectedAtKids)
    {
        if (m_context == null && hashedId == null)
        {
            QCLog.e(TAG, "Context passed to Quantcast API cannot be null.");
            return null;
        }
        if (hashedId != null)
        {
            if (hashedId.getApplicationContext() != null)
            {
                m_context = hashedId.getApplicationContext();
            } else
            {
                m_context = hashedId;
            }
        }
        m_eventHandler.setContext(m_context);
        hashedId = QCUtility.applyHash(s);
        m_eventHandler.post(new Runnable() {

            final QCMeasurement this$0;
            final String val$apiKey;
            final String val$appLabelsOrNull[];
            final String val$hashedId;
            final boolean val$isDirectedAtKids;
            final String val$networkCode;
            final String val$networkLabels[];

            public void run()
            {
                if (m_numActiveContext > 0) goto _L2; else goto _L1
_L1:
                boolean flag;
                m_optedOut = QCOptOutUtility.isOptedOut(m_context);
                if (m_optedOut)
                {
                    setOptOutCookie(true);
                }
                flag = checkAdvertisingId(m_context);
                if (isMeasurementActive()) goto _L4; else goto _L3
_L3:
                QCLog.i(QCMeasurement.TAG, "First start of Quantcast");
                String s2 = apiKey;
                String s1 = s2;
                if (s2 == null)
                {
                    s1 = QCUtility.getAPIKey(m_context);
                }
                if (validateApiKeyAndNetworkCode(s1, networkCode))
                {
                    m_apiKey = apiKey;
                    m_networkCode = networkCode;
                    if (hashedId != null)
                    {
                        m_userId = hashedId;
                    }
                    m_manager = new QCDataManager(m_context);
                    m_manager.setUploadCount(m_uploadCount);
                    m_policy = QCPolicy.getQuantcastPolicy(m_context, m_apiKey, m_networkCode, m_context.getPackageName(), isDirectedAtKids);
                    boolean flag1 = checkSessionId(m_context);
                    if (flag)
                    {
                        logBeginSessionEvent("adprefchange", appLabelsOrNull, networkLabels);
                    } else
                    if (flag1)
                    {
                        logBeginSessionEvent("launch", appLabelsOrNull, networkLabels);
                    } else
                    {
                        logResumeSessionEvent(appLabelsOrNull, networkLabels);
                    }
                    QCNotificationCenter.INSTANCE.postNotification("QC_START", m_context);
                }
_L2:
                int i = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = QCMeasurement.this;
                apiKey = s;
                networkCode = s1;
                hashedId = s2;
                isDirectedAtKids = flag;
                appLabelsOrNull = as;
                networkLabels = as1;
                super();
            }
        });
        return hashedId;
    }

    final String startUp(Context context, String s, String s1, String as[])
    {
        return startUp(context, s, null, s1, as, null, false);
    }

    final void stop(String as[])
    {
        stop(as, null);
    }

    final void stop(final String appLabels[], final String networkLabels[])
    {
        if (m_optedOut)
        {
            return;
        } else
        {
            m_eventHandler.post(new Runnable() {

                final QCMeasurement this$0;
                final String val$appLabels[];
                final String val$networkLabels[];

                public void run()
                {
                    if (isMeasurementActive())
                    {
                        m_numActiveContext = Math.max(0, m_numActiveContext - 1);
                        if (m_numActiveContext == 0)
                        {
                            QCLog.i(QCMeasurement.TAG, "Last Activity stopped, pausing");
                            updateSessionTimestamp();
                            String as[] = QCUtility.combineLabels(m_appLabels, appLabels);
                            String as1[] = QCUtility.combineLabels(m_netLabels, networkLabels);
                            m_manager.postEvent(QCEvent.pauseSession(m_context, m_sessionId, as, as1), m_policy);
                            QCNotificationCenter.INSTANCE.postNotification("QC_STOP", m_context);
                        }
                        return;
                    } else
                    {
                        QCLog.e(QCMeasurement.TAG, "Pause event called without first calling startActivity");
                        return;
                    }
                }

            
            {
                this$0 = QCMeasurement.this;
                appLabels = as;
                networkLabels = as1;
                super();
            }
            });
            return;
        }
    }

    final boolean usesSecureConnection()
    {
        return m_usesSecureConnection;
    }

    final boolean validateApiKeyAndNetworkCode(String s, String s1)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (s == null)
        {
            flag = flag1;
            if (s1 == null)
            {
                QCLog.e(TAG, "No Quantcast API Key was passed to the SDK. Please use the API Key provided to you by Quantcast.");
                flag = false;
            }
        }
        flag1 = flag;
        if (s != null)
        {
            flag1 = flag;
            if (!s.matches("[a-zA-Z0-9]{16}-[a-zA-Z0-9]{16}"))
            {
                QCLog.e(TAG, "The Quantcast API Key passed to the SDK is malformed. Please use the API Key provided to you by Quantcast.");
                flag1 = false;
            }
        }
        flag = flag1;
        if (s1 != null)
        {
            flag = flag1;
            if (!s1.matches("p-[-_a-zA-Z0-9]{13}"))
            {
                QCLog.e(TAG, "The Quantcast network p-code passed to the SDK is malformed. Please use the network p-code found on Quantcast.com.");
                flag = false;
            }
        }
        return flag;
    }

    static 
    {
        INSTANCE = new QCMeasurement("INSTANCE", 0);
        $VALUES = (new QCMeasurement[] {
            INSTANCE
        });
    }



/*
    static int access$002(QCMeasurement qcmeasurement, int i)
    {
        qcmeasurement.m_numActiveContext = i;
        return i;
    }

*/


/*
    static int access$008(QCMeasurement qcmeasurement)
    {
        int i = qcmeasurement.m_numActiveContext;
        qcmeasurement.m_numActiveContext = i + 1;
        return i;
    }

*/




/*
    static boolean access$102(QCMeasurement qcmeasurement, boolean flag)
    {
        qcmeasurement.m_optedOut = flag;
        return flag;
    }

*/




/*
    static String access$1202(QCMeasurement qcmeasurement, String s)
    {
        qcmeasurement.m_sessionId = s;
        return s;
    }

*/






/*
    static String access$402(QCMeasurement qcmeasurement, String s)
    {
        qcmeasurement.m_apiKey = s;
        return s;
    }

*/



/*
    static String access$502(QCMeasurement qcmeasurement, String s)
    {
        qcmeasurement.m_networkCode = s;
        return s;
    }

*/



/*
    static String access$602(QCMeasurement qcmeasurement, String s)
    {
        qcmeasurement.m_userId = s;
        return s;
    }

*/



/*
    static QCDataManager access$702(QCMeasurement qcmeasurement, QCDataManager qcdatamanager)
    {
        qcmeasurement.m_manager = qcdatamanager;
        return qcdatamanager;
    }

*/




/*
    static QCPolicy access$902(QCMeasurement qcmeasurement, QCPolicy qcpolicy)
    {
        qcmeasurement.m_policy = qcpolicy;
        return qcpolicy;
    }

*/
}
