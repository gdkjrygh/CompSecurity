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

    private static cy arA;
    private static final Object yc = new Object();
    private Context arq;
    private at arr;
    private volatile ar ars;
    private int art;
    private boolean aru;
    private boolean arv;
    private boolean arw;
    private au arx;
    private bo ary;
    private boolean arz;
    private boolean connected;
    private Handler handler;

    private cy()
    {
        art = 0x1b7740;
        aru = true;
        arv = false;
        connected = true;
        arw = true;
        arx = new au() {

            final cy arB;

            public void z(boolean flag)
            {
                arB.a(flag, cy.a(arB));
            }

            
            {
                arB = cy.this;
                super();
            }
        };
        arz = false;
    }

    static boolean a(cy cy1)
    {
        return cy1.connected;
    }

    static int b(cy cy1)
    {
        return cy1.art;
    }

    static boolean c(cy cy1)
    {
        return cy1.arz;
    }

    static Handler d(cy cy1)
    {
        return cy1.handler;
    }

    static at e(cy cy1)
    {
        return cy1.arr;
    }

    private void ea()
    {
        ary = new bo(this);
        ary.z(arq);
    }

    private void eb()
    {
        handler = new Handler(arq.getMainLooper(), new android.os.Handler.Callback() {

            final cy arB;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && cy.ee().equals(message.obj))
                {
                    arB.dispatch();
                    if (cy.b(arB) > 0 && !cy.c(arB))
                    {
                        cy.d(arB).sendMessageDelayed(cy.d(arB).obtainMessage(1, cy.ee()), cy.b(arB));
                    }
                }
                return true;
            }

            
            {
                arB = cy.this;
                super();
            }
        });
        if (art > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, yc), art);
        }
    }

    static Object ee()
    {
        return yc;
    }

    public static cy pw()
    {
        if (arA == null)
        {
            arA = new cy();
        }
        return arA;
    }

    void A(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(arz, flag);
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
        Context context1 = arq;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        arq = context.getApplicationContext();
        if (ars == null)
        {
            ars = ar1;
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
        if (arz != flag) goto _L2; else goto _L1
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
        if (art > 0)
        {
            handler.removeMessages(1, yc);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (art > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, yc), art);
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
        arz = flag;
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
        if (arv) goto _L2; else goto _L1
_L1:
        bh.V("Dispatch call queued. Dispatch will run once initialization is complete.");
        aru = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ars.b(new Runnable() {

            final cy arB;

            public void run()
            {
                cy.e(arB).dispatch();
            }

            
            {
                arB = cy.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void ed()
    {
        this;
        JVM INSTR monitorenter ;
        if (!arz && connected && art > 0)
        {
            handler.removeMessages(1, yc);
            handler.sendMessage(handler.obtainMessage(1, yc));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    at px()
    {
        this;
        JVM INSTR monitorenter ;
        if (arr != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (arq == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        arr = new cb(arx, arq);
        at at;
        if (handler == null)
        {
            eb();
        }
        arv = true;
        if (aru)
        {
            dispatch();
            aru = false;
        }
        if (ary == null && arw)
        {
            ea();
        }
        at = arr;
        this;
        JVM INSTR monitorexit ;
        return at;
    }

}
