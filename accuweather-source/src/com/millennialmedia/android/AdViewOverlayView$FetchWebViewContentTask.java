// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.AsyncTask;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.millennialmedia.android:
//            AdViewOverlayView, HttpGetRequest, MMLog, AdViewOverlayActivity, 
//            MMAdImpl, MMAdImplController

private static class _overlayViewRef extends AsyncTask
{

    private WeakReference _overlayViewRef;
    private String baseUrl;
    private boolean cancelVideo;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient String doInBackground(Void avoid[])
    {
        cancelVideo = true;
        if (TextUtils.isEmpty(baseUrl))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        avoid = (new HttpGetRequest()).get(baseUrl);
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        StatusLine statusline = avoid.getStatusLine();
        if (avoid == null || statusline == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (statusline.getStatusCode() == 404)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        avoid = avoid.getEntity();
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        avoid = HttpGetRequest.convertStreamToString(avoid.getContent());
        cancelVideo = false;
        return avoid;
        avoid;
        MMLog.e("AdViewOverlayView", "Unable to get weboverlay", avoid);
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        AdViewOverlayView adviewoverlayview = (AdViewOverlayView)_overlayViewRef.get();
        if (adviewoverlayview != null)
        {
            if (cancelVideo)
            {
                AdViewOverlayActivity adviewoverlayactivity = (AdViewOverlayActivity)adviewoverlayview.overlayActivityRef.get();
                if (adviewoverlayactivity != null)
                {
                    adviewoverlayactivity.finish();
                } else
                {
                    AdViewOverlayView.access$200(adviewoverlayview);
                }
            }
            if (s != null && adviewoverlayview.adImpl != null && adviewoverlayview.adImpl.controller != null)
            {
                adviewoverlayview.adImpl.controller.setWebViewContent(s, baseUrl);
            }
        }
    }

    protected void onPreExecute()
    {
        AdViewOverlayView adviewoverlayview = (AdViewOverlayView)_overlayViewRef.get();
        if (adviewoverlayview != null && AdViewOverlayView.access$400(adviewoverlayview) == null)
        {
            AdViewOverlayView.access$500(adviewoverlayview);
        }
        super.onPreExecute();
    }

    public (AdViewOverlayView adviewoverlayview, String s)
    {
        baseUrl = s;
        _overlayViewRef = new WeakReference(adviewoverlayview);
    }
}
