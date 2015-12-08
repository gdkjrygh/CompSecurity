// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.ads.mediation.admob.AdMobAdapter;

// Referenced classes of package com.google.android.gms.internal:
//            gf, cp, cv, gq, 
//            gr, fj, fh, fy, 
//            gu, ay, fb, gi, 
//            cy, cr, gv

public class fd extends gf
    implements gv.a
{
    private static final class a extends Exception
    {

        private final int tq;

        public int getErrorCode()
        {
            return tq;
        }

        public a(String s, int i)
        {
            super(s);
            tq = i;
        }
    }


    private final cy lA;
    private final Context mContext;
    private final Object mH = new Object();
    private final gu mo;
    private cr qi;
    private final fc.a tA;
    private final fy.a tB;
    private boolean tC;
    private cp tD;
    private cv tE;
    private final Object tj = new Object();
    private fj tn;

    public fd(Context context, fy.a a1, gu gu1, cy cy, fc.a a2)
    {
        tC = false;
        mContext = context;
        tB = a1;
        tn = a1.vK;
        mo = gu1;
        lA = cy;
        tA = a2;
        qi = a1.vE;
    }

    static Object a(fd fd1)
    {
        return fd1.mH;
    }

    private void a(fh fh1, long l)
        throws a
    {
        synchronized (tj)
        {
            tD = new cp(mContext, fh1, lA, qi);
        }
        tE = tD.a(l, 60000L);
        switch (tE.qO)
        {
        default:
            throw new a((new StringBuilder()).append("Unexpected mediation result: ").append(tE.qO).toString(), 0);

        case 1: // '\001'
            throw new a("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        fh1;
        obj;
        JVM INSTR monitorexit ;
        throw fh1;
    }

    static fc.a b(fd fd1)
    {
        return fd1.tA;
    }

    static fj c(fd fd1)
    {
        return fd1.tn;
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
            mH.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new a("Ad request cancelled.", -1);
        }
        return true;
    }

    static gu d(fd fd1)
    {
        return fd1.mo;
    }

    private void f(long l)
        throws a
    {
        gq.wR.post(new Runnable() {

            final fd tF;

            public void run()
            {
label0:
                {
                    synchronized (fd.a(tF))
                    {
                        if (fd.c(tF).errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                fd.d(tF).dD().a(tF);
                if (fd.c(tF).errorCode != -3)
                {
                    break MISSING_BLOCK_LABEL_119;
                }
                gr.V((new StringBuilder()).append("Loading URL in WebView: ").append(fd.c(tF).sg).toString());
                fd.d(tF).loadUrl(fd.c(tF).sg);
_L1:
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                gr.V("Loading HTML in WebView.");
                fd.d(tF).loadDataWithBaseURL(gi.L(fd.c(tF).sg), fd.c(tF).tU, "text/html", "UTF-8", null);
                  goto _L1
            }

            
            {
                tF = fd.this;
                super();
            }
        });
        h(l);
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
        } while (!tC);
    }

    public void a(gu gu1)
    {
        synchronized (mH)
        {
            gr.S("WebView finished loading.");
            tC = true;
            mH.notify();
        }
        return;
        exception;
        gu1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cx()
    {
        Object obj2 = mH;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        int i;
        gr.S("AdRendererBackgroundTask started.");
        obj = tB.vJ;
        i = tB.errorCode;
        long l = SystemClock.elapsedRealtime();
        if (!tn.tW) goto _L2; else goto _L1
_L1:
        a(((fh) (obj)), l);
_L11:
        av av;
        gu gu1;
        java.util.List list;
        java.util.List list1;
        java.util.List list2;
        String s1;
        int j;
        boolean flag;
        av = ((fh) (obj)).tL;
        gu1 = mo;
        list = tn.qw;
        list1 = tn.qx;
        list2 = tn.tY;
        j = tn.orientation;
        l = tn.qA;
        s1 = ((fh) (obj)).tO;
        flag = tn.tW;
        if (tE == null) goto _L4; else goto _L3
_L3:
        obj = tE.qP;
_L18:
        Object obj1;
        if (tE == null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        obj1 = tE.qQ;
_L19:
        if (tE == null) goto _L6; else goto _L5
_L5:
        String s = tE.qR;
_L16:
        cr cr = qi;
        if (tE == null) goto _L8; else goto _L7
_L7:
        ct ct = tE.qS;
_L17:
        obj = new fy(av, gu1, list, i, list1, list2, j, l, s1, flag, ((cq) (obj)), ((cz) (obj1)), s, cr, ct, tn.tX, tB.lS, tn.tV, tB.vG, tn.ua, tn.ub, tB.vD, null);
        gq.wR.post(new Runnable(((fy) (obj))) {

            final fd tF;
            final fy tG;

            public void run()
            {
                synchronized (fd.a(tF))
                {
                    fd.b(tF).a(tG);
                }
                return;
                exception;
                obj3;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                tF = fd.this;
                tG = fy1;
                super();
            }
        });
        return;
_L2:
        if (!tn.uc) goto _L10; else goto _L9
_L9:
        g(l);
          goto _L11
        obj1;
        i = ((a) (obj1)).getErrorCode();
        if (i != 3 && i != -1) goto _L13; else goto _L12
_L12:
        gr.U(((a) (obj1)).getMessage());
_L14:
        if (tn != null)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        tn = new fj(i);
_L15:
        gq.wR.post(new Runnable() {

            final fd tF;

            public void run()
            {
                tF.onStop();
            }

            
            {
                tF = fd.this;
                super();
            }
        });
          goto _L11
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L10:
        f(l);
          goto _L11
_L13:
        gr.W(((a) (obj1)).getMessage());
          goto _L14
        tn = new fj(i, tn.qA);
          goto _L15
_L6:
        s = com/google/ads/mediation/admob/AdMobAdapter.getName();
          goto _L16
_L8:
        ct = null;
          goto _L17
_L4:
        obj = null;
          goto _L18
        obj1 = null;
          goto _L19
    }

    protected void g(long l)
        throws a
    {
        Object obj = mo.ac();
        int i;
        int j;
        if (((ay) (obj)).oq)
        {
            j = mContext.getResources().getDisplayMetrics().widthPixels;
            i = mContext.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            j = ((ay) (obj)).widthPixels;
            i = ((ay) (obj)).heightPixels;
        }
        obj = new fb(this, mo, j, i);
        gq.wR.post(new Runnable(((fb) (obj))) {

            final fd tF;
            final fb tH;

            public void run()
            {
label0:
                {
                    synchronized (fd.a(tF))
                    {
                        if (fd.c(tF).errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                fd.d(tF).dD().a(tF);
                tH.b(fd.c(tF));
                obj1;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                tF = fd.this;
                tH = fb1;
                super();
            }
        });
        h(l);
        if (((fb) (obj)).cH())
        {
            gr.S("Ad-Network indicated no fill with passback URL.");
            throw new a("AdNetwork sent passback url", 3);
        }
        if (!((fb) (obj)).cI())
        {
            throw new a("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }

    public void onStop()
    {
        synchronized (tj)
        {
            mo.stopLoading();
            gi.a(mo);
            if (tD != null)
            {
                tD.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
