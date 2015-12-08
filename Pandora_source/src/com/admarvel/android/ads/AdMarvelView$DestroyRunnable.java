// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView

private static class adMarvelViewReference
    implements Runnable
{

    private final WeakReference adMarvelViewReference;

    public void run()
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        if (admarvelview == null)
        {
            return;
        }
        android.view.View view = admarvelview.findViewWithTag("CURRENT");
        AdMarvelView.access$2(admarvelview, view);
        if (!AdMarvelView.access$3(admarvelview))
        {
            AdMarvelView.access$4(admarvelview, view);
        }
        admarvelview.removeAllViews();
    }

    public (AdMarvelView admarvelview)
    {
        adMarvelViewReference = new WeakReference(admarvelview);
    }
}
