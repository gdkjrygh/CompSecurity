// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cw, bn, bh, ar, 
//            ca, at, au

class cx extends cw
{

    private static cx ahU;
    private static final Object tT = new Object();
    private Context ahK;
    private at ahL;
    private volatile ar ahM;
    private int ahN;
    private boolean ahO;
    private boolean ahP;
    private boolean ahQ;
    private au ahR;
    private bn ahS;
    private boolean ahT;
    private boolean connected;
    private Handler handler;

    private cx()
    {
        ahN = 0x1b7740;
        ahO = true;
        ahP = false;
        connected = true;
        ahQ = true;
        ahR = new au() {

            final cx ahV;

            public void s(boolean flag)
            {
                ahV.a(flag, cx.a(ahV));
            }

            
            {
                ahV = cx.this;
                super();
            }
        };
        ahT = false;
    }

    static boolean a(cx cx1)
    {
        return cx1.connected;
    }

    static int b(cx cx1)
    {
        return cx1.ahN;
    }

    static boolean c(cx cx1)
    {
        return cx1.ahT;
    }

    private void cF()
    {
        ahS = new bn(this);
        ahS.v(ahK);
    }

    private void cG()
    {
        handler = new Handler(ahK.getMainLooper(), new android.os.Handler.Callback() {

            final cx ahV;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && cx.cJ().equals(message.obj))
                {
                    ahV.cq();
                    if (cx.b(ahV) > 0 && !cx.c(ahV))
                    {
                        cx.d(ahV).sendMessageDelayed(cx.d(ahV).obtainMessage(1, cx.cJ()), cx.b(ahV));
                    }
                }
                return true;
            }

            
            {
                ahV = cx.this;
                super();
            }
        });
        if (ahN > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, tT), ahN);
        }
    }

    static Object cJ()
    {
        return tT;
    }

    static Handler d(cx cx1)
    {
        return cx1.handler;
    }

    static at e(cx cx1)
    {
        return cx1.ahL;
    }

    public static cx mQ()
    {
        if (ahU == null)
        {
            ahU = new cx();
        }
        return ahU;
    }

    void a(Context context, ar ar1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = ahK;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ahK = context.getApplicationContext();
        if (ahM == null)
        {
            ahM = ar1;
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
        if (ahT != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = connected;
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
        if (ahN > 0)
        {
            handler.removeMessages(1, tT);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (ahN > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, tT), ahN);
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
        bh.C(stringbuilder.append(((String) (obj))).toString());
        ahT = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void cI()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ahT && connected && ahN > 0)
        {
            handler.removeMessages(1, tT);
            handler.sendMessage(handler.obtainMessage(1, tT));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void cq()
    {
        this;
        JVM INSTR monitorenter ;
        if (ahP) goto _L2; else goto _L1
_L1:
        bh.C("Dispatch call queued. Dispatch will run once initialization is complete.");
        ahO = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ahM.a(new Runnable() {

            final cx ahV;

            public void run()
            {
                cx.e(ahV).cq();
            }

            
            {
                ahV = cx.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    at mR()
    {
        this;
        JVM INSTR monitorenter ;
        if (ahL != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (ahK == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        ahL = new ca(ahR, ahK);
        at at;
        if (handler == null)
        {
            cG();
        }
        ahP = true;
        if (ahO)
        {
            cq();
            ahO = false;
        }
        if (ahS == null && ahQ)
        {
            cF();
        }
        at = ahL;
        this;
        JVM INSTR monitorexit ;
        return at;
    }

    void t(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(ahT, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
