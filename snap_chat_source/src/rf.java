// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class rf extends rb
{

    private static boolean g = true;
    private boolean h;

    public rf()
    {
        JY jy = Ka.PROMO_LENSES_METADATA_CACHE;
        LB lb = new LB();
        ri ri1 = ri.a();
        Bus bus = Mf.a();
        Bt.a();
        new PC();
        this(jy, lb, ri1, bus);
    }

    private rf(JY jy, LB lb, ri ri1, Bus bus)
    {
        super(jy, lb, ri1, bus);
        h = false;
    }

    static boolean a(rf rf1)
    {
        rf1.h = false;
        return false;
    }

    private boolean b(BQ bq)
    {
        if (!f)
        {
            return false;
        }
        boolean flag;
        synchronized (d)
        {
            flag = e.containsKey(bq.mLensId);
        }
        return flag;
        bq;
        obj;
        JVM INSTR monitorexit ;
        throw bq;
    }

    static boolean g()
    {
        g = false;
        return false;
    }

    protected final void a(Map map)
    {
        super.a(map);
        b.a(new Nz());
    }

    protected final long c()
    {
        return TimeUnit.DAYS.toMillis(7L);
    }

    protected final Class d()
    {
        return BY;
    }

    public final void e()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (f) goto _L2; else goto _L1
_L1:
        Timber.i("PromoLensesDataSource", "shouldCheckPromoLenses: 'false', waiting for initialization.", new Object[0]);
_L3:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!h)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Timber.i("PromoLensesDataSource", "shouldCheckPromoLenses: 'false', already checking", new Object[0]);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        Timber.i("PromoLensesDataSource", "shouldCheckPromoLenses: 'true', because of app re-launch.", new Object[0]);
        flag = true;
          goto _L3
        als als1;
        als1 = Bt.bV();
        if (!PB.b().c(als1.ak_()))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        Timber.i("PromoLensesDataSource", "shouldCheckPromoLenses: 'true', because last check was at %s", new Object[] {
            als1
        });
        flag = true;
          goto _L3
        Timber.i("PromoLensesDataSource", "shouldCheckPromoLenses: 'false', previous check was at %s", new Object[] {
            als1
        });
          goto _L3
        h = true;
        (new pG(new pG.a() {

            private rf a;

            public final void a(Sf sf, pi pi)
            {
                Timber.i("PromoLensesDataSource", "onScheduleLoadFailed [\n\tNetworkResult=%s,\n\tStoreLenses=%s\n]", new Object[] {
                    pi, sf
                });
                rf.a(a);
            }

            public final void a(List list, int i)
            {
                Timber.i("PromoLensesDataSource", "onPromoLensesLoaded [\n\t%s\n]", new Object[] {
                    list
                });
                Timber.i("PromoLensesDataSource", "onPromoLensesLoaded display count = %d", new Object[] {
                    Integer.valueOf(i)
                });
                a.a();
                HashSet hashset = new HashSet();
                BY by;
                for (Iterator iterator = list.iterator(); iterator.hasNext(); hashset.add(by.mGplayIapId))
                {
                    by = (BY)iterator.next();
                    a.a(by);
                }

                Set set = Bt.cd();
                if (set != null && !set.equals(hashset))
                {
                    Timber.i("PromoLensesDataSource", "onPromoLensesLoaded send ReCreateCheckoutEvent", new Object[] {
                        list
                    });
                    Bt.a(hashset);
                    a.b.a(new ND());
                }
                rf.g();
                Bt.b(PB.b());
                Bt.g(i);
                rf.a(a);
                a.b.a(new Nz());
            }

            
            {
                a = rf.this;
                super();
            }
        })).execute();
          goto _L4
    }

    public final List f()
    {
        Object obj1;
        obj1 = new ArrayList();
        if (!f)
        {
            return ((List) (obj1));
        }
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.entrySet().iterator(); iterator.hasNext(); ((List) (obj1)).add(((java.util.Map.Entry)iterator.next()).getValue())) { }
        break MISSING_BLOCK_LABEL_77;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
    }

    public final void onPrepareLens(Nu nu)
    {
        if ((nu.lens instanceof BY) && b((BQ)nu.lens))
        {
            PG.b(new Runnable(nu) {

                private Nu a;
                private rf b;

                public final void run()
                {
                    b.a((BY)a.lens, false);
                }

            
            {
                b = rf.this;
                a = nu;
                super();
            }
            });
        }
    }

}
