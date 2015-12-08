// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            ae, p, z, t, 
//            f, ab, d, m, 
//            e

class q extends ae
{

    private static final Object yc = new Object();
    private static q yo;
    private Context mContext;
    private Handler mHandler;
    private d yd;
    private volatile f ye;
    private int yf;
    private boolean yg;
    private boolean yh;
    private String yi;
    private boolean yj;
    private boolean yk;
    private e yl;
    private p ym;
    private boolean yn;

    private q()
    {
        yf = 1800;
        yg = true;
        yj = true;
        yk = true;
        yl = new e() {

            final q yp;

            public void z(boolean flag)
            {
                yp.a(flag, q.a(yp));
            }

            
            {
                yp = q.this;
                super();
            }
        };
        yn = false;
    }

    static boolean a(q q1)
    {
        return q1.yj;
    }

    static int b(q q1)
    {
        return q1.yf;
    }

    static boolean c(q q1)
    {
        return q1.yn;
    }

    static Handler d(q q1)
    {
        return q1.mHandler;
    }

    public static q dZ()
    {
        if (yo == null)
        {
            yo = new q();
        }
        return yo;
    }

    private void ea()
    {
        ym = new p(this);
        ym.z(mContext);
    }

    private void eb()
    {
        mHandler = new Handler(mContext.getMainLooper(), new android.os.Handler.Callback() {

            final q yp;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && q.ee().equals(message.obj))
                {
                    t.ep().B(true);
                    yp.dispatchLocalHits();
                    t.ep().B(false);
                    if (q.b(yp) > 0 && !q.c(yp))
                    {
                        q.d(yp).sendMessageDelayed(q.d(yp).obtainMessage(1, q.ee()), q.b(yp) * 1000);
                    }
                }
                return true;
            }

            
            {
                yp = q.this;
                super();
            }
        });
        if (yf > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yc), yf * 1000);
        }
    }

    static Object ee()
    {
        return yc;
    }

    void A(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(yn, flag);
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
        if (ye == null)
        {
            ye = f1;
            if (yg)
            {
                dispatchLocalHits();
                yg = false;
            }
            if (yh)
            {
                dN();
                yh = false;
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
        if (yn != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = yj;
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
        if (yf > 0)
        {
            mHandler.removeMessages(1, yc);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (yf > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yc), yf * 1000);
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
        z.V(stringbuilder.append(((String) (obj))).toString());
        yn = flag;
        yj = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void dN()
    {
        if (ye == null)
        {
            z.V("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            yh = true;
            return;
        } else
        {
            t.ep().a(t.a.Ak);
            ye.dN();
            return;
        }
    }

    void dispatchLocalHits()
    {
        this;
        JVM INSTR monitorenter ;
        if (ye != null) goto _L2; else goto _L1
_L1:
        z.V("Dispatch call queued. Dispatch will run once initialization is complete.");
        yg = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        t.ep().a(t.a.zX);
        ye.dispatch();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    d ec()
    {
        this;
        JVM INSTR monitorenter ;
        if (yd != null)
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
        yd = new ab(yl, mContext);
        if (yi != null)
        {
            yd.dM().af(yi);
            yi = null;
        }
        d d1;
        if (mHandler == null)
        {
            eb();
        }
        if (ym == null && yk)
        {
            ea();
        }
        d1 = yd;
        this;
        JVM INSTR monitorexit ;
        return d1;
    }

    void ed()
    {
        this;
        JVM INSTR monitorenter ;
        if (!yn && yj && yf > 0)
        {
            mHandler.removeMessages(1, yc);
            mHandler.sendMessage(mHandler.obtainMessage(1, yc));
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
        z.V("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
        yf = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        t.ep().a(t.a.zY);
        if (!yn && yj && yf > 0)
        {
            mHandler.removeMessages(1, yc);
        }
        yf = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!yn && yj)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yc), i * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
