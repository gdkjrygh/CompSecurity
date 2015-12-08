// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.aa.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ax, g, m, n

public final class ay
    implements ax
{

    private static m c;
    private List a;
    private m b;

    public ay()
    {
        a = new ArrayList();
        b = c;
    }

    public ay(int i)
    {
        a = f.c(i);
        b = c;
    }

    private ay(Collection collection)
    {
        this(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); a((ax)collection.next())) { }
    }

    public transient ay(ax aax[])
    {
        this(((Collection) (Arrays.asList(aax))));
    }

    public final m a()
    {
        return b;
    }

    public final void a(ax ax1)
    {
        m m1 = ax1.a();
        if (m1 == c)
        {
            return;
        }
        if (b == c)
        {
            b = new m(g.a(m1.a), g.a(m1.b));
        } else
        {
            b.a(m1);
        }
        a.add(ax1);
    }

    public final boolean a(g g1)
    {
        if (b.a(g1))
        {
            int i = 0;
            while (i < a.size()) 
            {
                if (((ax)a.get(i)).a(g1))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean a(n n1)
    {
        m m1 = n1.a();
        if (b.a(m1))
        {
            int i = 0;
            while (i < a.size()) 
            {
                if (((ax)a.get(i)).a(n1))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    static 
    {
        g g1 = new g(0x80000000, 0x80000000);
        c = new m(g1, g1);
    }
}
