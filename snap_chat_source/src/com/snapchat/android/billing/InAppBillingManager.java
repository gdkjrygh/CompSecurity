// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.billing;

import anG;
import anM;
import android.text.TextUtils;
import android.util.SparseArray;
import aob;
import aok;
import aon;
import aoq;
import aox;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.android.util.debug.ReleaseManager;
import eB;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class InAppBillingManager
{
    public static final class SkuType extends Enum
    {

        private static final SkuType $VALUES[];
        public static final SkuType LENS;
        public static final SkuType REPLAY;

        public static SkuType valueOf(String s)
        {
            return (SkuType)Enum.valueOf(com/snapchat/android/billing/InAppBillingManager$SkuType, s);
        }

        public static SkuType[] values()
        {
            return (SkuType[])$VALUES.clone();
        }

        static 
        {
            REPLAY = new SkuType("REPLAY", 0);
            LENS = new SkuType("LENS", 1);
            $VALUES = (new SkuType[] {
                REPLAY, LENS
            });
        }

        private SkuType(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(aob.b b1, InAppBillingManager inappbillingmanager);
    }

    final class b
        implements aob.a
    {

        private InAppBillingManager a;

        public final void a(aob.c c1)
        {
            Timber.c("InAppBillingManager", "REPLAY-LOG: Inventory loaded", new Object[0]);
            InAppBillingManager.a(a, c1.a("inapp"));
            for (c1 = InAppBillingManager.b(a).iterator(); c1.hasNext(); ((a)c1.next()).a(InAppBillingManager.c(a), a)) { }
        }

        private b()
        {
            a = InAppBillingManager.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final Set c = eB.a(new String[] {
        "USD"
    });
    private static final Set d = eB.a(new String[] {
        "USD"
    });
    public anG a;
    public aob b;
    private final ReleaseManager e;
    private final List f;
    private aob.b g;

    public InAppBillingManager(anG ang)
    {
        this(ang, ReleaseManager.a(), ((List) (new ArrayList())));
    }

    private InAppBillingManager(anG ang, ReleaseManager releasemanager, List list)
    {
        Timber.c("InAppBillingManager", "REPLAY-LOG: Creating InAppBillingManager and initializing inventory", new Object[0]);
        a = ang;
        e = releasemanager;
        f = list;
    }

    static anG a(InAppBillingManager inappbillingmanager)
    {
        return inappbillingmanager.a;
    }

    static aob.b a(InAppBillingManager inappbillingmanager, aob.b b1)
    {
        inappbillingmanager.g = b1;
        return b1;
    }

    public static void a(Collection collection)
    {
        c.clear();
        c.addAll(collection);
    }

    static List b(InAppBillingManager inappbillingmanager)
    {
        return inappbillingmanager.f;
    }

    public static void b(Collection collection)
    {
        d.clear();
        d.addAll(collection);
    }

    static aob.b c(InAppBillingManager inappbillingmanager)
    {
        return inappbillingmanager.g;
    }

    private boolean c(String s, SkuType skutype)
    {
        s = a(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[SkuType.values().length];
                try
                {
                    a[SkuType.REPLAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SkuType.LENS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[skutype.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 64
    //                   2 86;
           goto _L3 _L4 _L5
_L3:
        throw new RuntimeException((new StringBuilder("SkuType isn't supported ")).append(skutype).toString());
_L4:
        boolean flag = c.contains(((aox) (s)).d.b);
_L6:
        if (flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        FeatureFlagManager.a();
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.SHOULD_IGNORE_BACKEND_STORE_AVAILABLE))
        {
            flag = true;
        } else
        {
            flag = d.contains(((aox) (s)).d.b);
        }
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }

    public final aox a(String s)
    {
label0:
        {
            if (!b() && e.c())
            {
                throw new RuntimeException("Attempt to get Sku when inventory has not loaded. Please check InAppBillingManager#areProductsReady before calling getSku");
            }
            if (g == null)
            {
                break label0;
            }
            Iterator iterator = Collections.unmodifiableList(g.d).iterator();
            aox aox1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                aox1 = (aox)iterator.next();
            } while (!TextUtils.equals(s, aox1.b));
            return aox1;
        }
        return null;
    }

    public final void a()
    {
        Timber.c("InAppBillingManager", "REPLAY-LOG: loadInventory", new Object[0]);
        if (b == null)
        {
            b = a.c();
            b.a(new b((byte)0));
            return;
        } else
        {
            b.b().a(new b((byte)0));
            return;
        }
    }

    public final void a(aoq aoq)
    {
        Timber.c("InAppBillingManager", "REPLAY-LOG: Creating purchase flow", new Object[0]);
        a.a(aoq);
    }

    public final void a(aox aox1, String s)
    {
        Timber.c("InAppBillingManager", (new StringBuilder("REPLAY-LOG: Initiating purchase ")).append(aox1.b).toString(), new Object[0]);
        a.a(new anS.b(aox1, s) {

            private aox a;
            private String b;
            private InAppBillingManager c;

            public final void a(anM anm)
            {
                Timber.c("InAppBillingManager", (new StringBuilder("REPLAY-LOG: purchase ready ")).append(a.b).toString(), new Object[0]);
                aox aox2 = a;
                String s1 = b;
                aok aok1 = (aok)InAppBillingManager.a(c).a.get(51966);
                if (aok1 == null)
                {
                    throw new IllegalArgumentException("Purchase flow doesn't exist. Have you forgotten to create it?");
                } else
                {
                    anm.a(aox2, s1, aok1);
                    return;
                }
            }

            
            {
                c = InAppBillingManager.this;
                a = aox1;
                b = s;
                super();
            }
        });
    }

    public final void a(a a1)
    {
        f.add(a1);
    }

    public final boolean a(String s, SkuType skutype)
    {
        if (!c(s, skutype)) goto _L2; else goto _L1
_L1:
        if (!b() && e.c())
        {
            throw new RuntimeException("Attempt to check if purchased when inventory has not loaded. Please check InAppBillingManager#areProductsReady before checking isPurchased");
        }
        if (g == null) goto _L4; else goto _L3
_L3:
        aoi.a a1;
        skutype = g;
        a1 = aoi.a.a;
        if (aon.a(((aob.b) (skutype)).c, s, a1) == null) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L6:
        if (!flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }

    public final String b(String s, SkuType skutype)
    {
        if (!c(s, skutype) && e.c())
        {
            throw new RuntimeException((new StringBuilder("Product with SKU ")).append(s).append(" is not available. Check isProductAvailable before calling getPriceString!").toString());
        }
        s = a(s);
        if (s != null)
        {
            return ((aox) (s)).c;
        } else
        {
            return null;
        }
    }

    public final boolean b()
    {
        return g != null;
    }

    public final void c()
    {
        Timber.c("InAppBillingManager", "REPLAY-LOG: Destroying purchase flow", new Object[0]);
        anG ang = a;
        aok aok1 = (aok)ang.a.get(51966);
        if (aok1 != null)
        {
            ang.a.delete(51966);
            ang.b.remove(Integer.valueOf(51966));
            aok1.a();
        }
    }


    // Unreferenced inner class com/snapchat/android/billing/InAppBillingManager$2

/* anonymous class */
    public final class _cls2 extends anS.b
    {

        private String a;
        private aoq b;

        public final void a(anM anm)
        {
            Timber.c("InAppBillingManager", (new StringBuilder("REPLAY-LOG: Consume ready ")).append(a).toString(), new Object[0]);
            anm.b(a, b);
        }

            public 
            {
                a = s;
                b = aoq;
                super();
            }
    }

}
