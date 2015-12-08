// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;

public final class ahl
{

    public static byte[] a(Bitmap bitmap)
    {
        int j;
        j = 0;
        if (bitmap == null)
        {
            return null;
        }
        float f;
        float f1;
        Object obj;
        obj = new Matrix();
        f1 = 200F / (float)bitmap.getHeight();
        f = 200F / (float)bitmap.getWidth();
        if ((double)Math.abs(f1 - f) >= 9.9999999999999995E-08D) goto _L2; else goto _L1
_L1:
        f = 200F / (float)bitmap.getHeight();
        int i = 1;
          goto _L3
_L8:
        Bitmap bitmap1;
        Canvas canvas;
        try
        {
            ((Matrix) (obj)).postScale(f, f);
            obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), false);
        }
        catch (RuntimeException runtimeexception)
        {
            return b(bitmap);
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        return b(((Bitmap) (obj)));
        bitmap1 = Bitmap.createBitmap(200, 200, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        canvas.drawColor(0);
        if (((Bitmap) (obj)).getHeight() >= 200) goto _L5; else goto _L4
_L4:
        i = (200 - ((Bitmap) (obj)).getHeight()) / 2;
_L6:
        canvas.drawBitmap(((Bitmap) (obj)), j, i, null);
        return b(bitmap1);
_L5:
        if (((Bitmap) (obj)).getWidth() >= 200)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        j = (200 - ((Bitmap) (obj)).getWidth()) / 2;
        i = 0;
          goto _L6
        i = 0;
          goto _L6
_L2:
        i = 0;
_L3:
        if (f1 < f)
        {
            f = f1;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static byte[] b(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return new byte[0];
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream);
            return bytearrayoutputstream.toByteArray();
        }
    }
}
