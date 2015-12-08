// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, Utils

static class adMarvelActivityReference
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;
    private String videoUrl;

    public void browseTo(String s)
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        AdMarvelInternalWebView admarvelinternalwebview;
        if (admarvelactivity != null)
        {
            if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(s));
                if (Utils.isIntentAvailable(admarvelactivity.getBaseContext(), intent))
                {
                    admarvelactivity.startActivity(intent);
                }
                finish();
                return;
            }
        }
    }

    public void cleanup()
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        AdMarvelInternalWebView admarvelinternalwebview;
        if (admarvelactivity != null)
        {
            if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
            {
                finish finish1 = new adMarvelInternalWebViewReference(admarvelactivity);
                AdMarvelActivity.access$7(admarvelactivity).post(finish1);
                return;
            }
        }
    }

    public void didPixel(String s)
    {
    }

    public void finish()
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        AdMarvelInternalWebView admarvelinternalwebview;
        if (admarvelactivity != null)
        {
            if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
            {
                AdMarvelActivity.access$19(admarvelactivity).sendEmptyMessage(0);
                return;
            }
        }
    }

    public void hide()
    {
        didPixel("Hide");
        finish();
    }

    public void load()
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        Object obj;
        if (admarvelactivity != null)
        {
            if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                ((AdMarvelInternalWebView) (obj)).disableCloseButton(true);
                if (videoUrl != null && videoUrl.length() > 0)
                {
                    obj = new videoUrl(videoUrl, admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                    AdMarvelActivity.access$7(admarvelactivity).post(((Runnable) (obj)));
                    admarvelactivity.isAdMarvelVideo = false;
                    return;
                }
            }
        }
    }

    public void onBackPressed()
    {
        finish();
    }

    public void play()
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        Object obj;
        if (admarvelactivity != null)
        {
            if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown() && videoUrl != null && videoUrl.length() > 0)
            {
                obj = new videoUrl(admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                AdMarvelActivity.access$7(admarvelactivity).post(((Runnable) (obj)));
                return;
            }
        }
    }

    public void positionVideo(float f, float f1, float f2, float f3)
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        Object obj;
        if (admarvelactivity != null)
        {
            if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown() && videoUrl != null && videoUrl.length() > 0)
            {
                obj = new (admarvelactivity, ((AdMarvelInternalWebView) (obj)), f, f1, f2, f3);
                AdMarvelActivity.access$7(admarvelactivity).post(((Runnable) (obj)));
                return;
            }
        }
    }

    public void seekTo(float f)
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        Object obj;
        if (admarvelactivity != null)
        {
            if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown() && videoUrl != null && videoUrl.length() > 0)
            {
                obj = new videoUrl(admarvelactivity, ((AdMarvelInternalWebView) (obj)), f);
                AdMarvelActivity.access$7(admarvelactivity).post(((Runnable) (obj)));
                return;
            }
        }
    }

    public void setVideoUrl(String s)
    {
        videoUrl = s;
    }

    boolean videoIsLoaded()
    {
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
        if (admarvelactivity == null)
        {
            return false;
        }
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview != null && admarvelinternalwebview.isSignalShutdown())
        {
            return false;
        }
        return AdMarvelActivity.access$29(admarvelactivity) != null;
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        adMarvelActivityReference = new WeakReference(admarvelactivity);
    }
}
