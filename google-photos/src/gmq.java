// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class gmq
    implements gml
{

    private final gll a;
    private final gmt b;
    private final fts c;
    private final ehr d;

    public gmq(gll gll1, ehr ehr, gmt gmt1, int i, int j)
    {
        a = gll1;
        d = ehr;
        b = gmt1;
        c = new fts(i, 5, new gmr(this), new gms(this));
    }

    static ehr a(gmq gmq1)
    {
        return gmq1.d;
    }

    static gll b(gmq gmq1)
    {
        return gmq1.a;
    }

    public final int a()
    {
        Integer integer = a.b(d);
        if (integer == null)
        {
            return -1;
        } else
        {
            return integer.intValue();
        }
    }

    public final int a(int i, int j)
    {
        return 1;
    }

    public final int a(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        } else
        {
            gml1 = String.valueOf(gml1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(gml1).length() + 24)).append("cannot locate producer: ").append(gml1).toString());
        }
    }

    public final void a(RecyclerView recyclerview, int i)
    {
    }

    public final boolean a(int i)
    {
        return a.a(d, i);
    }

    public final void a_(int i, int j, int k)
    {
        b.a(i);
        c.onScroll(null, i, j, k);
    }

    public final int b(int i, int j)
    {
        return i % j;
    }

    public final int b(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        } else
        {
            gml1 = String.valueOf(gml1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(gml1).length() + 24)).append("cannot locate producer: ").append(gml1).toString());
        }
    }

    public final hgo b(int i)
    {
        b.a(i);
        ekp ekp1 = (ekp)a.b(d, i);
        if (ekp1 != null)
        {
            return new frj(ekp1, 0x80000000);
        } else
        {
            return new gmh(1, 0x80000000);
        }
    }

    public final int c(int i, int j)
    {
        return i / j;
    }
}
