// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.GridLayoutManager;
import android.util.SparseIntArray;
import android.view.View;
import com.spotify.mobile.android.util.logging.Logger;

public class aad extends GridLayoutManager
{

    public aad(int i)
    {
        super(i);
    }

    private int a(abh abh1, abm abm1, int i)
    {
        int j;
        if (!abm1.a())
        {
            j = e.b(i, a);
        } else
        {
            int l = d.get(i, -1);
            j = l;
            if (l == -1)
            {
                int k = abh1.a(i);
                if (k == -1)
                {
                    Logger.b("GridLayoutManager", new Object[] {
                        (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i).toString()
                    });
                    return 0;
                } else
                {
                    return e.b(k, a);
                }
            }
        }
        return j;
    }

    final void a(abh abh1, abm abm1, aaf aaf1)
    {
        int j = 0;
        int i;
        int k;
        int i1;
        int j1;
        if (h() == 1)
        {
            i = q() - u() - s();
        } else
        {
            i = r() - v() - t();
        }
        if (b == null || b.length != a + 1 || b[b.length - 1] != i)
        {
            b = new int[a + 1];
        }
        b[0] = 0;
        i1 = i / a;
        j1 = i % a;
        k = 1;
        i = 0;
        while (k <= a) 
        {
            i += j1;
            int l;
            if (i > 0 && a - i < j1)
            {
                i -= a;
                l = i1 + 1;
            } else
            {
                l = i1;
            }
            j += l;
            b[k] = j;
            k++;
        }
        if (abm1.b() > 0 && !abm1.a())
        {
            if (aaf1.c)
            {
                j = a(abh1, abm1, aaf1.a);
                for (i = e.a(aaf1.a); i + j < a && aaf1.a < w(); i = e.a(aaf1.a))
                {
                    aaf1.a = aaf1.a + 1;
                    j = a(abh1, abm1, aaf1.a);
                }

            } else
            {
                for (i = a(abh1, abm1, aaf1.a); i > 0 && aaf1.a > 0; i = a(abh1, abm1, aaf1.a))
                {
                    aaf1.a = aaf1.a - 1;
                }

            }
        }
        if (c == null || c.length != a)
        {
            c = new View[a];
        }
    }
}
