// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.util.Log;
import android.view.View;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, AdMarvelAd, AdMarvelViewListenerImpl, Utils

private static class adMarvelViewReference
    implements Runnable
{

    private final AdMarvelAd adMarvelAd;
    private final WeakReference adMarvelViewReference;

    public void run()
    {
        Object obj;
        Object obj1;
        View view;
        android.content.Context context;
        try
        {
            obj = (AdMarvelView)adMarvelViewReference.get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
        if (obj == null)
        {
            return;
        }
        context = ((AdMarvelView) (obj)).getContext();
        if (context == null) goto _L2; else goto _L1
_L1:
        obj1 = ((AdMarvelView) (obj)).findViewWithTag("PENDING");
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        view = ((AdMarvelView) (obj)).findViewWithTag("CURRENT");
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        Logging.log((new StringBuilder("crv: ")).append(view.getVisibility()).toString());
        if (view == null) goto _L5; else goto _L4
_L4:
        if (!AdMarvelView.access$5(((AdMarvelView) (obj))) && view.getVisibility() == 0 && !view.isShown()) goto _L6; else goto _L5
_L5:
        if (!adMarvelAd.isMustBeVisible() || adMarvelAd.getSdkAdNetwork() != _fld3D) goto _L8; else goto _L7
_L7:
        ((View) (obj1)).setTag("CURRENT");
        AdMarvelView.access$2(((AdMarvelView) (obj)), view);
_L12:
        if (!AdMarvelView.access$3(((AdMarvelView) (obj))))
        {
            AdMarvelView.access$4(((AdMarvelView) (obj)), view);
        }
        AdMarvelView.access$7(((AdMarvelView) (obj))).onReceiveAd(context, ((AdMarvelView) (obj)), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L10:
        obj1 = new Utils(context, AdMarvelView.access$9(((AdMarvelView) (obj))));
        if (AdMarvelView.enableOfflineSDK && !AdMarvelView.access$10(((AdMarvelView) (obj))))
        {
            (new AdmarvelOfflineUtils()).firePixel(adMarvelAd, context, AdMarvelView.access$9(((AdMarvelView) (obj))));
            return;
        }
          goto _L9
_L8:
        AdMarvelView.access$6(((AdMarvelView) (obj)));
        ((View) (obj1)).setTag("CURRENT");
        ((View) (obj1)).setVisibility(0);
        ((AdMarvelView) (obj)).removeAllViews();
        ((AdMarvelView) (obj)).addView(((View) (obj1)));
        AdMarvelView.access$2(((AdMarvelView) (obj)), view);
        continue; /* Loop/switch isn't completed */
_L6:
        AdMarvelView.access$8(((AdMarvelView) (obj)), ((View) (obj1)), adMarvelAd);
          goto _L10
_L9:
        if (!AdMarvelView.enableOfflineSDK)
        {
            ((Utils) (obj1)).firePixel(adMarvelAd);
        }
_L2:
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public (AdMarvelView admarvelview, AdMarvelAd admarvelad)
    {
        adMarvelAd = admarvelad;
        adMarvelViewReference = new WeakReference(admarvelview);
    }
}
