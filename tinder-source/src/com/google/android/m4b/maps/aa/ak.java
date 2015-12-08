// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            au, af, aa, g, 
//            c, s, am

public abstract class ak extends au
    implements Serializable
{
    public static class a
    {

        public g a;

        public a()
        {
            a = new b();
        }
    }

    static final class b extends com.google.android.m4b.maps.aa.c
    {

        private static final long serialVersionUID = 0L;

        final Collection f()
        {
            return new ArrayList();
        }

        b()
        {
            super(new LinkedHashMap());
        }
    }

    static final class c
    {

        static final s.a a = s.a(com/google/android/m4b/maps/aa/ak, "map");
        static final s.a b = s.a(com/google/android/m4b/maps/aa/ak, "size");
        static final s.a c = s.a(com/google/android/m4b/maps/aa/am, "emptySet");

    }


    private static final long serialVersionUID = 0L;
    final transient af a;
    private transient int b;

    ak(af af1, int i)
    {
        a = af1;
        b = i;
    }

    public final int a()
    {
        return b;
    }

    public abstract aa a(Object obj);

    public final boolean a(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public Collection b(Object obj)
    {
        return a(obj);
    }

    final Map b()
    {
        throw new AssertionError("should never be called");
    }

    public final Map c()
    {
        return a;
    }

    public final Set d()
    {
        return a.g();
    }

    public final volatile boolean e()
    {
        return super.e();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
