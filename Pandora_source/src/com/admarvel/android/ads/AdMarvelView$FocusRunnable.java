// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, AdMarvelWebView

private static class adMarvelViewReference
    implements Runnable
{

    private final WeakReference adMarvelViewReference;

    public void run()
    {
        Object obj = (AdMarvelView)adMarvelViewReference.get();
        if (obj != null)
        {
            if ((obj = ((AdMarvelView) (obj)).findViewWithTag("CURRENT")) != null && (obj instanceof AdMarvelWebView))
            {
                ((AdMarvelWebView)obj).focus();
                return;
            }
        }
    }

    public _cls9(AdMarvelView admarvelview)
    {
        adMarvelViewReference = new WeakReference(admarvelview);
    }
}
