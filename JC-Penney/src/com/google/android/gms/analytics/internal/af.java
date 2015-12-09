// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.stats.b;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, q, ab, ah, 
//            ag, t, bb, bd, 
//            d, e

public class af extends z
{

    private final ah a = new ah(this);
    private e b;
    private final bd c;
    private q d;

    protected af(ab ab1)
    {
        super(ab1);
        d = new q(ab1.d());
        c = new ag(this, ab1);
    }

    static ah a(af af1)
    {
        return af1.a;
    }

    private void a(ComponentName componentname)
    {
        m();
        if (b != null)
        {
            b = null;
            a("Disconnected from device AnalyticsService", componentname);
            g();
        }
    }

    static void a(af af1, ComponentName componentname)
    {
        af1.a(componentname);
    }

    static void a(af af1, e e1)
    {
        af1.a(e1);
    }

    private void a(e e1)
    {
        m();
        b = e1;
        e();
        t().f();
    }

    static void b(af af1)
    {
        af1.f();
    }

    private void e()
    {
        d.a();
        c.a(q().v());
    }

    private void f()
    {
        m();
        if (!b())
        {
            return;
        } else
        {
            b("Inactivity, disconnecting from device AnalyticsService");
            d();
            return;
        }
    }

    private void g()
    {
        t().d();
    }

    protected void a()
    {
    }

    public boolean a(d d1)
    {
        u.a(d1);
        m();
        D();
        e e1 = b;
        if (e1 == null)
        {
            return false;
        }
        String s;
        java.util.List list;
        if (d1.f())
        {
            s = q().o();
        } else
        {
            s = q().p();
        }
        list = Collections.emptyList();
        try
        {
            e1.a(d1.b(), d1.d(), s, list);
            e();
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            b("Failed to send hits to AnalyticsService");
            return false;
        }
        return true;
    }

    public boolean b()
    {
        m();
        D();
        return b != null;
    }

    public boolean c()
    {
        m();
        D();
        if (b != null)
        {
            return true;
        }
        e e1 = a.a();
        if (e1 != null)
        {
            b = e1;
            e();
            return true;
        } else
        {
            return false;
        }
    }

    public void d()
    {
        m();
        D();
        try
        {
            com.google.android.gms.common.stats.b.a().a(o(), a);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (b != null)
        {
            b = null;
            g();
        }
    }
}
