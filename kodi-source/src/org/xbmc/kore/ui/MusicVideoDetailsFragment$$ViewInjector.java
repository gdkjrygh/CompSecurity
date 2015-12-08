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
//            MusicVideoDetailsFragment

public class _cls3.val.target
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (MusicVideoDetailsFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, final MusicVideoDetailsFragment target, Object obj)
    {
        target.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.eshLayout(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        target.exitTransitionView = (View)ctor.itionView(obj, 0x7f0e0085, "field 'exitTransitionView'");
        View view = (View)ctor.itionView(obj, 0x7f0e007c, "field 'fabButton' and method 'onFabClicked'");
        target.fabButton = (ImageButton)ctor.(view, 0x7f0e007c, "field 'fabButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MusicVideoDetailsFragment..ViewInjector this$0;
            final MusicVideoDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onFabClicked(view1);
            }

            
            {
                this$0 = MusicVideoDetailsFragment..ViewInjector.this;
                target = musicvideodetailsfragment;
                super();
            }
        });
        view = (View)ctor.ctor(obj, 0x7f0e007d, "field 'addToPlaylistButton' and method 'onAddToPlaylistClicked'");
        target.addToPlaylistButton = (ImageButton)ctor.listButton(view, 0x7f0e007d, "field 'addToPlaylistButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MusicVideoDetailsFragment..ViewInjector this$0;
            final MusicVideoDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onAddToPlaylistClicked(view1);
            }

            
            {
                this$0 = MusicVideoDetailsFragment..ViewInjector.this;
                target = musicvideodetailsfragment;
                super();
            }
        });
        view = (View)ctor.ctor(obj, 0x7f0e007e, "field 'downloadButton' and method 'onDownloadClicked'");
        target.downloadButton = (ImageButton)ctor.utton(view, 0x7f0e007e, "field 'downloadButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MusicVideoDetailsFragment..ViewInjector this$0;
            final MusicVideoDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onDownloadClicked(view1);
            }

            
            {
                this$0 = MusicVideoDetailsFragment..ViewInjector.this;
                target = musicvideodetailsfragment;
                super();
            }
        });
        target.mediaPanel = (ScrollView)ctor.l((View)ctor.l(obj, 0x7f0e0071, "field 'mediaPanel'"), 0x7f0e0071, "field 'mediaPanel'");
        target.mediaArt = (ImageView)ctor.l((View)ctor.l(obj, 0x7f0e0070, "field 'mediaArt'"), 0x7f0e0070, "field 'mediaArt'");
        target.mediaPoster = (ImageView)ctor.er((View)ctor.er(obj, 0x7f0e0075, "field 'mediaPoster'"), 0x7f0e0075, "field 'mediaPoster'");
        target.mediaTitle = (TextView)ctor.e((View)ctor.e(obj, 0x7f0e0073, "field 'mediaTitle'"), 0x7f0e0073, "field 'mediaTitle'");
        target.mediaUndertitle = (TextView)ctor.rtitle((View)ctor.rtitle(obj, 0x7f0e0074, "field 'mediaUndertitle'"), 0x7f0e0074, "field 'mediaUndertitle'");
        target.mediaYear = (TextView)ctor.((View)ctor.(obj, 0x7f0e007f, "field 'mediaYear'"), 0x7f0e007f, "field 'mediaYear'");
        target.mediaGenres = (TextView)ctor.es((View)ctor.es(obj, 0x7f0e008f, "field 'mediaGenres'"), 0x7f0e008f, "field 'mediaGenres'");
        target.mediaDescription = (TextView)ctor.ription((View)ctor.ription(obj, 0x7f0e007b, "field 'mediaDescription'"), 0x7f0e007b, "field 'mediaDescription'");
    }

    public volatile void reset(Object obj)
    {
        reset((MusicVideoDetailsFragment)obj);
    }

    public void reset(MusicVideoDetailsFragment musicvideodetailsfragment)
    {
        musicvideodetailsfragment.swipeRefreshLayout = null;
        musicvideodetailsfragment.exitTransitionView = null;
        musicvideodetailsfragment.fabButton = null;
        musicvideodetailsfragment.addToPlaylistButton = null;
        musicvideodetailsfragment.downloadButton = null;
        musicvideodetailsfragment.mediaPanel = null;
        musicvideodetailsfragment.mediaArt = null;
        musicvideodetailsfragment.mediaPoster = null;
        musicvideodetailsfragment.mediaTitle = null;
        musicvideodetailsfragment.mediaUndertitle = null;
        musicvideodetailsfragment.mediaYear = null;
        musicvideodetailsfragment.mediaGenres = null;
        musicvideodetailsfragment.mediaDescription = null;
    }

    public _cls3.val.target()
    {
    }
}
