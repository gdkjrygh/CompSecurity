// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.ui.progress.ProgressAware;
import com.soundcloud.android.playback.ui.progress.ProgressController;
import com.soundcloud.android.playback.ui.progress.ScrollXHelper;
import com.soundcloud.android.playback.ui.progress.ScrubController;
import com.soundcloud.android.playback.ui.progress.TranslateXHelper;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.waveform.WaveformData;
import java.util.BitSet;
import rx.Y;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            WaveformView

public class WaveformViewController
    implements ProgressAware, com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener, WaveformView.OnWidthChangedListener
{
    public static class Factory
    {

        private final com.soundcloud.android.playback.ui.progress.ProgressController.Factory animationControllerFactory;
        private final com.soundcloud.android.playback.ui.progress.ScrubController.Factory scrubControllerFactory;

        public WaveformViewController create(WaveformView waveformview)
        {
            return new WaveformViewController(waveformview, animationControllerFactory, scrubControllerFactory);
        }

        Factory(com.soundcloud.android.playback.ui.progress.ScrubController.Factory factory, com.soundcloud.android.playback.ui.progress.ProgressController.Factory factory1)
        {
            scrubControllerFactory = factory;
            animationControllerFactory = factory1;
        }
    }

    private class WaveformSubscriber extends DefaultSubscriber
    {

        final WaveformViewController this$0;

        public void onNext(WaveformData waveformdata)
        {
            isWaveformLoaded = true;
            waveformView.setWaveformData(waveformdata, adjustedWidth);
            if (currentState != com.soundcloud.android.playback.Player.PlayerState.IDLE)
            {
                waveformView.showExpandedWaveform();
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((WaveformData)obj);
        }

        private WaveformSubscriber()
        {
            this$0 = WaveformViewController.this;
            super();
        }

        WaveformSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int HAS_WAVEFORM_DATA = 3;
    private static final int HAS_WIDTH = 1;
    private static final int IS_CREATION_PENDING = 4;
    private static final int IS_EXPANDED = 2;
    private static final int IS_FOREGROUND = 0;
    private static final int NUM_FLAGS = 5;
    private static final BitSet SHOULD_CREATE_WAVEFORM = trueSet(5);
    private int adjustedWidth;
    private boolean canShow;
    private final BitSet createState = new BitSet(5);
    private com.soundcloud.android.playback.Player.PlayerState currentState;
    private final ProgressController dragProgressController;
    private boolean isCollapsed;
    private boolean isWaveformLoaded;
    private PlaybackProgress latestProgress;
    private final ProgressController leftProgressController;
    private TranslateXHelper leftProgressHelper;
    private final ProgressController rightProgressController;
    private TranslateXHelper rightProgressHelper;
    private final ScrubController scrubController;
    private boolean suppressProgress;
    private b waveformObservable;
    private Y waveformSubscription;
    private final WaveformView waveformView;
    private final float waveformWidthRatio;

    WaveformViewController(WaveformView waveformview, com.soundcloud.android.playback.ui.progress.ProgressController.Factory factory, com.soundcloud.android.playback.ui.progress.ScrubController.Factory factory1)
    {
        canShow = true;
        waveformSubscription = RxUtils.invalidSubscription();
        latestProgress = PlaybackProgress.empty();
        currentState = com.soundcloud.android.playback.Player.PlayerState.IDLE;
        waveformView = waveformview;
        waveformWidthRatio = waveformview.getWidthRatio();
        scrubController = factory1.create(waveformView.getDragViewHolder());
        createState.set(4);
        waveformView.setOnWidthChangedListener(this);
        scrubController.addScrubListener(this);
        leftProgressController = factory.create(waveformView.getLeftWaveform());
        rightProgressController = factory.create(waveformView.getRightWaveform());
        dragProgressController = factory.create(waveformView.getDragViewHolder());
    }

    private void createWaveforms(int i)
    {
        createState.set(i);
        if (createState.equals(SHOULD_CREATE_WAVEFORM))
        {
            waveformSubscription.unsubscribe();
            waveformSubscription = waveformObservable.observeOn(a.a()).subscribe(new WaveformSubscriber(null));
            createState.clear(4);
        }
    }

    private void showWaveform()
    {
        if (isWaveformLoaded)
        {
            waveformView.showExpandedWaveform();
            return;
        } else
        {
            waveformView.showIdleLinesAtWaveformPositions();
            return;
        }
    }

    private void startProgressAnimations(PlaybackProgress playbackprogress)
    {
        leftProgressController.startProgressAnimation(playbackprogress);
        rightProgressController.startProgressAnimation(playbackprogress);
        dragProgressController.startProgressAnimation(playbackprogress);
    }

    private static BitSet trueSet(int i)
    {
        BitSet bitset = new BitSet(i);
        bitset.set(0, i);
        return bitset;
    }

    public void addScrubListener(com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener onscrublistener)
    {
        scrubController.addScrubListener(onscrublistener);
    }

    public void cancelProgressAnimations()
    {
        leftProgressController.cancelProgressAnimation();
        rightProgressController.cancelProgressAnimation();
        dragProgressController.cancelProgressAnimation();
    }

    public void displayScrubPosition(float f)
    {
        leftProgressHelper.setValueFromProportion(waveformView.getLeftWaveform(), f);
        rightProgressHelper.setValueFromProportion(waveformView.getRightWaveform(), f);
        if (currentState == com.soundcloud.android.playback.Player.PlayerState.IDLE)
        {
            leftProgressHelper.setValueFromProportion(waveformView.getLeftLine(), f);
            rightProgressHelper.setValueFromProportion(waveformView.getRightLine(), f);
        }
    }

    public void hide()
    {
        canShow = false;
        waveformView.setVisibility(8);
    }

    public void onBackground()
    {
        createState.clear(0);
        createState.set(4);
    }

    public void onForeground()
    {
        createWaveforms(0);
    }

    public void onPlayerSlide(float f)
    {
        int i = 0;
        isCollapsed = false;
        if (canShow)
        {
            WaveformView waveformview = waveformView;
            if (f <= 0.0F)
            {
                i = 8;
            }
            waveformview.setVisibility(i);
        }
    }

    public void onWaveformViewWidthChanged(int i)
    {
        adjustedWidth = (int)(waveformWidthRatio * (float)i);
        waveformView.setWaveformWidths(adjustedWidth);
        i /= 2;
        waveformView.setWaveformTranslations(i, 0);
        leftProgressHelper = new TranslateXHelper(i, i - adjustedWidth);
        leftProgressController.setHelper(leftProgressHelper);
        rightProgressHelper = new TranslateXHelper(0, -adjustedWidth);
        rightProgressController.setHelper(rightProgressHelper);
        ScrollXHelper scrollxhelper = new ScrollXHelper(0, adjustedWidth);
        dragProgressController.setHelper(scrollxhelper);
        scrubController.setProgressHelper(scrollxhelper);
        setProgress(latestProgress);
        createWaveforms(1);
    }

    public void reset()
    {
        waveformSubscription.unsubscribe();
        waveformObservable = null;
        isWaveformLoaded = false;
        leftProgressController.reset();
        rightProgressController.reset();
        dragProgressController.reset();
        createState.clear(3);
    }

    public void scrubStateChanged(int i)
    {
        boolean flag = true;
        if (i != 1)
        {
            flag = false;
        }
        suppressProgress = flag;
        if (suppressProgress)
        {
            cancelProgressAnimations();
        }
        if (i == 2 && currentState == com.soundcloud.android.playback.Player.PlayerState.PLAYING)
        {
            startProgressAnimations(latestProgress);
        }
    }

    public void setCollapsed()
    {
        isCollapsed = true;
        createState.clear(2);
        waveformView.setVisibility(8);
    }

    public void setDuration(long l)
    {
        scrubController.setDuration(l);
    }

    public void setExpanded()
    {
        isCollapsed = false;
        createWaveforms(2);
        if (canShow)
        {
            waveformView.setVisibility(0);
        }
    }

    public void setProgress(PlaybackProgress playbackprogress)
    {
        latestProgress = playbackprogress;
        if (!playbackprogress.isEmpty())
        {
            scrubController.setDuration(playbackprogress.getDuration());
        }
        if (!suppressProgress)
        {
            leftProgressController.setPlaybackProgress(playbackprogress);
            rightProgressController.setPlaybackProgress(playbackprogress);
            dragProgressController.setPlaybackProgress(playbackprogress);
            if (currentState == com.soundcloud.android.playback.Player.PlayerState.IDLE)
            {
                waveformView.showIdleLinesAtWaveformPositions();
            }
        }
    }

    public void setWaveform(b b1, boolean flag)
    {
        waveformObservable = b1;
        createState.set(4);
        createWaveforms(3);
        if (flag)
        {
            onForeground();
            return;
        } else
        {
            onBackground();
            return;
        }
    }

    public void show()
    {
        canShow = true;
        if (!isCollapsed)
        {
            waveformView.setVisibility(0);
        }
    }

    public void showBufferingState()
    {
        currentState = com.soundcloud.android.playback.Player.PlayerState.BUFFERING;
        showWaveform();
        cancelProgressAnimations();
    }

    public void showIdleState()
    {
        currentState = com.soundcloud.android.playback.Player.PlayerState.IDLE;
        waveformView.showIdleLinesAtWaveformPositions();
        waveformView.showCollapsedWaveform();
        cancelProgressAnimations();
    }

    public void showPlayingState(PlaybackProgress playbackprogress)
    {
        currentState = com.soundcloud.android.playback.Player.PlayerState.PLAYING;
        showWaveform();
        if (!suppressProgress)
        {
            startProgressAnimations(playbackprogress);
        }
    }



/*
    static boolean access$102(WaveformViewController waveformviewcontroller, boolean flag)
    {
        waveformviewcontroller.isWaveformLoaded = flag;
        return flag;
    }

*/



}
