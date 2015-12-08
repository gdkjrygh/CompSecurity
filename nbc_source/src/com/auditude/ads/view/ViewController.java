// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.util.ObjectUtil;
import com.auditude.ads.util.event.EventDispatcher;
import com.auditude.ads.util.event.IEventListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.view:
//            IViewController, AdViewEvent, IAdView

public class ViewController extends EventDispatcher
    implements IViewController, PropertyChangeListener
{

    public static final String PROPERTY_CHANGE = "propertyChange";
    private APIBridge api;
    private boolean isInBreak;
    private AdSettings settings;

    public ViewController(APIBridge apibridge, AdSettings adsettings)
    {
        isInBreak = false;
        api = apibridge;
        settings = adsettings;
        settings.addPropertyChangeListener(this);
    }

    public void addPropertyChangeListener(IEventListener ieventlistener)
    {
        if (ieventlistener != null)
        {
            addEventListener("propertyChange", ieventlistener);
        }
    }

    public final void dispose()
    {
        if (settings != null)
        {
            settings = null;
        }
    }

    public final int getBitRate()
    {
        return ((Integer)settings.getProperty("bitrate")).intValue();
    }

    public final int getHeight()
    {
        return ObjectUtil.convertToInt(settings.getProperty("height"), 0);
    }

    public final boolean getIsInBreak()
    {
        return isInBreak;
    }

    public final float getLeftVolume()
    {
        return ObjectUtil.convertToFloat(settings.getProperty("leftVolume"), 0.0F);
    }

    public final Object getProperty(String s)
    {
        return settings.getProperty(s);
    }

    public final float getRightVolume()
    {
        return ObjectUtil.convertToFloat(settings.getProperty("rightVolume"), 0.0F);
    }

    public final int getWidth()
    {
        return ObjectUtil.convertToInt(settings.getProperty("width"), 0);
    }

    public final boolean hasProperty(String s)
    {
        return settings.hasProperty(s);
    }

    public final void init()
    {
    }

    public final void notifyAdViewEvent(AdViewEvent.AdViewEventType advieweventtype, IAdView iadview, HashMap hashmap)
    {
        advieweventtype = new AdViewEvent(this, advieweventtype, iadview.getSource(), iadview, hashmap);
        api.dispatchEvent("adViewEvent", advieweventtype);
    }

    public final void pauseMainMedia()
    {
        api.pauseMainMedia(null);
    }

    public void propertyChange(PropertyChangeEvent propertychangeevent)
    {
        dispatchEvent("propertyChange", propertychangeevent);
    }

    public void removePropertyChangeListener(IEventListener ieventlistener)
    {
        removeEventListener("propertyChange", ieventlistener);
    }

    public final void resumeMainMedia()
    {
        api.resumeMainMedia(null);
    }
}
