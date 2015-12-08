// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            af, q, aa, ac, 
//            d, n, u, f, 
//            e

class r extends af
{

    private static final Object tQ = new Object();
    private static r uc;
    private Context mContext;
    private Handler mHandler;
    private d tR;
    private volatile f tS;
    private int tT;
    private boolean tU;
    private boolean tV;
    private String tW;
    private boolean tX;
    private boolean tY;
    private e tZ;
    private q ua;
    private boolean ub;

    private r()
    {
        tT = 1800;
        tU = true;
        tX = true;
        tY = true;
        tZ = new e() {

            final r ud;

            public void s(boolean flag)
            {
                ud.a(flag, r.a(ud));
            }

            
            {
                ud = r.this;
                super();
            }
        };
        ub = false;
    }

    static boolean a(r r1)
    {
        return r1.tX;
    }

    static int b(r r1)
    {
        return r1.tT;
    }

    static boolean c(r r1)
    {
        return r1.ub;
    }

    private void cA()
    {
        ua = new q(this);
        ua.s(mContext);
    }

    private void cB()
    {
        mHandler = new Handler(mContext.getMainLooper(), new android.os.Handler.Callback() {

            final r ud;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && r.cE().equals(message.obj))
                {
                    u.cP().u(true);
                    ud.dispatchLocalHits();
                    u.cP().u(false);
                    if (r.b(ud) > 0 && !r.c(ud))
                    {
                        r.d(ud).sendMessageDelayed(r.d(ud).obtainMessage(1, r.cE()), r.b(ud) * 1000);
                    }
                }
                return true;
            }

            
            {
                ud = r.this;
                super();
            }
        });
        if (tT > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, tQ), tT * 1000);
        }
    }

    static Object cE()
    {
        return tQ;
    }

    public static r cz()
    {
        if (uc == null)
        {
            uc = new r();
        }
        return uc;
    }

    static Handler d(r r1)
    {
        return r1.mHandler;
    }

    void a(Context context, f f1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = mContext;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mContext = context.getApplicationContext();
        if (tS == null)
        {
            tS = f1;
            if (tU)
            {
                dispatchLocalHits();
                tU = false;
            }
            if (tV)
            {
                cn();
                tV = false;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ub != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = tX;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (tT > 0)
        {
            mHandler.removeMessages(1, tQ);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (tT > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, tQ), tT * 1000);
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        aa.C(stringbuilder.append(((String) (obj))).toString());
        ub = flag;
        tX = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    d cC()
    {
        this;
        JVM INSTR monitorenter ;
        if (tR != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (mContext == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        tR = new ac(tZ, mContext);
        if (tW != null)
        {
            tR.cm().M(tW);
            tW = null;
        }
        d d1;
        if (mHandler == null)
        {
            cB();
        }
        if (ua == null && tY)
        {
            cA();
        }
        d1 = tR;
        this;
        JVM INSTR monitorexit ;
        return d1;
    }

    void cD()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ub && tX && tT > 0)
        {
            mHandler.removeMessages(1, tQ);
            mHandler.sendMessage(mHandler.obtainMessage(1, tQ));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void cn()
    {
        if (tS == null)
        {
            aa.C("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            tV = true;
            return;
        } else
        {
            u.cP().a(u.a.vY);
            tS.cn();
            return;
        }
    }

    void dispatchLocalHits()
    {
        this;
        JVM INSTR monitorenter ;
        if (tS != null) goto _L2; else goto _L1
_L1:
        aa.C("Dispatch call queued. Dispatch will run once initialization is complete.");
        tU = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u.cP().a(u.a.vL);
        tS.cl();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void setLocalDispatchPeriod(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (mHandler != null) goto _L2; else goto _L1
_L1:
        aa.C("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
        tT = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u.cP().a(u.a.vM);
        if (!ub && tX && tT > 0)
        {
            mHandler.removeMessages(1, tQ);
        }
        tT = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!ub && tX)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, tQ), i * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void t(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(ub, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
