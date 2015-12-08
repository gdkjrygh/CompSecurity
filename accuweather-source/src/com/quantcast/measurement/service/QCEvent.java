// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TimeZone;

// Referenced classes of package com.quantcast.measurement.service:
//            QCReachability, QCReferrerReceiver, QCUtility, QCLog, 
//            QCPolicy

class QCEvent
{

    static final String QC_APIKEY_KEY = "apikey";
    static final String QC_APPEVENT_KEY = "appevent";
    static final String QC_APPID_KEY = "aid";
    static final String QC_APPNAME_KEY = "aname";
    static final String QC_BEGIN_ADPREF_REASON = "adprefchange";
    static final String QC_BEGIN_LAUNCH_REASON = "launch";
    static final String QC_BEGIN_RESUME_REASON = "resume";
    static final String QC_BEGIN_USERHASH_REASON = "userhash";
    static final String QC_BUILDNUM_KEY = "iver";
    static final String QC_CARRIERNAME_KEY = "mnn";
    static final String QC_CONNECTION_KEY = "ct";
    static final String QC_COUNTRYCODE_KEY = "icc";
    static final String QC_DEVICEID_KEY = "did";
    static final String QC_DEVICEMODEL_KEY = "dmod";
    static final String QC_DEVICEOS_KEY = "dos";
    static final String QC_DEVICEOS_VALUE = "android";
    static final String QC_DEVICETYPE_KEY = "dtype";
    static final String QC_DST_KEY = "dst";
    static final String QC_ERRORDESC_KEY = "error-desc";
    static final String QC_ERRORPARAM_KEY = "error-param";
    static final String QC_ERRORTYPE_KEY = "error-type";
    static final String QC_EVENT_APPEVENT = "appevent";
    static final String QC_EVENT_FINISHED = "finished";
    static final String QC_EVENT_KEY = "event";
    static final String QC_EVENT_LATENCY = "latency";
    static final String QC_EVENT_LOAD = "load";
    static final String QC_EVENT_PAUSE = "pause";
    static final String QC_EVENT_RESUME = "resume";
    static final String QC_EVENT_SDKERROR = "sdkerror";
    static final String QC_INSTALLDATE_KEY = "inst";
    static final String QC_LATENCYID_KEY = "uplid";
    static final String QC_LATENCYVALUE_KEY = "latency-value";
    static final String QC_LOCALECOUNTRY_KEY = "lc";
    static final String QC_LOCALELANG_KEY = "ll";
    static final String QC_MANUFACTURER_KEY = "dm";
    static final String QC_MCC_KEY = "mcc";
    static final String QC_MEDIA_KEY = "media";
    static final String QC_MEDIA_VALUE = "app";
    static final String QC_MNC_KEY = "mnc";
    static final String QC_NETWORKCODE_KEY = "pcode";
    static final String QC_OSVERSION_KEY = "dosv";
    static final String QC_PACKAGEID_KEY = "pkid";
    static final String QC_PARAMETER_APP_LABEL = "labels";
    static final String QC_PARAMETER_NETWORK_LABEL = "netlabels";
    static final String QC_REASON_KEY = "nsr";
    static final String QC_REFERRER_KEY = "r";
    static final String QC_SCREENRES_KEY = "sr";
    static final String QC_SESSIONID_KEY = "sid";
    static final String QC_TIMESTAMP_KEY = "et";
    static final String QC_TIMEZONE_KEY = "tzo";
    static final String QC_USERHASH_KEY = "uh";
    static final String QC_VERSION_KEY = "aver";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCEvent);
    private final String m_eventId;
    private boolean m_forceUpload;
    private final Map m_parameters;

    QCEvent(Long long1)
    {
        m_parameters = new HashMap();
        m_eventId = Long.toString(long1.longValue());
        m_forceUpload = false;
    }

    QCEvent(String s)
    {
        m_parameters = new HashMap();
        addParameter("et", Long.toString(System.currentTimeMillis() / 1000L));
        addParameter("sid", s);
        m_eventId = null;
    }

    static QCEvent beginSessionEvent(Context context, String s, String s1, String s2, String s3, String s4, String s5, String as[], 
            String as1[])
    {
        s2 = new QCEvent(s2);
        s2.addParameter("event", "load");
        s2.addParameter("nsr", s1);
        s2.addParameter("apikey", s3);
        s2.addParameter("media", "app");
        s2.addParameter("ct", QCReachability.networkType(context));
        s2.addParameter("pcode", s4);
        s2.addParameter("r", QCReferrerReceiver.referrer);
        s2.addParameter("did", s5);
        s2.addParameter("aid", QCUtility.getAppInstallId(context));
        s2.addParameter("aname", QCUtility.getAppName(context));
        s2.addParameter("uh", s);
        s = context.getPackageName();
        s2.addParameter("pkid", s);
        s1 = context.getPackageManager();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s = s1.getPackageInfo(s, 0);
        if (s == null) goto _L2; else goto _L3
_L3:
        int i;
        s2.addParameter("aver", ((PackageInfo) (s)).versionName);
        s2.addParameter("iver", Integer.toString(((PackageInfo) (s)).versionCode));
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 9) goto _L5; else goto _L4
_L4:
        s2.addParameter("inst", String.valueOf(android/content/pm/PackageInfo.getField("firstInstallTime").getLong(s)));
