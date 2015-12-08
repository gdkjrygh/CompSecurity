// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            z, bf, bx, ag, 
//            al, ah, ae, x, 
//            af, y, ax, aa

final class <init> extends z
{
    final class a extends ah
    {

        final bf.a a;

        public final x a()
        {
            return b().a();
        }

        final ae c()
        {
            return new y(this) {

                private a b;

                public final Object get(int j)
                {
                    ag ag1 = bf.a(b.a.a)[j];
                    return ax.a(ag1.getValue(), ag1.getKey());
                }

                final aa h()
                {
                    return b;
                }

            
            {
                b = a1;
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

        a()
        {
            a = bf.a.this;
            super();
        }
    }


    final bf a;

    final al b()
    {
        return new a();
    }

    final boolean c()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int j = bx.a(obj.hashCode());
            int k = bf.c(a);
            ag ag1 = bf.d(a)[j & k];
            while (ag1 != null) 
            {
                if (obj.equals(ag1.getValue()))
                {
                    return ag1.getKey();
                }
                ag1 = ag1.b();
            }
        }
        return null;
    }

    public final z i()
    {
        return a;
    }

    public final int size()
    {
        return a.size();
    }

    final Object writeReplace()
    {
        return new <init>(a);
    }

    private nit>(bf bf1)
    {
        a = bf1;
        super();
    }

    it>(bf bf1, byte byte0)
    {
        this(bf1);
    }
}
