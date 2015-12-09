// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            gl, gx

public class gk extends gl
{
    public static interface a
    {

        public abstract void a(gk gk1, Object obj);
    }


    private a a;
    private Object b;
    private Object c;
    private gx d;
    private gx e;

    public gk()
    {
    }

    static Object a(gk gk1)
    {
        return gk1.b;
    }

    static Object a(gk gk1, Object obj)
    {
        gk1.c = obj;
        return obj;
    }

    static gx b(gk gk1)
    {
        return gk1.d;
    }

    static gx c(gk gk1)
    {
        return gk1.e;
    }

    static void d(gk gk1)
    {
        gk1.n();
    }

    private void m()
    {
        a(new gl.c() {

            final gk a;

            public void a(gl gl1)
            {
                gk.d(a);
            }

            public void a(gl gl1, InputStream inputstream)
                throws Exception
            {
                while (!gl1.d() || gk.c(a) == null) 
                {
                    return;
                }
                gk.a(a, gk.c(a).b(inputstream));
            }

            public void a(gl gl1, OutputStream outputstream)
                throws Exception
            {
                if (gk.a(a) != null && gk.b(a) != null)
                {
                    gk.b(a).a(outputstream, gk.a(a));
                }
            }

            
            {
                a = gk.this;
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

    public void a(a a1)
    {
        a = a1;
    }

    public void a(gx gx)
    {
        d = gx;
    }

    public void a(Object obj)
    {
        b = obj;
    }

    public void b(gx gx)
    {
        e = gx;
    }

    public void safeRun()
    {
        m();
        super.safeRun();
    }
}
