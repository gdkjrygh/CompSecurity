// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, MarkableInputStream, Utils, Request, 
//            Downloader, Stats

final class NetworkRequestHandler extends RequestHandler
{

    private final Downloader downloader;
    private final Stats stats;

    public NetworkRequestHandler(Downloader downloader1, Stats stats1)
    {
        downloader = downloader1;
        stats = stats1;
    }

    private static Bitmap decodeStream(InputStream inputstream, Request request)
        throws IOException
    {
        InputStream inputstream1 = new MarkableInputStream(inputstream);
        long l = inputstream1.savePosition(0x10000);
        inputstream = createBitmapOptions(request);
        boolean flag = requiresInSampleSize(inputstream);
        boolean flag1 = Utils.isWebPFile(inputstream1);
        inputstream1.reset(l);
        if (flag1)
        {
            inputstream1 = Utils.toByteArray(inputstream1);
            if (flag)
            {
                BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
                calculateInSampleSize(request.targetWidth, request.targetHeight, inputstream, request);
            }
            inputstream = BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
        } else
        {
            if (flag)
            {
                BitmapFactory.decodeStream(inputstream1, null, inputstream);
                calculateInSampleSize(request.targetWidth, request.targetHeight, inputstream, request);
                inputstream1.reset(l);
            }
            request = BitmapFactory.decodeStream(inputstream1, null, inputstream);
            inputstream = request;
            if (request == null)
            {
                throw new IOException("Failed to decode stream.");
            }
        }
        return inputstream;
    }

    public final boolean canHandleRequest(Request request)
    {
        request = request.uri.getScheme();
        return "http".equals(request) || "https".equals(request);
    }

    final int getRetryCount()
    {
        return 2;
    }

    public final RequestHandler.Result load(Request request)
        throws IOException
    {
        Downloader.Response response = downloader.load(request.uri, request.loadFromLocalCacheOnly);
        if (response != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Picasso.LoadedFrom loadedfrom;
        Object obj;
        if (response.cached)
        {
            loadedfrom = Picasso.LoadedFrom.DISK;
        } else
        {
            loadedfrom = Picasso.LoadedFrom.NETWORK;
        }
        obj = response.getBitmap();
        if (obj != null)
        {
            return new RequestHandler.Result(((Bitmap) (obj)), loadedfrom);
        }
        obj = response.getInputStream();
        if (obj == null) goto _L1; else goto _L3
_L3:
        if (response.getContentLength() == 0L)
        {
            Utils.closeQuietly(((InputStream) (obj)));
            throw new IOException("Received response with 0 content-length header.");
        }
        if (loadedfrom == Picasso.LoadedFrom.NETWORK && response.getContentLength() > 0L)
        {
            stats.dispatchDownloadFinished(response.getContentLength());
        }
        request = new RequestHandler.Result(decodeStream(((InputStream) (obj)), request), loadedfrom);
        Utils.closeQuietly(((InputStream) (obj)));
        return request;
        request;
        Utils.closeQuietly(((InputStream) (obj)));
        throw request;
    }

    final boolean shouldRetry(boolean flag, NetworkInfo networkinfo)
    {
        return networkinfo == null || networkinfo.isConnected();
    }

    final boolean supportsReplay()
    {
        return true;
    }
}
