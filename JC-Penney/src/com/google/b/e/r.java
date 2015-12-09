// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.g;
import com.google.b.u;
import java.util.Map;

public abstract class r
    implements u
{

    public r()
    {
    }

    protected static int a(boolean aflag[], int i, int ai[], boolean flag)
    {
        int i1 = ai.length;
        int j = 0;
        int k = 0;
        while (j < i1) 
        {
            int j1 = ai[j];
            for (int l = 0; l < j1;)
            {
                aflag[i] = flag;
                l++;
                i++;
            }

            k += j1;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j++;
        }
        return k;
    }

    private static b a(boolean aflag[], int i, int j, int k)
    {
        int l = aflag.length;
        int i1 = l + k;
        int j1 = Math.max(i, i1);
        k = Math.max(1, j);
        i1 = j1 / i1;
        i = (j1 - l * i1) / 2;
        b b1 = new b(j1, k);
        for (j = 0; j < l;)
        {
            if (aflag[j])
            {
                b1.a(i, 0, i1, k);
            }
            j++;
            i += i1;
        }

        return b1;
    }

    public int a()
    {
        return 10;
    }

    public b a(String s, a a1, int i, int j, Map map)
    {
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Negative size is not allowed. Input: ").append(i).append('x').append(j).toString());
        }
        int k = a();
        if (map != null)
        {
            a1 = (Integer)map.get(g.f);
            if (a1 != null)
            {
                k = a1.intValue();
            }
        }
        return a(a(s), i, j, k);
    }

    public abstract boolean[] a(String s);
}
