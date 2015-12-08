// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface Downloader
{
    public static final class Response
    {

        final Bitmap bitmap;
        final boolean cached;
        final long contentLength;
        final InputStream stream;

        public final Bitmap getBitmap()
        {
            return bitmap;
        }

        public final long getContentLength()
        {
            return contentLength;
        }

        public final InputStream getInputStream()
        {
            return stream;
        }

        public Response(InputStream inputstream, boolean flag, long l)
        {
            if (inputstream == null)
            {
                throw new IllegalArgumentException("Stream may not be null.");
            } else
            {
                stream = inputstream;
                bitmap = null;
                cached = flag;
                contentLength = l;
                return;
            }
        }
    }

    public static final class ResponseException extends IOException
    {

        public ResponseException(String s)
        {
            super(s);
        }
    }


    public abstract Response load(Uri uri, boolean flag)
        throws IOException;
}
