// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.holder;

import android.util.SparseArray;
import android.view.ViewGroup;
import ctz;
import doh;
import dql;
import dqm;
import dqo;
import dqr;
import dqs;
import dqt;
import dqu;
import dqv;
import dqw;
import dqx;
import dqy;

// Referenced classes of package com.spotify.mobile.android.porcelain.holder:
//            PorcelainCarouselViewHolder

public abstract class PorcelainType extends Enum
{

    private static PorcelainType a;
    private static PorcelainType b;
    private static PorcelainType c;
    private static PorcelainType d;
    private static PorcelainType e;
    private static PorcelainType f;
    private static PorcelainType g;
    private static PorcelainType h;
    private static PorcelainType i;
    private static PorcelainType j;
    private static PorcelainType k;
    private static PorcelainType l;
    private static PorcelainType m;
    private static PorcelainType n;
    private static PorcelainType o;
    private static PorcelainType p;
    private static final SparseArray q;
    private static final PorcelainType r[];
    private final int mViewType;

    private PorcelainType(String s, int i1, int j1)
    {
        super(s, i1);
        mViewType = j1;
    }

    PorcelainType(String s, int i1, int j1, byte byte0)
    {
        this(s, i1, j1);
    }

    public static PorcelainType a(int i1)
    {
        return (PorcelainType)ctz.a(q.get(i1));
    }

    public static PorcelainType valueOf(String s)
    {
        return (PorcelainType)Enum.valueOf(com/spotify/mobile/android/porcelain/holder/PorcelainType, s);
    }

    public static PorcelainType[] values()
    {
        return (PorcelainType[])r.clone();
    }

    public abstract dqx a(ViewGroup viewgroup, doh doh);

    static 
    {
        int i1 = 0;
        a = new PorcelainType("BILLBOARD") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dql(viewgroup, doh);
            }

        };
        b = new PorcelainType("CARD") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqm(viewgroup, doh);
            }

        };
        c = new PorcelainType("CARD_COMPACT") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqr(viewgroup, doh);
            }

        };
        d = new PorcelainType("CAROUSEL") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return PorcelainCarouselViewHolder.a(viewgroup, doh);
            }

        };
        e = new PorcelainType("CAROUSEL_COMPACT") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return PorcelainCarouselViewHolder.c(viewgroup, doh);
            }

        };
        f = new PorcelainType("CAROUSEL_COMPACT_SMALL") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return PorcelainCarouselViewHolder.d(viewgroup, doh);
            }

        };
        g = new PorcelainType("CAROUSEL_SMALL") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return PorcelainCarouselViewHolder.b(viewgroup, doh);
            }

        };
        h = new PorcelainType("CELL") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return dqo.b(viewgroup, doh);
            }

        };
        i = new PorcelainType("CELL_SMALL") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return dqo.a(viewgroup, doh);
            }

        };
        j = new PorcelainType("CELL_TALL") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return dqo.c(viewgroup, doh);
            }

        };
        k = new PorcelainType("CELL_WIDE") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqy(viewgroup, doh);
            }

        };
        l = new PorcelainType("CUSTOM") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqs(viewgroup.getContext(), doh);
            }

        };
        m = new PorcelainType("HEADER") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqt(viewgroup.getContext(), doh);
            }

        };
        n = new PorcelainType("HEADER_DESCRIPTION") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqu(viewgroup, doh);
            }

        };
        o = new PorcelainType("PROMOTIONAL_CARD") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqv(viewgroup, doh);
            }

        };
        p = new PorcelainType("THROBBER") {

            final dqx a(ViewGroup viewgroup, doh doh)
            {
                return new dqw(viewgroup, doh);
            }

        };
        r = (new PorcelainType[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p
        });
        PorcelainType aporcelaintype[] = values();
        q = new SparseArray();
        for (int j1 = aporcelaintype.length; i1 < j1; i1++)
        {
            PorcelainType porcelaintype = aporcelaintype[i1];
            q.append(porcelaintype.mViewType, porcelaintype);
        }

    }
}
