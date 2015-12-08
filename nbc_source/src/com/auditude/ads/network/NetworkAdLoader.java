// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.event.PlayerErrorEvent;
import com.auditude.ads.exception.AssetException;
import com.auditude.ads.model.Ad;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.EventDispatcher;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.network:
//            INetworkAdLoader

public abstract class NetworkAdLoader extends EventDispatcher
    implements INetworkAdLoader
{

    public static final String COMPLETE = "complete";
    public static final String ERROR = "error";
    private Ad ad;
    private HashMap customParams;
    private Object result;
    private Object source;

    public NetworkAdLoader()
    {
    }

    public abstract void cancel();

    public final Ad getAd()
    {
        return ad;
    }

    public final Object getResult()
    {
        return result;
    }

    public final Object getSource()
    {
        if (source instanceof String)
        {
            String s1 = AuditudeUtil.substituteTags((String)source);
            String s = s1;
            if (customParams != null)
            {
                s = AuditudeUtil.substituteCustomPublisherTags(s1, customParams);
            }
            return AuditudeUtil.substituteCustomPublisherTags(s, AuditudeEnv.getInstance().getAdSettings().getPassThroughParams());
        } else
        {
            return source;
        }
    }

    public void load()
    {
    }

    protected final void logError(int i, String s)
    {
        s = new AssetException(i, s);
        if (ad != null)
        {
            s.adId = ad.getID();
        }
        AuditudeEnv.getInstance().getAPI().dispatchEvent("playerError", new PlayerErrorEvent(this, s));
    }

    protected final void notifyComplete()
    {
        dispatchEvent("complete", new Event(this));
    }

    protected final void notifyError(AdPluginEvent adpluginevent)
    {
        dispatchEvent("error", adpluginevent);
    }

    public final void setAd(Ad ad1)
    {
        ad = ad1;
    }

    public final void setCustomParams(HashMap hashmap)
    {
        customParams = hashmap;
    }

    public final void setResult(Object obj)
    {
        result = obj;
    }

    public final void setSource(Object obj)
    {
        source = obj;
    }
}
