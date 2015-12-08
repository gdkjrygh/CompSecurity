// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.spotify.android.paste.widget.carousel.CarouselLayoutManager;

public final class dhc
    implements dhd
{

    private CarouselLayoutManager a;

    public dhc(CarouselLayoutManager carousellayoutmanager)
    {
        a = carousellayoutmanager;
        super();
    }

    public final int a()
    {
        return (CarouselLayoutManager.a(a) - CarouselLayoutManager.b(a)) / 2;
    }

    public final int a(int i, int j)
    {
        return (i - CarouselLayoutManager.b(a)) / 2;
    }

    public final abk a(RecyclerView recyclerview, com.spotify.android.paste.widget.carousel.CarouselLayoutManager.ScrollDirection scrolldirection)
    {
        return new dhf(recyclerview.getContext(), scrolldirection) {

            public final int a(int i, int j, int k, int l, int i1)
            {
                return ((l - k - (j - i)) / 2 + k) - i;
            }

        };
    }

    public final int b()
    {
        return (CarouselLayoutManager.a(a) - CarouselLayoutManager.b(a)) / 2;
    }
}
