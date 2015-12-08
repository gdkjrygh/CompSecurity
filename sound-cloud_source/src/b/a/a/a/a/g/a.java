// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import android.content.Context;
import android.content.res.Resources;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.y;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.g;
import b.a.a.a.l;
import b.a.a.a.n;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package b.a.a.a.a.g:
//            d, n

abstract class a extends b.a.a.a.a.b.a
{

    public a(l l1, String s, String s1, g g, int i)
    {
        super(l1, s, s1, g, i);
    }

    private d a(d d1, b.a.a.a.a.g.d d2)
    {
        d d3;
        d3 = d1.b("app[identifier]", d2.b).b("app[name]", d2.f).b("app[display_version]", d2.c).b("app[build_version]", d2.d).a("app[source]", Integer.valueOf(d2.g)).b("app[minimum_sdk_version]", d2.h).b("app[built_sdk_version]", d2.i);
        if (!j.d(d2.e))
        {
            d3.b("app[instance_identifier]", d2.e);
        }
        if (d2.j == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        d1 = null;
        java.io.InputStream inputstream = b.n.getResources().openRawResource(d2.j.b);
        Object obj;
        d1 = inputstream;
        obj = inputstream;
        d3.b("app[icon][hash]", d2.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", inputstream).a("app[icon][width]", Integer.valueOf(d2.j.c)).a("app[icon][height]", Integer.valueOf(d2.j.d));
        j.a(inputstream);
_L2:
        if (d2.k != null)
        {
            for (d1 = d2.k.iterator(); d1.hasNext(); d3.b(String.format(Locale.US, "app[build][libraries][%s][type]", new Object[] {
    ((n) (d2)).a
}), ((n) (d2)).c))
            {
                d2 = (n)d1.next();
                d3.b(String.format(Locale.US, "app[build][libraries][%s][version]", new Object[] {
                    ((n) (d2)).a
                }), ((n) (d2)).b);
            }

        }
        break; /* Loop/switch isn't completed */
        obj;
        obj = d1;
        b.a.a.a.d.a();
        obj = d1;
        (new StringBuilder("Failed to find app icon with resource ID: ")).append(d2.j.b);
        j.a(d1);
        if (true) goto _L2; else goto _L1
        d1;
        obj = null;
_L4:
        j.a(((java.io.Closeable) (obj)));
        throw d1;
_L1:
        return d3;
        d1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(b.a.a.a.a.g.d d1)
    {
        d d2 = a(a(Collections.emptyMap()).a("X-CRASHLYTICS-API-KEY", d1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()), d1);
        b.a.a.a.d.a();
        (new StringBuilder("Sending app info to ")).append(super.a);
        if (d1.j != null)
        {
            b.a.a.a.d.a();
            (new StringBuilder("App icon hash is ")).append(d1.j.a);
            b.a.a.a.d.a();
            (new StringBuilder("App icon size is ")).append(d1.j.c).append("x").append(d1.j.d);
        }
        int i = d2.b();
        if ("POST".equals(d2.a().getRequestMethod()))
        {
            d1 = "Create";
        } else
        {
            d1 = "Update";
        }
        b.a.a.a.d.a();
        (new StringBuilder()).append(d1).append(" app request ID: ").append(d2.a("X-REQUEST-ID"));
        b.a.a.a.d.a();
        return y.a(i) == 0;
    }
}
