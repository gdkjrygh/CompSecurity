// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class ImageUtil
{

    public ImageUtil()
    {
    }

    public static Bitmap convertPreviewToBitmap(byte abyte0[], Point point, int i, Rect rect)
    {
        point = new YuvImage(abyte0, i, point.x, point.y, null);
        abyte0 = new ByteArrayOutputStream();
        point.compressToJpeg(rect, 100, abyte0);
        point = new android.graphics.BitmapFactory.Options();
        point.inPurgeable = true;
        return BitmapFactory.decodeByteArray(abyte0.toByteArray(), 0, abyte0.size(), point);
    }

    private static byte[] convertPreviewToJPEG(byte abyte0[], Point point, int i, Rect rect, int j)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        (new YuvImage(abyte0, i, point.x, point.y, null)).compressToJpeg(rect, j, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static float getCardRectangleCornerRadius(float f)
    {
        return 0.0406F * f;
    }

    private static Bitmap nativeToBitmap(byte abyte0[])
    {
        ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
        bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        int l = bytebuffer.getInt();
        int k = bytebuffer.getInt();
        int i = bytebuffer.getInt();
        l /= i;
        int i1 = l * k;
        int j1 = i1 * 3 + 12;
        boolean flag;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Expected exactly three channels in image conversion");
        if (abyte0.length == j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Expected image to be of size %s, but image data was of size %s", new Object[] {
            Integer.valueOf(j1), Integer.valueOf(abyte0.length)
        });
        abyte0 = new int[i1];
        for (int j = 0; j < i1; j++)
        {
            abyte0[j] = 0xff000000 | bytebuffer.get() & 0xff | (bytebuffer.get() & 0xff) << 8 | (bytebuffer.get() & 0xff) << 16;
        }

        return Bitmap.createBitmap(abyte0, l, k, android.graphics.Bitmap.Config.RGB_565);
    }

    public static Rect rotate90(Rect rect, Point point)
    {
        return new Rect(point.y - rect.bottom, rect.left, point.y - rect.top, rect.right);
    }

    public static Point rotatePointByImageOrientation(Point point, OcrImage ocrimage)
    {
        int ai[];
        int i;
        boolean flag;
        if (ocrimage.getOrientation() % 90 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "orientation must be a multiple of 90");
        i = ocrimage.getOrientation() / 90;
        ai = new int[4];
        ai[0] = point.x;
        ai[1] = point.y;
        ai[2] = ocrimage.getWidth() - point.x;
        ai[3] = ocrimage.getHeight() - point.y;
        return new Point(ai[(4 - i) % 4], ai[((4 - i) + 1) % 4]);
    }

    private static String save(byte abyte0[], String s, String s1)
        throws IOException
    {
        String s2;
        s = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), s);
        if (!s.exists() && !s.mkdirs())
        {
            throw new IOException(String.format("Failed to create directory %s", new Object[] {
                s.getPath()
            }));
        }
        s2 = String.format("%s%s%s.jpg", new Object[] {
            s.getPath(), File.separator, s1
        });
        s = new File(s2);
        s1 = null;
        s = new FileOutputStream(s);
        s.write(abyte0);
        s.close();
        return s2;
        s;
        abyte0 = s1;
_L2:
        if (abyte0 != null)
        {
            abyte0.close();
        }
        throw s;
        s1;
        abyte0 = s;
        s = s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final byte[] getCroppedRotatedJPEG(OcrImage ocrimage, Rect rect, int i, int j)
    {
        byte abyte0[];
        Bitmap bitmap;
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (ocrimage.getFormat() != 256)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Input cannot be JPEG");
        abyte0 = convertPreviewToJPEG((byte[])ocrimage.getData().clone(), ocrimage.getResolution(), ocrimage.getFormat(), rect, 100);
        ocrimage = new Matrix();
        ocrimage.setRotate(j);
        options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        ocrimage = Bitmap.createBitmap(bitmap, 0, 0, rect.width(), rect.height(), ocrimage, true);
        if (android.os.Build.VERSION.SDK_INT <= 9)
        {
            bitmap.recycle();
        }
        rect = new ByteArrayOutputStream();
        ocrimage.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, rect);
        if (android.os.Build.VERSION.SDK_INT <= 9)
        {
            ocrimage.recycle();
        }
        return rect.toByteArray();
    }

    public final Bitmap getRoundedCornerBitmap(Bitmap bitmap)
    {
        Object obj = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(((android.graphics.Shader) (obj)));
        obj = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        float f = getCardRectangleCornerRadius(bitmap.getWidth());
        canvas.drawRoundRect(((RectF) (obj)), f, f, paint);
        return bitmap1;
    }

    public final Bitmap getRoundedCornerBitmap(byte abyte0[])
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        return getRoundedCornerBitmap(BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options));
    }

    public final byte[] nativeToJpeg(byte abyte0[], int i)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        nativeToBitmap(abyte0).compress(android.graphics.Bitmap.CompressFormat.JPEG, i, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public final String saveDebugImage(byte abyte0[], String s)
        throws IOException
    {
        String s1 = (new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US)).format(new Date());
        if (TextUtils.isEmpty(s))
        {
            s = s1;
        } else
        {
            s = String.valueOf(s);
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
        }
        return save(abyte0, "debug", s);
    }
}
