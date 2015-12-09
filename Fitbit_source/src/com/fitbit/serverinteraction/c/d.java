// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.c;

import android.graphics.Bitmap;
import android.net.Uri;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.l;
import com.fitbit.util.aj;
import com.squareup.picasso.Downloader;
import java.io.IOException;

// Referenced classes of package com.fitbit.serverinteraction.c:
//            a

final class d
    implements Downloader
{

    d()
    {
    }

    private com.squareup.picasso.Downloader.Response a(Uri uri)
        throws ServerCommunicationException, IOException
    {
        String s = aj.a(uri.toString());
        Bitmap bitmap = (new l()).a(s);
        if (bitmap != null)
        {
            com.fitbit.e.a.a("FitbitPicasso", "(NETWORK): Returning loaded image: %s", new Object[] {
                s
            });
            com.fitbit.serverinteraction.c.a.a(uri.toString(), bitmap);
            return new com.squareup.picasso.Downloader.Response(bitmap, false, bitmap.getByteCount());
        } else
        {
            com.fitbit.e.a.a("FitbitPicasso", "(NETWORK): Returning cached image: %s", new Object[] {
                s
            });
            return b(uri);
        }
    }

    private com.squareup.picasso.Downloader.Response b(Uri uri)
    {
        uri = com.fitbit.serverinteraction.c.a.a(uri.toString());
        if (uri != null)
        {
            return new com.squareup.picasso.Downloader.Response(uri, true, uri.getByteCount());
        } else
        {
            return null;
        }
    }

    public com.squareup.picasso.Downloader.Response load(Uri uri, boolean flag)
        throws IOException
    {
        com.fitbit.e.a.a("FitbitPicasso", "(NETWORK): Loading image: %s", new Object[] {
            uri
        });
        if (flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        return a(uri);
        com.fitbit.e.a.a("FitbitPicasso", "(NETWORK): Returning cached image: %s", new Object[] {
            uri
        });
        uri = b(uri);
        return uri;
        uri;
        throw new IOException(uri);
    }
}
