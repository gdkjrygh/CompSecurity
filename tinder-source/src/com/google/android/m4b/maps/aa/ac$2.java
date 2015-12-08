// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ah, ac, x, af, 
//            ax

final class nit> extends ah
{

    final ac a;

    public final x a()
    {
        return new x() {

            private final Iterator a;
            private ac._cls2 b;

            public final boolean hasNext()
            {
                return a.hasNext();
            }

            public final Object next()
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
                return ax.a(entry.getKey(), entry.getValue());
            }

            
            {
                b = ac._cls2.this;
                super();
                a = ac.a(b.a).entrySet().iterator();
            }
        };
    }

    final af e()
    {
        return a;
    }

    public final Iterator iterator()
    {
        return a();
    }

    a(ac ac1)
    {
        a = ac1;
        super();
    }
}
