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

    private static cx aam;
    private static final Object sF = new Object();
    private Context aac;
    private at aad;
    private volatile ar aae;
    private int aaf;
    private boolean aag;
    private boolean aah;
    private boolean aai;
    private au aaj;
    private bn aak;
    private boolean aal;
    private boolean connected;
    private Handler handler;

    private cx()
    {
        aaf = 0x1b7740;
        aag = true;
        aah = false;
        connected = true;
        aai = true;
        aaj = new au() {

            final cx aan;

            public void r(boolean flag)
            {
                aan.a(flag, cx.a(aan));
            }

            
            {
                aan = cx.this;
                super();
            }
        };
        aal = false;
    }

    static boolean a(cx cx1)
    {
        return cx1.connected;
    }

    static int b(cx cx1)
    {
        return cx1.aaf;
    }

    static boolean c(cx cx1)
    {
        return cx1.aal;
    }

    private void cj()
    {
        aak = new bn(this);
        aak.o(aac);
    }

    private void ck()
    {
        handler = new Handler(aac.getMainLooper(), new android.os.Handler.Callback() {

            final cx aan;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && cx.cn().equals(message.obj))
                {
                    aan.bW();
                    if (cx.b(aan) > 0 && !cx.c(aan))
                    {
                        cx.d(aan).sendMessageDelayed(cx.d(aan).obtainMessage(1, cx.cn()), cx.b(aan));
                    }
                }
                return true;
            }

            
            {
                aan = cx.this;
                super();
            }
        });
        if (aaf > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, sF), aaf);
        }
    }

    static Object cn()
    {
        return sF;
    }

    static Handler d(cx cx1)
    {
        return cx1.handler;
    }

    static at e(cx cx1)
    {
        return cx1.aad;
    }

    public static cx lG()
    {
        if (aam == null)
        {
            aam = new cx();
        }
        return aam;
    }

    void a(Context context, ar ar1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = aac;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aac = context.getApplicationContext();
        if (aae == null)
        {
            aae = ar1;
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
        if (aal != flag) goto _L2; else goto _L1
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
        if (aaf > 0)
        {
            handler.removeMessages(1, sF);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (aaf > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, sF), aaf);
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
        bh.y(stringbuilder.append(((String) (obj))).toString());
        aal = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    public void bW()
    {
        this;
        JVM INSTR monitorenter ;
        if (aah) goto _L2; else goto _L1
_L1:
        bh.y("Dispatch call queued. Dispatch will run once initialization is complete.");
        aag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aae.a(new Runnable() {

            final cx aan;

            public void run()
            {
                cx.e(aan).bW();
            }

            
            {
                aan = cx.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void cm()
    {
        this;
        JVM INSTR monitorenter ;
        if (!aal && connected && aaf > 0)
        {
            handler.removeMessages(1, sF);
            handler.sendMessage(handler.obtainMessage(1, sF));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    at lH()
    {
        this;
        JVM INSTR monitorenter ;
        if (aad != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (aac == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        aad = new ca(aaj, aac);
        at at;
        if (handler == null)
        {
            ck();
        }
        aah = true;
        if (aag)
        {
            bW();
            aag = false;
        }
        if (aak == null && aai)
        {
            cj();
        }
        at = aad;
        this;
        JVM INSTR monitorexit ;
        return at;
    }

    void s(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(aal, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
