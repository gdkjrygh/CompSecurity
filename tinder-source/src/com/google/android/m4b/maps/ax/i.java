// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.bx.s;
import com.google.android.m4b.maps.bx.t;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.m4b.maps.ax:
//            f

public abstract class i
    implements f
{

    protected final ah a;
    protected final ag b;
    protected final t c;

    public i(ah ah, ag ag1, g g1)
    {
        this(ah, g1.a(), ag1);
    }

    private i(ah ah, t t1, ag ag1)
    {
        a = ah;
        c = t1;
        b = ag1;
        if (t1 == null)
        {
            throw new RuntimeException("Null zoom table");
        } else
        {
            return;
        }
    }

    public float a(com.google.android.m4b.maps.bo.g g1)
    {
        return (float)c(g1).e;
    }

    public final ac a(ac ac1, com.google.android.m4b.maps.bo.g g1)
    {
        g1 = c(g1);
        int j = ac1.a;
        if (j < 0 || j >= ((s) (g1)).f.length)
        {
            j = -1;
        } else
        {
            j = ((s) (g1)).f[j];
        }
        if (j < 0)
        {
            return null;
        } else
        {
            return ac1.a(j);
        }
    }

    public final List b(com.google.android.m4b.maps.bo.g g1)
    {
        ArrayList arraylist = new ArrayList();
        g1 = c(g1);
label0:
        for (int j = 0; j <= 2; j++)
        {
            if (!((s) (g1)).i.contains(Integer.valueOf(j)))
            {
                continue;
            }
            int i1 = 1 << j;
            int k = 0;
            do
            {
                if (k >= i1)
                {
                    continue label0;
                }
                for (int l = 0; l < i1; l++)
                {
                    arraylist.add(new ac(j, k, l, b.a()));
                }

                k++;
            } while (true);
        }

        return arraylist;
    }

    final s c(com.google.android.m4b.maps.bo.g g1)
    {
        return c.a(g1, a);
    }
}
