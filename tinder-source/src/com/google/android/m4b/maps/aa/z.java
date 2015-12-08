// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            af, az, bp, l, 
//            aa, bf

public abstract class z extends af
    implements az
{
    public static final class a extends af.a
    {

        public final af.a a(Object obj, Object obj1)
        {
            super.a(obj, obj1);
            return this;
        }

        public final af.a a(Map map)
        {
            super.a(map);
            return this;
        }

        public final af a()
        {
            switch (b)
            {
            default:
                return new bf(b, a);

            case 0: // '\0'
                return z.j();

            case 1: // '\001'
                return z.c(a[0].getKey(), a[0].getValue());
            }
        }

        public a()
        {
        }
    }

    static final class b extends af.b
    {

        private static final long serialVersionUID = 0L;

        final Object readResolve()
        {
            return a(new a());
        }

        b(z z1)
        {
            super(z1);
        }
    }


    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    z()
    {
    }

    public static z c(Object obj, Object obj1)
    {
        return new bp(obj, obj1);
    }

    public static z j()
    {
        return l.a;
    }

    public final aa h()
    {
        return i().g();
    }

    public abstract z i();

    public Collection values()
    {
        return i().g();
    }

    Object writeReplace()
    {
        return new b(this);
    }

}
