// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.br.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class f
    implements Iterator
{

    public ArrayList a;
    public d b[];
    private int c;

    public f()
    {
        a = new ArrayList();
        c = 0;
    }

    private void c()
    {
        b = new d[a.size()];
        for (int i = 0; i < a.size(); i++)
        {
            Iterator iterator = (Iterator)a.get(i);
            b[i] = (d)iterator.next();
            if (!iterator.hasNext())
            {
                a.set(i, null);
            }
        }

    }

    public final d a()
    {
        int k = -1;
        if (b == null)
        {
            c();
        }
        int i = 0;
        int j = -1;
        for (; i < b.length; i++)
        {
            if (b[i] != null && b[i].a() > k)
            {
                k = b[i].a();
                j = i;
            }
        }

        d d1 = b[j];
        Iterator iterator = (Iterator)a.get(j);
        if (iterator != null)
        {
            b[j] = (d)iterator.next();
            if (!iterator.hasNext())
            {
                a.set(j, null);
            }
            return d1;
        } else
        {
            b[j] = null;
            c = c + 1;
            return d1;
        }
    }

    public final d b()
    {
        int l = -1;
        if (b == null)
        {
            c();
        }
        int i = 0;
        int k;
        for (int j = -1; i < b.length; j = k)
        {
            int i1 = l;
            k = j;
            if (b[i] != null)
            {
                i1 = l;
                k = j;
                if (b[i].a() > j)
                {
                    k = b[i].a();
                    i1 = i;
                }
            }
            i++;
            l = i1;
        }

        return b[l];
    }

    public final boolean hasNext()
    {
        return c < a.size();
    }

    public final Object next()
    {
        return a();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("[RankMergingFeatureIterator");
        for (int i = 0; i < a.size(); i++)
        {
            stringbuilder.append('|').append(a.get(i));
        }

        return stringbuilder.append(']').toString();
    }
}
