// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            MovieDetailsFragment

public class >
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (MovieDetailsFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, final MovieDetailsFragment target, Object obj)
    {
        target.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        target.exitTransitionView = (View)ctor.(obj, 0x7f0e0085, "field 'exitTransitionView'");
        View view = (View)ctor.(obj, 0x7f0e007c, "field 'fabButton' and method 'onFabClicked'");
        target.fabButton = (ImageButton)ctor.(view, 0x7f0e007c, "field 'fabButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MovieDetailsFragment..ViewInjector this$0;
            final MovieDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onFabClicked(view1);
            }

            
            {
                this$0 = MovieDetailsFragment..ViewInjector.this;
                target = moviedetailsfragment;
                super();
            }
        });
        view = (View)ctor.(obj, 0x7f0e007d, "field 'addToPlaylistButton' and method 'onAddToPlaylistClicked'");
        target.addToPlaylistButton = (ImageButton)ctor.listButton(view, 0x7f0e007d, "field 'addToPlaylistButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MovieDetailsFragment..ViewInjector this$0;
            final MovieDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onAddToPlaylistClicked(view1);
            }

            
            {
                this$0 = MovieDetailsFragment..ViewInjector.this;
                target = moviedetailsfragment;
                super();
            }
        });
        view = (View)ctor.(obj, 0x7f0e008e, "field 'imdbButton' and method 'onImdbClicked'");
        target.imdbButton = (ImageButton)ctor.n(view, 0x7f0e008e, "field 'imdbButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MovieDetailsFragment..ViewInjector this$0;
            final MovieDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onImdbClicked(view1);
            }

            
            {
                this$0 = MovieDetailsFragment..ViewInjector.this;
                target = moviedetailsfragment;
                super();
            }
        });
        view = (View)ctor.(obj, 0x7f0e007e, "field 'downloadButton' and method 'onDownloadClicked'");
        target.downloadButton = (ImageButton)ctor.utton(view, 0x7f0e007e, "field 'downloadButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MovieDetailsFragment..ViewInjector this$0;
            final MovieDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onDownloadClicked(view1);
            }

            
            {
                this$0 = MovieDetailsFragment..ViewInjector.this;
                target = moviedetailsfragment;
                super();
            }
        });
        view = (View)ctor.(obj, 0x7f0e0087, "field 'seenButton' and method 'onSeenClicked'");
        target.seenButton = (ImageButton)ctor.n(view, 0x7f0e0087, "field 'seenButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MovieDetailsFragment..ViewInjector this$0;
            final MovieDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onSeenClicked(view1);
            }

            
            {
                this$0 = MovieDetailsFragment..ViewInjector.this;
                target = moviedetailsfragment;
                super();
            }
        });
        target.mediaPanel = (ScrollView)ctor.l((View)ctor.(obj, 0x7f0e0071, "field 'mediaPanel'"), 0x7f0e0071, "field 'mediaPanel'");
        target.mediaArt = (ImageView)ctor.((View)ctor.(obj, 0x7f0e0070, "field 'mediaArt'"), 0x7f0e0070, "field 'mediaArt'");
        target.mediaPoster = (ImageView)ctor.er((View)ctor.(obj, 0x7f0e0075, "field 'mediaPoster'"), 0x7f0e0075, "field 'mediaPoster'");
        target.mediaTitle = (TextView)ctor.e((View)ctor.(obj, 0x7f0e0073, "field 'mediaTitle'"), 0x7f0e0073, "field 'mediaTitle'");
        target.mediaUndertitle = (TextView)ctor.rtitle((View)ctor.(obj, 0x7f0e0074, "field 'mediaUndertitle'"), 0x7f0e0074, "field 'mediaUndertitle'");
        target.mediaRating = (TextView)ctor.ng((View)ctor.(obj, 0x7f0e0080, "field 'mediaRating'"), 0x7f0e0080, "field 'mediaRating'");
        target.mediaMaxRating = (TextView)ctor.ating((View)ctor.(obj, 0x7f0e0081, "field 'mediaMaxRating'"), 0x7f0e0081, "field 'mediaMaxRating'");
        target.mediaYear = (TextView)ctor.((View)ctor.(obj, 0x7f0e007f, "field 'mediaYear'"), 0x7f0e007f, "field 'mediaYear'");
        target.mediaGenres = (TextView)ctor.es((View)ctor.(obj, 0x7f0e008f, "field 'mediaGenres'"), 0x7f0e008f, "field 'mediaGenres'");
        target.mediaRatingVotes = (TextView)ctor.ngVotes((View)ctor.(obj, 0x7f0e0090, "field 'mediaRatingVotes'"), 0x7f0e0090, "field 'mediaRatingVotes'");
        target.mediaDescription = (TextView)ctor.ription((View)ctor.(obj, 0x7f0e007b, "field 'mediaDescription'"), 0x7f0e007b, "field 'mediaDescription'");
        target.mediaDirectors = (TextView)ctor.ctors((View)ctor.(obj, 0x7f0e008b, "field 'mediaDirectors'"), 0x7f0e008b, "field 'mediaDirectors'");
        target.videoCastList = (GridLayout)ctor.List((View)ctor.(obj, 0x7f0e0051, "field 'videoCastList'"), 0x7f0e0051, "field 'videoCastList'");
    }

    public volatile void reset(Object obj)
    {
        reset((MovieDetailsFragment)obj);
    }

    public void reset(MovieDetailsFragment moviedetailsfragment)
    {
        moviedetailsfragment.swipeRefreshLayout = null;
        moviedetailsfragment.exitTransitionView = null;
        moviedetailsfragment.fabButton = null;
        moviedetailsfragment.addToPlaylistButton = null;
        moviedetailsfragment.imdbButton = null;
        moviedetailsfragment.downloadButton = null;
        moviedetailsfragment.seenButton = null;
        moviedetailsfragment.mediaPanel = null;
        moviedetailsfragment.mediaArt = null;
        moviedetailsfragment.mediaPoster = null;
        moviedetailsfragment.mediaTitle = null;
        moviedetailsfragment.mediaUndertitle = null;
        moviedetailsfragment.mediaRating = null;
        moviedetailsfragment.mediaMaxRating = null;
        moviedetailsfragment.mediaYear = null;
        moviedetailsfragment.mediaGenres = null;
        moviedetailsfragment.mediaRatingVotes = null;
        moviedetailsfragment.mediaDescription = null;
        moviedetailsfragment.mediaDirectors = null;
        moviedetailsfragment.videoCastList = null;
    }

    public >()
    {
    }
}
