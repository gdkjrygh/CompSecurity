// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.b;

import android.content.Context;
import com.qihoo.security.appbox.a.a;
import com.qihoo.security.appbox.core.AppBoxResponse;
import java.util.ArrayList;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.appbox.b:
//            a

public class b
{

    private static int d = 0;
    private final Context a;
    private AppBoxResponse b;
    private final String c;
    private final long e;

    public b(Context context, AppBoxResponse appboxresponse, String s, long l)
    {
        a = context;
        b = appboxresponse;
        c = s;
        e = l;
    }

    public static AppBoxResponse a(Context context, JSONObject jsonobject)
    {
        AppBoxResponse appboxresponse = new AppBoxResponse();
        appboxresponse.end_state = jsonobject.optInt("end_state");
        appboxresponse.total = jsonobject.optInt("total");
        appboxresponse.updateTime = jsonobject.optLong("updateTime");
        context = com.qihoo.security.appbox.b.a.a(context, jsonobject, "data", d);
        appboxresponse.appItems.addAll(context);
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
        String s = null;
        long l;
        if (c.equals("1"))
        {
            s = "apps_app_box_previous_time";
        } else
        if (c.equals("2"))
        {
            s = "games_app_box_previous_time";
        }
        com.qihoo.security.appbox.core.b.b(a, s, System.currentTimeMillis());
        l = jsonobject.optLong("updateTime");
        if (e == l)
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
        stringbuffer.append(e);
        stringbuffer.append("&start=");
        stringbuffer.append(d);
        stringbuffer.append("&count=");
        stringbuffer.append("20");
        stringbuffer.append("&type=");
        stringbuffer.append(c);
        stringbuffer.append("&district=");
        stringbuffer.append(com.qihoo.security.appbox.a.a.b(a));
        stringbuffer.append("&lang=");
        stringbuffer.append(com.qihoo.security.appbox.a.a.a());
        return stringbuffer.toString();
    }

    public void a(int i)
    {
        d = i;
    }

}
