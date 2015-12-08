// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            aj, u, ae, y, 
//            f, ag, j, d, 
//            r, e

class v extends aj
{

    private static final Object yT = new Object();
    private static v zf;
    private Context mContext;
    private Handler mHandler;
    private d yU;
    private volatile f yV;
    private int yW;
    private boolean yX;
    private boolean yY;
    private String yZ;
    private boolean yt;
    private boolean za;
    private boolean zb;
    private e zc;
    private u zd;
    private boolean ze;

    private v()
    {
        yW = 1800;
        yX = true;
        za = true;
        zb = true;
        zc = new e() {

            final v zg;

            public void B(boolean flag)
            {
                zg.a(flag, v.a(zg));
            }

            
            {
                zg = v.this;
                super();
            }
        };
        ze = false;
        yt = false;
    }

    static boolean a(v v1)
    {
        return v1.za;
    }

    static int b(v v1)
    {
        return v1.yW;
    }

    static boolean c(v v1)
    {
        return v1.ze;
    }

    static Handler d(v v1)
    {
        return v1.mHandler;
    }

    public static v eu()
    {
        if (zf == null)
        {
            zf = new v();
        }
        return zf;
    }

    private void ev()
    {
        zd = new u(this);
        zd.z(mContext);
    }

    private void ew()
    {
        mHandler = new Handler(mContext.getMainLooper(), new android.os.Handler.Callback() {

            final v zg;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && v.ez().equals(message.obj))
                {
                    y.eK().D(true);
                    zg.dispatchLocalHits();
                    y.eK().D(false);
                    if (v.b(zg) > 0 && !v.c(zg))
                    {
                        v.d(zg).sendMessageDelayed(v.d(zg).obtainMessage(1, v.ez()), v.b(zg) * 1000);
                    }
                }
                return true;
            }

            
            {
                zg = v.this;
                super();
            }
        });
        if (yW > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yT), yW * 1000);
        }
    }

    static Object ez()
    {
        return yT;
    }

    void C(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(ze, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
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
        if (yV == null)
        {
            yV = f1;
            if (yX)
            {
                dispatchLocalHits();
                yX = false;
            }
            if (yY)
            {
                dW();
                yY = false;
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
        if (ze != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = za;
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
        if (yW > 0)
        {
            mHandler.removeMessages(1, yT);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (yW > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yT), yW * 1000);
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
        ae.V(stringbuilder.append(((String) (obj))).toString());
        ze = flag;
        za = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void dW()
    {
        if (yV == null)
        {
            ae.V("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            yY = true;
            return;
        } else
        {
            y.eK().a(y.a.Bb);
            yV.dW();
            return;
        }
    }

    void dispatchLocalHits()
    {
        this;
        JVM INSTR monitorenter ;
        if (yV != null) goto _L2; else goto _L1
_L1:
        ae.V("Dispatch call queued. Dispatch will run once initialization is complete.");
        yX = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        y.eK().a(y.a.AO);
        yV.dispatch();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    d ex()
    {
        this;
        JVM INSTR monitorenter ;
        if (yU != null)
        {
            break MISSING_BLOCK_LABEL_100;
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
        yU = new ag(zc, mContext, new j());
        yU.setDryRun(yt);
        if (yZ != null)
        {
            yU.dV().ad(yZ);
            yZ = null;
        }
        d d1;
        if (mHandler == null)
        {
            ew();
        }
        if (zd == null && zb)
        {
            ev();
        }
        d1 = yU;
        this;
        JVM INSTR monitorexit ;
        return d1;
    }

    void ey()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ze && za && yW > 0)
        {
            mHandler.removeMessages(1, yT);
            mHandler.sendMessage(mHandler.obtainMessage(1, yT));
        }
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
        ae.V("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
        yW = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        y.eK().a(y.a.AP);
        if (!ze && za && yW > 0)
        {
            mHandler.removeMessages(1, yT);
        }
        yW = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!ze && za)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yT), i * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
