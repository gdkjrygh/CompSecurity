// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.Collections;

public final class jro extends jsw
{

    final jrq a = new jrq(this);
    private jtf b;
    private final jtb c;
    private jsu e;

    protected jro(jrk jrk1)
    {
        super(jrk1);
        e = new jsu(jrk1.c);
        c = new jrp(this, jrk1);
    }

    static void a(jro jro1)
    {
        jrk.i();
        if (jro1.b())
        {
            jro1.b("Inactivity, disconnecting from device AnalyticsService");
            jro1.d();
        }
    }

    static void a(jro jro1, ComponentName componentname)
    {
        jrk.i();
        if (jro1.b != null)
        {
            jro1.b = null;
            jro1.a("Disconnected from device AnalyticsService", componentname);
            ((jrj) (jro1)).d.c().b();
        }
    }

    static void a(jro jro1, jtf jtf1)
    {
        jrk.i();
        jro1.b = jtf1;
        jro1.e();
        ((jrj) (jro1)).d.c().d();
    }

    private void e()
    {
        e.a();
        c.a(((Long)jsl.A.a()).longValue());
    }

    protected final void a()
    {
    }

    public final boolean a(jsn jsn1)
    {
        b.d(jsn1);
        jrk.i();
        r();
        jtf jtf1 = b;
        if (jtf1 == null)
        {
            return false;
        }
        String s;
        java.util.List list;
        if (jsn1.f)
        {
            s = jsh.h();
        } else
        {
            s = jsh.i();
        }
        list = Collections.emptyList();
        try
        {
            jtf1.a(jsn1.a, jsn1.d, s, list);
            e();
        }
        // Misplaced declaration of an exception variable
        catch (jsn jsn1)
        {
            b("Failed to send hits to AnalyticsService");
            return false;
        }
        return true;
    }

    public final boolean b()
    {
        jrk.i();
        r();
        return b != null;
    }

    public final boolean c()
    {
        jrk.i();
        r();
        if (b != null)
        {
            return true;
        }
        jtf jtf1 = a.a();
        if (jtf1 != null)
        {
            b = jtf1;
            e();
            return true;
        } else
        {
            return false;
        }
    }

    public final void d()
    {
        jrk.i();
        r();
        try
        {
            kcz.a().a(h(), a);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (b != null)
        {
            b = null;
            super.d.c().b();
        }
    }
}
