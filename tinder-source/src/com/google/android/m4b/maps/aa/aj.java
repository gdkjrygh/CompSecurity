// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aa, af, al, ax, 
//            e, x, ae, y

final class aj extends aa
{
    static final class a
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private af a;

        final Object readResolve()
        {
            return a.h();
        }

        a(af af1)
        {
            a = af1;
        }
    }


    private final af a;

    aj(af af1)
    {
        a = af1;
    }

    public final x a()
    {
        return ax.a(a.f().a());
    }

    final ae c()
    {
        return new y(a.f().b()) {

            private ae b;
            private aj c;

            public final Object get(int i)
            {
                return ((java.util.Map.Entry)b.get(i)).getValue();
            }

            final aa h()
            {
                return c;
            }

            
            {
                c = aj.this;
                b = ae1;
                super();
            }
        };
    }

    public final boolean contains(Object obj)
    {
        return obj != null && e.a(a(), obj);
    }

    final boolean d()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int size()
    {
        return a.size();
    }

    final Object writeReplace()
    {
        return new a(a);
    }
}
