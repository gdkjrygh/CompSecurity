// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.DisplayMetrics;

final class evh extends dhf
{

    public evh(Context context)
    {
        super(context, com.spotify.android.paste.widget.carousel.CarouselLayoutManager.ScrollDirection.b);
    }

    protected final float a(DisplayMetrics displaymetrics)
    {
        return super.a(displaymetrics) * 2.5F;
    }

    public final int a(int i, int j, int k, int l, int i1)
    {
        return ((l - k - (j - i)) / 2 + k) - i;
    }
}
