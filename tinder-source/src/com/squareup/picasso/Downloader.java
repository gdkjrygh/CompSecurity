// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            NetworkPolicy

public interface Downloader
{
    public static class ResponseException extends IOException
    {

        final boolean a;
        final int b;

        public ResponseException(String s, int i, int j)
        {
            super(s);
            a = NetworkPolicy.c(i);
            b = j;
        }
    }

    public static final class a
    {

        final InputStream a;
        final Bitmap b;
        final boolean c;
        final long d;

        public a(InputStream inputstream, boolean flag, long l)
        {
            if (inputstream == null)
            {
                throw new IllegalArgumentException("Stream may not be null.");
            } else
            {
                a = inputstream;
                b = null;
                c = flag;
                d = l;
                return;
            }
        }
    }


    public abstract a a(Uri uri, int i)
        throws IOException;
}