_L2:
        boolean flag;
        s = (WindowManager)context.getSystemService("window");
        if (s != null)
        {
            s = s.getDefaultDisplay();
            int j;
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                s1 = new Point();
                s.getSize(s1);
                s = String.format(Locale.US, "%dx%dx32", new Object[] {
                    Integer.valueOf(((Point) (s1)).x), Integer.valueOf(((Point) (s1)).y)
                });
            } else
            {
                s = String.format(Locale.US, "%dx%dx32", new Object[] {
                    Integer.valueOf(s.getWidth()), Integer.valueOf(s.getHeight())
                });
            }
            s2.addParameter("sr", s);
        }
        s = TimeZone.getDefault();
        s1 = new Date();
        s2.addParameter("dst", Boolean.toString(s.inDaylightTime(s1)));
        s2.addParameter("tzo", Long.toString(s.getOffset(s1.getTime()) / 1000 / 60));
        s3 = (TelephonyManager)context.getSystemService("phone");
        if (s3 == null) goto _L7; else goto _L6
_L6:
        s1 = s3.getNetworkOperator();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        s = s1;
        if (s1.length() > 0)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        s = s3.getSimOperator();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        if (s.length() > 0)
        {
            if (s.length() > 3)
            {
                break MISSING_BLOCK_LABEL_701;
            }
            s2.addParameter("mcc", s);
        }
