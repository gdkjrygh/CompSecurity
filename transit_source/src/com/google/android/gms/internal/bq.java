// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.internal:
//            cg, an, at, bw, 
//            ap, cm, cn, h, 
//            d, bu, br, ce, 
//            cq, ci, aw, cr

public final class bq extends cg
    implements br.a, cr.a
{
    private static final class a extends Exception
    {

        private final int gw;

        public int getErrorCode()
        {
            return gw;
        }

        public a(String s, int i)
        {
            super(s);
            gw = i;
        }
    }


    private final aw dZ;
    private final Object eJ = new Object();
    private ap eK;
    private final cq fG;
    private final bp.a gm;
    private final bu.a gn;
    private final h go;
    private cg gp;
    private bw gq;
    private boolean gr;
    private an gs;
    private at gt;
    private final Context mContext;

    public bq(Context context, bu.a a1, h h1, cq cq1, aw aw, bp.a a2)
    {
        gr = false;
        dZ = aw;
        gm = a2;
        fG = cq1;
        mContext = context;
        gn = a1;
        go = h1;
    }

    static Object a(bq bq1)
    {
        return bq1.eJ;
    }

    private void a(bu bu1, long l)
        throws a
    {
        gs = new an(mContext, bu1, dZ, eK);
        gt = gs.a(l, 60000L);
        switch (gt.fl)
        {
        default:
            throw new a((new StringBuilder()).append("Unexpected mediation result: ").append(gt.fl).toString(), 0);

        case 1: // '\001'
            throw new a("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
    }

    private void ad()
        throws a
    {
        if (gq.errorCode != -3)
        {
            if (TextUtils.isEmpty(gq.gG))
            {
                throw new a("No fill from ad server.", 3);
            }
            if (gq.gI)
            {
                try
                {
                    eK = new ap(gq.gG);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new a((new StringBuilder()).append("Could not parse mediation config: ").append(gq.gG).toString(), 0);
                }
            }
        }
    }

    static bp.a b(bq bq1)
    {
        return bq1.gm;
    }

    private void b(long l)
        throws a
    {
        cm.hO.post(new Runnable() {

            final bq gu;

            public void run()
            {
label0:
                {
                    synchronized (bq.a(gu))
                    {
                        if (bq.c(gu).errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                bq.d(gu).aw().a(gu);
                if (bq.c(gu).errorCode != -3)
                {
                    break MISSING_BLOCK_LABEL_119;
                }
                cn.p((new StringBuilder()).append("Loading URL in WebView: ").append(bq.c(gu).fW).toString());
                bq.d(gu).loadUrl(bq.c(gu).fW);
_L1:
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                cn.p("Loading HTML in WebView.");
                bq.d(gu).loadDataWithBaseURL(ci.j(bq.c(gu).fW), bq.c(gu).gG, "text/html", "UTF-8", null);
                  goto _L1
            }

            
            {
                gu = bq.this;
                super();
            }
        });
        d(l);
    }

    static bw c(bq bq1)
    {
        return bq1.gq;
    }

    private void c(long l)
        throws a
    {
        do
        {
            if (!e(l))
            {
                throw new a("Timed out waiting for ad response.", 2);
            }
        } while (gq == null);
        gp = null;
        if (gq.errorCode != -2 && gq.errorCode != -3)
        {
            throw new a((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(gq.errorCode).toString(), gq.errorCode);
        } else
        {
            return;
        }
    }

    static cq d(bq bq1)
    {
        return bq1.fG;
    }

    private void d(long l)
        throws a
    {
        do
        {
            if (!e(l))
            {
                throw new a("Timed out waiting for WebView to finish loading.", 2);
            }
        } while (!gr);
    }

    private boolean e(long l)
        throws a
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            eJ.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new a("Ad request cancelled.", -1);
        }
        return true;
    }

    public void a(bw bw1)
    {
        synchronized (eJ)
        {
            cn.m("Received ad response.");
            gq = bw1;
            eJ.notify();
        }
        return;
        bw1;
        obj;
        JVM INSTR monitorexit ;
        throw bw1;
    }

    public void a(cq cq1)
    {
        synchronized (eJ)
        {
            cn.m("WebView finished loading.");
            gr = true;
            eJ.notify();
        }
        return;
        exception;
        cq1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void ac()
    {
        Object obj2 = eJ;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        cn.m("AdLoaderBackgroundTask started.");
        obj = go.g().a(mContext);
        obj = new bu(gn, ((String) (obj)));
        int i = -2;
        long l;
        l = SystemClock.elapsedRealtime();
        gp = br.a(mContext, ((bu) (obj)), this);
        if (gp == null)
        {
            throw new a("Could not start the ad request service.", 0);
        }
          goto _L1
        Object obj1;
        obj1;
        i = ((a) (obj1)).getErrorCode();
        if (i != 3 && i != -1) goto _L3; else goto _L2
_L2:
        cn.o(((a) (obj1)).getMessage());
_L11:
        gq = new bw(i);
        cm.hO.post(new Runnable() {

            final bq gu;

            public void run()
            {
                gu.onStop();
            }

            
            {
                gu = bq.this;
                super();
            }
        });
_L10:
        v v;
        cq cq1;
        java.util.List list;
        java.util.List list1;
        java.util.List list2;
        String s1;
        int j;
        boolean flag;
        v = ((bu) (obj)).gB;
        cq1 = fG;
        list = gq.eW;
        list1 = gq.eX;
        list2 = gq.gK;
        j = gq.orientation;
        l = gq.fa;
        s1 = ((bu) (obj)).gE;
        flag = gq.gI;
        if (gt == null) goto _L5; else goto _L4
_L4:
        obj = gt.fm;
_L12:
        if (gt == null) goto _L7; else goto _L6
_L6:
        obj1 = gt.fn;
_L13:
        if (gt == null) goto _L9; else goto _L8
_L8:
        String s = gt.fo;
_L14:
        ar ar;
        ap ap1;
        ap1 = eK;
        if (gt == null)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        ar = gt.fp;
_L15:
        obj = new ce(v, cq1, list, i, list1, list2, j, l, s1, flag, ((ao) (obj)), ((ax) (obj1)), s, ap1, ar, gq.gJ, gq.gH);
        cm.hO.post(new Runnable(((ce) (obj))) {

            final bq gu;
            final ce gv;

            public void run()
            {
                synchronized (bq.a(gu))
                {
                    bq.b(gu).a(gv);
                }
                return;
                exception;
                obj3;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                gu = bq.this;
                gv = ce1;
                super();
            }
        });
        obj2;
        JVM INSTR monitorexit ;
        return;
_L1:
        c(l);
        ad();
        if (!gq.gI)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        a(((bu) (obj)), l);
          goto _L10
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        b(l);
          goto _L10
_L3:
        cn.q(((a) (obj1)).getMessage());
          goto _L11
_L5:
        obj = null;
          goto _L12
_L7:
        obj1 = null;
          goto _L13
_L9:
        s = null;
          goto _L14
        ar = null;
          goto _L15
    }

    public void onStop()
    {
        synchronized (eJ)
        {
            if (gp != null)
            {
                gp.cancel();
            }
            fG.stopLoading();
            ci.a(fG);
            if (gs != null)
            {
                gs.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
