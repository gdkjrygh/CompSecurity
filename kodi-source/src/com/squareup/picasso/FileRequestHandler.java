// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            ContentStreamRequestHandler, Request

class FileRequestHandler extends ContentStreamRequestHandler
{

    FileRequestHandler(Context context)
    {
        super(context);
    }

    static int getFileExifRotation(Uri uri)
        throws IOException
    {
        switch ((new ExifInterface(uri.getPath())).getAttributeInt("Orientation", 1))
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 6: // '\006'
            return 90;

        case 3: // '\003'
            return 180;

        case 8: // '\b'
            return 270;
        }
    }

    public boolean canHandleRequest(Request request)
    {
        return "file".equals(request.uri.getScheme());
    }

    public RequestHandler.Result load(Request request, int i)
        throws IOException
    {
        return new RequestHandler.Result(null, getInputStream(request), Picasso.LoadedFrom.DISK, getFileExifRotation(request.uri));
    }
}
