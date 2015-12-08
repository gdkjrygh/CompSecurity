// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.factories.MraidControllerFactory;
import java.util.Map;

// Referenced classes of package com.mopub.mraid:
//            MraidController, PlacementType, a, MraidWebViewDebugListener

class MraidBanner extends CustomEventBanner
{

    private MraidController a;
    private com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener b;
    private MraidWebViewDebugListener c;

    MraidBanner()
    {
    }

    static com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener a(MraidBanner mraidbanner)
    {
        return mraidbanner.b;
    }

    protected final void a()
    {
        if (a != null)
        {
            a.setMraidListener(null);
            a.destroy();
        }
    }

    protected final void a(Context context, com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener customeventbannerlistener, Map map, Map map1)
    {
        b = customeventbannerlistener;
        if (map1.containsKey("Html-Response-Body"))
        {
            customeventbannerlistener = (String)map1.get("Html-Response-Body");
            try
            {
                a = MraidControllerFactory.create(context, (AdReport)map.get("mopub-intent-ad-report"), PlacementType.INLINE);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                MoPubLog.w("MRAID banner creating failed:", context);
                b.onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
                return;
            }
            a.setDebugListener(c);
            a.setMraidListener(new a(this));
            a.loadContent(customeventbannerlistener);
            return;
        } else
        {
            b.onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
            return;
        }
    }

    public void setDebugListener(MraidWebViewDebugListener mraidwebviewdebuglistener)
    {
        c = mraidwebviewdebuglistener;
        if (a != null)
        {
            a.setDebugListener(mraidwebviewdebuglistener);
        }
    }
}
