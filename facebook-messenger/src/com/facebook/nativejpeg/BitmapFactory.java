// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nativejpeg;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.facebook.nativejpeg:
//            b, a

public class BitmapFactory
{

    private static boolean a = true;

    public BitmapFactory()
    {
    }

    private static Bitmap a(InputStream inputstream, Rect rect, b b1, String s)
    {
        b b2;
        b2 = b1;
        if (b1 == null)
        {
            b2 = new b();
        }
        if (!b2.inJustDecodeBounds) goto _L2; else goto _L1
_L1:
        b(s, rect, b2);
        rect = null;
_L8:
        return rect;
_L2:
        BufferedInputStream bufferedinputstream;
        byte abyte0[];
        int k;
        int l;
        byte byte1;
        b1 = null;
        k = -1;
        l = -1;
        byte1 = 0;
        bufferedinputstream = new BufferedInputStream(inputstream, 4096);
        abyte0 = new byte[128];
        int i;
        try
        {
            bufferedinputstream.mark(128);
            i = bufferedinputstream.read(abyte0, 0, 128);
            bufferedinputstream.reset();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            i = -1;
        }
        if (i <= 0)
        {
            return null;
        }
        if (b2 != null)
        {
            k = b2.a;
            l = b2.b;
            byte byte0;
            if (b2.e)
            {
                byte0 = 2;
            } else
            if (b2.d)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            b1 = b2.i;
            byte1 = byte0;
        }
        s = a.UNKNOWN;
        if (abyte0[0] != -1 || abyte0[1] != -40 || abyte0[2] != -1) goto _L4; else goto _L3
_L3:
        inputstream = a.JPEG;
_L6:
        if (!a || !b2.f || inputstream != a.JPEG)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        if (b2.g != null)
        {
            native_transcodeStream(bufferedinputstream, b2.g, k, l, byte1, b2.h);
            return null;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (abyte0[0] == -119 && abyte0[1] == 80 && abyte0[2] == 78 && abyte0[3] == 71 && abyte0[4] == 13 && abyte0[5] == 10 && abyte0[6] == 26 && abyte0[7] == 10)
        {
            inputstream = a.PNG;
            continue; /* Loop/switch isn't completed */
        }
        inputstream = s;
        if (abyte0[0] != 71)
        {
            continue; /* Loop/switch isn't completed */
        }
        inputstream = s;
        if (abyte0[1] != 73)
        {
            continue; /* Loop/switch isn't completed */
        }
        inputstream = s;
        if (abyte0[2] != 70)
        {
            continue; /* Loop/switch isn't completed */
        }
        inputstream = s;
        if (abyte0[3] != 56)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (abyte0[4] != 55)
        {
            inputstream = s;
            if (abyte0[4] != 57)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        inputstream = s;
        if (abyte0[5] == 97)
        {
            inputstream = a.GIF;
        }
        if (true) goto _L6; else goto _L5
_L5:
        int j;
        inputstream = native_decodeStream(bufferedinputstream, b1, k, l, byte1);
        float f;
        float f1;
        int i1;
        if (inputstream != null)
        {
            j = 0;
        } else
        {
            j = 1;
        }
_L11:
        if (j != 0)
        {
            inputstream = new android.graphics.Options();
            if (b2.inJustDecodeBounds)
            {
                bufferedinputstream.mark(4096);
                android.graphics.BitmapFactory.decodeStream(bufferedinputstream, null, b2);
            } else
            {
                inputstream.inSampleSize = 1;
            }
            rect = android.graphics.BitmapFactory.decodeStream(bufferedinputstream, rect, inputstream);
            inputstream = rect;
            if (b2.g != null)
            {
                rect.compress(android.graphics.Bitmap.CompressFormat.JPEG, b2.h, b2.g);
                inputstream = rect;
            }
        }
        rect = inputstream;
        if (inputstream == null) goto _L8; else goto _L7
_L7:
        if (k > 0 && inputstream.getWidth() > k)
        {
            break; /* Loop/switch isn't completed */
        }
        rect = inputstream;
        if (k <= 0) goto _L8; else goto _L9
_L9:
        rect = inputstream;
        if (inputstream.getWidth() <= k) goto _L8; else goto _L10
_L10:
        j = inputstream.getWidth();
        i1 = inputstream.getHeight();
        if (a)
        {
            return native_copyBitmap(inputstream, b2.i, k, l, byte1);
        } else
        {
            f = (float)k / (float)j;
            f1 = (float)l / (float)i1;
            rect = new Matrix();
            rect.postScale(f, f1);
            return Bitmap.createBitmap(inputstream, 0, 0, j, i1, rect, true);
        }
        j = 1;
        inputstream = null;
          goto _L11
    }

    public static Bitmap a(String s, Rect rect, b b1)
    {
        Object obj = null;
        FileInputStream fileinputstream = new FileInputStream(new File(s));
        s = a(((InputStream) (fileinputstream)), rect, b1, s);
        rect = s;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect)
            {
                return s;
            }
            rect = s;
        }
        return rect;
        s;
        fileinputstream = null;
_L4:
        rect = obj;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_39;
        }
        s;
        fileinputstream = null;
_L2:
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect) { }
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Bitmap a(String s, b b1)
    {
        return a(s, null, b1);
    }

    private static void b(String s, Rect rect, b b1)
    {
        try
        {
            s = new FileInputStream(s);
            android.graphics.Options options = new android.graphics.Options();
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeStream(s, rect, options);
            b1.outWidth = options.outWidth;
            b1.outHeight = options.outHeight;
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private static native Bitmap native_copyBitmap(Bitmap bitmap, Bitmap bitmap1, int i, int j, int k);

    private static native Bitmap native_decodeByteArray(byte abyte0[], int i, int j, Bitmap bitmap, int k, int l, int i1);

    private static native Bitmap native_decodeFile(String s, Bitmap bitmap, int i, int j, int k);

    private static native Bitmap native_decodeStream(InputStream inputstream, Bitmap bitmap, int i, int j, int k);

    private static native int native_transcodeStream(InputStream inputstream, OutputStream outputstream, int i, int j, int k, int l);

}
