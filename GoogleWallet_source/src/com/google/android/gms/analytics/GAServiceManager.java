// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            ah, u, ac, w, 
//            f, ae, o, d, 
//            r, e

final class GAServiceManager extends ah
{

    private static final Object yS = new Object();
    private static GAServiceManager ze;
    private Context mContext;
    private Handler mHandler;
    private d yT;
    private volatile f yU;
    private int yV;
    private boolean yW;
    private boolean yX;
    private String yY;
    private boolean yZ;
    private boolean ys;
    private boolean za;
    private e zb;
    private u zc;
    private boolean zd;

    private GAServiceManager()
    {
        yV = 1800;
        yW = true;
        yZ = true;
        za = true;
        zb = new e() {

            final GAServiceManager zf;

            public final void B(boolean flag)
            {
                zf.a(flag, GAServiceManager.a(zf));
            }

            
            {
                zf = GAServiceManager.this;
                super();
            }
        };
        zd = false;
        ys = false;
    }

    static boolean a(GAServiceManager gaservicemanager)
    {
        return gaservicemanager.yZ;
    }

    static int b(GAServiceManager gaservicemanager)
    {
        return gaservicemanager.yV;
    }

    static boolean c(GAServiceManager gaservicemanager)
    {
        return gaservicemanager.zd;
    }

    static Handler d(GAServiceManager gaservicemanager)
    {
        return gaservicemanager.mHandler;
    }

    private void eq()
    {
        zc = new u(this);
        zc.z(mContext);
    }

    private void er()
    {
        mHandler = new Handler(mContext.getMainLooper(), new android.os.Handler.Callback() {

            final GAServiceManager zf;

            public final boolean handleMessage(Message message)
            {
                if (1 == message.what && GAServiceManager.eu().equals(message.obj))
                {
                    w.eF().D(true);
                    zf.dispatchLocalHits();
                    w.eF().D(false);
                    if (GAServiceManager.b(zf) > 0 && !GAServiceManager.c(zf))
                    {
                        GAServiceManager.d(zf).sendMessageDelayed(GAServiceManager.d(zf).obtainMessage(1, GAServiceManager.eu()), GAServiceManager.b(zf) * 1000);
                    }
                }
                return true;
            }

            
            {
                zf = GAServiceManager.this;
                super();
            }
        });
        if (yV > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yS), yV * 1000);
        }
    }

    static Object eu()
    {
        return yS;
    }

    public static GAServiceManager getInstance()
    {
        if (ze == null)
        {
            ze = new GAServiceManager();
        }
        return ze;
    }

    private void setForceLocalDispatch()
    {
        if (yU == null)
        {
            ac.v("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            yX = true;
            return;
        } else
        {
            w.eF().a(w.a.AZ);
            yU.setForceLocalDispatch();
            return;
        }
    }

    final void C(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(zd, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(Context context, f f1)
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
        if (yU == null)
        {
            yU = f1;
            if (yW)
            {
                dispatchLocalHits();
                yW = false;
            }
            if (yX)
            {
                setForceLocalDispatch();
                yX = false;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    final void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (zd != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = yZ;
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
        if (yV > 0)
        {
            mHandler.removeMessages(1, yS);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (yV > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yS), yV * 1000);
        }
        StringBuilder stringbuilder = new StringBuilder("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        ac.v(stringbuilder.append(((String) (obj))).toString());
        zd = flag;
        yZ = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    final void dispatchLocalHits()
    {
        this;
        JVM INSTR monitorenter ;
        if (yU != null) goto _L2; else goto _L1
_L1:
        ac.v("Dispatch call queued. Dispatch will run once initialization is complete.");
        yW = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w.eF().a(w.a.AM);
        yU.dispatch();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final d es()
    {
        this;
        JVM INSTR monitorenter ;
        if (yT != null)
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
        yT = new ae(zb, mContext, new o());
        yT.setDryRun(ys);
        if (yY != null)
        {
            yT.dU().overrideHostUrl(yY);
            yY = null;
        }
        d d1;
        if (mHandler == null)
        {
            er();
        }
        if (zc == null && za)
        {
            eq();
        }
        d1 = yT;
        this;
        JVM INSTR monitorexit ;
        return d1;
    }

    final void et()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zd && yZ && yV > 0)
        {
            mHandler.removeMessages(1, yS);
            mHandler.sendMessage(mHandler.obtainMessage(1, yS));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void setLocalDispatchPeriod(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (mHandler != null) goto _L2; else goto _L1
_L1:
        ac.v("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
        yV = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w.eF().a(w.a.AN);
        if (!zd && yZ && yV > 0)
        {
            mHandler.removeMessages(1, yS);
        }
        yV = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!zd && yZ)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, yS), i * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
