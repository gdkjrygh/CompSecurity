// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            ek, eu

public class ei extends ek
{
    public static interface a
    {

        public abstract void a(ei ei1, Object obj);
    }


    private a a;
    private Object b;
    private Object c;
    private eu d;
    private eu e;

    public ei()
    {
    }

    static Object a(ei ei1)
    {
        return ei1.b;
    }

    static Object a(ei ei1, Object obj)
    {
        ei1.c = obj;
        return obj;
    }

    static eu b(ei ei1)
    {
        return ei1.d;
    }

    static eu c(ei ei1)
    {
        return ei1.e;
    }

    static void d(ei ei1)
    {
        ei1.n();
    }

    private void m()
    {
        a(new ek.c() {

            final ei a;

            public void a(ek ek1)
            {
                ei.d(a);
            }

            public void a(ek ek1, InputStream inputstream)
            {
                while (!ek1.d() || ei.c(a) == null) 
                {
                    return;
                }
                ei.a(a, ei.c(a).a(inputstream));
            }

            public void a(ek ek1, OutputStream outputstream)
            {
                if (ei.a(a) != null && ei.b(a) != null)
                {
                    ei.b(a).a(outputstream, ei.a(a));
                }
            }

            
            {
                a = ei.this;
                super();
            }
        });
    }

    private void n()
    {
        while (a == null || b()) 
        {
            return;
        }
        a.a(this, c);
    }

    public void a()
    {
        m();
        super.a();
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void a(eu eu)
    {
        d = eu;
    }

    public void a(Object obj)
    {
        b = obj;
    }
}
