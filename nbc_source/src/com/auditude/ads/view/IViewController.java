// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import com.auditude.ads.util.event.IEventListener;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.view:
//            IAdView

public interface IViewController
{

    public abstract void addPropertyChangeListener(IEventListener ieventlistener);

    public abstract int getBitRate();

    public abstract int getHeight();

    public abstract boolean getIsInBreak();

    public abstract float getLeftVolume();

    public abstract Object getProperty(String s);

    public abstract float getRightVolume();

    public abstract int getWidth();

    public abstract boolean hasProperty(String s);

    public abstract void notifyAdViewEvent(AdViewEvent.AdViewEventType advieweventtype, IAdView iadview, HashMap hashmap);

    public abstract void pauseMainMedia();

    public abstract void removePropertyChangeListener(IEventListener ieventlistener);

    public abstract void resumeMainMedia();
}
