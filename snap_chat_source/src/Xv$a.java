// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public static final class util.List extends Xz
{

    private final aia a;
    private final Xu b;
    private final List c;
    private final List d;
    private long e;

    private long a(ahY ahy, boolean flag)
    {
        long l1 = 0L;
        ahY ahy1;
        Xz xz;
        Object obj;
        int i;
        int j;
        int k;
        int l;
        long l2;
        if (flag)
        {
            ahy = new ahX();
            ahy1 = ahy;
        } else
        {
            ahy1 = null;
        }
        k = c.size();
        i = 0;
        if (i >= k) goto _L2; else goto _L1
_L1:
        obj = (Xr)c.get(i);
        xz = (Xz)d.get(i);
        ahy.b(Xv.a());
        ahy.b(a);
        ahy.b(Xv.b());
        if (obj != null)
        {
            j = 0;
            for (l = ((Xr) (obj)).a.length / 2; j < l; j++)
            {
                ahy.b(((Xr) (obj)).a(j)).b(Xv.c()).b(((Xr) (obj)).b(j)).b(Xv.b());
            }

        }
        obj = xz.a();
        if (obj != null)
        {
            ahy.b("Content-Type: ").b(((Xu) (obj)).toString()).b(Xv.b());
        }
        l2 = xz.b();
        if (l2 == -1L) goto _L4; else goto _L3
_L3:
        ahy.b("Content-Length: ").j(l2).b(Xv.b());
_L6:
        ahy.b(Xv.b());
        if (flag)
        {
            l1 = l2 + l1;
        } else
        {
            ((Xz)d.get(i)).a(ahy);
        }
        ahy.b(Xv.b());
        i++;
        break MISSING_BLOCK_LABEL_31;
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        ahy1.p();
        l2 = -1L;
_L8:
        return l2;
_L2:
        ahy.b(Xv.a());
        ahy.b(a);
        ahy.b(Xv.a());
        ahy.b(Xv.b());
        l2 = l1;
        if (flag)
        {
            l2 = ((ahX) (ahy1)).b;
            ahy1.p();
            return l1 + l2;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Xu a()
    {
        return b;
    }

    public final void a(ahY ahy)
    {
        a(ahy, false);
    }

    public final long b()
    {
        long l = e;
        if (l != -1L)
        {
            return l;
        } else
        {
            long l1 = a(null, true);
            e = l1;
            return l1;
        }
    }

    public >(Xu xu, aia aia1, List list, List list1)
    {
        e = -1L;
        if (xu == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            a = aia1;
            b = Xu.a((new StringBuilder()).append(xu).append("; boundary=").append(aia1.a()).toString());
            c = XO.a(list);
            d = XO.a(list1);
            return;
        }
    }
}
