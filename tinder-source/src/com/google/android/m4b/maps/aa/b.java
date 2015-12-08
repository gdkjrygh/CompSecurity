// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            x

public abstract class b extends x
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/aa/b$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("READY", 0);
            b = new a("NOT_READY", 1);
            c = new a("DONE", 2);
            d = new a("FAILED", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    a a;
    private Object b;

    protected b()
    {
        a = a.b;
    }

    protected abstract Object a();

    public final boolean hasNext()
    {
        boolean flag1 = false;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag;
        if (a != a.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        flag = flag1;
        switch (_cls1.a[a.ordinal()])
        {
        default:
            a = a.d;
            b = a();
            flag = flag1;
            if (a != a.c)
            {
                a = a.a;
                flag = true;
            }
            // fall through

        case 1: // '\001'
            return flag;

        case 2: // '\002'
            return true;
        }
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            a = a.b;
            Object obj = b;
            b = null;
            return obj;
        }
    }
}
