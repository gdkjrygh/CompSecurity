// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.util;

import com.google.common.collect.Lists;
import cuv;
import cva;
import ejj;
import gfp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Releases
{

    public static final List a;
    public static final gfp b;
    private static ejj c = new ejj((byte)0);

    public static List a(List list, gfp gfp1, String s)
    {
        c.a = s;
        s = SortOrder.valueOf(gfp1.a);
        list = cuv.b(list, c);
        boolean flag = gfp1.b();
        if (((SortOrder) (s)).mOrdering == null)
        {
            return Lists.a(list);
        }
        if (flag)
        {
            return ((SortOrder) (s)).mOrdering.a().a(list);
        } else
        {
            return ((SortOrder) (s)).mOrdering.a(list);
        }
    }

    static 
    {
        b = new gfp(SortOrder.c.toString(), 0x7f080525, false);
        a = Collections.unmodifiableList(Arrays.asList(new gfp[] {
            new gfp(SortOrder.a.toString(), 0x7f080521), new gfp(SortOrder.b.toString(), 0x7f080520), b
        }));
    }

    private class SortOrder extends Enum
    {

        public static final SortOrder a;
        public static final SortOrder b;
        public static final SortOrder c;
        private static final SortOrder d[];
        cva mOrdering;

        public static SortOrder valueOf(String s)
        {
            return (SortOrder)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/util/Releases$SortOrder, s);
        }

        public static SortOrder[] values()
        {
            return (SortOrder[])d.clone();
        }

        static 
        {
            a = new SortOrder("NAME", 0, cva.a(String.CASE_INSENSITIVE_ORDER).a(ejk.a()));
            b = new SortOrder("YEAR", 1, cva.b().a(ejk.b()));
            c = new SortOrder("NONE", 2, null);
            d = (new SortOrder[] {
                a, b, c
            });
        }

        private SortOrder(String s, int i, cva cva1)
        {
            super(s, i);
            mOrdering = cva1;
        }
    }

}
