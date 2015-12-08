// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class ee extends eg
{

    private final eb a;

    ee(eb eb1)
    {
        a = eb1;
    }

    public final eG a()
    {
        return b().a();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean e()
    {
        return true;
    }

    final ea f()
    {
        return new dV(a.b().b()) {

            private ea b;
            private ee c;

            final dX c()
            {
                return c;
            }

            public final Object get(int i)
            {
                return ((java.util.Map.Entry)b.get(i)).getKey();
            }

            
            {
                c = ee.this;
                b = ea1;
                super();
            }
        };
    }

    public final Iterator iterator()
    {
        return b().a();
    }

    public final int size()
    {
        return a.size();
    }
}
