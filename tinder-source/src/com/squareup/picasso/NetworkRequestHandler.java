// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            t, r, Downloader, ab, 
//            v

final class NetworkRequestHandler extends t
{
    static class ContentLengthException extends IOException
    {

        public ContentLengthException(String s)
        {
            super(s);
        }
    }


    private final Downloader a;
    private final v b;

    public NetworkRequestHandler(Downloader downloader, v v1)
    {
        a = downloader;
        b = v1;
    }

    final int a()
    {
        return 2;
    }

    final boolean a(NetworkInfo networkinfo)
    {
        return networkinfo == null || networkinfo.isConnected();
    }

    public final boolean a(r r1)
    {
        r1 = r1.d.getScheme();
        return "http".equals(r1) || "https".equals(r1);
    }

    public final t.a b(r r1)
        throws IOException
    {
        Downloader.a a1 = a.a(r1.d, r1.c);
        Object obj;
        if (a1.c)
        {
            r1 = Picasso.LoadedFrom.b;
        } else
        {
            r1 = Picasso.LoadedFrom.c;
        }
        obj = a1.b;
        if (obj != null)
        {
            return new t.a(((android.graphics.Bitmap) (obj)), r1);
        }
        obj = a1.a;
        if (obj == null)
        {
            return null;
        }
        if (r1 == Picasso.LoadedFrom.b && a1.d == 0L)
        {
            ab.a(((java.io.InputStream) (obj)));
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (r1 == Picasso.LoadedFrom.c && a1.d > 0L)
        {
            v v1 = b;
            long l = a1.d;
            v1.c.sendMessage(v1.c.obtainMessage(4, Long.valueOf(l)));
        }
        return new t.a(((java.io.InputStream) (obj)), r1);
    }

    final boolean b()
    {
        return true;
    }
}
