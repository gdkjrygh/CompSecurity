// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cmcm.adsdk.b.a.e;
import com.cmcm.adsdk.b.d.b;
import java.util.Observable;

// Referenced classes of package com.cmcm.adsdk.b:
//            e, d, b, c

public final class a extends Observable
    implements b
{

    private static a e;
    private static SharedPreferences f;
    private com.cmcm.adsdk.b.d.a a;
    private Context b;
    private d c;
    private String d;
    private final String g = "cmcmadsdk_config";

    private a(String s)
    {
        d = s;
    }

    private static long a()
    {
        return f.getLong("request_time", 0L);
    }

    static Context a(a a1)
    {
        return a1.b;
    }

    public static a a(String s)
    {
        if (e == null)
        {
            e = new a(s);
        }
        return e;
    }

    static d b(a a1)
    {
        return a1.c;
    }

    static void c(a a1)
    {
        a1.setChanged();
    }

    public final void a(Context context)
    {
        b = context;
        com.cmcm.adsdk.b.e.b.a(context);
        com.cmcm.adsdk.b.c.a.a(context);
        a = com.cmcm.adsdk.b.d.a.a();
        f = b.getSharedPreferences("cmcmadsdk_config", 0);
        com.cmcm.adsdk.b.e.a(context).a(d);
    }

    public final void a(d d1)
    {
        c = d1;
        boolean flag;
        if (System.currentTimeMillis() / 1000L - a() >= 7200L)
        {
            com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("time:")).append(System.currentTimeMillis() / 1000L - a()).toString());
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            com.cmcm.adsdk.b.d.a a1 = a;
            if (com.cmcm.adsdk.b.b())
            {
                d1 = "http://unconf.mobad.ijinshan.com/b/";
            } else
            {
                d1 = "http://unconf.adkmob.com/b/";
            }
            a1.a(d1, com.cmcm.adsdk.b.e.a.b(d), this);
            return;
        } else
        {
            com.cmcm.adsdk.b.c.b.a("RequestConfig", "has request config has success within 2 hour ");
            d1.();
            return;
        }
    }

    public final void b(String s)
    {
        com.cmcm.adsdk.b.c.b.c("RequestConfig", (new StringBuilder("request failed...")).append(s).toString());
        com.cmcm.adsdk.c.a.a(new com.cmcm.adsdk.b.b(this), new Void[0]);
    }

    public final void c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            com.cmcm.adsdk.b.c.b.a("RequestConfig", "server config is empty");
            return;
        }
        com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("request config success.,save time :")).append(System.currentTimeMillis() / 1000L).toString());
        long l = System.currentTimeMillis() / 1000L;
        Object obj = f.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong("request_time", l);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        } else
        {
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        obj = com.cmcm.adsdk.b.e.b.a("");
        com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("local config :")).append(((String) (obj))).toString());
        if (!((String) (obj)).equals(s))
        {
            com.cmcm.adsdk.b.e.b.b(s);
            s = com.cmcm.adsdk.b.a.e.a(s);
            obj = s.a();
            com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("listBean:")).append(obj.toString()).toString());
            com.cmcm.adsdk.b.c.b.a("RequestConfig", "update config in db");
            com.cmcm.adsdk.c.a.a(new c(this, ((java.util.List) (obj))), new Void[0]);
            com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("reponse:")).append(s).toString());
            return;
        } else
        {
            com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("config no changed ")).append(s).append(",time:").append(System.currentTimeMillis()).toString());
            return;
        }
    }
}
