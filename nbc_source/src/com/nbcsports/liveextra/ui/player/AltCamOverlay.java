// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import java.util.List;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerPresenter, PlayerActivity, AltCamPresenter, PlayerPresenterListener, 
//            AbstractPresenterListener

public class AltCamOverlay extends RelativeLayout
{

    private com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener adPlaybackListener = new AdPlaybackEventListenerStub() {

        final AltCamOverlay this$0;

        public void onAdBreakComplete(AdBreak adbreak)
        {
            isInAdBreak = false;
            if (!isShowing())
            {
                showIndicator(true);
            }
        }

        public void onAdBreakSkipped(AdBreak adbreak)
        {
            if (!isShowing())
            {
                showIndicator(true);
            }
        }

        public void onAdBreakStart(AdBreak adbreak)
        {
            isInAdBreak = true;
            hide();
        }

        public void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick)
        {
        }

        public void onAdComplete(AdBreak adbreak, Ad ad)
        {
            Timber.d("AD COMPLETE CALL", new Object[0]);
        }

        public void onAdProgress(AdBreak adbreak, Ad ad, int j)
        {
        }

        public void onAdStart(AdBreak adbreak, Ad ad)
        {
            if (ad == null)
            {
                return;
            } else
            {
                isInAdBreak = true;
                hide();
                return;
            }
        }

            
            {
                this$0 = AltCamOverlay.this;
                super();
            }
    };
    ImageView camIndicator;
    GridLayout cams;
    TextView camsAvailable;
    View container;
    private Runnable hide = new Runnable() {

        final AltCamOverlay this$0;

        public void run()
        {
            setVisibility(0);
            container.setVisibility(8);
            showCamList(false);
            showIndicator(true);
        }

            
            {
                this$0 = AltCamOverlay.this;
                super();
            }
    };
    private final LayoutInflater inflater;
    private boolean isInAdBreak;
    private PlayerPresenterListener listener = new AbstractPresenterListener() {

        final AltCamOverlay this$0;

        public void onToggleFullScreen(boolean flag)
        {
            super.onToggleFullScreen(flag);
            View view = shim;
            int j;
            if (flag)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            view.setVisibility(j);
        }

            
            {
                this$0 = AltCamOverlay.this;
                super();
            }
    };
    private com.adobe.mediacore.MediaPlayer.PlaybackEventListener playbackListener = new PlaybackEventListenerStub() {

        final AltCamOverlay this$0;

        public void onPlayStart()
        {
            super.onPlayStart();
            showIndicator(true);
            container.setVisibility(8);
            camsAvailable.setVisibility(8);
            scrollView.setVisibility(8);
            started = true;
        }

            
            {
                this$0 = AltCamOverlay.this;
                super();
            }
    };
    MediaPlayer player;
    PlayerPresenter playerPresenter;
    AltCamPresenter presenter;
    View scrollView;
    View shim;
    private boolean started;

    public AltCamOverlay(Context context)
    {
        this(context, null);
    }

    public AltCamOverlay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AltCamOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        inflater = LayoutInflater.from(context);
    }

    private void setCamViews()
    {
        cams.removeAllViews();
        VideoSource videosource = playerPresenter.getSelectedSource();
        List list = playerPresenter.getVideoSources();
        if (list != null)
        {
            int i = 0;
            while (i < list.size()) 
            {
                final VideoSource source = (VideoSource)list.get(i);
                TextView textview = (TextView)inflater.inflate(0x7f04008e, cams, false);
                textview.setText(source.getName());
                textview.setOnClickListener(new android.view.View.OnClickListener() {

                    final AltCamOverlay this$0;
                    final VideoSource val$source;

                    public void onClick(View view)
                    {
                        presenter.selectSource(source);
                        post(new Runnable() {

                            final _cls1 this$1;

                            public void run()
                            {
                                setCamViews();
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                    }

            
            {
                this$0 = AltCamOverlay.this;
                source = videosource;
                super();
            }
                });
                if (source.equals(videosource))
                {
                    textview.setSelected(true);
                    textview.setCompoundDrawablesWithIntrinsicBounds(0x7f02007e, 0, 0, 0);
                }
                cams.addView(textview);
                i++;
            }
        }
    }

    void bindView()
    {
        int i = playerPresenter.getVideoSourceCount();
        cams.setRowCount((int)Math.ceil(((double)i * 1.0D) / (double)cams.getColumnCount()));
        setCamViews();
    }

    public void hide()
    {
        postDelayed(hide, 0L);
    }

    public void init()
    {
        setVisibility(0);
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adPlaybackListener);
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
    }

    public boolean isShowing()
    {
        return container.getVisibility() == 0;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.bind(this);
            PlayerActivity.component().inject(this);
            presenter.takeView(this);
            playerPresenter.register(listener);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        playerPresenter.unregister(listener);
        ButterKnife.unbind(this);
        setOnClickListener(null);
        presenter.release();
    }

    public void onShowCams()
    {
        showCamList(true);
    }

    public void show()
    {
        setVisibility(0);
        if (isInAdBreak || !started)
        {
            return;
        }
        if (!isShowing())
        {
            container.setVisibility(0);
        }
        showIndicator(false);
        removeCallbacks(hide);
    }

    void showCamList(boolean flag)
    {
        boolean flag1 = false;
        Object obj = camsAvailable;
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = scrollView;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
    }

    public void showIndicator(boolean flag)
    {
        byte byte0 = 8;
        if (isInAdBreak || !started)
        {
            camIndicator.setVisibility(8);
            camsAvailable.setVisibility(8);
            return;
        }
        Object obj = camIndicator;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        obj = camsAvailable;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
    }



/*
    static boolean access$102(AltCamOverlay altcamoverlay, boolean flag)
    {
        altcamoverlay.started = flag;
        return flag;
    }

*/


/*
    static boolean access$202(AltCamOverlay altcamoverlay, boolean flag)
    {
        altcamoverlay.isInAdBreak = flag;
        return flag;
    }

*/
}
