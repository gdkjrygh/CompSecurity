// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.f;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.k;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            e, f, bd

public final class d
{

    public static Iterable a(Iterable iterable, f f1)
    {
        j.a(iterable);
        j.a(f1);
        return new bd(iterable, f1) {

            private Iterable b;
            private f c;

            public final Iterator iterator()
            {
                return e.a(b.iterator(), c);
            }

            
            {
                b = iterable;
                c = f1;
                super();
            }
        };
    }

    public static Iterable a(Iterable iterable, k k)
    {
        j.a(iterable);
        j.a(k);
        return new bd(iterable, k) {

            private Iterable b;
            private k c;

            public final Iterator iterator()
            {
                return e.a(b.iterator(), c);
            }

            
            {
                b = iterable;
                c = k;
                super();
            }
        };
    }

    public static Object a(Iterable iterable)
    {
        return e.c(iterable.iterator());
    }

    public static Object[] b(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
        } else
        {
            iterable = f.a(iterable.iterator());
        }
        return iterable.toArray();
    }
}
