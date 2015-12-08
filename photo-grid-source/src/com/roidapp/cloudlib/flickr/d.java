// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.app.ProgressDialog;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrAuthenActivity

final class d extends WebChromeClient
{

    final FlickrAuthenActivity a;

    d(FlickrAuthenActivity flickrauthenactivity)
    {
        a = flickrauthenactivity;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        if (i == 100 && FlickrAuthenActivity.b(a) != null)
        {
            FlickrAuthenActivity.b(a).dismiss();
        }
        super.onProgressChanged(webview, i);
    }
}
