// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            VideoInterstitialControls

private class imageUrl
    implements Runnable
{

    private String imageUrl;
    private final WeakReference imageViewReference;
    final VideoInterstitialControls this$0;

    public void run()
    {
        if (imageViewReference.get() != null)
        {
            (new imageViewReference(VideoInterstitialControls.this, (ImageView)imageViewReference.get())).Executor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                imageUrl
            });
        }
    }

    public (ImageView imageview, String s)
    {
        this$0 = VideoInterstitialControls.this;
        super();
        imageViewReference = new WeakReference(imageview);
        imageUrl = s;
    }
}
