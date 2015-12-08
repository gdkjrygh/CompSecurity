// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.o;

public class aj
{

    public aj()
    {
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        int l = 1;
        int k = 1;
        if (i1 > j || j1 > i)
        {
            i1 /= 2;
            j1 /= 2;
            do
            {
                l = k;
                if (i1 / k <= j)
                {
                    break;
                }
                l = k;
                if (j1 / k <= i)
                {
                    break;
                }
                k *= 2;
            } while (true);
        }
        return l;
    }

    public static Bitmap a(Resources resources, int i, int j, int k)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = a(options, j, k);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static String a(String s)
    {
        String s1;
label0:
        {
            s1 = s;
            if (!s.startsWith("http"))
            {
                s1 = ServerGateway.a().c().c();
                if (!s.startsWith("/"))
                {
                    break label0;
                }
                s1 = (new StringBuilder()).append(s1).append(s).toString();
            }
            return s1;
        }
        return (new StringBuilder()).append(s1).append("/").append(s).toString();
    }
}
