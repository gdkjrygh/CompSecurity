// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class BitmapUtil
{

    public BitmapUtil()
    {
    }

    public static void createScaledImage(String s, String s1, int i, int j)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        int k = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        int i1 = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        j = i;
        if (i > k)
        {
            j = k;
        }
        i = 1;
        int l = k;
        k = i1;
        do
        {
            if (l / 2 <= j)
            {
                float f = (float)j / (float)l;
                obj.inJustDecodeBounds = false;
                obj.inDither = false;
                obj.inSampleSize = i;
                obj.inScaled = false;
                obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                s = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
                obj = new Matrix();
                ((Matrix) (obj)).postScale(f, f);
                s = Bitmap.createBitmap(s, 0, 0, s.getWidth(), s.getHeight(), ((Matrix) (obj)), true);
                try
                {
                    s1 = new FileOutputStream(s1);
                    s.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, s1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                }
                break;
            }
            l /= 2;
            k /= 2;
            i *= 2;
        } while (true);
    }

    public static Bitmap cropToSquare(Bitmap bitmap)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap != null)
        {
            if (bitmap.getWidth() > bitmap.getHeight())
            {
                bitmap1 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getHeight(), bitmap.getHeight());
            } else
            {
                bitmap1 = bitmap;
                if (bitmap.getWidth() < bitmap.getHeight())
                {
                    return Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getWidth());
                }
            }
        }
        return bitmap1;
    }

    public static Bitmap decodeFile(File file, int i, boolean flag)
    {
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new FileInputStream(file), null, options);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        int k;
        int l;
        l = options.outWidth;
        k = options.outHeight;
        int j = 1;
_L2:
        if (l / 2 >= i && k / 2 >= i)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = j;
        options.inScaled = true;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        return cropToSquare(BitmapFactory.decodeFile(file.getAbsolutePath(), options));
        l /= 2;
        k /= 2;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        file = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return file;
        file;
        file.printStackTrace();
        return null;
    }

    public static Bitmap decodeFile(String s, int i, boolean flag)
    {
        return decodeFile(new File(s), i, flag);
    }

    public static Bitmap getThumbnail(ContentResolver contentresolver, long l)
    {
        Cursor cursor = contentresolver.query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_data"
        }, "_id=?", new String[] {
            String.valueOf(l)
        }, null);
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        String s;
        boolean flag;
        cursor.moveToFirst();
        s = cursor.getString(0);
        cursor.close();
        flag = false;
        int j = (new ExifInterface(s)).getAttributeInt("Orientation", 0);
        int i = ((flag) ? 1 : 0);
        if (j == 0) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
        j;
        JVM INSTR tableswitch 3 8: default 140
    //                   3 193
    //                   4 144
    //                   5 144
    //                   6 209
    //                   7 144
    //                   8 201;
           goto _L5 _L6 _L7 _L7 _L8 _L7 _L9
_L7:
        break; /* Loop/switch isn't completed */
_L5:
        i = ((flag) ? 1 : 0);
_L4:
        Bitmap bitmap = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentresolver, l, 1, null);
        contentresolver = bitmap;
        if (i != 0)
        {
            contentresolver = new Matrix();
            contentresolver.setRotate(i);
            contentresolver = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), contentresolver, true);
        }
        return contentresolver;
_L6:
        i = 180;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 270;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 90;
        continue; /* Loop/switch isn't completed */
_L2:
        return null;
        IOException ioexception;
        ioexception;
        i = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L10
_L10:
    }
}
