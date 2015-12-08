// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class lfi
{

    final lgb a;
    final kdh b;
    public String c;
    Map d;
    private final Context e;
    private final Map f;

    public lfi(Context context)
    {
        this(context, ((Map) (new HashMap())), new lgb(context), kdj.c());
    }

    private lfi(Context context, Map map, lgb lgb1, kdh kdh1)
    {
        c = null;
        d = new HashMap();
        e = context;
        b = kdh1;
        a = lgb1;
        f = map;
    }

    final void a(lfh lfh1, lfk lfk)
    {
        lgb lgb1 = a;
        String s = lfh1.a();
        Integer integer = lfh1.b;
        lfn lfn = lfo.a;
        lfh1 = new lfj(this, lfh1, lfk);
        lgb1.d.execute(new lgc(lgb1, s, integer, lfn, lfh1));
    }

    public final void a(lfp lfp1, lfk lfk, lgj lgj)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = lfp1.a.iterator();
        boolean flag = false;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            lfh lfh1 = (lfh)((Iterator) (obj)).next();
            lfm lfm1 = (lfm)d.get(lfh1.a);
            long l;
            if (lfm1 != null)
            {
                l = lfm1.a;
            } else
            {
                l = a.a(lfh1.a);
            }
            if (l + 0xdbba0L < b.a())
            {
                flag = true;
            }
        } while (true);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        obj = (lgm)f.get(lfp1.a());
        lfk = ((lfk) (obj));
        if (obj == null)
        {
            if (c == null)
            {
                lfk = new lgm();
            } else
            {
                lfk = new lgm(c);
            }
            f.put(lfp1.a(), lfk);
        }
        obj = e;
        lfk;
        JVM INSTR monitorenter ;
        lqh.d("ResourceLoaderScheduler: Loading new resource.");
        if (((lgm) (lfk)).b == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        lfk;
        JVM INSTR monitorexit ;
        return;
        if (((lgm) (lfk)).c == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        lfp1 = new lgl(((Context) (obj)), lfp1, lgj, ((lgm) (lfk)).c);
_L1:
        lfk.b = ((lgm) (lfk)).a.schedule(lfp1, 0L, TimeUnit.MILLISECONDS);
        lfk;
        JVM INSTR monitorexit ;
        return;
        lfp1;
        lfk;
        JVM INSTR monitorexit ;
        throw lfp1;
        lfp1 = new lgl(((Context) (obj)), lfp1, lgj);
          goto _L1
        lfp1 = lfp1.a;
        if (lfp1.size() != 1)
        {
            flag1 = false;
        }
        b.b(flag1);
        a((lfh)lfp1.get(0), lfk);
        return;
    }
}
