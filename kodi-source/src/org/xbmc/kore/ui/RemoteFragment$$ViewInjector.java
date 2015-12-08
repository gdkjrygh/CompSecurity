// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (RemoteFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, final RemoteFragment target, Object obj)
    {
        target.infoPanel = (RelativeLayout)ctor.((View)ctor.edView(obj, 0x7f0e00b3, "field 'infoPanel'"), 0x7f0e00b3, "field 'infoPanel'");
        target.mediaPanel = (RelativeLayout)ctor.l((View)ctor.edView(obj, 0x7f0e0071, "field 'mediaPanel'"), 0x7f0e0071, "field 'mediaPanel'");
        target.remotePanel = (RelativeLayout)ctor.el((View)ctor.edView(obj, 0x7f0e00aa, "field 'remotePanel'"), 0x7f0e00aa, "field 'remotePanel'");
        target.infoTitle = (TextView)ctor.((View)ctor.edView(obj, 0x7f0e00b4, "field 'infoTitle'"), 0x7f0e00b4, "field 'infoTitle'");
        target.infoMessage = (TextView)ctor.ge((View)ctor.edView(obj, 0x7f0e00b5, "field 'infoMessage'"), 0x7f0e00b5, "field 'infoMessage'");
        target.buttonBarPanel = (LinearLayout)ctor.Panel((View)ctor.edView(obj, 0x7f0e006a, "field 'buttonBarPanel'"), 0x7f0e006a, "field 'buttonBarPanel'");
        View view = (View)ctor.edView(obj, 0x7f0e0004, "field 'homeButton' and method 'onHomeClicked'");
        target.homeButton = (ImageButton)ctor.n(view, 0x7f0e0004, "field 'homeButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onHomeClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        view = (View)ctor.edView(obj, 0x7f0e00a6, "field 'moviesButton' and method 'onMoviedClicked'");
        target.moviesButton = (ImageButton)ctor.ton(view, 0x7f0e00a6, "field 'moviesButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onMoviedClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        view = (View)ctor.edView(obj, 0x7f0e00a7, "field 'tvShowsButton' and method 'onTvShowsClicked'");
        target.tvShowsButton = (ImageButton)ctor.tton(view, 0x7f0e00a7, "field 'tvShowsButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onTvShowsClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        view = (View)ctor.edView(obj, 0x7f0e00a8, "field 'musicButton' and method 'onMusicClicked'");
        target.musicButton = (ImageButton)ctor.on(view, 0x7f0e00a8, "field 'musicButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onMusicClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        view = (View)ctor.edView(obj, 0x7f0e00a9, "field 'picturesButton' and method 'onPicturesClicked'");
        target.picturesButton = (ImageButton)ctor.utton(view, 0x7f0e00a9, "field 'picturesButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onPicturesClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        target.selectButton = (ImageView)ctor.ton((View)ctor.edView(obj, 0x7f0e00ae, "field 'selectButton'"), 0x7f0e00ae, "field 'selectButton'");
        target.leftButton = (ImageView)ctor.n((View)ctor.edView(obj, 0x7f0e00ad, "field 'leftButton'"), 0x7f0e00ad, "field 'leftButton'");
        target.rightButton = (ImageView)ctor.on((View)ctor.edView(obj, 0x7f0e00af, "field 'rightButton'"), 0x7f0e00af, "field 'rightButton'");
        target.upButton = (ImageView)ctor.edView((View)ctor.edView(obj, 0x7f0e0008, "field 'upButton'"), 0x7f0e0008, "field 'upButton'");
        target.downButton = (ImageView)ctor.n((View)ctor.edView(obj, 0x7f0e00b1, "field 'downButton'"), 0x7f0e00b1, "field 'downButton'");
        target.backButton = (ImageView)ctor.n((View)ctor.edView(obj, 0x7f0e00b0, "field 'backButton'"), 0x7f0e00b0, "field 'backButton'");
        target.infoButton = (ImageView)ctor.n((View)ctor.edView(obj, 0x7f0e00ac, "field 'infoButton'"), 0x7f0e00ac, "field 'infoButton'");
        target.contextButton = (ImageView)ctor.tton((View)ctor.edView(obj, 0x7f0e00ab, "field 'contextButton'"), 0x7f0e00ab, "field 'contextButton'");
        target.osdButton = (ImageView)ctor.((View)ctor.edView(obj, 0x7f0e00b2, "field 'osdButton'"), 0x7f0e00b2, "field 'osdButton'");
        target.thumbnail = (ImageView)ctor.((View)ctor.edView(obj, 0x7f0e0070, "field 'thumbnail'"), 0x7f0e0070, "field 'thumbnail'");
        target.nowPlayingTitle = (TextView)ctor.gTitle((View)ctor.edView(obj, 0x7f0e002d, "field 'nowPlayingTitle'"), 0x7f0e002d, "field 'nowPlayingTitle'");
        target.nowPlayingDetails = (TextView)ctor.gDetails((View)ctor.edView(obj, 0x7f0e00a5, "field 'nowPlayingDetails'"), 0x7f0e00a5, "field 'nowPlayingDetails'");
        view = (View)ctor.edView(obj, 0x7f0e009a, "field 'playButton' and method 'onPlayClicked'");
        target.playButton = (ImageButton)ctor.n(view, 0x7f0e009a, "field 'playButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onPlayClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        view = (View)ctor.edView(obj, 0x7f0e0099, "field 'stopButton' and method 'onStopClicked'");
        target.stopButton = (ImageButton)ctor.n(view, 0x7f0e0099, "field 'stopButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onStopClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        view = (View)ctor.edView(obj, 0x7f0e0098, "field 'rewindButton' and method 'onRewindClicked'");
        target.rewindButton = (ImageButton)ctor.ton(view, 0x7f0e0098, "field 'rewindButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onRewindClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
        obj = (View)ctor.edView(obj, 0x7f0e009b, "field 'fastForwardButton' and method 'onFastForwardClicked'");
        target.fastForwardButton = (ImageButton)ctor.rdButton(((View) (obj)), 0x7f0e009b, "field 'fastForwardButton'");
        ((View) (obj)).setOnClickListener(new DebouncingOnClickListener() {

            final RemoteFragment..ViewInjector this$0;
            final RemoteFragment val$target;

            public void doClick(View view1)
            {
                target.onFastForwardClicked(view1);
            }

            
            {
                this$0 = RemoteFragment..ViewInjector.this;
                target = remotefragment;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((RemoteFragment)obj);
    }

    public void reset(RemoteFragment remotefragment)
    {
        remotefragment.infoPanel = null;
        remotefragment.mediaPanel = null;
        remotefragment.remotePanel = null;
        remotefragment.infoTitle = null;
        remotefragment.infoMessage = null;
        remotefragment.buttonBarPanel = null;
        remotefragment.homeButton = null;
        remotefragment.moviesButton = null;
        remotefragment.tvShowsButton = null;
        remotefragment.musicButton = null;
        remotefragment.picturesButton = null;
        remotefragment.selectButton = null;
        remotefragment.leftButton = null;
        remotefragment.rightButton = null;
        remotefragment.upButton = null;
        remotefragment.downButton = null;
        remotefragment.backButton = null;
        remotefragment.infoButton = null;
        remotefragment.contextButton = null;
        remotefragment.osdButton = null;
        remotefragment.thumbnail = null;
        remotefragment.nowPlayingTitle = null;
        remotefragment.nowPlayingDetails = null;
        remotefragment.playButton = null;
        remotefragment.stopButton = null;
        remotefragment.rewindButton = null;
        remotefragment.fastForwardButton = null;
    }

    public ()
    {
    }
}
