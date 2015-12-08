// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Request, Utils

class ResourceRequestHandler extends RequestHandler
{

    private final Context context;

    ResourceRequestHandler(Context context1)
    {
        context = context1;
    }

    private static Bitmap decodeResource(Resources resources, int i, Request request)
    {
        android.graphics.BitmapFactory.Options options = createBitmapOptions(request);
        if (requiresInSampleSize(options))
        {
            BitmapFactory.decodeResource(resources, i, options);
            calculateInSampleSize(request.targetWidth, request.targetHeight, options, request);
        }
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public boolean canHandleRequest(Request request)
    {
        if (request.resourceId != 0)
        {
            return true;
        } else
        {
            return "android.resource".equals(request.uri.getScheme());
        }
    }

    public RequestHandler.Result load(Request request, int i)
        throws IOException
    {
        Resources resources = Utils.getResources(context, request);
        return new RequestHandler.Result(decodeResource(resources, Utils.getResourceId(resources, request), request), Picasso.LoadedFrom.DISK);
    }
}
