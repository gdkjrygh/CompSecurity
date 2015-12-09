// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import java.util.Collections;

public final class bni extends bnd
{

    final bnj a = new bnj(this);
    bmk b;
    private final bnu c;
    private bmv d;

    protected bni(bnf bnf1)
    {
        super(bnf1);
        d = new bmv(bnf1.c);
        c = new bnu(bnf1) {

            private bni d;

            public final void a()
            {
                bni.a(d);
            }

            
            {
                d = bni.this;
                super(bnf1);
            }
        };
    }

    static void a(bni bni1)
    {
        bnf.i();
        if (bni1.b())
        {
            bni1.b("Inactivity, disconnecting from device AnalyticsService");
            bni1.e();
        }
    }

    protected final void a()
    {
    }

    public final boolean a(bmj bmj1)
    {
        btl.a(bmj1);
        bnf.i();
        m();
        bmk bmk1 = b;
        if (bmk1 == null)
        {
            return false;
        }
        String s;
        java.util.List list;
        if (bmj1.f)
        {
            s = bns.h();
        } else
        {
            s = bns.i();
        }
        list = Collections.emptyList();
        try
        {
            bmk1.a(bmj1.a, bmj1.d, s, list);
            c();
        }
        // Misplaced declaration of an exception variable
        catch (bmj bmj1)
        {
            b("Failed to send hits to AnalyticsService");
            return false;
        }
        return true;
    }

    public final boolean b()
    {
        bnf.i();
        m();
        return b != null;
    }

    final void c()
    {
        d.a();
        c.a(((Long)bnz.A.a).longValue());
    }

    public final boolean d()
    {
        bnf.i();
        m();
        if (b != null)
        {
            return true;
        }
        bmk bmk1 = a.a();
        if (bmk1 != null)
        {
            b = bmk1;
            c();
            return true;
        } else
        {
            return false;
        }
    }

    public final void e()
    {
        bnf.i();
        m();
        try
        {
            bto.a();
            bto.a(super.f.a, a);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (b != null)
        {
            b = null;
            super.f.c().d();
        }
    }
}
