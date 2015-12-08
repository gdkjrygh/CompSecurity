// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ah, bj, ae, x, 
//            af, y, aq, ax, 
//            aa

final class <init> extends ah
{

    final bj a;

    public final x a()
    {
        return b().a();
    }

    final ae c()
    {
        return new y() {

            private final ae b;
            private bj.a c;

            public final Object get(int i)
            {
                return ax.a(b.get(i), bj.a(c.a).get(i));
            }

            final aa h()
            {
                return c;
            }

            
            {
                c = bj.a.this;
                super();
                b = c.a.a.b();
            }
        };
    }

    final af e()
    {
        return a;
    }

    public final Iterator iterator()
    {
        return b().a();
    }

    private a(bj bj1)
    {
        a = bj1;
        super();
    }

    nit>(bj bj1, byte byte0)
    {
        this(bj1);
    }
}
