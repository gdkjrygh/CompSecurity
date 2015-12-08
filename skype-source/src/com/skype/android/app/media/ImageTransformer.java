// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

public class ImageTransformer
{

    private static final int COMPRESS_QUALITY = 80;
    private static final int IMAGE_SIDE_LENGTH = 800;
    private static final Logger log = Logger.getLogger("ImageTransformer");

    public ImageTransformer()
    {
    }

    private int calculateSampleSize(android.graphics.BitmapFactory.Options options)
    {
        int j = options.outWidth;
        int k = options.outHeight;
        int i = 1;
        do
        {
            if (j <= 800 && k <= 800)
            {
                break;
            }
            k /= 2;
            j /= 2;
            if (k <= 800 && j <= 800)
            {
                break;
            }
            i *= 2;
        } while (true);
        return i;
    }

    public static Bitmap cropToSquare(Bitmap bitmap)
    {
        Bitmap bitmap1 = null;
        int k = 0;
        int l = 0;
        int j = bitmap.getWidth();
        int i = bitmap.getHeight();
        if (j != i)
        {
            if (j > i)
            {
                k = (j - i) / 2;
                j = i;
            } else
            {
                l = (i - j) / 2;
                i = j;
            }
            bitmap1 = Bitmap.createBitmap(bitmap, k, l, j, i);
        }
        if (bitmap1 != null)
        {
            return bitmap1;
        } else
        {
            return bitmap;
        }
    }

    public static float getOrientationDegrees(String s)
    {
        int i = 1;
        int j = (new ExifInterface(s)).getAttributeInt("Orientation", 1);
        i = j;
_L1:
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0.0F;

        case 6: // '\006'
            return 90F;

        case 3: // '\003'
            return 180F;

        case 8: // '\b'
            return 270F;
        }
        s;
        s.printStackTrace();
          goto _L1
    }

    public String saveBitmap(File file, Bitmap bitmap)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj2 = null;
        obj1 = null;
        obj = obj2;
        String s = File.createTempFile("tmp", ".jpg", file).getAbsolutePath();
        obj = obj2;
        file = new BufferedOutputStream(new FileOutputStream(s), 16384);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, file);
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return s;
        }
        obj = s;
        return ((String) (obj));
        bitmap;
        file = obj1;
_L4:
        obj = file;
        log.warning("Can't save transformed image");
        obj = file;
        bitmap.printStackTrace();
        obj = null;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_69;
        }
        file;
_L2:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap) { }
        }
        throw file;
        bitmap;
        obj = file;
        file = bitmap;
        if (true) goto _L2; else goto _L1
_L1:
        bitmap;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Bitmap scaleAndRotate(Bitmap bitmap, int i, float f)
    {
        if (bitmap == null)
        {
            return null;
        }
        int l = bitmap.getWidth();
        int i1 = bitmap.getHeight();
        int k = l;
        int j = i1;
        if (l > i || i1 > i)
        {
            float f1 = (float)l / (float)i1;
            Matrix matrix;
            if (l > i1)
            {
                k = i;
                j = (int)((float)i / f1);
            } else
            {
                k = (int)((float)i * f1);
                j = i;
            }
        }
        matrix = new Matrix();
        matrix.reset();
        matrix.preRotate(f, (int)((float)l / 2.0F), (int)((float)i1 / 2.0F));
        matrix.preScale((float)k / (float)l, (float)j / (float)i1);
        return Bitmap.createBitmap(bitmap, 0, 0, l, i1, matrix, true);
    }

    public Bitmap transform(String s)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        int i = calculateSampleSize(((android.graphics.BitmapFactory.Options) (obj)));
        obj = new android.graphics.BitmapFactory.Options();
        obj.inSampleSize = i;
        Bitmap bitmap = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        obj = null;
        if (bitmap != null)
        {
            s = scaleAndRotate(bitmap, 800, getOrientationDegrees(s));
            obj = s;
            if (s != bitmap)
            {
                bitmap.recycle();
                obj = s;
            }
        }
        return ((Bitmap) (obj));
    }

}
