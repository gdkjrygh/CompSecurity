// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;
import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Request, Downloader, Utils, 
//            Stats

class NetworkRequestHandler extends RequestHandler
{
    static class ContentLengthException extends IOException
    {

        public ContentLengthException(String s)
        {
            super(s);
        }
    }


    static final int RETRY_COUNT = 2;
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    public NetworkRequestHandler(Downloader downloader1, Stats stats1)
    {
        downloader = downloader1;
        stats = stats1;
    }

    public boolean canHandleRequest(Request request)
    {
        request = request.uri.getScheme();
        return "http".equals(request) || "https".equals(request);
    }

    int getRetryCount()
    {
        return 2;
    }

    public RequestHandler.Result load(Request request, int i)
        throws IOException
    {
        Downloader.Response response = downloader.load(request.uri, request.networkPolicy);
        if (response != null)
        {
            Object obj;
            if (response.cached)
            {
                request = Picasso.LoadedFrom.DISK;
            } else
            {
                request = Picasso.LoadedFrom.NETWORK;
            }
            obj = response.getBitmap();
            if (obj != null)
            {
                return new RequestHandler.Result(((android.graphics.Bitmap) (obj)), request);
            }
            obj = response.getInputStream();
            if (obj != null)
            {
                if (request == Picasso.LoadedFrom.DISK && response.getContentLength() == 0L)
                {
                    Utils.closeQuietly(((java.io.InputStream) (obj)));
                    throw new ContentLengthException("Received response with 0 content-length header.");
                }
                if (request == Picasso.LoadedFrom.NETWORK && response.getContentLength() > 0L)
                {
                    stats.dispatchDownloadFinished(response.getContentLength());
                }
                return new RequestHandler.Result(((java.io.InputStream) (obj)), request);
            }
        }
        return null;
    }

    boolean shouldRetry(boolean flag, NetworkInfo networkinfo)
    {
        return networkinfo == null || networkinfo.isConnected();
    }

    boolean supportsReplay()
    {
        return true;
    }
}
