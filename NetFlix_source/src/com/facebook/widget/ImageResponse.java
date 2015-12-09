// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.widget:
//            ImageRequest

class ImageResponse
{

    private Bitmap bitmap;
    private Exception error;
    private boolean isCachedRedirect;
    private ImageRequest request;

    ImageResponse(ImageRequest imagerequest, Exception exception, boolean flag, Bitmap bitmap1)
    {
        request = imagerequest;
        error = exception;
        bitmap = bitmap1;
        isCachedRedirect = flag;
    }

    Bitmap getBitmap()
    {
        return bitmap;
    }

    Exception getError()
    {
        return error;
    }

    ImageRequest getRequest()
    {
        return request;
    }

    boolean isCachedRedirect()
    {
        return isCachedRedirect;
    }
}
