// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.core;

import com.auditude.ads.event.AdClickThroughEvent;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.event.AdProgressEvent;
import com.auditude.ads.event.LinearAdEvent;
import com.auditude.ads.event.NonLinearAdEvent;
import com.auditude.ads.event.OnPageEvent;
import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.IClick;
import com.auditude.ads.model.ILinearAsset;
import com.auditude.ads.model.INonLinearAsset;
import com.auditude.ads.model.IOnPageAsset;
import com.auditude.ads.session.IPlaybackSession;
import com.auditude.ads.util.event.EventDispatcher;
import java.util.HashMap;

public class APIBridge extends EventDispatcher
{

    public static final String AD_VIEW_EVENT = "adViewEvent";
    public static final String API_EVENT = "apiEvent";
    public static final String SMIL_EVENT = "smilEvent";

    public APIBridge()
    {
    }

    public final void adBegin(IAsset iasset, IOnPageAsset aionpageasset[], IPlaybackSession iplaybacksession, boolean flag)
    {
        IAsset iasset1 = null;
        if (!(iasset instanceof ILinearAsset)) goto _L2; else goto _L1
_L1:
        if (iasset instanceof ILinearAsset)
        {
            iasset1 = iasset;
        }
        dispatchEvent("apiEvent", new LinearAdEvent("linearAdBegin", (ILinearAsset)iasset1, aionpageasset, iplaybacksession, flag));
_L4:
        return;
_L2:
        if (iasset instanceof INonLinearAsset)
        {
            if (!(iasset instanceof INonLinearAsset))
            {
                iasset = null;
            }
            dispatchEvent("apiEvent", new NonLinearAdEvent("nonLinearAdBegin", (INonLinearAsset)iasset, aionpageasset));
            return;
        }
        if ((iasset instanceof IOnPageAsset) && iasset.getFormat().equals("onpage"))
        {
            int i;
            if (!(iasset instanceof IOnPageAsset))
            {
                iasset = null;
            }
            dispatchEvent("apiEvent", new OnPageEvent("showBanner", (IOnPageAsset)iasset));
        }
        if (aionpageasset != null)
        {
            i = 0;
            while (i < aionpageasset.length) 
            {
                dispatchEvent("apiEvent", new OnPageEvent("showBanner", aionpageasset[i]));
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void adClick(IClick iclick, HashMap hashmap)
    {
        dispatchEvent("apiEvent", new AdClickThroughEvent("adClick", iclick, hashmap));
    }

    public final void adEnd(IAsset iasset, boolean flag)
    {
        if (iasset instanceof ILinearAsset)
        {
            if (!(iasset instanceof ILinearAsset))
            {
                iasset = null;
            }
            dispatchEvent("apiEvent", new LinearAdEvent("linearAdEnd", (ILinearAsset)iasset, null, null, flag));
        } else
        {
            if (iasset instanceof INonLinearAsset)
            {
                if (!(iasset instanceof INonLinearAsset))
                {
                    iasset = null;
                }
                dispatchEvent("apiEvent", new NonLinearAdEvent("nonLinearAdEnd", (INonLinearAsset)iasset, null));
                return;
            }
            if ((iasset instanceof IOnPageAsset) && iasset.getFormat().equals("onpage"))
            {
                if (!(iasset instanceof IOnPageAsset))
                {
                    iasset = null;
                }
                dispatchEvent("apiEvent", new OnPageEvent("hideBanner", (IOnPageAsset)iasset));
                return;
            }
        }
    }

    public final void adPaused(IAsset iasset)
    {
        if (iasset instanceof ILinearAsset)
        {
            if (!(iasset instanceof ILinearAsset))
            {
                iasset = null;
            }
            dispatchEvent("apiEvent", new LinearAdEvent("linearAdPaused", (ILinearAsset)iasset, null, null, true));
        }
    }

    public final void adProgress(IAsset iasset, int i, int j, HashMap hashmap)
    {
        dispatchEvent("apiEvent", new AdProgressEvent("adProgress", i, j, iasset, hashmap));
    }

    public final void adResumed(IAsset iasset)
    {
        if (iasset instanceof ILinearAsset)
        {
            if (!(iasset instanceof ILinearAsset))
            {
                iasset = null;
            }
            dispatchEvent("apiEvent", new LinearAdEvent("linearAdResumed", (ILinearAsset)iasset, null, null, true));
        }
    }

    public final void breakBegin(HashMap hashmap)
    {
        dispatchEvent("apiEvent", new AdPluginEvent("breakBegin", hashmap));
    }

    public final void breakEnd(HashMap hashmap)
    {
        dispatchEvent("apiEvent", new AdPluginEvent("breakEnd", hashmap));
    }

    public final void pauseMainMedia(HashMap hashmap)
    {
        dispatchEvent("apiEvent", new AdPluginEvent("pausePlayback", hashmap));
    }

    public final void resumeMainMedia(HashMap hashmap)
    {
        dispatchEvent("apiEvent", new AdPluginEvent("resumePlayback", hashmap));
    }
}
