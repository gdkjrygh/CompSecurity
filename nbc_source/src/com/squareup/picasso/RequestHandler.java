// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            Request, Utils

public abstract class RequestHandler
{
    public static final class Result
    {

        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final InputStream stream;

        public Bitmap getBitmap()
        {
            return bitmap;
        }

        int getExifOrientation()
        {
            return exifOrientation;
        }

        public Picasso.LoadedFrom getLoadedFrom()
        {
            return loadedFrom;
        }

        public InputStream getStream()
        {
            return stream;
        }

        public Result(Bitmap bitmap1, Picasso.LoadedFrom loadedfrom)
        {
            this((Bitmap)Utils.checkNotNull(bitmap1, "bitmap == null"), null, loadedfrom, 0);
        }

        Result(Bitmap bitmap1, InputStream inputstream, Picasso.LoadedFrom loadedfrom, int i)
        {
            boolean flag1 = true;
            super();
            boolean flag;
            if (bitmap1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (inputstream == null)
            {
                flag1 = false;
            }
            if (!(flag1 ^ flag))
            {
                throw new AssertionError();
            } else
            {
                bitmap = bitmap1;
                stream = inputstream;
                loadedFrom = (Picasso.LoadedFrom)Utils.checkNotNull(loadedfrom, "loadedFrom == null");
                exifOrientation = i;
                return;
            }
        }

        public Result(InputStream inputstream, Picasso.LoadedFrom loadedfrom)
        {
            this(null, (InputStream)Utils.checkNotNull(inputstream, "stream == null"), loadedfrom, 0);
        }
    }


    public RequestHandler()
    {
    }

    static void calculateInSampleSize(int i, int j, int k, int l, android.graphics.BitmapFactory.Options options, Request request)
    {
        int i1 = 1;
        if (l > j || k > i)
        {
            if (j == 0)
            {
                i1 = (int)Math.floor((float)k / (float)i);
            } else
            if (i == 0)
            {
                i1 = (int)Math.floor((float)l / (float)j);
            } else
            {
                j = (int)Math.floor((float)l / (float)j);
                i = (int)Math.floor((float)k / (float)i);
                if (request.centerInside)
                {
                    i1 = Math.max(j, i);
                } else
                {
                    i1 = Math.min(j, i);
                }
            }
        }
        options.inSampleSize = i1;
        options.inJustDecodeBounds = false;
    }

    static void calculateInSampleSize(int i, int j, android.graphics.BitmapFactory.Options options, Request request)
    {
        calculateInSampleSize(i, j, options.outWidth, options.outHeight, options, request);
    }

    static android.graphics.BitmapFactory.Options createBitmapOptions(Request request)
    {
        boolean flag1 = request.hasSize();
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (request.config != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        options = null;
        if (flag1 || flag)
        {
            android.graphics.BitmapFactory.Options options1 = new android.graphics.BitmapFactory.Options();
            options1.inJustDecodeBounds = flag1;
            options = options1;
            if (flag)
            {
                options1.inPreferredConfig = request.config;
                options = options1;
            }
        }
        return options;
    }

    static boolean requiresInSampleSize(android.graphics.BitmapFactory.Options options)
    {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(Request request);

    int getRetryCount()
    {
        return 0;
    }

    public abstract Result load(Request request, int i)
        throws IOException;

    boolean shouldRetry(boolean flag, NetworkInfo networkinfo)
    {
        return false;
    }

    boolean supportsReplay()
    {
        return false;
    }
}
