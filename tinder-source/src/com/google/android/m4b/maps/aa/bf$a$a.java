// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ah, bf, ae, x, 
//            af, y, ax, aa

final class t> extends ah
{

    final b a;

    public final x a()
    {
        return b().a();
    }

    final ae c()
    {
        return new y() {

            private bf.a.a b;

            public final Object get(int i)
            {
                ag ag = bf.a(b.a.a)[i];
                return ax.a(ag.getValue(), ag.getKey());
            }

            final aa h()
            {
                return b;
            }

            
            {
                b = bf.a.a.this;
                super();
            }
        };
    }

    final af e()
    {
        return a;
    }

    final boolean g()
    {
        return true;
    }

    public final int hashCode()
    {
        return bf.b(a.a);
    }

    public final Iterator iterator()
    {
        return b().a();
    }

    >(> >)
    {
        a = >;
        super();
    }
}
