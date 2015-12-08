// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.internal:
//            ImageRequest

public class ImageResponse
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

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public Exception getError()
    {
        return error;
    }

    public ImageRequest getRequest()
    {
        return request;
    }

    public boolean isCachedRedirect()
    {
        return isCachedRedirect;
    }
}
