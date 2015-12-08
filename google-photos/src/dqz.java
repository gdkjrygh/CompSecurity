// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class dqz
    implements gml
{

    private final ehr a;
    private final glr b;
    private final doy c;
    private final fts d;

    public dqz(ehr ehr, glr glr1, doy doy1, int i)
    {
        a = ehr;
        b = glr1;
        c = doy1;
        d = new fts(1, new dra(this), new drb(this, glr1, ehr));
    }

    public final int a()
    {
        boolean flag = true;
        Object obj = c;
        if (((doy) (obj)).a.a())
        {
            boolean flag1;
            if (((doy) (obj)).b.b(dov) != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            noy.a("value", Boolean.valueOf(flag1));
        }
        if (((doy) (obj)).b.b(dov) == null)
        {
            flag = false;
        }
        if (!flag)
        {
            return -1;
        }
        obj = b.b(a);
        if (obj == null)
        {
            return -1;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    public final int a(int i, int j)
    {
        return j;
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
        return b.a(a, i);
    }

    public final void a_(int i, int j, int k)
    {
        d.onScroll(null, i, j, k);
    }

    public final int b(int i, int j)
    {
        return i;
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
        glq glq1 = (glq)b.b(a, i);
        if (glq1 != null)
        {
            return new dqx(glq1);
        }
        if (c.a(i))
        {
            return new dqx(c.b(i));
        } else
        {
            return new dqx(0);
        }
    }

    public final int c(int i, int j)
    {
        return i;
    }
}
