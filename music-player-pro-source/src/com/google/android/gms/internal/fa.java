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
//            gf, fj, fh, ay, 
//            ga, cr, an, gr, 
//            k, g, fe, gq

public class fa extends gf
    implements fe.a
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


    private final Context mContext;
    private final Object mH = new Object();
    private cr qi;
    private final ez.a ti;
    private final Object tj = new Object();
    private final fh.a tk;
    private final k tl;
    private gf tm;
    private fj tn;

    public fa(Context context, fh.a a1, k k1, ez.a a2)
    {
        ti = a2;
        mContext = context;
        tk = a1;
        tl = k1;
    }

    private ay a(fh fh1)
        throws a
    {
        if (tn.tZ == null)
        {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = tn.tZ.split("x");
        if (aobj.length != 2)
        {
            throw new a((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(tn.tZ).toString(), 0);
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
        catch (fh fh1)
        {
            throw new a((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(tn.tZ).toString(), 0);
        }
        aobj = fh1.lS.or;
        k1 = aobj.length;
        ay ay1;
        int j;
        int l;
        for (int i = 0; i < k1; i++)
        {
            ay1 = aobj[i];
            float f = mContext.getResources().getDisplayMetrics().density;
            if (ay1.width == -1)
            {
                j = (int)((float)ay1.widthPixels / f);
            } else
            {
                j = ay1.width;
            }
            if (ay1.height == -2)
            {
                l = (int)((float)ay1.heightPixels / f);
            } else
            {
                l = ay1.height;
            }
            if (i1 == j && j1 == l)
            {
                return new ay(ay1, fh1.lS.or);
            }
        }

        throw new a((new StringBuilder()).append("The ad size from the ad response was not one of the requested sizes: ").append(tn.tZ).toString(), 0);
    }

    static Object a(fa fa1)
    {
        return fa1.mH;
    }

    static ez.a b(fa fa1)
    {
        return fa1.ti;
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

    private void cE()
        throws a
    {
        if (tn.errorCode != -3)
        {
            if (TextUtils.isEmpty(tn.tU))
            {
                throw new a("No fill from ad server.", 3);
            }
            ga.a(mContext, tn.tT);
            if (tn.tW)
            {
                try
                {
                    qi = new cr(tn.tU);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new a((new StringBuilder()).append("Could not parse mediation config: ").append(tn.tU).toString(), 0);
                }
            }
        }
    }

    private void e(long l)
        throws a
    {
        do
        {
            if (!c(l))
            {
                throw new a("Timed out waiting for ad response.", 2);
            }
        } while (tn == null);
        synchronized (tj)
        {
            tm = null;
        }
        if (tn.errorCode != -2 && tn.errorCode != -3)
        {
            throw new a((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(tn.errorCode).toString(), tn.errorCode);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void t(boolean flag)
    {
        ga.dc().x(flag);
        an an1 = ga.dc().l(mContext);
        if (an1 != null && !an1.isAlive())
        {
            gr.S("start fetching content...");
            an1.ba();
        }
    }

    public void a(fj fj1)
    {
        synchronized (mH)
        {
            gr.S("Received ad response.");
            tn = fj1;
            mH.notify();
        }
        return;
        fj1;
        obj;
        JVM INSTR monitorexit ;
        throw fj1;
    }

    public void cx()
    {
        Object obj2 = mH;
        obj2;
        JVM INSTR monitorenter ;
        fh fh1;
        gr.S("AdLoaderBackgroundTask started.");
        String s = tl.C().a(mContext);
        fh1 = new fh(tk, s);
        int i;
        long l;
        long l1;
        i = -2;
        l1 = -1L;
        l = l1;
        long l2 = SystemClock.elapsedRealtime();
        l = l1;
        Object obj1 = fe.a(mContext, fh1, this);
        l = l1;
        Object obj = tj;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        tm = ((gf) (obj1));
        if (tm == null)
        {
            throw new a("Could not start the ad request service.", 0);
        }
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        throw exception;
        exception;
        obj = null;
_L12:
        i = exception.getErrorCode();
        if (i != 3 && i != -1) goto _L3; else goto _L2
_L2:
        gr.U(exception.getMessage());
_L9:
        if (tn != null) goto _L5; else goto _L4
_L4:
        tn = new fj(i);
_L10:
        gq.wR.post(new Runnable() {

            final fa to;

            public void run()
            {
                to.onStop();
            }

            
            {
                to = fa.this;
                super();
            }
        });
_L8:
        boolean flag = TextUtils.isEmpty(tn.ue);
        if (flag) goto _L7; else goto _L6
_L6:
        exception = new JSONObject(tn.ue);
_L11:
        obj = new fy.a(fh1, tn, qi, ((ay) (obj)), i, l, tn.ua, exception);
        gq.wR.post(new Runnable(((fy.a) (obj))) {

            final fa to;
            final fy.a tp;

            public void run()
            {
                synchronized (fa.a(to))
                {
                    fa.b(to).a(tp);
                }
                return;
                exception1;
                obj3;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                to = fa.this;
                tp = a1;
                super();
            }
        });
        obj2;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        e(l2);
        l = l1;
        l1 = SystemClock.elapsedRealtime();
        l = l1;
        cE();
        l = l1;
        if (fh1.lS.or == null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        l = l1;
        obj = a(fh1);
_L13:
        t(tn.uh);
        l = l1;
          goto _L8
_L3:
        gr.W(exception.getMessage());
          goto _L9
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        tn = new fj(i, tn.qA);
          goto _L10
        exception;
        gr.b("Error parsing the JSON for Active View.", exception);
_L7:
        exception = null;
          goto _L11
        exception;
        l = l1;
          goto _L12
        obj = null;
          goto _L13
    }

    public void onStop()
    {
        synchronized (tj)
        {
            if (tm != null)
            {
                tm.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
