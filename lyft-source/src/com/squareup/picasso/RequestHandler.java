// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;

// Referenced classes of package com.squareup.picasso:
//            Request

public abstract class RequestHandler
{

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

    public abstract Result load(Request request, int i);

    boolean shouldRetry(boolean flag, NetworkInfo networkinfo)
    {
        return false;
    }

    boolean supportsReplay()
    {
        return false;
    }
}
