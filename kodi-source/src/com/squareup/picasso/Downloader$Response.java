// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            Downloader

public static class contentLength
{

    final Bitmap bitmap;
    final boolean cached;
    final long contentLength;
    final InputStream stream;

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public long getContentLength()
    {
        return contentLength;
    }

    public InputStream getInputStream()
    {
        return stream;
    }

    public (InputStream inputstream, boolean flag, long l)
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
