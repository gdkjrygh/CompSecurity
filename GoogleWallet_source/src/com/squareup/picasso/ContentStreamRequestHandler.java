// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Request, Utils

class ContentStreamRequestHandler extends RequestHandler
{

    final Context context;

    ContentStreamRequestHandler(Context context1)
    {
        context = context1;
    }

    public boolean canHandleRequest(Request request)
    {
        return "content".equals(request.uri.getScheme());
    }

    protected final Bitmap decodeContentStream(Request request)
        throws IOException
    {
        Object obj;
        android.graphics.BitmapFactory.Options options;
        ContentResolver contentresolver;
        contentresolver = context.getContentResolver();
        options = createBitmapOptions(request);
        if (!requiresInSampleSize(options))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = null;
        java.io.InputStream inputstream = contentresolver.openInputStream(request.uri);
        obj = inputstream;
        BitmapFactory.decodeStream(inputstream, null, options);
        Utils.closeQuietly(inputstream);
        calculateInSampleSize(request.targetWidth, request.targetHeight, options, request);
        request = contentresolver.openInputStream(request.uri);
        obj = BitmapFactory.decodeStream(request, null, options);
        Utils.closeQuietly(request);
        return ((Bitmap) (obj));
        request;
        Utils.closeQuietly(((java.io.InputStream) (obj)));
        throw request;
        Exception exception;
        exception;
        Utils.closeQuietly(request);
        throw exception;
    }

    public RequestHandler.Result load(Request request)
        throws IOException
    {
        return new RequestHandler.Result(decodeContentStream(request), Picasso.LoadedFrom.DISK);
    }
}
