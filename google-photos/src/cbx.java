// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class cbx extends caq
{

    final List a;
    private final int b[];
    private final SparseArray c;
    private long d;
    private cay e;

    private cbx(int ai[], List list)
    {
        b.a(list.size(), "size of effectList");
        b.a(ai.length, "Effect index count", list.size(), "Effect index array and effect list must have the same size.");
        a = Collections.unmodifiableList(list);
        b = ai;
        c = new SparseArray();
        int i1 = 0;
        while (i1 < list.size()) 
        {
            boolean flag;
            if (c.get(ai[i1]) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "Repeated effect index found.");
            b.a(list.get(i1), "effectList member", null);
            c.put(ai[i1], list.get(i1));
            i1++;
        }
    }

    public transient cbx(int ai[], cay acay[])
    {
        this(ai, Arrays.asList(acay));
    }

    private cay A(cba cba1)
    {
        if (e != null && cba1.a == d) goto _L2; else goto _L1
_L1:
        int ai[];
        int i1;
        int k1;
        if (cba1.x == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        ai = cba1.x.a;
        k1 = ai.length;
        i1 = 0;
_L7:
        if (i1 >= k1) goto _L4; else goto _L3
_L3:
        cay cay1;
        int i2 = ai[i1];
        cay1 = (cay)c.get(i2);
        if (cay1 == null) goto _L6; else goto _L5
_L5:
        e = cay1;
        d = cba1.a;
_L2:
        return e;
_L6:
        i1++;
          goto _L7
_L4:
        throw new IllegalStateException("No effect enabled in styling for MultiEffect");
        if (cba1.f == 0)
        {
            cay1 = (cay)a.get(0);
        } else
        {
            int j1 = cba1.f;
            int l1 = (int)cba1.e;
            j1 = b.b(0, a.size(), j1 + l1);
            cay1 = (cay)a.get(j1);
        }
          goto _L5
    }

    private int d(cnq cnq1)
    {
        return b[(new Random(cnq1.hashCode())).nextInt(b.length)];
    }

    private cay e(cnq cnq1)
    {
        return (cay)c.get(d(cnq1));
    }

    public final List D_()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cay cay1 = (cay)iterator.next();
            if (cay1.D_() != null)
            {
                arraylist.addAll(cay1.D_());
            }
        } while (true);
        return arraylist;
    }

    public car E_()
    {
        return car.a;
    }

    public long a(cnt cnt, cnt cnt1)
    {
        return 0L;
    }

    public final Bitmap a(Context context, cba cba1, int i1, int j1)
    {
        return A(cba1).a(context, cba1, i1, j1);
    }

    public final Matrix a(cba cba1, cpy cpy)
    {
        return A(cba1).a(cba1, cpy);
    }

    public final List a(cnq cnq1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(d(cnq1)));
        return Collections.unmodifiableList(arraylist);
    }

    public final boolean a(cba cba1)
    {
        return A(cba1).a(cba1);
    }

    public final Matrix b(cba cba1)
    {
        return A(cba1).b(cba1);
    }

    public final pyh b(cnq cnq1)
    {
        return e(cnq1).b(cnq1);
    }

    public final Matrix c(cba cba1)
    {
        return A(cba1).c(cba1);
    }

    public List c(cnq cnq1)
    {
        return e(cnq1).c(cnq1);
    }

    public final Matrix d(cba cba1)
    {
        return A(cba1).d(cba1);
    }

    public int e(cba cba1)
    {
        return A(cba1).e(cba1);
    }

    public int f(cba cba1)
    {
        return A(cba1).f(cba1);
    }

    public Matrix g(cba cba1)
    {
        return A(cba1).g(cba1);
    }

    public float h(cba cba1)
    {
        return A(cba1).h(cba1);
    }

    public float[] h()
    {
        return cbg.a;
    }

    public final int i(cba cba1)
    {
        return A(cba1).i(cba1);
    }

    public final int j(cba cba1)
    {
        return A(cba1).j(cba1);
    }

    public final Matrix k(cba cba1)
    {
        return A(cba1).k(cba1);
    }

    public final float l(cba cba1)
    {
        return A(cba1).l(cba1);
    }

    public final int m(cba cba1)
    {
        return A(cba1).m(cba1);
    }

    public final int n(cba cba1)
    {
        return A(cba1).n(cba1);
    }

    public final Matrix o(cba cba1)
    {
        return A(cba1).o(cba1);
    }

    public final float p(cba cba1)
    {
        return A(cba1).p(cba1);
    }

    public final int q(cba cba1)
    {
        return A(cba1).q(cba1);
    }

    public int r(cba cba1)
    {
        return A(cba1).r(cba1);
    }

    public final long s(cba cba1)
    {
        return 0L;
    }

    public final float t(cba cba1)
    {
        return A(cba1).t(cba1);
    }

    public String toString()
    {
        return b.a(getClass(), new Object[] {
            a
        });
    }

    public final float u(cba cba1)
    {
        return E_().h;
    }

    public float v(cba cba1)
    {
        return A(cba1).v(cba1);
    }

    public final float w(cba cba1)
    {
        return A(cba1).w(cba1);
    }

    public final Matrix x(cba cba1)
    {
        return A(cba1).x(cba1);
    }

    public final Matrix y(cba cba1)
    {
        return A(cba1).y(cba1);
    }

    public final void z(cba cba1)
    {
    }
}
