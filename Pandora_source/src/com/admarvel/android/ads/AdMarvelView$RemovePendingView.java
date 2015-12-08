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

    final WeakReference adMarvelViewReference;

    public void run()
    {
        AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
        android.view.View view;
        if (admarvelview != null)
        {
            if ((view = admarvelview.findViewWithTag("PENDING")) != null)
            {
                admarvelview.removeView(view);
                return;
            }
        }
    }

    public (AdMarvelView admarvelview)
    {
        adMarvelViewReference = new WeakReference(admarvelview);
    }
}
