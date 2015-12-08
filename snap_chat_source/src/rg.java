// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class rg extends rb
{

    private static boolean g = true;
    private boolean h;

    public rg()
    {
        JY jy = Ka.PURCHASED_LENSES_METADATA_CACHE;
        LB lb = new LB();
        ri ri1 = ri.a();
        Bus bus = Mf.a();
        Bt.a();
        new PC();
        this(jy, lb, ri1, bus);
    }

    private rg(JY jy, LB lb, ri ri1, Bus bus)
    {
        super(jy, lb, ri1, bus);
        h = false;
    }

    static boolean a(rg rg1)
    {
        rg1.h = false;
        return false;
    }

    static boolean f()
    {
        g = false;
        return false;
    }

    public final volatile void a(BQ bq)
    {
        a((BY)bq);
    }

    public final void a(BY by)
    {
        super.a(by);
        Ka.LENSES_RESOURCES_CACHE.a(((BQ) (by)).mLensLink);
    }

    protected final void a(Map map)
    {
        super.a(map);
        b.a(new NA());
    }

    public final void a(boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (f) goto _L2; else goto _L1
_L1:
        Timber.i("PurchasedLensesDataSource", "shouldCheckPurchasedLenses: 'false', waiting for initialization.", new Object[0]);
_L3:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_152;
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
        Timber.i("PurchasedLensesDataSource", "shouldCheckPurchasedLenses: 'false', already checking", new Object[0]);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        Timber.i("PurchasedLensesDataSource", "shouldCheckPurchasedLenses: 'true', force check", new Object[0]);
        flag1 = true;
          goto _L3
        if (!g)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        Timber.i("PurchasedLensesDataSource", "shouldCheckPurchasedLenses: 'true', because of app re-launch.", new Object[0]);
        flag1 = true;
          goto _L3
        als als1;
        als1 = Bt.bW();
        if (!PB.b().c(als1.ak_()))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        Timber.i("PurchasedLensesDataSource", "shouldCheckPurchasedLenses: 'true', because last check was at %s", new Object[] {
            als1
        });
        flag1 = true;
          goto _L3
        Timber.i("PurchasedLensesDataSource", "shouldCheckPurchasedLenses: 'false', previous check was at %s", new Object[] {
            als1
        });
          goto _L3
        h = true;
        (new pH(new pH.a() {

            private rg a;

            public final void a(Tt tt, pi pi)
            {
                Timber.i("PurchasedLensesDataSource", "onPurchasedLensesLoadFailed [\n\tNetworkResult=%s,\n\tUserOwnedUnlockables=%s\n]", new Object[] {
                    pi, tt
                });
                rg.a(a);
            }

            public final void a(List list)
            {
                Timber.i("PurchasedLensesDataSource", "onPurchasedLensesLoaded [\n\t%s\n]", new Object[] {
                    list
                });
                a.a();
                BY by;
                for (list = list.iterator(); list.hasNext(); a.a(by))
                {
                    by = (BY)list.next();
                }

                rg.f();
                Bt.c(PB.b());
                rg.a(a);
                a.b.a(new NA());
            }

            
            {
                a = rg.this;
                super();
            }
        })).execute();
          goto _L4
    }

    public final boolean a(String s)
    {
        if (!f)
        {
            return false;
        }
        boolean flag;
        synchronized (d)
        {
            flag = e.containsKey(s);
        }
        return flag;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean b(BQ bq)
    {
        return a(bq.mLensId);
    }

    protected final long c()
    {
        return 0x7fffffffffffffffL;
    }

    protected final Class d()
    {
        return BY;
    }

    public final List e()
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
        for (Iterator iterator = e.entrySet().iterator(); iterator.hasNext(); ((List) (obj1)).add((BY)((java.util.Map.Entry)iterator.next()).getValue())) { }
        break MISSING_BLOCK_LABEL_80;
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
        if ((nu.lens instanceof BY) && b((BY)nu.lens))
        {
            PG.b(new Runnable(nu) {

                private Nu a;
                private rg b;

                public final void run()
                {
                    b.a((BY)a.lens, false);
                }

            
            {
                b = rg.this;
                a = nu;
                super();
            }
            });
        }
    }

}
