// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            by, ak, w, bc, 
//            ap, y, z

final class bz extends by
{

    private static final Object a = new Object();
    private static bz n;
    private Context b;
    private y c;
    private volatile w d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private z j;
    private Handler k;
    private ap l;
    private boolean m;

    private bz()
    {
        e = 0x1b7740;
        f = true;
        g = false;
        h = true;
        i = true;
        j = new z() {

            final bz a;

            public final void a(boolean flag)
            {
                a.a(flag, bz.a(a));
            }

            
            {
                a = bz.this;
                super();
            }
        };
        m = false;
    }

    static boolean a(bz bz1)
    {
        return bz1.h;
    }

    static int b(bz bz1)
    {
        return bz1.e;
    }

    public static bz c()
    {
        if (n == null)
        {
            n = new bz();
        }
        return n;
    }

    static boolean c(bz bz1)
    {
        return bz1.m;
    }

    static Handler d(bz bz1)
    {
        return bz1.k;
    }

    static y e(bz bz1)
    {
        return bz1.c;
    }

    static Object e()
    {
        return a;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        ak.b();
        f = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d.a(new Runnable() {

            final bz a;

            public final void run()
            {
                bz.e(a).a();
            }

            
            {
                a = bz.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void a(Context context, w w1)
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
            d = w1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    final void a(boolean flag)
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

    final void a(boolean flag, boolean flag1)
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
        StringBuilder stringbuilder = new StringBuilder("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        stringbuilder.append(((String) (obj)));
        ak.b();
        m = flag;
        h = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    final void b()
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

    final y d()
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
        c = new bc(j, b);
        y y;
        if (k == null)
        {
            k = new Handler(b.getMainLooper(), new android.os.Handler.Callback() {

                final bz a;

                public final boolean handleMessage(Message message)
                {
                    if (1 == message.what && bz.e().equals(message.obj))
                    {
                        a.a();
                        if (bz.b(a) > 0 && !bz.c(a))
                        {
                            bz.d(a).sendMessageDelayed(bz.d(a).obtainMessage(1, bz.e()), bz.b(a));
                        }
                    }
                    return true;
                }

            
            {
                a = bz.this;
                super();
            }
            });
            if (e > 0)
            {
                k.sendMessageDelayed(k.obtainMessage(1, a), e);
            }
        }
        g = true;
        if (f)
        {
            a();
            f = false;
        }
        if (l == null && i)
        {
            l = new ap(this);
            ap ap1 = l;
            Context context = b;
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(ap1, intentfilter);
            intentfilter = new IntentFilter();
            intentfilter.addAction("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(ap1, intentfilter);
        }
        y = c;
        this;
        JVM INSTR monitorexit ;
        return y;
    }

}
