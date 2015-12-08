// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class lqb
    implements lqe
{

    private static lqb a;
    private static final Object b = new Object();
    private lsq c;
    private lrp d;

    private lqb(Context context)
    {
        this(((lrp) (lrq.a(context))), ((lsq) (new ltl())));
    }

    private lqb(lrp lrp1, lsq lsq1)
    {
        d = lrp1;
        c = lsq1;
    }

    public static lqe a(Context context)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = new lqb(context);
            }
            context = a;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final boolean a(String s)
    {
        if (!c.a())
        {
            lqh.b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        } else
        {
            d.a(s);
            return true;
        }
    }

}
