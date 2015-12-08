// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

public final class hbm extends hbl
{

    private final Context c;
    private final int d;
    private final flj e;
    private final boolean f;

    public hbm(Context context, int i)
    {
        this(context, i, flj.b, true);
    }

    public hbm(Context context, int i, flj flj1, boolean flag)
    {
        super(c.dO, context.getResources().getDisplayMetrics().widthPixels / i);
        c = context;
        d = i;
        e = flj1;
        f = flag;
    }

    public final int a()
    {
        return hbi.a(c, d);
    }

    public final afn a(ViewGroup viewgroup)
    {
        return new fro(viewgroup, e, f);
    }
}
