// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class lqr
{

    private static lqr g;
    public final lqu a;
    public final Context b;
    final lpu c;
    final ltm d;
    final ConcurrentMap e = new ConcurrentHashMap();
    public final lpt f = new lpt();

    private lqr(Context context, lqu lqu1, lpu lpu1, ltm ltm)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        b = context.getApplicationContext();
        d = ltm;
        a = lqu1;
        c = lpu1;
        c.a(new lqs(this));
        c.a(new lsz(b));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.registerComponentCallbacks(new lqt(this));
        }
    }

    public static lqr a(Context context)
    {
        lqr;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        lqh.a("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        lqr;
        JVM INSTR monitorexit ;
        throw context;
        g = new lqr(context, new lqu(), new lpu(new lur(context)), lqm.a());
        context = g;
        lqr;
        JVM INSTR monitorexit ;
        return context;
    }

    static void a(lqr lqr1, String s)
    {
        for (lqr1 = lqr1.e.keySet().iterator(); lqr1.hasNext(); ((lpn)lqr1.next()).a(s)) { }
    }

    public final jyt a(String s, int i, String s1)
    {
        lfi lfi1 = null;
        lpo lpo1 = a.a(b, this, null, s, -1, f);
        s = lfi1;
        if (lpo1.g != -1)
        {
            s = Integer.valueOf(lpo1.g);
        }
        lfi1 = lpo1.k;
        String s2 = lpo1.j;
        lpp lpp1 = new lpp(lpo1, s1);
        lfp lfp1 = new lfp();
        s = new lfh(s2, s, s1, false);
        b.d(s);
        for (s1 = lfp1.a.iterator(); s1.hasNext();)
        {
            if (((lfh)s1.next()).a.equals(((lfh) (s)).a))
            {
                throw new IllegalArgumentException((new StringBuilder("The container is already being requested. ")).append(((lfh) (s)).a).toString());
            }
        }

        lfp1.a.add(s);
        lfi1.a(lfp1, lpp1, new lfl(lfi1, lfp1, lfo.a, lpp1));
        return lpo1;
    }
}
