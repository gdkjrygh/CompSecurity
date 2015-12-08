// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, AdMarvelWebView

private static class handlerReference
    implements Runnable
{

    private final WeakReference adMarvelViewReference;
    private final WeakReference handlerReference;

    public void run()
    {
        Object obj = (AdMarvelView)adMarvelViewReference.get();
        if (obj != null)
        {
            Handler handler = (Handler)handlerReference.get();
            android.content.Context context = ((AdMarvelView) (obj)).getContext();
            obj = ((AdMarvelView) (obj)).findViewWithTag("CURRENT");
            if (obj != null && (obj instanceof AdMarvelWebView))
            {
                obj = ((AdMarvelWebView)obj).getAdMarvelAd();
                if (obj != null)
                {
                    (new AdmarvelOfflineUtils()).firePixel(((AdMarvelAd) (obj)), context, handler);
                    return;
                }
            }
        }
    }

    public (AdMarvelView admarvelview, Handler handler)
    {
        adMarvelViewReference = new WeakReference(admarvelview);
        handlerReference = new WeakReference(handler);
    }
}
