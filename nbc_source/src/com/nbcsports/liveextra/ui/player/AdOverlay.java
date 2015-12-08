// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;
import java.util.Iterator;
import rx.Subscription;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

public class AdOverlay extends LinearLayout
    implements com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener
{

    private final int MS_IN_SECOND;
    private long currentAdBreakSize;
    private long currentAdDuration;
    private long currentAdIndex;
    private long currentAdTime;
    private boolean isAdded;
    MediaPlayer player;
    TextView remainingAds;
    TextView remainingTime;
    private Subscription subscription;

    public AdOverlay(Context context)
    {
        this(context, null);
    }

    public AdOverlay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AdOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        MS_IN_SECOND = 1000;
        if (isInEditMode())
        {
            return;
        } else
        {
            PlayerActivity.component().inject(this);
            return;
        }
    }

    private void hide()
    {
        setVisibility(4);
    }

    private void hideAdProgress()
    {
        remainingAds.setVisibility(4);
        remainingTime.setVisibility(4);
    }

    private void show()
    {
        setVisibility(0);
    }

    private void showAdProgress()
    {
        remainingAds.setVisibility(0);
    }

    public void notifyClockTick()
    {
        currentAdTime = currentAdTime + 1L;
        remainingAds.setText((new StringBuilder()).append(currentAdIndex + 1L).append("/").append(currentAdBreakSize).toString());
        remainingTime.setText((new StringBuilder()).append(currentAdTime).append("/").append(currentAdDuration).toString());
    }

    public void onAdBreakComplete(AdBreak adbreak)
    {
        currentAdBreakSize = 0L;
        hide();
    }

    public void onAdBreakSkipped(AdBreak adbreak)
    {
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        show();
        hideAdProgress();
        currentAdBreakSize = adbreak.size();
        currentAdIndex = 0L;
        adbreak.getDuration();
    }

    public void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick)
    {
    }

    public void onAdComplete(AdBreak adbreak, Ad ad)
    {
        hideAdProgress();
        currentAdTime = 0L;
        currentAdDuration = 0L;
    }

    public void onAdProgress(AdBreak adbreak, Ad ad, int i)
    {
    }

    public void onAdStart(AdBreak adbreak, Ad ad)
    {
        adbreak = adbreak.adsIterator();
        currentAdIndex = 0L;
        do
        {
            if (!adbreak.hasNext() || ((Ad)adbreak.next()).getId() == ad.getId())
            {
                currentAdTime = 0L;
                remainingAds.setText((new StringBuilder()).append(currentAdIndex + 1L).append("/").append(currentAdBreakSize).toString());
                showAdProgress();
                return;
            }
            currentAdIndex = currentAdIndex + 1L;
        } while (true);
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
            registerEventListener();
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
    }

    public void registerEventListener()
    {
        if (isAdded)
        {
            return;
        } else
        {
            player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, this);
            isAdded = true;
            return;
        }
    }
}
