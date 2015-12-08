// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection;
import java.util.List;

public final class dpv extends dpr
    implements PorcelainCarouselCollection
{

    private final com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size e;
    private com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle f;

    public dpv(String s, com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size size, List list)
    {
        super(s, list);
        e = (com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size)ctz.a(size);
        f = com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle.b;
    }

    private dsf a()
    {
        return new dsf(this);
    }

    public final String getBackground()
    {
        return null;
    }

    public final com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle getBackgroundStyle()
    {
        return f;
    }

    public final volatile String getId()
    {
        return super.getId();
    }

    public final dsi getInfo()
    {
        return a();
    }

    public final dsj getInfo()
    {
        return a();
    }

    public final volatile int getItemCount()
    {
        return super.getItemCount();
    }

    public final drp getMetricsInfo()
    {
        return null;
    }

    public final volatile Iterable getPlayables()
    {
        return super.getPlayables();
    }

    public final CharSequence getTitle()
    {
        return null;
    }

    public final int getType()
    {
        return e.viewType;
    }
}
