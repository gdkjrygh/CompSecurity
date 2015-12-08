// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            kl, kx

public class kj extends kl
{

    private a a;
    private Object b;
    private Object c;
    private kx d;
    private kx e;

    public kj()
    {
    }

    static Object a(kj kj1)
    {
        return kj1.b;
    }

    static Object a(kj kj1, Object obj)
    {
        kj1.c = obj;
        return obj;
    }

    static kx b(kj kj1)
    {
        return kj1.d;
    }

    static kx c(kj kj1)
    {
        return kj1.e;
    }

    static void d(kj kj1)
    {
        kj1.s();
    }

    private void r()
    {
        a(new _cls1());
    }

    private void s()
    {
        while (a == null || e()) 
        {
            return;
        }
        a.a(this, c);
    }

    public void a()
    {
        r();
        super.a();
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void a(kx kx)
    {
        d = kx;
    }

    public void a(Object obj)
    {
        b = obj;
    }

    public void b(kx kx)
    {
        e = kx;
    }

    private class _cls1
        implements kl.c
    {

        final kj a;

        public void a(kl kl1)
        {
            kj.d(a);
        }

        public void a(kl kl1, InputStream inputstream)
        {
            while (!kl1.g() || kj.c(a) == null) 
            {
                return;
            }
            kj.a(a, kj.c(a).b(inputstream));
        }

        public void a(kl kl1, OutputStream outputstream)
        {
            if (kj.a(a) != null && kj.b(a) != null)
            {
                kj.b(a).a(outputstream, kj.a(a));
            }
        }

        _cls1()
        {
            a = kj.this;
            super();
        }
    }


    private class a
    {

        public abstract void a(kj kj1, Object obj);
    }

}
