// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kik.g:
//            q, r

public class p extends q
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        private static final int e[];

        public static int[] a()
        {
            return (int[])e.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = (new int[] {
                a, b, c, d
            });
        }
    }


    private volatile Throwable b;
    private volatile Object c;
    private volatile int d;
    private boolean e;
    private List f;
    private Object g;

    public p()
    {
        d = a.a;
        f = new ArrayList();
        g = new Object();
    }

    private void a(int k, r r1)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.a().length];
                try
                {
                    a[a.b - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.d - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        k = _cls1.a[k - 1];
        k;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 49
    //                   2 79
    //                   3 94;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_94;
_L5:
        r1.b(c);
        r1.a();
        return;
_L2:
        r1.a(c);
        r1.c();
          goto _L5
        Exception exception;
        exception;
        r1.b(c);
        r1.a();
        throw exception;
_L3:
        r1.b();
        r1.a(b);
          goto _L5
        r1.b(b);
        r1.a(b);
          goto _L5
    }

    private void a(int k, Object obj, Throwable throwable)
    {
        List list;
label0:
        {
            list = f;
            synchronized (g)
            {
                if (e)
                {
                    break label0;
                }
                c = obj;
                d = k;
                e = true;
                b = throwable;
                f = null;
            }
            for (int l = 0; l < list.size(); l++)
            {
                a(k, (r)list.get(l));
            }

            break MISSING_BLOCK_LABEL_101;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        list.clear();
        return;
    }

    public final r a(r r1)
    {
label0:
        {
            synchronized (g)
            {
                if (e)
                {
                    break label0;
                }
                f.add(r1);
            }
            return r1;
        }
        obj;
        JVM INSTR monitorexit ;
        a(d, r1);
        return r1;
        r1;
        obj;
        JVM INSTR monitorexit ;
        throw r1;
    }

    public final void a(Object obj)
    {
        a(a.b, obj, null);
    }

    public final void a(Throwable throwable)
    {
        a(a.c, null, throwable);
    }

    public final void e()
    {
        a(a.d, null, null);
    }

    public final Object f()
    {
        return c;
    }

    public final boolean g()
    {
        return d != a.a;
    }

    public final boolean h()
    {
        return d == a.b;
    }

    public final boolean i()
    {
        return d == a.c;
    }

    public final boolean j()
    {
        return d == a.d;
    }
}
