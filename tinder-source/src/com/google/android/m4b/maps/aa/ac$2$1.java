// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            x, ac, ax, ah, 
//            af

final class b extends x
{

    private final Iterator a;
    private a b;

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        java.util.ry ry = (java.util.ry)a.next();
        return ax.a(ry.getKey(), ry.getValue());
    }

    t>(t> t>)
    {
        b = t>;
        super();
        a = ac.a(b.b).entrySet().iterator();
    }

    // Unreferenced inner class com/google/android/m4b/maps/aa/ac$2

/* anonymous class */
    final class ac._cls2 extends ah
    {

        final ac a;

        public final x a()
        {
            return new ac._cls2._cls1(this);
        }

        final af e()
        {
            return a;
        }

        public final Iterator iterator()
        {
            return a();
        }

            
            {
                a = ac1;
                super();
            }
    }

}
