// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowEpisodeDetailsFragment

public class _cls4.val.target
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (TVShowEpisodeDetailsFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, final TVShowEpisodeDetailsFragment target, Object obj)
    {
        target.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.eshLayout(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        target.exitTransitionView = (View)ctor.itionView(obj, 0x7f0e0085, "field 'exitTransitionView'");
        View view = (View)ctor.itionView(obj, 0x7f0e007c, "field 'fabButton' and method 'onFabClicked'");
        target.fabButton = (ImageButton)ctor.(view, 0x7f0e007c, "field 'fabButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final TVShowEpisodeDetailsFragment..ViewInjector this$0;
            final TVShowEpisodeDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onFabClicked(view1);
            }

            
            {
                this$0 = TVShowEpisodeDetailsFragment..ViewInjector.this;
                target = tvshowepisodedetailsfragment;
                super();
            }
        });
        view = (View)ctor.ctor(obj, 0x7f0e007d, "field 'addToPlaylistButton' and method 'onAddToPlaylistClicked'");
        target.addToPlaylistButton = (ImageButton)ctor.listButton(view, 0x7f0e007d, "field 'addToPlaylistButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final TVShowEpisodeDetailsFragment..ViewInjector this$0;
            final TVShowEpisodeDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onAddToPlaylistClicked(view1);
            }

            
            {
                this$0 = TVShowEpisodeDetailsFragment..ViewInjector.this;
                target = tvshowepisodedetailsfragment;
                super();
            }
        });
        view = (View)ctor.ctor(obj, 0x7f0e007e, "field 'downloadButton' and method 'onDownloadClicked'");
        target.downloadButton = (ImageButton)ctor.utton(view, 0x7f0e007e, "field 'downloadButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final TVShowEpisodeDetailsFragment..ViewInjector this$0;
            final TVShowEpisodeDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onDownloadClicked(view1);
            }

            
            {
                this$0 = TVShowEpisodeDetailsFragment..ViewInjector.this;
                target = tvshowepisodedetailsfragment;
                super();
            }
        });
        view = (View)ctor.ctor(obj, 0x7f0e0087, "field 'seenButton' and method 'onSeenClicked'");
        target.seenButton = (ImageButton)ctor.n(view, 0x7f0e0087, "field 'seenButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final TVShowEpisodeDetailsFragment..ViewInjector this$0;
            final TVShowEpisodeDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onSeenClicked(view1);
            }

            
            {
                this$0 = TVShowEpisodeDetailsFragment..ViewInjector.this;
                target = tvshowepisodedetailsfragment;
                super();
            }
        });
        target.mediaPanel = (ScrollView)ctor.l((View)ctor.l(obj, 0x7f0e0071, "field 'mediaPanel'"), 0x7f0e0071, "field 'mediaPanel'");
        target.mediaArt = (ImageView)ctor.l((View)ctor.l(obj, 0x7f0e0070, "field 'mediaArt'"), 0x7f0e0070, "field 'mediaArt'");
        target.mediaTitle = (TextView)ctor.e((View)ctor.e(obj, 0x7f0e0073, "field 'mediaTitle'"), 0x7f0e0073, "field 'mediaTitle'");
        target.mediaUndertitle = (TextView)ctor.rtitle((View)ctor.rtitle(obj, 0x7f0e0074, "field 'mediaUndertitle'"), 0x7f0e0074, "field 'mediaUndertitle'");
        target.mediaRating = (TextView)ctor.ng((View)ctor.ng(obj, 0x7f0e0080, "field 'mediaRating'"), 0x7f0e0080, "field 'mediaRating'");
        target.mediaMaxRating = (TextView)ctor.ating((View)ctor.ating(obj, 0x7f0e0081, "field 'mediaMaxRating'"), 0x7f0e0081, "field 'mediaMaxRating'");
        target.mediaPremiered = (TextView)ctor.iered((View)ctor.iered(obj, 0x7f0e0088, "field 'mediaPremiered'"), 0x7f0e0088, "field 'mediaPremiered'");
        target.mediaSeason = (TextView)ctor.on((View)ctor.on(obj, 0x7f0e0089, "field 'mediaSeason'"), 0x7f0e0089, "field 'mediaSeason'");
        target.mediaDescription = (TextView)ctor.ription((View)ctor.ription(obj, 0x7f0e007b, "field 'mediaDescription'"), 0x7f0e007b, "field 'mediaDescription'");
        target.mediaDirectors = (TextView)ctor.ctors((View)ctor.ctors(obj, 0x7f0e008b, "field 'mediaDirectors'"), 0x7f0e008b, "field 'mediaDirectors'");
    }

    public volatile void reset(Object obj)
    {
        reset((TVShowEpisodeDetailsFragment)obj);
    }

    public void reset(TVShowEpisodeDetailsFragment tvshowepisodedetailsfragment)
    {
        tvshowepisodedetailsfragment.swipeRefreshLayout = null;
        tvshowepisodedetailsfragment.exitTransitionView = null;
        tvshowepisodedetailsfragment.fabButton = null;
        tvshowepisodedetailsfragment.addToPlaylistButton = null;
        tvshowepisodedetailsfragment.downloadButton = null;
        tvshowepisodedetailsfragment.seenButton = null;
        tvshowepisodedetailsfragment.mediaPanel = null;
        tvshowepisodedetailsfragment.mediaArt = null;
        tvshowepisodedetailsfragment.mediaTitle = null;
        tvshowepisodedetailsfragment.mediaUndertitle = null;
        tvshowepisodedetailsfragment.mediaRating = null;
        tvshowepisodedetailsfragment.mediaMaxRating = null;
        tvshowepisodedetailsfragment.mediaPremiered = null;
        tvshowepisodedetailsfragment.mediaSeason = null;
        tvshowepisodedetailsfragment.mediaDescription = null;
        tvshowepisodedetailsfragment.mediaDirectors = null;
    }

    public _cls4.val.target()
    {
    }
}
