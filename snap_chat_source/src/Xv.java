// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Xv
{
    public static final class a extends Xz
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
            int j;
            int k;
            int l;
            int i1;
            long l2;
            if (flag)
            {
                ahy = new ahX();
                ahy1 = ahy;
            } else
            {
                ahy1 = null;
            }
            l = c.size();
            j = 0;
            if (j >= l) goto _L2; else goto _L1
_L1:
            obj = (Xr)c.get(j);
            xz = (Xz)d.get(j);
            ahy.b(Xv.a());
            ahy.b(a);
            ahy.b(Xv.b());
            if (obj != null)
            {
                k = 0;
                for (i1 = ((Xr) (obj)).a.length / 2; k < i1; k++)
                {
                    ahy.b(((Xr) (obj)).a(k)).b(Xv.c()).b(((Xr) (obj)).b(k)).b(Xv.b());
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
                ((Xz)d.get(j)).a(ahy);
            }
            ahy.b(Xv.b());
            j++;
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

        public a(Xu xu, aia aia1, List list, List list1)
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


    public static final Xu a = Xu.a("multipart/form-data");
    private static Xu f = Xu.a("multipart/mixed");
    private static final byte g[] = {
        58, 32
    };
    private static final byte h[] = {
        13, 10
    };
    private static final byte i[] = {
        45, 45
    };
    public final aia b;
    public Xu c;
    public final List d;
    public final List e;

    public Xv()
    {
        this(UUID.randomUUID().toString());
    }

    private Xv(String s)
    {
        c = f;
        d = new ArrayList();
        e = new ArrayList();
        b = aia.a(s);
    }

    static byte[] a()
    {
        return i;
    }

    static byte[] b()
    {
        return h;
    }

    static byte[] c()
    {
        return g;
    }

    static 
    {
        Xu.a("multipart/alternative");
        Xu.a("multipart/digest");
        Xu.a("multipart/parallel");
    }
}
