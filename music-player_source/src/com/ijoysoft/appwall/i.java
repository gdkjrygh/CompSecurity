// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class i
{

    public static Bitmap a(byte abyte0[])
    {
        int j;
        int k;
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
            j = options.outWidth / 200;
            k = options.outHeight / 200;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        if (j <= k)
        {
            j = k;
        }
        abyte0 = a(abyte0, j);
        return abyte0;
    }

    private static Bitmap a(byte abyte0[], int j)
    {
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = j;
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }
}