_L9:
        s1 = s3.getNetworkCountryIso();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        s = s1;
        if (s1.length() != 0)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        s = s3.getSimCountryIso();
        if (s != null)
        {
            try
            {
                if (s.length() > 0)
                {
                    s2.addParameter("icc", s);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        s1 = s3.getNetworkOperatorName();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        s = s1;
        if (s1.length() != 0)
        {
            break MISSING_BLOCK_LABEL_462;
        }
        s = s3.getSimOperatorName();
        if (s != null)
        {
            try
            {
                if (s.length() > 0)
                {
                    s2.addParameter("mnn", s);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
_L7:
        j = context.getResources().getConfiguration().screenLayout & 0xf;
        if (j == 4 || j == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            context = "Tablet";
        } else
        {
            context = "Handset";
        }
        s2.addParameter("dtype", context);
        s2.addParameter("dos", "android");
        s2.addParameter("dmod", Build.MODEL);
        s2.addParameter("dosv", android.os.Build.VERSION.RELEASE);
        s2.addParameter("dm", Build.MANUFACTURER);
        context = Locale.getDefault();
        try
        {
            s2.addParameter("lc", context.getISO3Country());
            s2.addParameter("ll", context.getISO3Language());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            s2.addParameter("lc", "XX");
            s2.addParameter("ll", "xx");
        }
        s2.addLabels(as);
        s2.addNetworkLabels(as1);
        return s2;
        s;
        s = context.getFilesDir();
        if (s != null)
        {
            try
            {
                s2.addParameter("inst", String.valueOf(s.lastModified()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                QCLog.e(TAG, "Unable to get application info for this app.", s);
            }
        }
          goto _L2
_L5:
        s = context.getFilesDir();
        if (s == null) goto _L2; else goto _L8
_L8:
        s2.addParameter("inst", String.valueOf(s.lastModified()));
          goto _L2
        try
        {
            s2.addParameter("mcc", s.substring(0, 3));
            s2.addParameter("mnc", s.substring(3));
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L9
    }

    static QCEvent closeSessionEvent(Context context, String s, String as[], String as1[])
    {
        s = new QCEvent(s);
        s.setForceUpload(true);
        s.addParameter("event", "finished");
        context = QCUtility.getAppInstallId(context);
        if (context != null)
        {
            s.addParameter("aid", context);
        }
        s.addLabels(as);
        s.addNetworkLabels(as1);
        return s;
    }

    static QCEvent dataBaseEventWithPolicyCheck(Long long1, Map map, QCPolicy qcpolicy)
    {
        if (qcpolicy != null && qcpolicy.policyIsLoaded() && !qcpolicy.isBlackedOut() && !qcpolicy.isBlacklisted("event")) goto _L2; else goto _L1
_L1:
        long1 = null;
_L4:
        return long1;
_L2:
        QCEvent qcevent = new QCEvent(long1);
        if (qcpolicy.getSalt() != null)
        {
            if (map.containsKey("did"))
            {
                map.put("did", QCUtility.applyHash((new StringBuilder()).append((String)map.get("did")).append(qcpolicy.getSalt()).toString()));
            }
            if (map.containsKey("aid"))
            {
                map.put("aid", QCUtility.applyHash((new StringBuilder()).append((String)map.get("aid")).append(qcpolicy.getSalt()).toString()));
            }
        }
        Iterator iterator = map.keySet().iterator();
        do
        {
            long1 = qcevent;
            if (!iterator.hasNext())
            {
                continue;
            }
            long1 = (String)iterator.next();
            if (!qcpolicy.isBlacklisted(long1))
            {
                qcevent.addParameter(long1, (String)map.get(long1));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static QCEvent logEvent(Context context, String s, String s1, String as[], String as1[])
    {
        s = new QCEvent(s);
        s.addParameter("event", "appevent");
        s.addParameter("appevent", s1);
        context = QCUtility.getAppInstallId(context);
        if (context != null)
        {
            s.addParameter("aid", context);
        }
        s.addLabels(as);
        s.addNetworkLabels(as1);
        return s;
    }

    static QCEvent logLatency(Context context, String s, String s1, String s2)
    {
        s = new QCEvent(s);
        s.addParameter("event", "latency");
        context = QCUtility.getAppInstallId(context);
        if (context != null)
        {
            s.addParameter("aid", context);
        }
        s.addParameter("uplid", s1);
        s.addParameter("latency-value", s2);
        return s;
    }

    static QCEvent logOptionalEvent(Context context, String s, Map map, String as[], String as1[])
    {
        s = new QCEvent(s);
        s.addParameters(map);
        context = QCUtility.getAppInstallId(context);
        if (context != null)
        {
            s.addParameter("aid", context);
        }
        s.addLabels(as);
        s.addNetworkLabels(as1);
        return s;
    }

    static QCEvent logSDKError(String s, String s1, String s2, String s3)
    {
        s = new QCEvent(s);
        s.setForceUpload(true);
        s.addParameter("event", "sdkerror");
        s.addParameter("error-type", s1);
        if (s2 != null)
        {
            s.addParameter("error-desc", s2);
        }
        if (s3 != null)
        {
            s.addParameter("error-param", s3);
        }
        return s;
    }

    static QCEvent pauseSession(Context context, String s, String as[], String as1[])
    {
        s = new QCEvent(s);
        s.setForceUpload(true);
        s.addParameter("event", "pause");
        context = QCUtility.getAppInstallId(context);
        if (context != null)
        {
            s.addParameter("aid", context);
        }
        s.addLabels(as);
        s.addNetworkLabels(as1);
        return s;
    }

    static QCEvent resumeSession(Context context, String s, String as[], String as1[])
    {
        s = new QCEvent(s);
        s.addParameter("event", "resume");
        context = QCUtility.getAppInstallId(context);
        if (context != null)
        {
            s.addParameter("aid", context);
        }
        s.addLabels(as);
        s.addNetworkLabels(as1);
        return s;
    }

    void addLabels(String as[])
    {
        addParameter("labels", QCUtility.encodeStringArray(as));
    }

    void addNetworkLabels(String as[])
    {
        addParameter("netlabels", QCUtility.encodeStringArray(as));
    }

    void addParameter(String s, String s1)
    {
        if (s1 != null)
        {
            m_parameters.put(s, s1);
        }
    }

    void addParameters(Map map)
    {
        if (map != null && map.size() > 0)
        {
            m_parameters.putAll(map);
        }
    }

    String getEventId()
    {
        return m_eventId;
    }

    Map getParameters()
    {
        return m_parameters;
    }

    void setForceUpload(boolean flag)
    {
        m_forceUpload = flag;
    }

    boolean shouldForceUpload()
    {
        return m_forceUpload;
    }

}
