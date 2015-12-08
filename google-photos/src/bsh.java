// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class bsh
    implements bsj
{

    private bsa a;

    bsh(bsa bsa1)
    {
        a = bsa1;
        super();
    }

    public final void a()
    {
        if (a.d())
        {
            a.e.a("generating_timeline_thumbnail", true);
        }
    }

    public final void a(int i)
    {
        a.b.a(i);
    }

    public final void a(int i, int j)
    {
        if (i == j)
        {
            return;
        }
        if (a.d())
        {
            a.e.a("generating_timeline_thumbnail", true);
        }
        crb crb1 = new crb(i, j);
        ((bsi)a.f.b).a(crb1);
        a.c.a(crb1);
    }

    public final void a(SparseArray sparsearray)
    {
        int i = sparsearray.keyAt(0);
        bww bww1 = a.c;
        bww1.c.x = Collections.unmodifiableList(new ArrayList(bww1.b.A));
        bww1.c.y = i;
        ((bsi)a.f.b).a(i);
        int j = sparsearray.size();
        i = 0x7fffffff;
        j--;
        while (j >= 0) 
        {
            int k = sparsearray.keyAt(j);
            cqz cqz1;
            boolean flag;
            if (k <= i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag, "Implementation error: SparseArray keys not sorted.");
            cqz1 = new cqz(k, (cnq)sparsearray.valueAt(j));
            a.c.a(cqz1);
            j--;
            i = k;
        }
    }

    public final void b()
    {
        if (a.c.j())
        {
            bww bww1 = a.c;
            c.a(bww1.j(), "canUndo");
            List list = bww1.c.x;
            bww1.b.A.clear();
            bww1.b.A.addAll(list);
            bww1.g();
            bww1.a(new bxg[] {
                bxg.b
            });
            bww1.k();
        }
    }

    public final void b(int i, int j)
    {
        a.a(i, j);
    }

    public final void c()
    {
        if (a.c.j())
        {
            a.c.k();
        }
    }

    public final void d()
    {
        bww bww1 = a.c;
        for (List list = bww1.b.A; list.size() > bww1.b.B && list.size() > 0; list.remove(list.size() - 1)) { }
        long l = bww1.b.z.d;
        boolean flag1 = bww1.b.z.c;
        bww1.b.z.a();
        bww1.b.z.a(l);
        bww1.b.z.c = flag1;
        List list1 = bww1.b.g;
        int i = bww1.b.h.size() - 1;
        boolean flag = false;
        for (; i >= 0; i--)
        {
            if (list1.contains(((bwz)bww1.b.h.get(i)).a))
            {
                continue;
            }
            bww1.b.h.remove(b.a(i, "index", bww1.b.h));
            bww1.c.a.remove(b.a(i, "index", bww1.c.a));
            if ((Long)bww1.c.b.remove(b.a(i, "index", bww1.c.b)) == null)
            {
                bxi bxi1 = bww1.c;
                bxi1.c = bxi1.c - 1;
            }
            bww1.c.g = -1L;
            flag = true;
        }

        if (flag)
        {
            bww1.g();
            bww1.a(new bxg[] {
                bxg.i, bxg.k
            });
        }
        bww1.g();
        bww1.a(new bxg[] {
            bxg.a, bxg.b
        });
    }

    public final void e()
    {
        a.c.l();
    }

    public final cnq f()
    {
        Object obj = null;
        a.c();
        cqf cqf1 = a.c.c.e;
        cnq cnq1 = obj;
        if (cqf1 != null)
        {
            long l = a.c.b.Y;
            int k = cqf1.d();
            int i = cqf1.a(l, false);
            int j = i;
            if (i == k)
            {
                i--;
                do
                {
                    j = i;
                    if (i < 0)
                    {
                        break;
                    }
                    j = i;
                    if (cqf1.b(i).d != cnt.d)
                    {
                        break;
                    }
                    i--;
                } while (true);
            }
            cnq1 = obj;
            if (j >= 0)
            {
                cnq1 = cqf1.b(j);
            }
        }
        return cnq1;
    }

    public final boolean g()
    {
        if (a.d())
        {
            a.e.a("generating_timeline_thumbnail", true);
            return true;
        } else
        {
            return false;
        }
    }
}
