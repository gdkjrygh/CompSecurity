// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            en, ex

public class el extends en
{
    public static interface a
    {

        public abstract void a(el el1, Object obj);
    }


    private a a;
    private Object b;
    private Object c;
    private ex d;
    private ex e;

    public el()
    {
    }

    static Object a(el el1)
    {
        return el1.b;
    }

    static Object a(el el1, Object obj)
    {
        el1.c = obj;
        return obj;
    }

    static ex b(el el1)
    {
        return el1.d;
    }

    static ex c(el el1)
    {
        return el1.e;
    }

    static void d(el el1)
    {
        el1.n();
    }

    private void m()
    {
        a(new en.c() {

            final el a;

            public void a(en en1)
            {
                el.d(a);
            }

            public void a(en en1, InputStream inputstream)
                throws Exception
            {
                while (!en1.d() || el.c(a) == null) 
                {
                    return;
                }
                el.a(a, el.c(a).a(inputstream));
            }

            public void a(en en1, OutputStream outputstream)
                throws Exception
            {
                if (el.a(a) != null && el.b(a) != null)
                {
                    el.b(a).a(outputstream, el.a(a));
                }
            }

            
            {
                a = el.this;
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

    public void a(ex ex)
    {
        d = ex;
    }

    public void a(Object obj)
    {
        b = obj;
    }

    public void b(ex ex)
    {
        e = ex;
    }
}
