// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;

public final class lpo extends jyz
{

    final Looper f;
    public final int g;
    final Context h;
    final lqr i;
    public final String j;
    public lfi k;
    volatile lpn l;
    private lpr m;

    private lpo(Context context, lqr lqr, Looper looper, String s, int i1, lps lps1, lpr lpr1, 
            lfi lfi1, kdh kdh, lsq lsq)
    {
        if (looper == null)
        {
            lps1 = Looper.getMainLooper();
        } else
        {
            lps1 = looper;
        }
        super(lps1);
        h = context;
        i = lqr;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        f = context;
        j = s;
        g = i1;
        m = lpr1;
        k = lfi1;
        new kso();
        context = lqk.a();
        if ((((lqk) (context)).a == lql.b || ((lqk) (context)).a == lql.c) && j.equals(((lqk) (context)).b))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            a(lqk.a().c);
        }
    }

    public lpo(Context context, lqr lqr, Looper looper, String s, int i1, lpt lpt1)
    {
        this(context, lqr, looper, s, i1, new lps(context, s), new lpr(context, s, lpt1), new lfi(context), kdj.c(), ((lsq) (new lsc(30, 0xdbba0L, 5000L, "refreshing", kdj.c()))));
        k.c = lpt1.a;
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (m != null)
        {
            m.a(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected final jyw a(Status status)
    {
        return c(status);
    }

    protected final lpn c(Status status)
    {
        if (l != null)
        {
            return l;
        }
        if (status == Status.d)
        {
            lqh.a("timer expired: setting result to failure");
        }
        return new lpn(status);
    }
}
