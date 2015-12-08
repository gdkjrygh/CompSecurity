// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class bwr extends bsr
{

    private final boolean a;
    private bwn b;

    bwr(bwn bwn1, boolean flag)
    {
        b = bwn1;
        if (flag)
        {
            bwn1 = "Preview";
        } else
        {
            bwn1 = "Full";
        }
        bwn1 = String.valueOf(bwn1);
        if (bwn1.length() != 0)
        {
            bwn1 = "DownloadMusicData".concat(bwn1);
        } else
        {
            bwn1 = new String("DownloadMusicData");
        }
        super(bwn1);
        a = flag;
    }

    public final mtf a(String s)
    {
        if (bwn.x(b).c.k == null || a && bwn.y(b).c.n)
        {
            return null;
        }
        if (!a && (bwn.z(b).c.e == null || !bwn.A(b).c.d))
        {
            return null;
        }
        c.a(bwn.B(b).c.l, "detailed soundtrack", null);
        Object obj = bwn.C(b).c.e;
        if ((obj == null || !bwn.D(b).c.d) && !a)
        {
            return null;
        }
        if (ddy.j.a() && bwn.E(b).c.k.g == -4L)
        {
            bwn.F(b).c(true);
            bwn.G(b).b(true);
            return null;
        }
        long l;
        boolean flag;
        if (a)
        {
            l = 0x989680L;
        } else
        {
            l = ((cnn)((cqf) (obj)).c.get(0)).a(0).f.c;
        }
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "endpoint should be non-negative");
        bwn.H(b).d(false);
        obj = String.valueOf(s);
        if (a)
        {
            s = "Preview";
        } else
        {
            s = "Full";
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = ((String) (obj)).concat(s);
        } else
        {
            s = new String(((String) (obj)));
        }
        return new bvw(s, bwn.I(b).c.r, l, bwn.J(b).c.l);
    }

    public final boolean a(String s, mue mue1)
    {
        if (mue1.c())
        {
            bwn.K(b).d(true);
            return false;
        }
        if (a)
        {
            bwn.L(b).c(true);
            return true;
        } else
        {
            bwn.M(b).b(true);
            return true;
        }
    }
}
