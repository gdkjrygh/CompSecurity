// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.abtest.qe.c;
import com.facebook.auth.f.b;
import com.facebook.prefs.shared.d;
import com.google.common.base.Optional;
import com.google.common.d.a.i;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            bv, bt, bu

public class bs
    implements b
{

    private static final Class a = com/facebook/orca/contacts/divebar/bs;
    private final c b;
    private final d c;
    private final Executor d;
    private boolean e;
    private boolean f;
    private boolean g;
    private bv h;
    private long i;

    public bs(c c1, d d1, Executor executor)
    {
        b = c1;
        c = d1;
        d = executor;
        d();
    }

    static bv a(bs bs1, bv bv1)
    {
        bs1.h = bv1;
        return bv1;
    }

    static d a(bs bs1)
    {
        return bs1.c;
    }

    static boolean a(bs bs1, Optional optional)
    {
        return bs1.a(optional);
    }

    static boolean a(bs bs1, boolean flag)
    {
        bs1.e = flag;
        return flag;
    }

    private boolean a(Optional optional)
    {
        if (optional.isPresent())
        {
            return ((String)optional.get()).equals("1");
        } else
        {
            com.facebook.debug.log.b.e(a, "Experiment parameter not found! Using default value...");
            return false;
        }
    }

    static boolean b(bs bs1)
    {
        return bs1.e;
    }

    static boolean b(bs bs1, boolean flag)
    {
        bs1.f = flag;
        return flag;
    }

    static boolean c(bs bs1)
    {
        return bs1.f;
    }

    static boolean c(bs bs1, boolean flag)
    {
        bs1.g = flag;
        return flag;
    }

    static boolean d(bs bs1)
    {
        return bs1.g;
    }

    static Class e()
    {
        return a;
    }

    public boolean a()
    {
        return f;
    }

    public boolean b()
    {
        return g;
    }

    public void c()
    {
        if (h != bv.INIT && (h != bv.COMPLETED || System.nanoTime() - i <= 0x68c61714000L))
        {
            return;
        } else
        {
            bt bt1 = new bt(this);
            com.google.common.d.a.i.a(b.a("wildfire_presence_android", bt1), new bu(this), d);
            h = bv.RUNNING;
            i = System.nanoTime();
            return;
        }
    }

    public void d()
    {
        e = false;
        f = false;
        g = false;
        h = bv.INIT;
        i = -1L;
    }

}
