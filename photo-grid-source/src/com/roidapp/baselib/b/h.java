// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class h
{

    private static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int l = 1;
        boolean flag = true;
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        if (i1 > j || j1 > i)
        {
            float f;
            float f1;
            int k;
            if (j1 > i1)
            {
                k = Math.round((float)i1 / (float)j);
            } else
            {
                k = Math.round((float)j1 / (float)i);
            }
            if (k == 0)
            {
                k = ((flag) ? 1 : 0);
            }
            f = j1 * i1;
            f1 = i * j * 2;
            do
            {
                l = k;
                if (f / (float)(k * k) <= f1)
                {
                    break;
                }
                k++;
            } while (true);
        }
        return l;
    }

    public static Bitmap a(String s, int i, int j)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        options.inSampleSize = a(options, i, j);
        options.inJustDecodeBounds = false;
        try
        {
            s = BitmapFactory.decodeFile(s, options);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
