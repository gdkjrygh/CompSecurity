// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView

private static class adMarvelWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelWebViewReference;
    private String mState;

    public void run()
    {
        Object obj = (AdMarvelWebView)adMarvelWebViewReference.get();
        if (obj != null)
        {
            if ((obj = (AdMarvelInternalWebView)((AdMarvelWebView) (obj)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("INTERNAL").toString())) != null)
            {
                int i = ((AdMarvelInternalWebView) (obj)).getVisibility();
                if (mState.equals("show") && i != 0)
                {
                    ((AdMarvelInternalWebView) (obj)).setVisibility(0);
                }
                if (mState.equals("hide") && i == 0)
                {
                    ((AdMarvelInternalWebView) (obj)).setVisibility(4);
                    return;
                }
            }
        }
    }

    public (String s, AdMarvelWebView admarvelwebview)
    {
        mState = null;
        mState = s;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
    }
}
