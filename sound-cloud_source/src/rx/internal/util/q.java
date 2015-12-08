// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.b.e;
import rx.b.f;
import rx.b.g;
import rx.b.h;
import rx.b.i;
import rx.b.j;
import rx.b.k;
import rx.b.l;
import rx.b.m;
import rx.b.n;
import rx.b.o;

// Referenced classes of package rx.internal.util:
//            r

public final class q
{
    private static final class a extends Enum
        implements f
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(rx/internal/util/q$a, s);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        public final Object call(Object obj)
        {
            return Boolean.valueOf(true);
        }

        static 
        {
            a = new a("INSTANCE");
            b = (new a[] {
                a
            });
        }

        private a(String s)
        {
            super(s, 0);
        }
    }

    private static final class b
        implements e, f, g, h, i, j, k, l, m, n, o
    {

        public final Object a(Object obj, Object obj1, Object obj2, Object obj3)
        {
            return null;
        }

        public final transient Object a(Object aobj[])
        {
            return null;
        }

        public final Object call()
        {
            return null;
        }

        public final Object call(Object obj)
        {
            return null;
        }

        public final Object call(Object obj, Object obj1)
        {
            return null;
        }

        public final Object call(Object obj, Object obj1, Object obj2)
        {
            return null;
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final b a = new b((byte)0);

    public static f a()
    {
        return a.a;
    }

    public static f b()
    {
        return new r();
    }

}
