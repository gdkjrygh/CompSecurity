// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;

public abstract class cjc
    implements chr
{

    private final Runnable a;
    private boolean b;
    volatile Thread g;

    public cjc()
    {
        a = new Runnable() {

            private cjc a;

            public final void run()
            {
                a.g = Thread.currentThread();
                a.a();
            }

            
            {
                a = cjc.this;
                super();
            }
        };
        b = false;
    }

    public cjc(byte byte0)
    {
        a = new _cls1();
        b = true;
    }

    public abstract void a();

    public abstract void b();

    public final void c()
    {
        b();
        if (g != null)
        {
            g.interrupt();
        }
    }

    public final Future e()
    {
        if (b)
        {
            return cji.a(1, a);
        } else
        {
            return cji.a(a);
        }
    }

    public final Object f_()
    {
        return e();
    }
}
