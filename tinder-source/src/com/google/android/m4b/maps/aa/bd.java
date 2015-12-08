// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            e

public abstract class bd
    implements Iterable
{

    public final Iterable a;

    protected bd()
    {
        a = this;
    }

    bd(Iterable iterable)
    {
        a = (Iterable)j.a(iterable);
    }

    public static bd a(Iterable iterable)
    {
        if (iterable instanceof bd)
        {
            return (bd)iterable;
        } else
        {
            return new bd(iterable, iterable) {

                private Iterable b;

                public final Iterator iterator()
                {
                    return b.iterator();
                }

            
            {
                b = iterable1;
                super(iterable);
            }
            };
        }
    }

    public String toString()
    {
        return e.b(a.iterator());
    }
}
