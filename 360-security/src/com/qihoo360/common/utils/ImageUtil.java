// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ImageUtil
{

    public ImageUtil()
    {
    }

    public static Bitmap getThumbFromBytes(byte abyte0[])
    {
        if (abyte0 != null)
        {
            try
            {
                abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return null;
            }
            if (abyte0 != null)
            {
                return abyte0;
            }
        }
        return null;
    }

    public static Bitmap getThumbnail(Bitmap bitmap, int i)
    {
        Object obj = null;
        Bitmap bitmap1 = obj;
        Bitmap bitmap2;
        int j;
        int k;
        int l;
        try
        {
            j = bitmap.getWidth();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return bitmap1;
        }
        bitmap1 = obj;
        k = bitmap.getHeight();
        bitmap1 = obj;
        l = Math.min(k, j);
        bitmap1 = obj;
        bitmap2 = Bitmap.createBitmap(bitmap, (j - l) / 2, (k - l) / 2, l, l);
        bitmap1 = obj;
        bitmap = Bitmap.createScaledBitmap(bitmap2, i, i, true);
        bitmap1 = bitmap;
        bitmap2.recycle();
        return bitmap;
    }
}
