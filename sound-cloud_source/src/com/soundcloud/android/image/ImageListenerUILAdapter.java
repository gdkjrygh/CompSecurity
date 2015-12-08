// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.view.View;
import com.b.a.b.a.b;
import com.b.a.b.f.a;

// Referenced classes of package com.soundcloud.android.image:
//            ImageListener

public class ImageListenerUILAdapter
    implements a
{

    private final ImageListener imageListener;

    public ImageListenerUILAdapter(ImageListener imagelistener)
    {
        imageListener = imagelistener;
    }

    public void onLoadingCancelled(String s, View view)
    {
    }

    public void onLoadingComplete(String s, View view, Bitmap bitmap)
    {
        imageListener.onLoadingComplete(s, view, bitmap);
    }

    public void onLoadingFailed(String s, View view, b b1)
    {
        ImageListener imagelistener = imageListener;
        if (b1 != null && b1.a != null)
        {
            b1 = b1.a.getMessage();
        } else
        {
            b1 = null;
        }
        imagelistener.onLoadingFailed(s, view, b1);
    }

    public void onLoadingStarted(String s, View view)
    {
        imageListener.onLoadingStarted(s, view);
    }
}
