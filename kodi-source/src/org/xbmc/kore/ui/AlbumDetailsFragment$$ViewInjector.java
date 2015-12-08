// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumDetailsFragment

public class >
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (AlbumDetailsFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, final AlbumDetailsFragment target, Object obj)
    {
        target.exitTransitionView = (View)ctor.(obj, 0x7f0e0085, "field 'exitTransitionView'");
        View view = (View)ctor.(obj, 0x7f0e007c, "field 'fabButton' and method 'onFabClicked'");
        target.fabButton = (ImageButton)ctor.(view, 0x7f0e007c, "field 'fabButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final AlbumDetailsFragment..ViewInjector this$0;
            final AlbumDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onFabClicked(view1);
            }

            
            {
                this$0 = AlbumDetailsFragment..ViewInjector.this;
                target = albumdetailsfragment;
                super();
            }
        });
        view = (View)ctor.(obj, 0x7f0e007d, "field 'addToPlaylistButton' and method 'onAddToPlaylistClicked'");
        target.addToPlaylistButton = (ImageButton)ctor.listButton(view, 0x7f0e007d, "field 'addToPlaylistButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final AlbumDetailsFragment..ViewInjector this$0;
            final AlbumDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onAddToPlaylistClicked(view1);
            }

            
            {
                this$0 = AlbumDetailsFragment..ViewInjector.this;
                target = albumdetailsfragment;
                super();
            }
        });
        view = (View)ctor.(obj, 0x7f0e007e, "field 'downloadButton' and method 'onDownloadClicked'");
        target.downloadButton = (ImageButton)ctor.utton(view, 0x7f0e007e, "field 'downloadButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final AlbumDetailsFragment..ViewInjector this$0;
            final AlbumDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onDownloadClicked(view1);
            }

            
            {
                this$0 = AlbumDetailsFragment..ViewInjector.this;
                target = albumdetailsfragment;
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
        target.mediaDescriptionContainer = (LinearLayout)ctor.riptionContainer((View)ctor.(obj, 0x7f0e0082, "field 'mediaDescriptionContainer'"), 0x7f0e0082, "field 'mediaDescriptionContainer'");
        target.mediaDescription = (TextView)ctor.ription((View)ctor.(obj, 0x7f0e007b, "field 'mediaDescription'"), 0x7f0e007b, "field 'mediaDescription'");
        target.mediaShowAll = (ImageView)ctor.All((View)ctor.(obj, 0x7f0e0083, "field 'mediaShowAll'"), 0x7f0e0083, "field 'mediaShowAll'");
        target.songListView = (LinearLayout)ctor.iew((View)ctor.(obj, 0x7f0e0084, "field 'songListView'"), 0x7f0e0084, "field 'songListView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AlbumDetailsFragment)obj);
    }

    public void reset(AlbumDetailsFragment albumdetailsfragment)
    {
        albumdetailsfragment.exitTransitionView = null;
        albumdetailsfragment.fabButton = null;
        albumdetailsfragment.addToPlaylistButton = null;
        albumdetailsfragment.downloadButton = null;
        albumdetailsfragment.mediaPanel = null;
        albumdetailsfragment.mediaArt = null;
        albumdetailsfragment.mediaPoster = null;
        albumdetailsfragment.mediaTitle = null;
        albumdetailsfragment.mediaUndertitle = null;
        albumdetailsfragment.mediaRating = null;
        albumdetailsfragment.mediaMaxRating = null;
        albumdetailsfragment.mediaYear = null;
        albumdetailsfragment.mediaDescriptionContainer = null;
        albumdetailsfragment.mediaDescription = null;
        albumdetailsfragment.mediaShowAll = null;
        albumdetailsfragment.songListView = null;
    }

    public >()
    {
    }
}
