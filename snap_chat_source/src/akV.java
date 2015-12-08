// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class akV
    implements Iterable
{
    final class a
        implements b
    {

        private int a;
        private int b;
        private boolean c;
        private akV d;

        private void a()
        {
            if (!c)
            {
                c = true;
                akV.c(d);
            }
        }

        public final boolean hasNext()
        {
            int i;
            for (i = b; i < a && akV.a(d, i) == null; i++) { }
            if (i < a)
            {
                return true;
            } else
            {
                a();
                return false;
            }
        }

        public final Object next()
        {
            for (; b < a && akV.a(d, b) == null; b = b + 1) { }
            if (b < a)
            {
                akV akv = d;
                int i = b;
                b = i + 1;
                return akV.a(akv, i);
            } else
            {
                a();
                throw new NoSuchElementException();
            }
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private a()
        {
            d = akV.this;
            super();
            b = 0;
            c = false;
            akV.a(akV.this);
            a = akV.b(akV.this);
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static interface b
        extends Iterator
    {
    }


    public static final boolean e;
    public final List a = new ArrayList();
    public int b;
    public int c;
    public boolean d;

    public akV()
    {
        b = 0;
        c = 0;
        d = false;
    }

    static Object a(akV akv, int i)
    {
        return akv.a.get(i);
    }

    private void a()
    {
        if (!e && b != 0)
        {
            throw new AssertionError();
        }
        for (int i = a.size() - 1; i >= 0; i--)
        {
            if (a.get(i) == null)
            {
                a.remove(i);
            }
        }

    }

    static void a(akV akv)
    {
        akv.b = akv.b + 1;
    }

    static int b(akV akv)
    {
        return akv.a.size();
    }

    static void c(akV akv)
    {
        akv.b = akv.b - 1;
        if (!e && akv.b < 0)
        {
            throw new AssertionError();
        }
        if (akv.b <= 0 && akv.d)
        {
            akv.d = false;
            akv.a();
        }
    }

    public final boolean a(Object obj)
    {
        if (obj == null || a.contains(obj))
        {
            return false;
        }
        boolean flag = a.add(obj);
        if (!e && !flag)
        {
            throw new AssertionError();
        } else
        {
            c = c + 1;
            return true;
        }
    }

    public Iterator iterator()
    {
        return new a((byte)0);
    }

    static 
    {
        boolean flag;
        if (!akV.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
