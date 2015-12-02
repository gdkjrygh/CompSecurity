// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.b;

import android.content.Context;
import com.qihoo.security.appbox.a.a;
import com.qihoo.security.appbox.core.AppBoxResponse;
import com.qihoo.security.appbox.core.b;
import com.qihoo360.mobilesafe.share.SharedPref;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.appbox.b:
//            a

public class d
{

    private final Context a;
    private AppBoxResponse b;
    private final long c;

    public d(Context context, AppBoxResponse appboxresponse, long l)
    {
        a = context;
        b = appboxresponse;
        c = l;
    }

    public static AppBoxResponse a(Context context, JSONObject jsonobject)
    {
        AppBoxResponse appboxresponse = new AppBoxResponse();
        appboxresponse.errno = jsonobject.optInt("errno");
        appboxresponse.end_state = jsonobject.optInt("end_state");
        appboxresponse.total = jsonobject.optInt("total");
        appboxresponse.updateTime = jsonobject.optLong("updateTime");
        appboxresponse.appItems = com.qihoo.security.appbox.b.a.a(context, jsonobject.optJSONObject("data"), "banner", 0);
        return appboxresponse;
    }

    public AppBoxResponse a(JSONObject jsonobject)
    {
        if (b == null || jsonobject == null)
        {
            return b;
        }
        b.errno = jsonobject.optInt("errno");
        if (b.errno != 0)
        {
            return b;
        }
        com.qihoo.security.appbox.core.b.b(a, "pickers_app_box_previous_time", System.currentTimeMillis());
        long l = jsonobject.optLong("updateTime");
        if (c == l)
        {
            return b;
        } else
        {
            b = a(a, jsonobject);
            return b;
        }
    }

    public String a()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("client=");
        stringbuffer.append("com.qihoo.security.lite");
        stringbuffer.append("&version=");
        stringbuffer.append(com.qihoo.security.appbox.a.a.a(a));
        stringbuffer.append("&updateTime=");
        stringbuffer.append(c);
        stringbuffer.append("&start=");
        stringbuffer.append("0");
        stringbuffer.append("&count=");
        stringbuffer.append("50");
        stringbuffer.append("&district=");
        stringbuffer.append(com.qihoo.security.appbox.a.a.b(a));
        stringbuffer.append("&lang=");
        stringbuffer.append(com.qihoo.security.appbox.a.a.a());
        SharedPref.a(a, "appbox_last_time_use_language", com.qihoo.security.appbox.a.a.a());
        return stringbuffer.toString();
    }
}
