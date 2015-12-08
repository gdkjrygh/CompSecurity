// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView

private static class isDisabling
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference contextReference;
    private boolean isDisabling;

    public void run()
    {
        Object obj;
        obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        break MISSING_BLOCK_LABEL_11;
        while (true) 
        {
            Object obj1;
            do
            {
                do
                {
                    return;
                } while (obj == null || AdMarvelInternalWebView.access$2(((AdMarvelInternalWebView) (obj))));
                obj1 = (Activity)(Context)contextReference.get();
                if (obj1 == null)
                {
                    continue;
                }
                obj1 = (ViewGroup)((Activity) (obj1)).getWindow().findViewById(0x1020002);
                if (!isDisabling)
                {
                    break;
                }
                if (!AdMarvelInternalWebView.access$4(((AdMarvelInternalWebView) (obj))))
                {
                    obj1 = (LinearLayout)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
                    if (obj1 != null && AdMarvelInternalWebView.access$3(((AdMarvelInternalWebView) (obj))))
                    {
                        ((LinearLayout) (obj1)).setVisibility(8);
                        return;
                    }
                } else
                {
                    obj = (Button)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE_IMAGE").toString());
                    if (obj != null)
                    {
                        ((Button) (obj)).setVisibility(4);
                        return;
                    }
                }
            } while (true);
            LinearLayout linearlayout = (LinearLayout)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
            if (linearlayout != null)
            {
                if (linearlayout.getVisibility() != 0)
                {
                    linearlayout.setVisibility(0);
                }
                obj = (Button)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE_IMAGE").toString());
                if (obj != null && ((Button) (obj)).getVisibility() != 0)
                {
                    ((Button) (obj)).setVisibility(0);
                    return;
                }
            }
        }
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, Context context, Boolean boolean1)
    {
        isDisabling = true;
        contextReference = new WeakReference(context);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        isDisabling = boolean1.booleanValue();
    }
}
