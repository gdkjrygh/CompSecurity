// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.android.location.UberLocation;
import com.ubercab.android.location.service.model.UberLocationRequest;

public final class cis extends civ
{

    private final Context b;
    private final civ c;

    public cis(Context context, cit cit1)
    {
        b = context;
        switch (_cls1.a[cit1.ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder("Unknown location client vendor: ")).append(cit1).toString());

        case 1: // '\001'
            cjc.a(b, true);
            c = new cja(b);
            return;

        case 2: // '\002'
            break;
        }
        if (f())
        {
            cjc.a(b, false);
        }
        c = new cjd(b);
    }

    private static boolean f()
    {
        try
        {
            Class.forName("com.baidu.location.f");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return true;
    }

    public final UberLocation a()
    {
        if (c.b())
        {
            return c.a();
        } else
        {
            return null;
        }
    }

    public final void a(ciw ciw)
    {
        c.a(ciw);
    }

    public final void a(UberLocationRequest uberlocationrequest)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(uberlocationrequest);
        this;
        JVM INSTR monitorexit ;
        return;
        uberlocationrequest;
        throw uberlocationrequest;
    }

    public final void b(ciw ciw)
    {
        c.b(ciw);
    }

    public final boolean b()
    {
        return c.b();
    }

    public final void c()
    {
        c.c();
    }

    public final void d()
    {
        c.d();
    }

    public final UberLocationRequest e()
    {
        this;
        JVM INSTR monitorenter ;
        UberLocationRequest uberlocationrequest = c.e();
        this;
        JVM INSTR monitorexit ;
        return uberlocationrequest;
        Exception exception;
        exception;
        throw exception;
    }

    /* member class not found */
    class _cls1 {}

}
