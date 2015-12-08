// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, Utils

private static class mCallback
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final String mCallback;

    public void run()
    {
        Object obj;
        try
        {
            obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
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
        if (Utils.isNetworkAvailable(((AdMarvelInternalWebView) (obj)).getContext()))
        {
            ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
            return;
        }
        ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
        return;
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, String s)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        mCallback = s;
    }
}
