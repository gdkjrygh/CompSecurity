// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.b;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.IOException;

public final class e
{

    private static int a(String s)
    {
        int i = (new ExifInterface(s)).getAttributeInt("Orientation", 1);
        i;
        JVM INSTR tableswitch 3 8: default 56
    //                   3 61
    //                   4 56
    //                   5 56
    //                   6 58
    //                   7 56
    //                   8 65;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4
_L1:
        return 0;
_L3:
        return 90;
_L2:
        return 180;
_L4:
        return 270;
        s;
        s.printStackTrace();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static Bitmap a(Bitmap bitmap, String s)
    {
        int i;
        i = 0;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        Bitmap bitmap1;
        if (bitmap.isRecycled())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        bitmap1 = bitmap;
        if (android.os.Build.VERSION.SDK_INT <= 5)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (s.length() > 0)
        {
            i = a(s);
        }
        bitmap1 = bitmap;
        if (i > 0)
        {
            try
            {
                s = new Matrix();
                s.setRotate(i);
                s = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), s, false);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return bitmap;
            }
            return s;
        }
        break MISSING_BLOCK_LABEL_85;
        bitmap1 = null;
        return bitmap1;
    }
}
