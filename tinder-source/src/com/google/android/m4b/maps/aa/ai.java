// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            al, ae, af, x, 
//            y, aa

final class ai extends al
{
    static final class a
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private af a;

        final Object readResolve()
        {
            return a.g();
        }

        a(af af1)
        {
            a = af1;
        }
    }


    private final af a;

    ai(af af1)
    {
        a = af1;
    }

    public final x a()
    {
        return b().a();
    }

    final ae c()
    {
        return new y(a.f().b()) {

            private ae b;
            private ai c;

            public final Object get(int i)
            {
                return ((java.util.Map.Entry)b.get(i)).getKey();
            }

            final aa h()
            {
                return c;
            }

            
            {
                c = ai.this;
                b = ae1;
                super();
            }
        };
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean d()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return b().a();
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
