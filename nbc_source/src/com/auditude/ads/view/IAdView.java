// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import com.auditude.ads.session.IPlaybackSession;
import com.auditude.ads.view.model.IAdViewSource;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.view:
//            IAuditudeView

public interface IAdView
    extends IAuditudeView
{

    public abstract void dispose();

    public abstract int getDuration();

    public abstract float getLeftVolume();

    public abstract IPlaybackSession getPlaybackSession();

    public abstract int getPosition();

    public abstract float getRightVolume();

    public abstract IAdViewSource getSource();

    public abstract void hide(IAdViewSource iadviewsource);

    public abstract void notifyAdEvent(AdViewEvent.AdViewEventType advieweventtype, HashMap hashmap);

    public abstract void reset();

    public abstract void setPlaybackSession(IPlaybackSession iplaybacksession);

    public abstract void setVolume(float f, float f1);

    public abstract boolean shouldNotifyAdBeginOnLoad();

    public abstract void show(IAdViewSource iadviewsource);
}
