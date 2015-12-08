// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.Context;
import com.worklight.wlclient.WLRequestListener;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            Logger

public class WLAnalytics
{

    public WLAnalytics()
    {
    }

    public static void disable()
    {
        Logger.setAnalyticsCapture(false);
    }

    public static void enable()
    {
        Logger.setAnalyticsCapture(true);
    }

    public static void log(String s, JSONObject jsonobject)
    {
        Logger.getInstance("wl.analytics").analytics(s, jsonobject);
    }

    public static void send()
    {
        Logger.sendAnalytics(null);
    }

    public static void send(WLRequestListener wlrequestlistener)
    {
        Logger.sendAnalytics(wlrequestlistener);
    }

    public static void setContext(Context context)
    {
        Logger.setContext(context);
    }
}
