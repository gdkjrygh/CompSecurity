// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowOverviewFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (TVShowOverviewFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, TVShowOverviewFragment tvshowoverviewfragment, Object obj)
    {
        tvshowoverviewfragment.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.eshLayout(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        tvshowoverviewfragment.mediaPanel = (ScrollView)ctor.l((View)ctor.l(obj, 0x7f0e0071, "field 'mediaPanel'"), 0x7f0e0071, "field 'mediaPanel'");
        tvshowoverviewfragment.mediaArt = (ImageView)ctor.l((View)ctor.l(obj, 0x7f0e0070, "field 'mediaArt'"), 0x7f0e0070, "field 'mediaArt'");
        tvshowoverviewfragment.mediaPoster = (ImageView)ctor.er((View)ctor.er(obj, 0x7f0e0075, "field 'mediaPoster'"), 0x7f0e0075, "field 'mediaPoster'");
        tvshowoverviewfragment.mediaTitle = (TextView)ctor.e((View)ctor.e(obj, 0x7f0e0073, "field 'mediaTitle'"), 0x7f0e0073, "field 'mediaTitle'");
        tvshowoverviewfragment.mediaUndertitle = (TextView)ctor.rtitle((View)ctor.rtitle(obj, 0x7f0e0074, "field 'mediaUndertitle'"), 0x7f0e0074, "field 'mediaUndertitle'");
        tvshowoverviewfragment.mediaRating = (TextView)ctor.ng((View)ctor.ng(obj, 0x7f0e0080, "field 'mediaRating'"), 0x7f0e0080, "field 'mediaRating'");
        tvshowoverviewfragment.mediaMaxRating = (TextView)ctor.ating((View)ctor.ating(obj, 0x7f0e0081, "field 'mediaMaxRating'"), 0x7f0e0081, "field 'mediaMaxRating'");
        tvshowoverviewfragment.mediaPremiered = (TextView)ctor.iered((View)ctor.iered(obj, 0x7f0e0088, "field 'mediaPremiered'"), 0x7f0e0088, "field 'mediaPremiered'");
        tvshowoverviewfragment.mediaGenres = (TextView)ctor.es((View)ctor.es(obj, 0x7f0e008f, "field 'mediaGenres'"), 0x7f0e008f, "field 'mediaGenres'");
        tvshowoverviewfragment.mediaDescription = (TextView)ctor.ription((View)ctor.ription(obj, 0x7f0e007b, "field 'mediaDescription'"), 0x7f0e007b, "field 'mediaDescription'");
        tvshowoverviewfragment.videoCastList = (GridLayout)ctor.List((View)ctor.List(obj, 0x7f0e0051, "field 'videoCastList'"), 0x7f0e0051, "field 'videoCastList'");
    }

    public volatile void reset(Object obj)
    {
        reset((TVShowOverviewFragment)obj);
    }

    public void reset(TVShowOverviewFragment tvshowoverviewfragment)
    {
        tvshowoverviewfragment.swipeRefreshLayout = null;
        tvshowoverviewfragment.mediaPanel = null;
        tvshowoverviewfragment.mediaArt = null;
        tvshowoverviewfragment.mediaPoster = null;
        tvshowoverviewfragment.mediaTitle = null;
        tvshowoverviewfragment.mediaUndertitle = null;
        tvshowoverviewfragment.mediaRating = null;
        tvshowoverviewfragment.mediaMaxRating = null;
        tvshowoverviewfragment.mediaPremiered = null;
        tvshowoverviewfragment.mediaGenres = null;
        tvshowoverviewfragment.mediaDescription = null;
        tvshowoverviewfragment.videoCastList = null;
    }

    public ()
    {
    }
}
