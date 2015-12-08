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

    private static final Object tT = new Object();
    private static r uf;
    private Context mContext;
    private Handler mHandler;
    private d tU;
    private volatile f tV;
    private int tW;
    private boolean tX;
    private boolean tY;
    private String tZ;
    private boolean ua;
    private boolean ub;
    private e uc;
    private q ud;
    private boolean ue;

    private r()
    {
        tW = 1800;
        tX = true;
        ua = true;
        ub = true;
        uc = new e() {

            final r ug;

            public void s(boolean flag)
            {
                ug.a(flag, r.a(ug));
            }

            
            {
                ug = r.this;
                super();
            }
        };
        ue = false;
    }

    static boolean a(r r1)
    {
        return r1.ua;
    }

    static int b(r r1)
    {
        return r1.tW;
    }

    static boolean c(r r1)
    {
        return r1.ue;
    }

    public static r cE()
    {
        if (uf == null)
        {
            uf = new r();
        }
        return uf;
    }

    private void cF()
    {
        ud = new q(this);
        ud.v(mContext);
    }

    private void cG()
    {
        mHandler = new Handler(mContext.getMainLooper(), new android.os.Handler.Callback() {

            final r ug;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && r.cJ().equals(message.obj))
                {
                    u.cU().u(true);
                    ug.dispatchLocalHits();
                    u.cU().u(false);
                    if (r.b(ug) > 0 && !r.c(ug))
                    {
                        r.d(ug).sendMessageDelayed(r.d(ug).obtainMessage(1, r.cJ()), r.b(ug) * 1000);
                    }
                }
                return true;
            }

            
            {
                ug = r.this;
                super();
            }
        });
        if (tW > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, tT), tW * 1000);
        }
    }

    static Object cJ()
    {
        return tT;
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
        if (tV == null)
        {
            tV = f1;
            if (tX)
            {
                dispatchLocalHits();
                tX = false;
            }
            if (tY)
            {
                cs();
                tY = false;
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
        if (ue != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = ua;
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
        if (tW > 0)
        {
            mHandler.removeMessages(1, tT);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (tW > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, tT), tW * 1000);
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
        ue = flag;
        ua = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    d cH()
    {
        this;
        JVM INSTR monitorenter ;
        if (tU != null)
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
        tU = new ac(uc, mContext);
        if (tZ != null)
        {
            tU.cr().M(tZ);
            tZ = null;
        }
        d d1;
        if (mHandler == null)
        {
            cG();
        }
        if (ud == null && ub)
        {
            cF();
        }
        d1 = tU;
        this;
        JVM INSTR monitorexit ;
        return d1;
    }

    void cI()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ue && ua && tW > 0)
        {
            mHandler.removeMessages(1, tT);
            mHandler.sendMessage(mHandler.obtainMessage(1, tT));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void cs()
    {
        if (tV == null)
        {
            aa.C("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            tY = true;
            return;
        } else
        {
            u.cU().a(u.a.wb);
            tV.cs();
            return;
        }
    }

    void dispatchLocalHits()
    {
        this;
        JVM INSTR monitorenter ;
        if (tV != null) goto _L2; else goto _L1
_L1:
        aa.C("Dispatch call queued. Dispatch will run once initialization is complete.");
        tX = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u.cU().a(u.a.vO);
        tV.cq();
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
        tW = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u.cU().a(u.a.vP);
        if (!ue && ua && tW > 0)
        {
            mHandler.removeMessages(1, tT);
        }
        tW = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!ue && ua)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, tT), i * 1000);
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
        a(ue, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
