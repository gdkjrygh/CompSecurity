// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.arist.util:
//            Constant

public class BitmapService
{

    public BitmapService()
    {
    }

    public static void copyBitmap(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            if ((s = getBitmap(s)) != null)
            {
                save(s, s1);
                return;
            }
        }
    }

    public static void copyCachBmp(String s)
    {
        s = s.replace(".mp3", ".jpg");
        copyBitmap((new StringBuilder(String.valueOf(Constant.BASE_ABLUM_CACHES_PATH))).append(s).toString(), (new StringBuilder(String.valueOf(Constant.BASE_ABLUM_PATH))).append(s).toString());
    }

    public static Bitmap getBitmap(Resources resources, int i, int j, int k)
    {
        android.graphics.BitmapFactory.Options options;
        try
        {
            options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, i, options);
            j = options.outWidth / j;
            k = options.outHeight / k;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            return null;
        }
        if (j <= k)
        {
            j = k;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = j;
        resources = BitmapFactory.decodeResource(resources, i, options);
        return resources;
    }

    public static Bitmap getBitmap(String s)
    {
        return BitmapFactory.decodeFile(s);
    }

    public static Bitmap getBitmap(String s, int i)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = i;
        return BitmapFactory.decodeFile(s, options);
    }

    public static Bitmap getBitmap(String s, int i, int j)
    {
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(s, options);
            i = options.outWidth / i;
            j = options.outHeight / j;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (i <= j)
        {
            i = j;
        }
        s = getBitmap(s, i);
        return s;
    }

    public static Bitmap getBitmap(byte abyte0[])
    {
        return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
    }

    public static Bitmap getBitmap(byte abyte0[], int i)
    {
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = i;
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public static Bitmap getBitmap(byte abyte0[], int i, int j)
    {
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
            i = options.outWidth / i;
            j = options.outHeight / j;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        if (i <= j)
        {
            i = j;
        }
        abyte0 = getBitmap(abyte0, i);
        return abyte0;
    }

    public static Bitmap readBitMap(Resources resources, int i)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeStream(resources.openRawResource(i), null, options);
    }

    public static void save(Bitmap bitmap, String s)
    {
        s = new File(s);
        if (s.exists())
        {
            return;
        }
        try
        {
            if (!s.getParentFile().exists())
            {
                s.getParentFile().mkdirs();
            }
            if (!s.exists())
            {
                s.createNewFile();
            }
            s = new FileOutputStream(s);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, s);
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
        }
        return;
    }
}
