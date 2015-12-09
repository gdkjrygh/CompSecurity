// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView

private static class adMarvelWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelWebViewReference;

    public void run()
    {
        AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
        if (admarvelwebview != null)
        {
            admarvelwebview.close();
        }
    }

    public (AdMarvelWebView admarvelwebview)
    {
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
    }
}
