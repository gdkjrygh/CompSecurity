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

    private static cx ahR;
    private static final Object tQ = new Object();
    private Context ahH;
    private at ahI;
    private volatile ar ahJ;
    private int ahK;
    private boolean ahL;
    private boolean ahM;
    private boolean ahN;
    private au ahO;
    private bn ahP;
    private boolean ahQ;
    private boolean connected;
    private Handler handler;

    private cx()
    {
        ahK = 0x1b7740;
        ahL = true;
        ahM = false;
        connected = true;
        ahN = true;
        ahO = new au() {

            final cx ahS;

            public void s(boolean flag)
            {
                ahS.a(flag, cx.a(ahS));
            }

            
            {
                ahS = cx.this;
                super();
            }
        };
        ahQ = false;
    }

    static boolean a(cx cx1)
    {
        return cx1.connected;
    }

    static int b(cx cx1)
    {
        return cx1.ahK;
    }

    static boolean c(cx cx1)
    {
        return cx1.ahQ;
    }

    private void cA()
    {
        ahP = new bn(this);
        ahP.s(ahH);
    }

    private void cB()
    {
        handler = new Handler(ahH.getMainLooper(), new android.os.Handler.Callback() {

            final cx ahS;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && cx.cE().equals(message.obj))
                {
                    ahS.cl();
                    if (cx.b(ahS) > 0 && !cx.c(ahS))
                    {
                        cx.d(ahS).sendMessageDelayed(cx.d(ahS).obtainMessage(1, cx.cE()), cx.b(ahS));
                    }
                }
                return true;
            }

            
            {
                ahS = cx.this;
                super();
            }
        });
        if (ahK > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, tQ), ahK);
        }
    }

    static Object cE()
    {
        return tQ;
    }

    static Handler d(cx cx1)
    {
        return cx1.handler;
    }

    static at e(cx cx1)
    {
        return cx1.ahI;
    }

    public static cx mL()
    {
        if (ahR == null)
        {
            ahR = new cx();
        }
        return ahR;
    }

    void a(Context context, ar ar1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = ahH;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ahH = context.getApplicationContext();
        if (ahJ == null)
        {
            ahJ = ar1;
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
        if (ahQ != flag) goto _L2; else goto _L1
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
        if (ahK > 0)
        {
            handler.removeMessages(1, tQ);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (ahK > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, tQ), ahK);
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
        ahQ = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void cD()
    {
        this;
        JVM INSTR monitorenter ;
        if (!ahQ && connected && ahK > 0)
        {
            handler.removeMessages(1, tQ);
            handler.sendMessage(handler.obtainMessage(1, tQ));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void cl()
    {
        this;
        JVM INSTR monitorenter ;
        if (ahM) goto _L2; else goto _L1
_L1:
        bh.C("Dispatch call queued. Dispatch will run once initialization is complete.");
        ahL = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ahJ.a(new Runnable() {

            final cx ahS;

            public void run()
            {
                cx.e(ahS).cl();
            }

            
            {
                ahS = cx.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    at mM()
    {
        this;
        JVM INSTR monitorenter ;
        if (ahI != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (ahH == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        ahI = new ca(ahO, ahH);
        at at;
        if (handler == null)
        {
            cB();
        }
        ahM = true;
        if (ahL)
        {
            cl();
            ahL = false;
        }
        if (ahP == null && ahN)
        {
            cA();
        }
        at = ahI;
        this;
        JVM INSTR monitorexit ;
        return at;
    }

    void t(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(ahQ, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
