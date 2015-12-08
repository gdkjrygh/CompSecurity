// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.toolbox.ImageLoader;

public class MaxWidthImageLoader extends ImageLoader
{

    private final int a;

    public MaxWidthImageLoader(RequestQueue requestqueue, Context context, com.mopub.volley.toolbox.ImageLoader.ImageCache imagecache)
    {
        super(requestqueue, imagecache);
        requestqueue = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        context = new Point();
        if (android.os.Build.VERSION.SDK_INT < 13)
        {
            context.set(requestqueue.getWidth(), requestqueue.getHeight());
        } else
        {
            requestqueue.getSize(context);
        }
        a = Math.min(((Point) (context)).x, ((Point) (context)).y);
    }

    public com.mopub.volley.toolbox.ImageLoader.ImageContainer get(String s, com.mopub.volley.toolbox.ImageLoader.ImageListener imagelistener)
    {
        return super.get(s, imagelistener, a, 0);
    }
}
