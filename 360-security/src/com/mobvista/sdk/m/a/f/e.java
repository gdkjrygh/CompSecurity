// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import android.content.Context;
import android.net.Uri;
import com.mobvista.sdk.m.core.p;

// Referenced classes of package com.mobvista.sdk.m.a.f:
//            f, b, c

public final class e
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;

    public e()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = 1;
    }

    private static f b(Context context)
    {
        f f1 = new f((byte)0);
        f1.a("platform", Integer.valueOf(1));
        f1.a("os_version", android.os.Build.VERSION.RELEASE);
        f1.a("package_name", com.mobvista.sdk.m.a.f.b.m(context));
        f1.a("app_version_name", com.mobvista.sdk.m.a.f.b.j(context));
        f1.a("app_version_code", Integer.valueOf(com.mobvista.sdk.m.a.f.b.i(context)));
        f1.a("orientation", Integer.valueOf(1));
        f1.a("model", com.mobvista.sdk.m.a.f.b.a());
        f1.a("android_id", com.mobvista.sdk.m.a.f.b.e(context));
        f1.a("imei", com.mobvista.sdk.m.a.f.b.a(context));
        f1.a("mac", com.mobvista.sdk.m.a.f.b.h(context));
        f1.a("gaid", com.mobvista.sdk.m.a.f.b.g());
        f1.a("mnc", com.mobvista.sdk.m.a.f.b.d(context));
        f1.a("mcc", com.mobvista.sdk.m.a.f.b.c(context));
        f1.a("network_type", Integer.valueOf(com.mobvista.sdk.m.a.f.b.q(context)));
        f1.a("language", (new StringBuilder()).append(com.mobvista.sdk.m.a.f.b.f(context)).append('-').append(com.mobvista.sdk.m.a.f.b.g(context)));
        f1.a("timezone", com.mobvista.sdk.m.a.f.b.e());
        f1.a("useragent", com.mobvista.sdk.m.a.f.b.d());
        f1.a("sdk_version", "6.1.2 M");
        f1.a("gp_version", com.mobvista.sdk.m.a.f.b.s(context));
        f1.a("gpsv", com.mobvista.sdk.m.a.f.b.r(context));
        f1.a("screen_size", (new StringBuilder()).append(com.mobvista.sdk.m.a.f.b.k(context)).append('x').append(com.mobvista.sdk.m.a.f.b.l(context)));
        return f1;
    }

    private f c()
    {
        f f1 = new f((byte)0);
        f1.a("app_id", p.a);
        f1.a("unit_id", a);
        f1.a("sign", com.mobvista.sdk.m.a.f.c.b((new StringBuilder()).append(p.a).append(p.b).toString()));
        f1.a("category", b);
        f1.a("ad_num", Integer.valueOf(h));
        f1.a("ping_mode", f);
        f1.a("exclude_ids", d);
        f1.a("offset", c);
        f1.a("only_impression", e);
        f1.a("image_size", g);
        return f1;
    }

    static String c(String s)
    {
        return d(s);
    }

    private static String d(String s)
    {
        if (s == null || s.trim().length() == 0)
        {
            return "";
        } else
        {
            return Uri.encode(s, "utf-8");
        }
    }

    public final e a()
    {
        f = "1";
        return this;
    }

    public final e a(int i)
    {
        b = String.valueOf(i);
        return this;
    }

    public final e a(String s)
    {
        a = s;
        return this;
    }

    public final String a(Context context)
    {
        return b(context).a(c().toString()).toString();
    }

    public final e b()
    {
        e = "1";
        return this;
    }

    public final e b(int i)
    {
        if (i > 0) goto _L2; else goto _L1
_L1:
        int j = 1;
_L4:
        h = j;
        return this;
_L2:
        j = i;
        if (i > 20)
        {
            j = 20;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final e b(String s)
    {
        d = s;
        return this;
    }

    public final e c(int i)
    {
        c = String.valueOf(i);
        return this;
    }

    public final e d(int i)
    {
        g = String.valueOf(i);
        return this;
    }
}
