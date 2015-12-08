// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            af, q, aa, u, 
//            f, ac, d, n, 
//            e

class r extends af
{

    private static final Object sF = new Object();
    private static r sR;
    private Context mContext;
    private Handler mHandler;
    private d sG;
    private volatile f sH;
    private int sI;
    private boolean sJ;
    private boolean sK;
    private String sL;
    private boolean sM;
    private boolean sN;
    private e sO;
    private q sP;
    private boolean sQ;

    private r()
    {
        sI = 1800;
        sJ = true;
        sM = true;
        sN = true;
        sO = new e() {

            final r sS;

            public void r(boolean flag)
            {
                sS.a(flag, r.a(sS));
            }

            
            {
                sS = r.this;
                super();
            }
        };
        sQ = false;
    }

    static boolean a(r r1)
    {
        return r1.sM;
    }

    static int b(r r1)
    {
        return r1.sI;
    }

    static boolean c(r r1)
    {
        return r1.sQ;
    }

    public static r ci()
    {
        if (sR == null)
        {
            sR = new r();
        }
        return sR;
    }

    private void cj()
    {
        sP = new q(this);
        sP.o(mContext);
    }

    private void ck()
    {
        mHandler = new Handler(mContext.getMainLooper(), new android.os.Handler.Callback() {

            final r sS;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && r.cn().equals(message.obj))
                {
                    u.cy().t(true);
                    sS.dispatchLocalHits();
                    u.cy().t(false);
                    if (r.b(sS) > 0 && !r.c(sS))
                    {
                        r.d(sS).sendMessageDelayed(r.d(sS).obtainMessage(1, r.cn()), r.b(sS) * 1000);
                    }
                }
                return true;
            }

            
            {
                sS = r.this;
                super();
            }
        });
        if (sI > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, sF), sI * 1000);
        }
    }

    static Object cn()
    {
        return sF;
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
        if (sH == null)
        {
            sH = f1;
            if (sJ)
            {
                dispatchLocalHits();
                sJ = false;
            }
            if (sK)
            {
                bY();
                sK = false;
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
        if (sQ != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = sM;
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
        if (sI > 0)
        {
            mHandler.removeMessages(1, sF);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (sI > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, sF), sI * 1000);
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
        aa.y(stringbuilder.append(((String) (obj))).toString());
        sQ = flag;
        sM = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void bY()
    {
        if (sH == null)
        {
            aa.y("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            sK = true;
            return;
        } else
        {
            u.cy().a(u.a.uN);
            sH.bY();
            return;
        }
    }

    d cl()
    {
        this;
        JVM INSTR monitorenter ;
        if (sG != null)
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
        sG = new ac(sO, mContext);
        if (sL != null)
        {
            sG.bX().F(sL);
            sL = null;
        }
        d d1;
        if (mHandler == null)
        {
            ck();
        }
        if (sP == null && sN)
        {
            cj();
        }
        d1 = sG;
        this;
        JVM INSTR monitorexit ;
        return d1;
    }

    void cm()
    {
        this;
        JVM INSTR monitorenter ;
        if (!sQ && sM && sI > 0)
        {
            mHandler.removeMessages(1, sF);
            mHandler.sendMessage(mHandler.obtainMessage(1, sF));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void dispatchLocalHits()
    {
        this;
        JVM INSTR monitorenter ;
        if (sH != null) goto _L2; else goto _L1
_L1:
        aa.y("Dispatch call queued. Dispatch will run once initialization is complete.");
        sJ = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u.cy().a(u.a.uA);
        sH.bW();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void s(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(sQ, flag);
        this;
        JVM INSTR monitorexit ;
        return;
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
        aa.y("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
        sI = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u.cy().a(u.a.uB);
        if (!sQ && sM && sI > 0)
        {
            mHandler.removeMessages(1, sF);
        }
        sI = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!sQ && sM)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, sF), i * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
