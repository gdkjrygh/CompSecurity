// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class c
{

    private static int a(android.graphics.BitmapFactory.Options options, int i)
    {
        int k = 1;
        double d = options.outWidth;
        double d1 = options.outHeight;
        int j;
        if (i == -1)
        {
            j = 128;
        } else
        {
            j = (int)Math.min(Math.floor(d / (double)i), Math.floor(d1 / (double)i));
        }
        if (j <= 0)
        {
            j = 1;
        } else
        if (i == -1)
        {
            j = 1;
        } else
        if (i == -1)
        {
            j = 1;
        }
        if (j <= 8)
        {
            i = k;
            do
            {
                k = i;
                if (i >= j)
                {
                    break;
                }
                i <<= 1;
            } while (true);
        } else
        {
            k = ((j + 7) / 8) * 8;
        }
        return k;
    }

    public static Bitmap a(String s, int i)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        Object obj = new FileInputStream(s);
        Object obj1 = obj;
        BitmapFactory.decodeStream(((InputStream) (obj)), null, options);
        obj1 = obj;
        ((InputStream) (obj)).close();
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = a(options, i);
        s = new FileInputStream(s);
        obj = s;
        obj1 = BitmapFactory.decodeStream(s, null, options);
        obj = s;
        s.close();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return ((Bitmap) (obj1));
        s;
        obj = null;
_L17:
        obj1 = obj;
        s.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            return null;
        }
          goto _L1
        s;
        obj = null;
_L16:
        obj1 = obj;
        s.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            return null;
        }
          goto _L1
        s;
        obj = null;
_L15:
        obj1 = obj;
        s.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            return null;
        }
          goto _L1
        s;
        obj = null;
_L14:
        obj1 = obj;
        s.printStackTrace();
        if (obj == null) goto _L1; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        s;
        obj1 = null;
_L13:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        throw s;
        s;
_L11:
        s.printStackTrace();
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        Object obj2;
        obj2;
        s = ((String) (obj));
_L9:
        obj = s;
        ((IOException) (obj2)).printStackTrace();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        obj2;
        s = ((String) (obj));
_L7:
        obj = s;
        ((NullPointerException) (obj2)).printStackTrace();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        s;
_L5:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
        if (true) goto _L9; else goto _L8
_L8:
        obj2;
        obj = s;
        s = ((String) (obj2));
        if (true) goto _L11; else goto _L10
_L10:
        s;
        if (true) goto _L13; else goto _L12
_L12:
        s;
          goto _L14
        s;
          goto _L15
        s;
          goto _L16
        s;
          goto _L17
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }
}
