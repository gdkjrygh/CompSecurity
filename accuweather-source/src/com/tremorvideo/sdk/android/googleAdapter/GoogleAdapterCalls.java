// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.googleAdapter;


// Referenced classes of package com.tremorvideo.sdk.android.googleAdapter:
//            GoogleAdapterCallbackListener

public class GoogleAdapterCalls
{

    private static GoogleAdapterCallbackListener a;

    public GoogleAdapterCalls()
    {
    }

    public static void onAdFinished()
    {
        if (a != null)
        {
            a.onAdFinished();
        }
    }

    public static void onAdReady()
    {
        if (a != null)
        {
            a.onAdReady();
        }
    }

    public static void onGetAdFailed()
    {
        if (a != null)
        {
            a.onAdFailed();
        }
    }

    public static void onLeaveApp()
    {
        if (a != null)
        {
            a.onLeaveAd();
        }
    }

    public static void setGoogleCallBackListener(GoogleAdapterCallbackListener googleadaptercallbacklistener)
    {
    }
}
