// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.content.Context;
import com.auditude.ads.model.IAsset;
import com.auditude.ads.session.IPlaybackSession;
import com.auditude.ads.view.AdPlaybackSession;
import com.auditude.ads.view.AdView;
import com.auditude.ads.view.ILinearAdView;
import com.auditude.ads.view.IViewController;
import com.auditude.ads.view.model.AdViewSource;
import com.auditude.ads.view.model.IAdViewSource;
import java.util.HashMap;

public class ExternalVideoView extends AdView
    implements com.auditude.ads.view.AdPlaybackSession.OnAdPlaybackSessionEventListener, ILinearAdView
{

    private static int $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants[];
    private static final String DURATION = "duration";
    private static final String POSITION = "position";
    private int duration;
    private int position;

    static int[] $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants()
    {
        int ai[] = $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.values().length];
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.CLICK.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.COMPLETE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.ERROR.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.NOTIFY.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.PAUSE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.PROGRESS.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.RESUME.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.SKIP.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.START.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.auditude.ads.view.AdPlaybackSession.PlaybackConstants.STOP.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants = ai;
        return ai;
    }

    public ExternalVideoView(Context context)
    {
        super(context);
        duration = 0;
        position = 0;
    }

    public int getDuration()
    {
        return duration;
    }

    public IPlaybackSession getPlaybackSession()
    {
        return super.getPlaybackSession();
    }

    public int getPosition()
    {
        return position;
    }

    public void hide(IAdViewSource iadviewsource)
    {
        super.hide(iadviewsource);
    }

    public void initialize(IViewController iviewcontroller)
    {
        super.initialize(iviewcontroller);
    }

    public void onAdPlaybackSessionEvent(com.auditude.ads.view.AdPlaybackSession.PlaybackConstants playbackconstants, AdViewSource adviewsource, AdView adview, HashMap hashmap)
    {
        if (adviewsource != null)
        {
            adviewsource = adviewsource.getAsset();
        } else
        {
            adviewsource = null;
        }
        if (adviewsource != null)
        {
            switch ($SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants()[playbackconstants.ordinal()])
            {
            case 2: // '\002'
            case 3: // '\003'
            case 8: // '\b'
            default:
                return;

            case 1: // '\001'
                notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_START);
                return;

            case 5: // '\005'
                notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_COMPLETE);
                return;

            case 4: // '\004'
                notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_STOP);
                return;

            case 6: // '\006'
                notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_ERROR);
                return;

            case 7: // '\007'
                notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_CLICK);
                return;

            case 9: // '\t'
                break;
            }
            if (hashmap != null)
            {
                if (hashmap.containsKey("position"))
                {
                    position = Integer.parseInt(hashmap.get("position").toString());
                }
                if (hashmap.containsKey("duration"))
                {
                    duration = Integer.parseInt(hashmap.get("duration").toString());
                }
                notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_PROGRESS);
                return;
            }
        }
    }

    public final void pause()
    {
    }

    public void reset()
    {
        super.reset();
    }

    public final void resume()
    {
    }

    public void setPlaybackSession(IPlaybackSession iplaybacksession)
    {
        ((AdPlaybackSession)iplaybacksession).setOnAdPlaybackSessionEventListener(this);
        super.setPlaybackSession(iplaybacksession);
    }

    public boolean shouldAddToStage()
    {
        return false;
    }

    public boolean shouldNotifyAdBeginOnLoad()
    {
        return true;
    }

    public void show(IAdViewSource iadviewsource)
    {
        super.show(iadviewsource);
        duration = iadviewsource.getAsset().getDurationInMillis();
        notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_LOAD);
    }
}
