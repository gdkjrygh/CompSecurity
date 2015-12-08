// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import com.android.volley.VolleyError;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageLoader

class 
    implements ageListener
{

    final ImageLoader this$0;
    final com.netflix.mediaclient.util.gfx.ageLoaderListener val$listener;

    public void onErrorResponse(VolleyError volleyerror)
    {
        com.netflix.mediaclient.util.gfx.ageLoaderListener ageloaderlistener = val$listener;
        if (volleyerror == null)
        {
            volleyerror = null;
        } else
        {
            volleyerror = volleyerror.getMessage();
        }
        ageloaderlistener.onErrorResponse(volleyerror);
    }

    public void onResponse(ageContainer agecontainer, boolean flag)
    {
        if (agecontainer == null)
        {
            val$listener.onResponse(null, null);
            return;
        } else
        {
            val$listener.onResponse(agecontainer.getBitmap(), agecontainer.getRequestUrl());
            return;
        }
    }

    ()
    {
        this$0 = final_imageloader;
        val$listener = com.netflix.mediaclient.util.gfx.ageLoaderListener.this;
        super();
    }
}
