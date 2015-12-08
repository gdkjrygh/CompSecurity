// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.g;

import a.a.a.a.a.b.ag;
import a.a.a.a.a.b.l;
import a.a.a.a.a.e.e;
import a.a.a.a.a.e.m;
import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.r;
import a.a.a.a.s;
import android.content.Context;
import android.content.res.Resources;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package a.a.a.a.a.g:
//            d, n

abstract class a extends a.a.a.a.a.b.a
{

    public a(p p1, String s1, String s2, m m, int i)
    {
        super(p1, s1, s2, m, i);
    }

    private e a(e e1, d d1)
    {
        Object obj;
        e e2;
        e2 = e1.b("app[identifier]", d1.b).b("app[name]", d1.f).b("app[display_version]", d1.c).b("app[build_version]", d1.d).a("app[source]", Integer.valueOf(d1.g)).b("app[minimum_sdk_version]", d1.h).b("app[built_sdk_version]", d1.i);
        if (!l.d(d1.e))
        {
            e2.b("app[instance_identifier]", d1.e);
        }
        if (d1.j == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = null;
        e1 = null;
        java.io.InputStream inputstream = a.v().getResources().openRawResource(d1.j.b);
        e1 = inputstream;
        obj = inputstream;
        e2.b("app[icon][hash]", d1.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", inputstream).a("app[icon][width]", Integer.valueOf(d1.j.c)).a("app[icon][height]", Integer.valueOf(d1.j.d));
        l.a(inputstream, "Failed to close app icon InputStream.");
_L2:
        if (d1.k != null)
        {
            for (e1 = d1.k.iterator(); e1.hasNext(); e2.b(String.format(Locale.US, "app[build][libraries][%s][type]", new Object[] {
    d1.a()
}), d1.c()))
            {
                d1 = (r)e1.next();
                e2.b(String.format(Locale.US, "app[build][libraries][%s][version]", new Object[] {
                    d1.a()
                }), d1.b());
            }

        }
        break MISSING_BLOCK_LABEL_346;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        obj = e1;
        f.d().b("Fabric", (new StringBuilder("Failed to find app icon with resource ID: ")).append(d1.j.b).toString(), notfoundexception);
        l.a(e1, "Failed to close app icon InputStream.");
        if (true) goto _L2; else goto _L1
_L1:
        e1;
        l.a(((java.io.Closeable) (obj)), "Failed to close app icon InputStream.");
        throw e1;
        return e2;
    }

    public boolean a(d d1)
    {
        e e1 = a(b().a("X-CRASHLYTICS-API-KEY", d1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", a.a()), d1);
        f.d();
        (new StringBuilder("Sending app info to ")).append(a());
        if (d1.j != null)
        {
            f.d();
            (new StringBuilder("App icon hash is ")).append(d1.j.a);
            f.d();
            (new StringBuilder("App icon size is ")).append(d1.j.c).append("x").append(d1.j.d);
        }
        int i = e1.b();
        if ("POST".equals(e1.d()))
        {
            d1 = "Create";
        } else
        {
            d1 = "Update";
        }
        f.d();
        (new StringBuilder()).append(d1).append(" app request ID: ").append(e1.a("X-REQUEST-ID"));
        f.d();
        return ag.a(i) == 0;
    }
}
