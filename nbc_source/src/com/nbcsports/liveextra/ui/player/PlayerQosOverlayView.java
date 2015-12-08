// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.qos.PlaybackInformation;
import com.adobe.mediacore.qos.QOSProvider;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, PlayerPresenter, PlayerPresenterListener, AbstractPresenterListener

public class PlayerQosOverlayView extends GridLayout
{

    TextView bitrate;
    TextView bufferLength;
    TextView bufferTime;
    TextView bufferingTime;
    TextView emptyBufferCount;
    TextView frameRate;
    MediaPlayer player;
    PlayerPresenter presenter;
    private PlayerPresenterListener presenterListener = new AbstractPresenterListener() {

        final PlayerQosOverlayView this$0;

        public void onHideChrome()
        {
            super.onHideChrome();
            setVisibility(8);
        }

        public void onToggleQos()
        {
            super.onToggleQos();
            toggleQoS();
        }

            
            {
                this$0 = PlayerQosOverlayView.this;
                super();
            }
    };
    private final QOSProvider qosProvider;
    TextView timeToLoad;
    TextView timeToStart;
    private Subscription timer;
    TextView url;

    public PlayerQosOverlayView(Context context)
    {
        this(context, null);
    }

    public PlayerQosOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayerQosOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        qosProvider = new QOSProvider(context.getApplicationContext());
        PlayerActivity.component().inject(this);
    }

    private void updateView()
    {
        if (frameRate == null)
        {
            return;
        } else
        {
            PlaybackInformation playbackinformation = qosProvider.getPlaybackInformation();
            frameRate.setText(String.format("%s (%s dropped)", new Object[] {
                Integer.toString((int)playbackinformation.getFrameRate()), Long.toString(playbackinformation.getDroppedFrameCount())
            }));
            bitrate.setText(Long.toString(playbackinformation.getBitrate()));
            bufferingTime.setText(Long.toString(playbackinformation.getBufferingTime()));
            bufferLength.setText(Long.toString(playbackinformation.getBufferLength()));
            bufferTime.setText(Long.toString(playbackinformation.getBufferTime()));
            emptyBufferCount.setText(Long.toString(playbackinformation.getEmptyBufferCount()));
            timeToLoad.setText(Long.toString(playbackinformation.getTimeToLoad()));
            timeToStart.setText(Long.toString(playbackinformation.getTimeToStart()));
            return;
        }
    }

    public void attachPlayer()
    {
        qosProvider.attachMediaPlayer(player);
        updateView();
        timer = Observable.timer(0L, 1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlayerQosOverlayView this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d(throwable, "", new Object[0]);
            }

            public void onNext(Long long1)
            {
                updateView();
            }

            public volatile void onNext(Object obj)
            {
                onNext((Long)obj);
            }

            
            {
                this$0 = PlayerQosOverlayView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        ButterKnife.bind(this);
        super.onAttachedToWindow();
        attachPlayer();
        presenter.register(presenterListener);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (timer != null)
        {
            timer.unsubscribe();
        }
        ButterKnife.unbind(this);
    }

    public void releasePlayer()
    {
        timer.unsubscribe();
        qosProvider.detachMediaPlayer();
        player = null;
    }

    public void toggleQoS()
    {
        if (getVisibility() == 0)
        {
            setVisibility(8);
            return;
        } else
        {
            setVisibility(0);
            return;
        }
    }

}
