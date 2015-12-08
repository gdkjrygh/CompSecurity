// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.internal:
//            ImageResponse, ImageRequest

final class val.callback
    implements Runnable
{

    final Bitmap val$bitmap;
    final ack val$callback;
    final Exception val$error;
    final boolean val$isCachedRedirect;
    final ImageRequest val$request;

    public final void run()
    {
        ImageResponse imageresponse = new ImageResponse(val$request, val$error, val$isCachedRedirect, val$bitmap);
        val$callback.onCompleted(imageresponse);
    }

    ack()
    {
        val$request = imagerequest;
        val$error = exception;
        val$isCachedRedirect = flag;
        val$bitmap = bitmap1;
        val$callback = ack;
        super();
    }
}
