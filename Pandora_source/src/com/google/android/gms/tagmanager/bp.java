// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzct, ai, zzbg, au, 
//            r, t, u

class bp extends zzct
{

    private static final Object a = new Object();
    private static bp n;
    private Context b;
    private t c;
    private volatile r d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private u j;
    private Handler k;
    private ai l;
    private boolean m;

    private bp()
    {
        e = 0x1b7740;
        f = true;
        g = false;
        h = true;
        i = true;
        j = new u() {

            final bp a;

            public void a(boolean flag)
            {
                a.a(flag, bp.a(a));
            }

            
            {
                a = bp.this;
                super();
            }
        };
        m = false;
    }

    public static bp a()
    {
        if (n == null)
        {
            n = new bp();
        }
        return n;
    }

    static boolean a(bp bp1)
    {
        return bp1.h;
    }

    static int b(bp bp1)
    {
        return bp1.e;
    }

    static Object c()
    {
        return a;
    }

    static boolean c(bp bp1)
    {
        return bp1.m;
    }

    static Handler d(bp bp1)
    {
        return bp1.k;
    }

    private void d()
    {
        l = new ai(this);
        l.a(b);
    }

    static t e(bp bp1)
    {
        return bp1.c;
    }

    private void e()
    {
        k = new Handler(b.getMainLooper(), new android.os.Handler.Callback() {

            final bp a;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && bp.c().equals(message.obj))
                {
                    a.dispatch();
                    if (bp.b(a) > 0 && !bp.c(a))
                    {
                        bp.d(a).sendMessageDelayed(bp.d(a).obtainMessage(1, bp.c()), bp.b(a));
                    }
                }
                return true;
            }

            
            {
                a = bp.this;
                super();
            }
        });
        if (e > 0)
        {
            k.sendMessageDelayed(k.obtainMessage(1, a), e);
        }
    }

    void a(Context context, r r1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = b;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = context.getApplicationContext();
        if (d == null)
        {
            d = r1;
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
        if (m != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = h;
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
        if (e > 0)
        {
            k.removeMessages(1, a);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (e > 0)
        {
            k.sendMessageDelayed(k.obtainMessage(1, a), e);
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
        zzbg.zzam(stringbuilder.append(((String) (obj))).toString());
        m = flag;
        h = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    t b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (b == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c = new au(j, b);
        t t;
        if (k == null)
        {
            e();
        }
        g = true;
        if (f)
        {
            dispatch();
            f = false;
        }
        if (l == null && i)
        {
            d();
        }
        t = c;
        this;
        JVM INSTR monitorexit ;
        return t;
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        zzbg.zzam("Dispatch call queued. Dispatch will run once initialization is complete.");
        f = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d.a(new Runnable() {

            final bp a;

            public void run()
            {
                bp.e(a).a();
            }

            
            {
                a = bp.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void zzaj(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(m, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void zzgA()
    {
        this;
        JVM INSTR monitorenter ;
        if (!m && h && e > 0)
        {
            k.removeMessages(1, a);
            k.sendMessage(k.obtainMessage(1, a));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
