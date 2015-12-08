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
//            gg, fk, fi, ay, 
//            gb, cm, an, gs, 
//            k, g, ff, gr

public class fb extends gg
    implements ff.a
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


    private final Context mContext;
    private final Object mw = new Object();
    private cm pR;
    private final fa.a sU;
    private final Object sV = new Object();
    private final fi.a sW;
    private final k sX;
    private gg sY;
    private fk sZ;

    public fb(Context context, fi.a a1, k k1, fa.a a2)
    {
        sU = a2;
        mContext = context;
        sW = a1;
        sX = k1;
    }

    private ay a(fi fi1)
        throws a
    {
        if (sZ.tL == null)
        {
            throw new a("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = sZ.tL.split("x");
        if (aobj.length != 2)
        {
            throw new a((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(sZ.tL).toString(), 0);
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
        catch (fi fi1)
        {
            throw new a((new StringBuilder()).append("Could not parse the ad size from the ad response: ").append(sZ.tL).toString(), 0);
        }
        aobj = fi1.lH.oh;
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
                return new ay(ay1, fi1.lH.oh);
            }
        }

        throw new a((new StringBuilder()).append("The ad size from the ad response was not one of the requested sizes: ").append(sZ.tL).toString(), 0);
    }

    static Object a(fb fb1)
    {
        return fb1.mw;
    }

    static fa.a b(fb fb1)
    {
        return fb1.sU;
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

    private void cx()
        throws a
    {
        if (sZ.errorCode != -3)
        {
            if (TextUtils.isEmpty(sZ.tG))
            {
                throw new a("No fill from ad server.", 3);
            }
            gb.a(mContext, sZ.tF);
            if (sZ.tI)
            {
                try
                {
                    pR = new cm(sZ.tG);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new a((new StringBuilder()).append("Could not parse mediation config: ").append(sZ.tG).toString(), 0);
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
        } while (sZ == null);
        synchronized (sV)
        {
            sY = null;
        }
        if (sZ.errorCode != -2 && sZ.errorCode != -3)
        {
            throw new a((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(sZ.errorCode).toString(), sZ.errorCode);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void r(boolean flag)
    {
        gb.cU().v(flag);
        an an1 = gb.cU().l(mContext);
        if (an1 != null && !an1.isAlive())
        {
            gs.S("start fetching content...");
            an1.aV();
        }
    }

    public void a(fk fk1)
    {
        synchronized (mw)
        {
            gs.S("Received ad response.");
            sZ = fk1;
            mw.notify();
        }
        return;
        fk1;
        obj;
        JVM INSTR monitorexit ;
        throw fk1;
    }

    public void co()
    {
        Object obj2 = mw;
        obj2;
        JVM INSTR monitorenter ;
        fi fi1;
        gs.S("AdLoaderBackgroundTask started.");
        String s = sX.z().a(mContext);
        fi1 = new fi(sW, s);
        int i;
        long l;
        long l1;
        i = -2;
        l1 = -1L;
        l = l1;
        long l2 = SystemClock.elapsedRealtime();
        l = l1;
        Object obj1 = ff.a(mContext, fi1, this);
        l = l1;
        Object obj = sV;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        sY = ((gg) (obj1));
        if (sY == null)
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
        gs.U(exception.getMessage());
_L9:
        if (sZ != null) goto _L5; else goto _L4
_L4:
        sZ = new fk(i);
_L10:
        gr.wC.post(new Runnable() {

            final fb ta;

            public void run()
            {
                ta.onStop();
            }

            
            {
                ta = fb.this;
                super();
            }
        });
_L8:
        boolean flag = TextUtils.isEmpty(sZ.tQ);
        if (flag) goto _L7; else goto _L6
_L6:
        exception = new JSONObject(sZ.tQ);
_L11:
        obj = new fz.a(fi1, sZ, pR, ((ay) (obj)), i, l, sZ.tM, exception);
        gr.wC.post(new Runnable(((fz.a) (obj))) {

            final fb ta;
            final fz.a tb;

            public void run()
            {
                synchronized (fb.a(ta))
                {
                    fb.b(ta).a(tb);
                }
                return;
                exception1;
                obj3;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                ta = fb.this;
                tb = a1;
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
        cx();
        l = l1;
        if (fi1.lH.oh == null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        l = l1;
        obj = a(fi1);
_L13:
        r(sZ.tT);
        l = l1;
          goto _L8
_L3:
        gs.W(exception.getMessage());
          goto _L9
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        sZ = new fk(i, sZ.qj);
          goto _L10
        exception;
        gs.b("Error parsing the JSON for Active View.", exception);
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
        synchronized (sV)
        {
            if (sY != null)
            {
                sY.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
