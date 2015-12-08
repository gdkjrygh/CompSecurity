// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

public class it>
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (NowPlayingFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, final NowPlayingFragment target, Object obj)
    {
        View view = (View)ctor.ew(obj, 0x7f0e009a, "field 'playButton' and method 'onPlayClicked'");
        target.playButton = (ImageButton)ctor.n(view, 0x7f0e009a, "field 'playButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onPlayClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e0099, "field 'stopButton' and method 'onStopClicked'");
        target.stopButton = (ImageButton)ctor.n(view, 0x7f0e0099, "field 'stopButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onStopClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e0097, "field 'previousButton' and method 'onPreviousClicked'");
        target.previousButton = (ImageButton)ctor.utton(view, 0x7f0e0097, "field 'previousButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onPreviousClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e009c, "field 'nextButton' and method 'onNextClicked'");
        target.nextButton = (ImageButton)ctor.n(view, 0x7f0e009c, "field 'nextButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onNextClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e0098, "field 'rewindButton' and method 'onRewindClicked'");
        target.rewindButton = (ImageButton)ctor.ton(view, 0x7f0e0098, "field 'rewindButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onRewindClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e009b, "field 'fastForwardButton' and method 'onFastForwardClicked'");
        target.fastForwardButton = (ImageButton)ctor.rdButton(view, 0x7f0e009b, "field 'fastForwardButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onFastForwardClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        target.volumeDownButton = (ImageButton)ctor.nButton((View)ctor.ew(obj, 0x7f0e009d, "field 'volumeDownButton'"), 0x7f0e009d, "field 'volumeDownButton'");
        target.volumeUpButton = (ImageButton)ctor.utton((View)ctor.ew(obj, 0x7f0e009f, "field 'volumeUpButton'"), 0x7f0e009f, "field 'volumeUpButton'");
        view = (View)ctor.ew(obj, 0x7f0e009e, "field 'volumeMuteButton' and method 'onVolumeMuteClicked'");
        target.volumeMuteButton = (ImageButton)ctor.eButton(view, 0x7f0e009e, "field 'volumeMuteButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onVolumeMuteClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e00a1, "field 'shuffleButton' and method 'onShuffleClicked'");
        target.shuffleButton = (ImageButton)ctor.tton(view, 0x7f0e00a1, "field 'shuffleButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onShuffleClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e00a0, "field 'repeatButton' and method 'onRepeatClicked'");
        target.repeatButton = (ImageButton)ctor.ton(view, 0x7f0e00a0, "field 'repeatButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onRepeatClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        view = (View)ctor.ew(obj, 0x7f0e00a2, "field 'overflowButton' and method 'onOverflowClicked'");
        target.overflowButton = (ImageButton)ctor.utton(view, 0x7f0e00a2, "field 'overflowButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final NowPlayingFragment..ViewInjector this$0;
            final NowPlayingFragment val$target;

            public void doClick(View view1)
            {
                target.onOverflowClicked(view1);
            }

            
            {
                this$0 = NowPlayingFragment..ViewInjector.this;
                target = nowplayingfragment;
                super();
            }
        });
        target.infoPanel = (RelativeLayout)ctor.((View)ctor.ew(obj, 0x7f0e00b3, "field 'infoPanel'"), 0x7f0e00b3, "field 'infoPanel'");
        target.mediaPanel = (ScrollView)ctor.l((View)ctor.ew(obj, 0x7f0e0071, "field 'mediaPanel'"), 0x7f0e0071, "field 'mediaPanel'");
        target.infoTitle = (TextView)ctor.((View)ctor.ew(obj, 0x7f0e00b4, "field 'infoTitle'"), 0x7f0e00b4, "field 'infoTitle'");
        target.infoMessage = (TextView)ctor.ge((View)ctor.ew(obj, 0x7f0e00b5, "field 'infoMessage'"), 0x7f0e00b5, "field 'infoMessage'");
        target.mediaArt = (ImageView)ctor.ew((View)ctor.ew(obj, 0x7f0e0070, "field 'mediaArt'"), 0x7f0e0070, "field 'mediaArt'");
        target.mediaPoster = (ImageView)ctor.er((View)ctor.ew(obj, 0x7f0e0075, "field 'mediaPoster'"), 0x7f0e0075, "field 'mediaPoster'");
        target.mediaTitle = (TextView)ctor.e((View)ctor.ew(obj, 0x7f0e0073, "field 'mediaTitle'"), 0x7f0e0073, "field 'mediaTitle'");
        target.mediaUndertitle = (TextView)ctor.rtitle((View)ctor.ew(obj, 0x7f0e0074, "field 'mediaUndertitle'"), 0x7f0e0074, "field 'mediaUndertitle'");
        target.mediaDuration = (TextView)ctor.tion((View)ctor.ew(obj, 0x7f0e0095, "field 'mediaDuration'"), 0x7f0e0095, "field 'mediaDuration'");
        target.mediaProgress = (TextView)ctor.ress((View)ctor.ew(obj, 0x7f0e0093, "field 'mediaProgress'"), 0x7f0e0093, "field 'mediaProgress'");
        target.mediaSeekbar = (SeekBar)ctor.bar((View)ctor.ew(obj, 0x7f0e0094, "field 'mediaSeekbar'"), 0x7f0e0094, "field 'mediaSeekbar'");
        target.mediaDetailsPanel = (RelativeLayout)ctor.ilsPanel((View)ctor.ew(obj, 0x7f0e0078, "field 'mediaDetailsPanel'"), 0x7f0e0078, "field 'mediaDetailsPanel'");
        target.mediaRating = (TextView)ctor.ng((View)ctor.ew(obj, 0x7f0e0080, "field 'mediaRating'"), 0x7f0e0080, "field 'mediaRating'");
        target.mediaMaxRating = (TextView)ctor.ating((View)ctor.ew(obj, 0x7f0e0081, "field 'mediaMaxRating'"), 0x7f0e0081, "field 'mediaMaxRating'");
        target.mediaYear = (TextView)ctor.((View)ctor.ew(obj, 0x7f0e007f, "field 'mediaYear'"), 0x7f0e007f, "field 'mediaYear'");
        target.mediaGenreSeason = (TextView)ctor.eSeason((View)ctor.ew(obj, 0x7f0e008f, "field 'mediaGenreSeason'"), 0x7f0e008f, "field 'mediaGenreSeason'");
        target.mediaRatingVotes = (TextView)ctor.ngVotes((View)ctor.ew(obj, 0x7f0e0090, "field 'mediaRatingVotes'"), 0x7f0e0090, "field 'mediaRatingVotes'");
        target.mediaDescription = (TextView)ctor.ription((View)ctor.ew(obj, 0x7f0e007b, "field 'mediaDescription'"), 0x7f0e007b, "field 'mediaDescription'");
        target.videoCastList = (GridLayout)ctor.List((View)ctor.ew(obj, 0x7f0e0051, "field 'videoCastList'"), 0x7f0e0051, "field 'videoCastList'");
    }

    public volatile void reset(Object obj)
    {
        reset((NowPlayingFragment)obj);
    }

    public void reset(NowPlayingFragment nowplayingfragment)
    {
        nowplayingfragment.playButton = null;
        nowplayingfragment.stopButton = null;
        nowplayingfragment.previousButton = null;
        nowplayingfragment.nextButton = null;
        nowplayingfragment.rewindButton = null;
        nowplayingfragment.fastForwardButton = null;
        nowplayingfragment.volumeDownButton = null;
        nowplayingfragment.volumeUpButton = null;
        nowplayingfragment.volumeMuteButton = null;
        nowplayingfragment.shuffleButton = null;
        nowplayingfragment.repeatButton = null;
        nowplayingfragment.overflowButton = null;
        nowplayingfragment.infoPanel = null;
        nowplayingfragment.mediaPanel = null;
        nowplayingfragment.infoTitle = null;
        nowplayingfragment.infoMessage = null;
        nowplayingfragment.mediaArt = null;
        nowplayingfragment.mediaPoster = null;
        nowplayingfragment.mediaTitle = null;
        nowplayingfragment.mediaUndertitle = null;
        nowplayingfragment.mediaDuration = null;
        nowplayingfragment.mediaProgress = null;
        nowplayingfragment.mediaSeekbar = null;
        nowplayingfragment.mediaDetailsPanel = null;
        nowplayingfragment.mediaRating = null;
        nowplayingfragment.mediaMaxRating = null;
        nowplayingfragment.mediaYear = null;
        nowplayingfragment.mediaGenreSeason = null;
        nowplayingfragment.mediaRatingVotes = null;
        nowplayingfragment.mediaDescription = null;
        nowplayingfragment.videoCastList = null;
    }

    public it>()
    {
    }
}
