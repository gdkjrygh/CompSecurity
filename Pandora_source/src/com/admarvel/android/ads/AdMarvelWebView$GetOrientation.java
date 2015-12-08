// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView

private static class adMarvelWebViewReference
    implements Runnable
{

    private static int currentOrientaion = 0x80000000;
    private final WeakReference adMarvelWebViewReference;

    private int getCurrentOriention()
    {
        return currentOrientaion;
    }

    public void run()
    {
        AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
        Context context;
        if (admarvelwebview != null)
        {
            if ((context = admarvelwebview.getContext()) != null)
            {
                currentOrientaion = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
                AdMarvelWebView.access$28(admarvelwebview, currentOrientaion);
                return;
            }
        }
    }



    public (AdMarvelWebView admarvelwebview)
    {
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
    }
}
