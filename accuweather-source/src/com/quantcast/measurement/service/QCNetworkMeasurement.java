// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.quantcast.measurement.service:
//            QCMeasurement, QCLog

public class QCNetworkMeasurement
{

    static final String QC_EVENT_NETEVENT = "netevent";
    static final String QC_NETEVENT_KEY = "netevent";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCNetworkMeasurement);

    public QCNetworkMeasurement()
    {
    }

    public static String activityStart(Context context)
    {
        if (!QCMeasurement.INSTANCE.hasNetworkCode())
        {
            QCLog.e(TAG, "Network labels will be ignored without starting with a network code.  Call QCNetworkMeasurement.activityStart on Activity onStart to set a network code");
        }
        return QCMeasurement.INSTANCE.startUp(context, null, null, null, null, null, false);
    }

    public static String activityStart(Context context, String s, String s1, String s2, String as[], String as1[], boolean flag)
    {
        if (s1 == null)
        {
            QCLog.e(TAG, "Network p-code is null. If no network p-code is required, then please consider using the QuantcastClient.activityStart version.");
        }
        return QCMeasurement.INSTANCE.startUp(context, s, s1, s2, as, as1, flag);
    }

    public static void activityStop(String as[], String as1[])
    {
        if (!QCMeasurement.INSTANCE.hasNetworkCode())
        {
            QCLog.e(TAG, "Network labels will be ignored without starting with a network code.  Call QCNetworkMeasurement.activityStart on Activity onStart to set a network code");
        }
        QCMeasurement.INSTANCE.stop(as, as1);
    }

    public static void logEvent(String s, String as[], String as1[])
    {
        if (!QCMeasurement.INSTANCE.hasNetworkCode())
        {
            QCLog.e(TAG, "Network labels will be ignored without starting with a network code.  Call QCNetworkMeasurement.activityStart on Activity onStart to set a network code");
        }
        QCMeasurement.INSTANCE.logEvent(s, as, as1);
    }

    public static void logNetworkEvent(String s, String as[])
    {
        if (!QCMeasurement.INSTANCE.hasNetworkCode())
        {
            QCLog.e(TAG, "Network labels will be ignored without starting with a network code.  Call QCNetworkMeasurement.activityStart on Activity onStart to set a network code");
        }
        HashMap hashmap = new HashMap();
        hashmap.put("event", "netevent");
        hashmap.put("netevent", s);
        QCMeasurement.INSTANCE.logOptionalEvent(hashmap, null, as);
    }

    public static String recordUserIdentifier(String s, String as[], String as1[])
    {
        if (!QCMeasurement.INSTANCE.hasNetworkCode())
        {
            QCLog.e(TAG, "Network labels will be ignored without starting with a network code.  Call QCNetworkMeasurement.activityStart on Activity onStart to set a network code");
        }
        return QCMeasurement.INSTANCE.recordUserIdentifier(s, as, as1);
    }

    public static transient void setNetworkLabels(String as[])
    {
        QCMeasurement.INSTANCE.setNetworkLabels(as);
    }

}
