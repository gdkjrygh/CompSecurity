// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.d;


// Referenced classes of package com.qihoo.security.engine.d:
//            b

public abstract class c
    implements Runnable
{
    public static interface a
    {

        public abstract int a(b b1);

        public abstract void a(c c1);
    }


    final a a;
    protected volatile boolean b;

    public c(a a1)
    {
        b = false;
        a = a1;
    }

    public abstract int a();

    public abstract int a(String s, String s1);

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public int f()
    {
        b = true;
        return 0;
    }

    public void run()
    {
        if (!b)
        {
            d();
            a.a(this);
        }
    }
}
