// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

public final class enj extends aep
{

    final int a;
    final int b;
    public int c;
    int d;
    int e;
    float f;
    private final aen g;
    private final enh h;
    private final int i;
    private final int j;
    private final SparseIntArray k = new SparseIntArray();
    private final SparseIntArray l = new SparseIntArray();
    private final SparseIntArray m = new SparseIntArray();
    private final List n = new ArrayList();

    public enj(Context context, aen aen1, enh enh1)
    {
        g = aen1;
        h = enh1;
        aen1.a(this);
        context = context.getResources();
        i = context.getDimensionPixelSize(b.mc);
        a = context.getDimensionPixelSize(b.me);
        b = context.getDimensionPixelSize(b.ma);
        j = context.getDimensionPixelSize(b.mb);
    }

    public final void a()
    {
        b();
    }

    public final void a(int i1, int j1, int k1)
    {
        b();
    }

    public final void a(int i1, Rect rect)
    {
        if (k.get(i1, -1) != -1 || g.a() == 0) goto _L2; else goto _L1
_L1:
        int j1;
        for (j1 = i1; j1 > 0 && h.a(j1 - 1) > 0.0F; j1--) { }
_L8:
        if (j1 >= g.a() || j1 > i1) goto _L2; else goto _L3
_L3:
        float f3;
        int k1;
        n.clear();
        f3 = 0.0F;
        k1 = j1;
_L9:
        float f1;
        if (k1 >= g.a())
        {
            break MISSING_BLOCK_LABEL_549;
        }
        float f4 = h.a(k1);
        f1 = f4;
        if (f4 == -2F)
        {
            if ((k1 % 2 + k1 % 5 + k1 % 7) % 2 == 0)
            {
                f1 = 0.8F;
            } else
            {
                f1 = 1.25F;
            }
        }
        if (f1 != -1F) goto _L5; else goto _L4
_L4:
        if (k1 != j1) goto _L7; else goto _L6
_L6:
        j1 = k1 + 1;
          goto _L8
_L7:
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_183;
_L5:
        if (k1 != j1 && f3 + f1 > f)
        {
            break MISSING_BLOCK_LABEL_549;
        }
        n.add(Float.valueOf(f1));
        f3 += f1;
        k1++;
          goto _L9
_L10:
        if (k1 == g.a())
        {
            flag = true;
        }
        int l1 = (int)((float)(d - (n.size() - 1) * c) / f3);
        if (flag || n.size() == 1)
        {
            l1 = Math.max(i, Math.min(l1, e));
        }
        int j2 = 0;
        int i2 = 0;
        while (i2 < n.size()) 
        {
            int k2;
            if (i2 == n.size() - 1 && !flag)
            {
                k1 = d;
            } else
            {
                float f2 = l1;
                k1 = (int)(((Float)n.get(i2)).floatValue() * f2) + j2;
            }
            k2 = k1;
            if (i2 == n.size() - 1)
            {
                k2 = k1;
                if (d - k1 < j)
                {
                    k2 = d;
                }
            }
            k.put(j1 + i2, j2);
            l.put(j1 + i2, k2);
            m.put(j1 + i2, l1);
            k1 = c;
            i2++;
            j2 = k2 + k1;
        }
        k1 = (n.size() + j1) - 1;
          goto _L6
_L2:
        rect.set(k.get(i1), 0, l.get(i1), m.get(i1));
        return;
        flag = false;
          goto _L10
    }

    public final boolean a(int i1)
    {
        return h.a(i1) != -1F;
    }

    public final void a_(int i1, int j1)
    {
        b();
    }

    void b()
    {
        k.clear();
        l.clear();
        m.clear();
    }

    public final void b_(int i1, int j1)
    {
        b();
    }

    public final void c_(int i1, int j1)
    {
        b();
    }
}
