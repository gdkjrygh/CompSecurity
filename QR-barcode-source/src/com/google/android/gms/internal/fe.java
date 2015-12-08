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
//            gg, ck, cq, gr, 
//            gs, fk, fi, fz, 
//            gv, ay, fc, gj, 
//            ct, cm, gw

public class fe extends gg
    implements gw.a
{
    private static final class a extends Exception
    {

        private final int tc;

        public int getErrorCode()
        {
            return tc;
        }

        public a(String s, int i)
        {
            super(s);
            tc = i;
        }
    }


    private final ct lq;
    private final Context mContext;
    private final gv md;
    private final Object mw = new Object();
    private cm pR;
    private final Object sV = new Object();
    private fk sZ;
    private final fd.a tm;
    private final fz.a tn;
    private boolean to;
    private ck tp;
    private cq tq;

    public fe(Context context, fz.a a1, gv gv1, ct ct, fd.a a2)
    {
        to = false;
        mContext = context;
        tn = a1;
        sZ = a1.vw;
        md = gv1;
        lq = ct;
        tm = a2;
        pR = a1.vq;
    }

    static Object a(fe fe1)
    {
        return fe1.mw;
    }

    private void a(fi fi1, long l)
        throws a
    {
        synchronized (sV)
        {
            tp = new ck(mContext, fi1, lq, pR);
        }
        tq = tp.a(l, 60000L);
        switch (tq.qx)
        {
        default:
            throw new a((new StringBuilder()).append("Unexpected mediation result: ").append(tq.qx).toString(), 0);

        case 1: // '\001'
            throw new a("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        fi1;
        obj;
        JVM INSTR monitorexit ;
        throw fi1;
    }

    static fd.a b(fe fe1)
    {
        return fe1.tm;
    }

    static fk c(fe fe1)
    {
        return fe1.sZ;
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
            mw.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new a("Ad request cancelled.", -1);
        }
        return true;
    }

    static gv d(fe fe1)
    {
        return fe1.md;
    }

    private void f(long l)
        throws a
    {
        gr.wC.post(new Runnable() {

            final fe tr;

            public void run()
            {
label0:
                {
                    synchronized (fe.a(tr))
                    {
                        if (fe.c(tr).errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                fe.d(tr).du().a(tr);
                if (fe.c(tr).errorCode != -3)
                {
                    break MISSING_BLOCK_LABEL_119;
                }
                gs.V((new StringBuilder()).append("Loading URL in WebView: ").append(fe.c(tr).rP).toString());
                fe.d(tr).loadUrl(fe.c(tr).rP);
_L1:
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                gs.V("Loading HTML in WebView.");
                fe.d(tr).loadDataWithBaseURL(gj.L(fe.c(tr).rP), fe.c(tr).tG, "text/html", "UTF-8", null);
                  goto _L1
            }

            
            {
                tr = fe.this;
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
        } while (!to);
    }

    public void a(gv gv1)
    {
        synchronized (mw)
        {
            gs.S("WebView finished loading.");
            to = true;
            mw.notify();
        }
        return;
        exception;
        gv1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void co()
    {
        Object obj2 = mw;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        int i;
        gs.S("AdRendererBackgroundTask started.");
        obj = tn.vv;
        i = tn.errorCode;
        long l = SystemClock.elapsedRealtime();
        if (!sZ.tI) goto _L2; else goto _L1
_L1:
        a(((fi) (obj)), l);
_L11:
        av av;
        gv gv1;
        java.util.List list;
        java.util.List list1;
        java.util.List list2;
        String s1;
        int j;
        boolean flag;
        av = ((fi) (obj)).tx;
        gv1 = md;
        list = sZ.qf;
        list1 = sZ.qg;
        list2 = sZ.tK;
        j = sZ.orientation;
        l = sZ.qj;
        s1 = ((fi) (obj)).tA;
        flag = sZ.tI;
        if (tq == null) goto _L4; else goto _L3
_L3:
        obj = tq.qy;
_L18:
        Object obj1;
        if (tq == null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        obj1 = tq.qz;
_L19:
        if (tq == null) goto _L6; else goto _L5
_L5:
        String s = tq.qA;
_L16:
        cm cm = pR;
        if (tq == null) goto _L8; else goto _L7
_L7:
        co co1 = tq.qB;
_L17:
        obj = new fz(av, gv1, list, i, list1, list2, j, l, s1, flag, ((cl) (obj)), ((cu) (obj1)), s, cm, co1, sZ.tJ, tn.lH, sZ.tH, tn.vs, sZ.tM, sZ.tN, tn.vp, null);
        gr.wC.post(new Runnable(((fz) (obj))) {

            final fe tr;
            final fz ts;

            public void run()
            {
                synchronized (fe.a(tr))
                {
                    fe.b(tr).a(ts);
                }
                return;
                exception;
                obj3;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                tr = fe.this;
                ts = fz1;
                super();
            }
        });
        return;
_L2:
        if (!sZ.tO) goto _L10; else goto _L9
_L9:
        g(l);
          goto _L11
        obj1;
        i = ((a) (obj1)).getErrorCode();
        if (i != 3 && i != -1) goto _L13; else goto _L12
_L12:
        gs.U(((a) (obj1)).getMessage());
_L14:
        if (sZ != null)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        sZ = new fk(i);
_L15:
        gr.wC.post(new Runnable() {

            final fe tr;

            public void run()
            {
                tr.onStop();
            }

            
            {
                tr = fe.this;
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
        gs.W(((a) (obj1)).getMessage());
          goto _L14
        sZ = new fk(i, sZ.qj);
          goto _L15
_L6:
        s = com/google/ads/mediation/admob/AdMobAdapter.getName();
          goto _L16
_L8:
        co1 = null;
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
        Object obj = md.Y();
        int i;
        int j;
        if (((ay) (obj)).og)
        {
            j = mContext.getResources().getDisplayMetrics().widthPixels;
            i = mContext.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            j = ((ay) (obj)).widthPixels;
            i = ((ay) (obj)).heightPixels;
        }
        obj = new fc(this, md, j, i);
        gr.wC.post(new Runnable(((fc) (obj))) {

            final fe tr;
            final fc tt;

            public void run()
            {
label0:
                {
                    synchronized (fe.a(tr))
                    {
                        if (fe.c(tr).errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                fe.d(tr).du().a(tr);
                tt.b(fe.c(tr));
                obj1;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                tr = fe.this;
                tt = fc1;
                super();
            }
        });
        h(l);
        if (((fc) (obj)).cA())
        {
            gs.S("Ad-Network indicated no fill with passback URL.");
            throw new a("AdNetwork sent passback url", 3);
        }
        if (!((fc) (obj)).cB())
        {
            throw new a("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }

    public void onStop()
    {
        synchronized (sV)
        {
            md.stopLoading();
            gj.a(md);
            if (tp != null)
            {
                tp.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
