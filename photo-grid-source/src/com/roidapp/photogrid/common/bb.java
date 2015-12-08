// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import com.roidapp.photogrid.release.rf;
import java.io.IOException;

public final class bb
{

    public static int a(String s)
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
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        Bitmap bitmap1;
        if (bitmap.isRecycled())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        bitmap1 = bitmap;
        if (android.os.Build.VERSION.SDK_INT <= 5)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        int i = 0;
        try
        {
            if (s.length() > 0)
            {
                i = a(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return bitmap;
        }
        bitmap1 = bitmap;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        rf.a();
        s = rf.a(bitmap, i);
        return s;
        bitmap1 = null;
        return bitmap1;
    }
}
