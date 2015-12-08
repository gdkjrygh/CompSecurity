// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import com.cmcm.adsdk.a;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.e;
import com.picksinit.ICallBack;
import com.picksinit.PicksMob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            w, z, h, m, 
//            d

public final class y extends w
{

    ICallBack a;
    private List b;
    private Object c;
    private int d;
    private AtomicBoolean e;

    protected y(Context context, String s)
    {
        super(context, s, "cm");
        b = null;
        c = new Object();
        d = 0;
        e = new AtomicBoolean(false);
        a = new z(this);
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "CmPicksNative");
        b = new ArrayList();
    }

    static AtomicBoolean a(y y1)
    {
        return y1.e;
    }

    static void a(y y1, String s)
    {
        y1.a(s);
    }

    private void a(String s)
    {
        if (mNativeAdListener != null)
        {
            mNativeAdListener.a(getAdName(), s);
            com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "CMPicks onNativeFailed");
        }
    }

    private boolean a()
    {
label0:
        {
            synchronized (c)
            {
                if (b != null && !b.isEmpty())
                {
                    break label0;
                }
            }
            return false;
        }
        com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "to remove has installed ad");
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            m m1 = (m)iterator.next();
            if (!m1.n())
            {
                com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", (new StringBuilder("adpool remove invalid ad title:")).append(m1.d()).toString());
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_111;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", (new StringBuilder("adpool size:")).append(b.size()).toString());
        boolean flag;
        if (b.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    static Object b(y y1)
    {
        return y1.c;
    }

    private static boolean b()
    {
        try
        {
            Class.forName("com.cleanmaster.ui.app.market.Ad");
            Class.forName("com.picksinit.ICallBack");
            Class.forName("com.picksinit.PicksMob");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return true;
    }

    static List c(y y1)
    {
        return y1.b;
    }

    private void c()
    {
        if (!com.cmcm.adsdk.a.d())
        {
            com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "sdk has stop work");
            return;
        }
        if (e.get())
        {
            com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "isLoading ,avoid repeat load");
            return;
        }
        e.set(true);
        if (requestParams != null && requestParams.d())
        {
            PicksMob.getInstance().loadad(d, Integer.valueOf(mPositionId).intValue(), a, 10, 0);
            d = d + 1;
            return;
        } else
        {
            PicksMob.getInstance().loadad(Integer.valueOf(mPositionId).intValue(), a, 10, 0);
            d = 0;
            return;
        }
    }

    private void d()
    {
        if (!a())
        {
            com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "candidate mAdPool empty ");
            a("10002");
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_109;
            }
        } while (!((m)iterator.next()).n());
        if (mNativeAdListener == null || !a())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        d d1;
        synchronized (c)
        {
            d1 = (d)b.get(0);
        }
        mNativeAdListener.a(d1);
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void d(y y1)
    {
        y1.d();
    }

    protected final List getAdList(int i)
    {
        int j;
        j = 0;
        com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "getAdList");
        if (com.cmcm.adsdk.a.d()) goto _L2; else goto _L1
_L1:
        com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "sdk has stop work");
_L4:
        return null;
_L2:
        if (!a()) goto _L4; else goto _L3
_L3:
        ArrayList arraylist = new ArrayList();
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        int k = b.size();
_L5:
        if (j >= Math.min(i, k))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        d d1 = (d)b.remove(0);
        d1.a();
        arraylist.add(d1);
        j++;
          goto _L5
        if (b.isEmpty())
        {
            com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "adpool is empty,preload Ad");
            c();
        }
        obj;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void loadAd()
    {
        com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "loadAd");
        if (a())
        {
            com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "adpool has valid ad");
            d();
            return;
        }
        com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", "PicksMob request");
        if (b())
        {
            c();
            return;
        } else
        {
            a("10003");
            return;
        }
    }

    protected final void removeAdFromPool(com.cmcm.a.a.a a1)
    {
        com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", (new StringBuilder("Picsk ad title:")).append(a1.d()).toString());
        if (requestParams == null || requestParams != null && requestParams.a())
        {
            com.cmcm.adsdk.b.c.b.a("PicksNativeLoader", (new StringBuilder("adpool remove ad title:")).append(a1.d()).append(", adpool size:").append(b.size()).toString());
            synchronized (c)
            {
                b.remove(a1);
            }
            return;
        } else
        {
            return;
        }
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }
}
