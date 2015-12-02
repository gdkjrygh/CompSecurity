// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.appconfig.l;
import com.facebook.auth.b.d;
import com.facebook.auth.e.a;
import com.facebook.base.c;
import com.facebook.contacts.data.b;
import com.facebook.debug.d.e;
import com.facebook.f.n;
import com.facebook.orca.emoji.w;
import com.facebook.orca.g.aa;
import com.facebook.orca.prefs.az;
import com.facebook.orca.prefs.o;
import com.facebook.orca.stickers.v;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.f;
import com.facebook.prefs.shared.j;
import com.google.common.a.fi;
import java.util.Set;

// Referenced classes of package com.facebook.orca.app:
//            fj, fi, fh, g

public class fg
    implements c
{

    private static final Class a = com/facebook/orca/app/fg;
    private static final ae b = com.facebook.f.n.a("messenger_sms_read_android");
    private static final ae c = com.facebook.f.n.a("messenger_mms_read_android");
    private static final Set o;
    private final com.facebook.auth.b.b d;
    private final aa e;
    private final b f;
    private final j g;
    private final az h;
    private final com.facebook.common.executors.a i;
    private final g j;
    private final fj k = new fj(this);
    private final javax.inject.a l;
    private final com.facebook.config.a.a m;
    private f n;

    public fg(com.facebook.auth.b.b b1, aa aa1, j j1, az az, com.facebook.common.executors.a a1, g g1, b b2, 
            javax.inject.a a2, com.facebook.config.a.a a3)
    {
        d = b1;
        e = aa1;
        g = j1;
        h = az;
        i = a1;
        j = g1;
        f = b2;
        l = a2;
        m = a3;
    }

    static void a(fg fg1)
    {
        fg1.f();
    }

    static void a(fg fg1, ae ae1)
    {
        fg1.a(ae1);
    }

    private void a(ae ae1)
    {
        i.c(new com.facebook.orca.app.fi(this, ae1));
    }

    static j b(fg fg1)
    {
        return fg1.g;
    }

    static com.facebook.auth.b.b c(fg fg1)
    {
        return fg1.d;
    }

    static ae d()
    {
        return b;
    }

    static javax.inject.a d(fg fg1)
    {
        return fg1.l;
    }

    static g e(fg fg1)
    {
        return fg1.j;
    }

    static ae e()
    {
        return c;
    }

    private void f()
    {
        e.b();
        f.c();
    }

    public void a()
    {
        e e1 = com.facebook.debug.d.e.a("OrcaDataManager.init");
        if (com.facebook.debug.log.b.b(2))
        {
            g.e();
        }
        if (g.a(a.w, -1) < 2)
        {
            com.facebook.debug.log.b.c(a, "Me user version upgrade to version 2");
            if (d instanceof d)
            {
                ((d)d).f();
            }
            f();
            com.facebook.prefs.shared.e e2 = g.b();
            e2.a(a.w, 2);
            e2.a();
        }
        if (g.a(n.b, -1) < 8)
        {
            com.facebook.debug.log.b.c(a, "GK version upgrade to version %d", new Object[] {
                Integer.valueOf(8)
            });
            if (d instanceof d)
            {
                ((d)d).f();
            }
            com.facebook.prefs.shared.e e3 = g.b();
            e3.a(n.b, 8);
            e3.a();
        }
        n = new fh(this);
        g.a(n);
        e1.a();
    }

    public void b()
    {
        f();
        g.a(o);
    }

    public fj c()
    {
        return k;
    }

    static 
    {
        o = fi.a(a.w, o.s, l.a, com.facebook.orca.prefs.n.y, com.facebook.orca.prefs.n.B, com.facebook.orca.prefs.n.C, new ae[] {
            com.facebook.orca.prefs.n.j, com.facebook.orca.background.n.a, w.b, v.b, n.a
        });
    }
}
