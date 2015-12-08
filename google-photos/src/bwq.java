// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class bwq extends bsr
{

    private bwn a;

    bwq(bwn bwn1, String s)
    {
        a = bwn1;
        super(s);
    }

    public final mtf a(String s)
    {
        if (bwn.n(a).c.k == null || bwn.o(a).c.l != null)
        {
            return null;
        }
        cst cst1 = (cst)c.a(bwn.p(a).c.r, "music library", null);
        cqa cqa1 = (cqa)c.a(bwn.q(a).c.k, "soundtrack", null);
        bwn.r(a).d(false);
        c.a(cst1.b, "mDetailedTrackCache", null);
        Object obj = cst1.b;
        cqc cqc = cqa1.e;
        if (((csv) (obj)).a.a(cqc))
        {
            obj = (cnx)((csv) (obj)).get(cqa1);
            if (obj != null)
            {
                bwn.s(a).a(((cnx) (obj)));
                return null;
            }
        }
        return new bvx(s, cst1, cqa1);
    }

    public final boolean a(String s, mue mue1)
    {
        bwn.t(a);
        c.b(bwn.u(a).c.l, "detailed soundtrack", null);
        s = (cnx)mue1.a().getParcelable("detailed_soundtrack");
        if (s == null)
        {
            bwn.v(a).d(true);
            return false;
        } else
        {
            bwn.w(a).a(s);
            return true;
        }
    }
}
