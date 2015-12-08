// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

final class fms extends hbl
{

    private int c;
    private fmo d;

    fms(fmo fmo1, int i, int j, int k)
    {
        d = fmo1;
        c = k;
        super(i, 0);
    }

    public final int a()
    {
        return hbi.a(fmo.e(d), c);
    }

    public final afn a(ViewGroup viewgroup)
    {
        return new gmi(viewgroup);
    }
}
