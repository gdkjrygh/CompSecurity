// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            em, du, ds, al, 
//            bk, bq, bm, et, 
//            eu, k, g, dp, 
//            ef, ex, do, eo, 
//            bt, ey

public class dn extends em
    implements dp.a, ey.a
{
    private static final class a extends Exception
    {

        private final int pJ;

        public int getErrorCode()
        {
            return pJ;
        }

        public a(String s, int i)
        {
            super(s);
            pJ = i;
        }
    }


    private final bt kB;
    private final ex lN;
    private final Object ls = new Object();
    private final Context mContext;
    private bm nf;
    private final k pA;
    private em pB;
    private du pC;
    private boolean pD;
    private bk pE;
    private bq pF;
    private final dm.a px;
    private final Object py = new Object();
    private final ds.a pz;

    public dn(Context context, ds.a a1, k k1, ex ex1, bt bt, dm.a a2)
    {
        pD = false;
        kB = bt;
        px = a2;
        lN = ex1;
        mContext = context;
        pz = a1;
        pA = k1;
    }

    private al a(ds ds1)
        throws a
    {
        if (pC.qj == null)
        {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = pC.qj.split("x");
        if (aobj.length != 2)
        {
            throw new a((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(pC.qj).toString(), 0);
        }
        int i1;
        int j1;
        int k1;
        try
        {
            i1 = Integer.parseInt(aobj[0]);
            j1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (ds ds1)
        {
            throw new a((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(pC.qj).toString(), 0);
        }
        aobj = ds1.kT.mg;
        k1 = aobj.length;
        al al1;
        int j;
        int l;
        for (int i = 0; i < k1; i++)
        {
            al1 = aobj[i];
            float f1 = mContext.getResources().getDisplayMetrics().density;
            if (al1.width == -1)
            {
                j = (int)((float)al1.widthPixels / f1);
            } else
            {
                j = al1.width;
            }
            if (al1.height == -2)
            {
                l = (int)((float)al1.heightPixels / f1);
            } else
            {
                l = al1.height;
            }
            if (i1 == j && j1 == l)
            {
                return new al(al1, ds1.kT.mg);
            }
        }

        throw new a((new StringBuilder()).append("The ad size from the ad response was not one of the requested sizes: ").append(pC.qj).toString(), 0);
    }

    static Object a(dn dn1)
    {
        return dn1.ls;
    }

    private void a(ds ds1, long l)
        throws a
    {
        synchronized (py)
        {
            pE = new bk(mContext, ds1, kB, nf);
        }
        pF = pE.a(l, 60000L);
        switch (pF.nL)
        {
        default:
            throw new a((new StringBuilder()).append("Unexpected mediation result: ").append(pF.nL).toString(), 0);

        case 1: // '\001'
            throw new a("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        ds1;
        obj;
        JVM INSTR monitorexit ;
        throw ds1;
    }

    static dm.a b(dn dn1)
    {
        return dn1.px;
    }

    private void bn()
        throws a
    {
        if (pC.errorCode != -3)
        {
            if (TextUtils.isEmpty(pC.qe))
            {
                throw new a("No fill from ad server.", 3);
            }
            if (pC.qg)
            {
                try
                {
                    nf = new bm(pC.qe);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new a((new StringBuilder()).append("Could not parse mediation config: ").append(pC.qe).toString(), 0);
                }
            }
        }
    }

    static du c(dn dn1)
    {
        return dn1.pC;
    }

    private boolean c(long l)
        throws a
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            ls.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new a("Ad request cancelled.", -1);
        }
        return true;
    }

    static ex d(dn dn1)
    {
        return dn1.lN;
    }

    private void e(long l)
        throws a
    {
        et.sv.post(new Runnable() {

            final dn pG;

            public void run()
            {
label0:
                {
                    synchronized (dn.a(pG))
                    {
                        if (dn.c(pG).errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                dn.d(pG).cb().a(pG);
                if (dn.c(pG).errorCode != -3)
                {
                    break MISSING_BLOCK_LABEL_119;
                }
                eu.C((new StringBuilder()).append("Loading URL in WebView: ").append(dn.c(pG).oA).toString());
                dn.d(pG).loadUrl(dn.c(pG).oA);
_L1:
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                eu.C("Loading HTML in WebView.");
                dn.d(pG).loadDataWithBaseURL(eo.v(dn.c(pG).oA), dn.c(pG).qe, "text/html", "UTF-8", null);
                  goto _L1
            }

            
            {
                pG = dn.this;
                super();
            }
        });
        h(l);
    }

    private void g(long l)
        throws a
    {
        do
        {
            if (!c(l))
            {
                throw new a("Timed out waiting for ad response.", 2);
            }
        } while (pC == null);
        synchronized (py)
        {
            pB = null;
        }
        if (pC.errorCode != -2 && pC.errorCode != -3)
        {
            throw new a((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(pC.errorCode).toString(), pC.errorCode);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void h(long l)
        throws a
    {
        do
        {
            if (!c(l))
            {
                throw new a("Timed out waiting for WebView to finish loading.", 2);
            }
        } while (!pD);
    }

    public void a(du du1)
    {
        synchronized (ls)
        {
            eu.z("Received ad response.");
            pC = du1;
            ls.notify();
        }
        return;
        du1;
        obj;
        JVM INSTR monitorexit ;
        throw du1;
    }

    public void a(ex ex1)
    {
        synchronized (ls)
        {
            eu.z("WebView finished loading.");
            pD = true;
            ls.notify();
        }
        return;
        exception;
        ex1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void bh()
    {
        Object obj6 = ls;
        obj6;
        JVM INSTR monitorenter ;
        Object obj3;
        eu.z("AdLoaderBackgroundTask started.");
        Object obj1 = pA.z();
        String s = ((g) (obj1)).b(mContext);
        obj1 = ((g) (obj1)).a(mContext);
        obj3 = new ds(pz, s, ((String) (obj1)));
        Object obj;
        Object obj2;
        bl bl;
        int i;
        long l;
        long l1;
        obj = null;
        bl = null;
        i = -2;
        l1 = -1L;
        obj2 = bl;
        l = l1;
        long l2 = SystemClock.elapsedRealtime();
        obj2 = bl;
        l = l1;
        Object obj5 = dp.a(mContext, ((ds) (obj3)), this);
        obj2 = bl;
        l = l1;
        Object obj4 = py;
        obj2 = bl;
        l = l1;
        obj4;
        JVM INSTR monitorenter ;
        pB = ((em) (obj5));
        if (pB == null)
        {
            throw new a("Could not start the ad request service.", 0);
        }
          goto _L1
        obj;
        obj4;
        JVM INSTR monitorexit ;
        obj2 = bl;
        l = l1;
        ai ai;
        ex ex1;
        java.util.List list;
        java.util.List list1;
        java.util.List list2;
        String s1;
        bm bm1;
        int j;
        boolean flag;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        i = ((a) (obj)).getErrorCode();
        if (i != 3 && i != -1) goto _L3; else goto _L2
_L2:
        eu.B(((a) (obj)).getMessage());
_L16:
        if (pC != null) goto _L5; else goto _L4
_L4:
        pC = new du(i);
_L17:
        et.sv.post(new Runnable() {

            final dn pG;

            public void run()
            {
                pG.onStop();
            }

            
            {
                pG = dn.this;
                super();
            }
        });
        obj = obj2;
_L23:
        flag = TextUtils.isEmpty(pC.qo);
        if (flag) goto _L7; else goto _L6
_L6:
        obj2 = new JSONObject(pC.qo);
_L18:
        ai = ((ds) (obj3)).pX;
        ex1 = lN;
        list = pC.nt;
        list1 = pC.nu;
        list2 = pC.qi;
        j = pC.orientation;
        l1 = pC.nx;
        s1 = ((ds) (obj3)).qa;
        flag = pC.qg;
        if (pF == null) goto _L9; else goto _L8
_L8:
        bl = pF.nM;
_L19:
        if (pF == null) goto _L11; else goto _L10
_L10:
        obj3 = pF.nN;
_L20:
        if (pF == null) goto _L13; else goto _L12
_L12:
        obj4 = pF.nO;
_L21:
        bm1 = nf;
        if (pF == null) goto _L15; else goto _L14
_L14:
        obj5 = pF.nP;
_L22:
        obj = new ef(ai, ex1, list, i, list1, list2, j, l1, s1, flag, bl, ((bu) (obj3)), ((String) (obj4)), bm1, ((bo) (obj5)), pC.qh, ((al) (obj)), pC.qf, l, pC.qk, pC.ql, ((JSONObject) (obj2)));
        et.sv.post(new Runnable(((ef) (obj))) {

            final dn pG;
            final ef pH;

            public void run()
            {
                synchronized (dn.a(pG))
                {
                    dn.b(pG).a(pH);
                }
                return;
                exception;
                obj7;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                pG = dn.this;
                pH = ef1;
                super();
            }
        });
        obj6;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj4;
        JVM INSTR monitorexit ;
        obj2 = bl;
        l = l1;
        g(l2);
        obj2 = bl;
        l = l1;
        l1 = SystemClock.elapsedRealtime();
        obj2 = bl;
        l = l1;
        bn();
        obj2 = bl;
        l = l1;
        if (((ds) (obj3)).kT.mg == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        obj2 = bl;
        l = l1;
        obj = a(((ds) (obj3)));
        obj2 = obj;
        l = l1;
        if (!pC.qg)
        {
            break MISSING_BLOCK_LABEL_586;
        }
        obj2 = obj;
        l = l1;
        a(((ds) (obj3)), l2);
        break MISSING_BLOCK_LABEL_707;
        obj2 = obj;
        l = l1;
        if (!pC.qm)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        obj2 = obj;
        l = l1;
        f(l2);
        break MISSING_BLOCK_LABEL_707;
        obj6;
        JVM INSTR monitorexit ;
        throw obj;
        obj2 = obj;
        l = l1;
        e(l2);
        break MISSING_BLOCK_LABEL_707;
_L3:
        eu.D(((a) (obj)).getMessage());
          goto _L16
_L5:
        pC = new du(i, pC.nx);
          goto _L17
        obj2;
        eu.b("Error parsing the JSON for Active View.", ((Throwable) (obj2)));
_L7:
        obj2 = null;
          goto _L18
_L9:
        bl = null;
          goto _L19
_L11:
        obj3 = null;
          goto _L20
_L13:
        obj4 = null;
          goto _L21
_L15:
        obj5 = null;
          goto _L22
        l = l1;
          goto _L23
    }

    protected void f(long l)
        throws a
    {
        Object obj = lN.V();
        int i;
        int j;
        if (((al) (obj)).mf)
        {
            j = mContext.getResources().getDisplayMetrics().widthPixels;
            i = mContext.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            j = ((al) (obj)).widthPixels;
            i = ((al) (obj)).heightPixels;
        }
        obj = new do(this, lN, j, i);
        et.sv.post(new Runnable(((do) (obj))) {

            final dn pG;
            final do pI;

            public void run()
            {
label0:
                {
                    synchronized (dn.a(pG))
                    {
                        if (dn.c(pG).errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                dn.d(pG).cb().a(pG);
                pI.b(dn.c(pG));
                obj1;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                pG = dn.this;
                pI = do1;
                super();
            }
        });
        h(l);
        if (((do) (obj)).bq())
        {
            eu.z("Ad-Network indicated no fill with passback URL.");
            throw new a("AdNetwork sent passback url", 3);
        }
        if (!((do) (obj)).br())
        {
            throw new a("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }

    public void onStop()
    {
        synchronized (py)
        {
            if (pB != null)
            {
                pB.cancel();
            }
            lN.stopLoading();
            eo.a(lN);
            if (pE != null)
            {
                pE.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
