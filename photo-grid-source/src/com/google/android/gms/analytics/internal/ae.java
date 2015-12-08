// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.stats.b;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            y, p, aa, ag, 
//            af, s, bh, bi, 
//            bb, d, az, e

public final class ae extends y
{

    private final ag a = new ag(this);
    private e b;
    private final bb c;
    private p d;

    protected ae(aa aa1)
    {
        super(aa1);
        d = new p(aa1.c());
        c = new af(this, aa1);
    }

    static ag a(ae ae1)
    {
        return ae1.a;
    }

    static void a(ae ae1, ComponentName componentname)
    {
        aa.r();
        if (ae1.b != null)
        {
            ae1.b = null;
            ae1.a("Disconnected from device AnalyticsService", componentname);
            ae1.r().d();
        }
    }

    static void a(ae ae1, e e1)
    {
        aa.r();
        ae1.b = e1;
        ae1.e();
        ae1.r().e();
    }

    static void b(ae ae1)
    {
        aa.r();
        if (ae1.b())
        {
            ae1.b("Inactivity, disconnecting from device AnalyticsService");
            ae1.d();
        }
    }

    private void e()
    {
        d.a();
        c.a(((Long)bh.K.a()).longValue());
    }

    protected final void a()
    {
    }

    public final boolean a(d d1)
    {
        bl.a(d1);
        aa.r();
        B();
        e e1 = b;
        if (e1 == null)
        {
            return false;
        }
        String s1;
        java.util.List list;
        if (d1.e())
        {
            s1 = az.h();
        } else
        {
            s1 = az.i();
        }
        list = Collections.emptyList();
        try
        {
            e1.a(d1.b(), d1.d(), s1, list);
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

    public final boolean b()
    {
        aa.r();
        B();
        return b != null;
    }

    public final boolean c()
    {
        aa.r();
        B();
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

    public final void d()
    {
        aa.r();
        B();
        try
        {
            com.google.android.gms.common.stats.b.a().a(m(), a);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (b != null)
        {
            b = null;
            r().d();
        }
    }
}
