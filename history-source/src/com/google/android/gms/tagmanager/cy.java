// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cx, bo, bh, ar, 
//            cb, at, au

class cy extends cx
{

    private static cy atJ;
    private static final Object yT = new Object();
    private at atA;
    private volatile ar atB;
    private int atC;
    private boolean atD;
    private boolean atE;
    private boolean atF;
    private au atG;
    private bo atH;
    private boolean atI;
    private Context atz;
    private boolean connected;
    private Handler handler;

    private cy()
    {
        atC = 0x1b7740;
        atD = true;
        atE = false;
        connected = true;
        atF = true;
        atG = new au() {

            final cy atK;

            public void B(boolean flag)
            {
                atK.a(flag, cy.a(atK));
            }

            
            {
                atK = cy.this;
                super();
            }
        };
        atI = false;
    }

    static boolean a(cy cy1)
    {
        return cy1.connected;
    }

    static int b(cy cy1)
    {
        return cy1.atC;
    }

    static boolean c(cy cy1)
    {
        return cy1.atI;
    }

    static Handler d(cy cy1)
    {
        return cy1.handler;
    }

    static at e(cy cy1)
    {
        return cy1.atA;
    }

    private void ev()
    {
        atH = new bo(this);
        atH.z(atz);
    }

    private void ew()
    {
        handler = new Handler(atz.getMainLooper(), new android.os.Handler.Callback() {

            final cy atK;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && cy.ez().equals(message.obj))
                {
                    atK.dispatch();
                    if (cy.b(atK) > 0 && !cy.c(atK))
                    {
                        cy.d(atK).sendMessageDelayed(cy.d(atK).obtainMessage(1, cy.ez()), cy.b(atK));
                    }
                }
                return true;
            }

            
            {
                atK = cy.this;
                super();
            }
        });
        if (atC > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, yT), atC);
        }
    }

    static Object ez()
    {
        return yT;
    }

    public static cy qN()
    {
        if (atJ == null)
        {
            atJ = new cy();
        }
        return atJ;
    }

    void C(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(atI, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(Context context, ar ar1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = atz;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        atz = context.getApplicationContext();
        if (atB == null)
        {
            atB = ar1;
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
        if (atI != flag) goto _L2; else goto _L1
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
        if (atC > 0)
        {
            handler.removeMessages(1, yT);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (atC > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, yT), atC);
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
        bh.V(stringbuilder.append(((String) (obj))).toString());
        atI = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (atE) goto _L2; else goto _L1
_L1:
        bh.V("Dispatch call queued. Dispatch will run once initialization is complete.");
        atD = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        atB.b(new Runnable() {

            final cy atK;

            public void run()
            {
                cy.e(atK).dispatch();
            }

            
            {
                atK = cy.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void ey()
    {
        this;
        JVM INSTR monitorenter ;
        if (!atI && connected && atC > 0)
        {
            handler.removeMessages(1, yT);
            handler.sendMessage(handler.obtainMessage(1, yT));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    at qO()
    {
        this;
        JVM INSTR monitorenter ;
        if (atA != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (atz == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        atA = new cb(atG, atz);
        at at;
        if (handler == null)
        {
            ew();
        }
        atE = true;
        if (atD)
        {
            dispatch();
            atD = false;
        }
        if (atH == null && atF)
        {
            ev();
        }
        at = atA;
        this;
        JVM INSTR monitorexit ;
        return at;
    }

}
