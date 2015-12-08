// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebViewManager, HybridWebViewControl, HybridWebView

public static class 
{

    public void onWebViewCreated(HybridWebView hybridwebview)
    {
    }

    public void setWaitUiVisibility(HybridWebViewControl hybridwebviewcontrol, boolean flag)
    {
        hybridwebviewcontrol.setWaitUiVisibility(flag);
    }

    public void setWebViewVisibility(HybridWebViewControl hybridwebviewcontrol, boolean flag)
    {
        hybridwebviewcontrol.setWebViewVisibility(flag);
    }

    public boolean shouldOverrideUrlLoading(HybridWebViewControl hybridwebviewcontrol, HybridWebView hybridwebview, String s)
    {
        return false;
    }

    public void showError(HybridWebViewControl hybridwebviewcontrol, int i, String s, int j, String s1)
    {
        hybridwebviewcontrol.showErrorToast(s);
    }

    public ()
    {
    }
}
