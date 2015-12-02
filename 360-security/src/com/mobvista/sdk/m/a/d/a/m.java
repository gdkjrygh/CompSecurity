// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

public final class m
{

    private static int a(byte abyte0[], int i)
    {
        return abyte0[i + 0] | (abyte0[i + 1] << 8 | abyte0[i + 2] << 16 | abyte0[i + 3] << 24);
    }

    private static Bitmap a(InputStream inputstream)
    {
        Object obj = BitmapFactory.decodeStream(inputstream);
        inputstream = a(((Bitmap) (obj)));
        if (NinePatch.isNinePatchChunk(inputstream))
        {
            Bitmap bitmap = Bitmap.createBitmap(((Bitmap) (obj)), 1, 1, ((Bitmap) (obj)).getWidth() - 2, ((Bitmap) (obj)).getHeight() - 2);
            ((Bitmap) (obj)).recycle();
            obj = bitmap.getClass().getDeclaredField("mNinePatchChunk");
            ((Field) (obj)).setAccessible(true);
            ((Field) (obj)).set(bitmap, inputstream);
            return bitmap;
        } else
        {
            return ((Bitmap) (obj));
        }
    }

    public static Drawable a(Context context, InputStream inputstream)
    {
        inputstream = a(inputstream);
        if (inputstream.getNinePatchChunk() == null)
        {
            return new BitmapDrawable(context.getResources(), inputstream);
        } else
        {
            Rect rect = new Rect();
            a(inputstream.getNinePatchChunk(), rect);
            return new NinePatchDrawable(context.getResources(), inputstream, inputstream.getNinePatchChunk(), rect, null);
        }
    }

    private static void a(Bitmap bitmap, byte abyte0[])
    {
        int ai[];
        int i;
        boolean flag;
        flag = false;
        ai = new int[bitmap.getWidth() - 2];
        bitmap.getPixels(ai, 0, ai.length, 1, bitmap.getHeight() - 1, ai.length, 1);
        i = 0;
_L13:
        if (i >= ai.length) goto _L2; else goto _L1
_L1:
        if (0xff000000 != ai[i]) goto _L4; else goto _L3
_L3:
        a(abyte0, 12, i);
_L2:
        i = ai.length - 1;
_L14:
        if (i < 0) goto _L6; else goto _L5
_L5:
        if (0xff000000 != ai[i]) goto _L8; else goto _L7
_L7:
        a(abyte0, 16, ai.length - i - 2);
_L6:
        ai = new int[bitmap.getHeight() - 2];
        bitmap.getPixels(ai, 0, 1, bitmap.getWidth() - 1, 0, 1, ai.length);
        i = ((flag) ? 1 : 0);
_L15:
        if (i >= ai.length) goto _L10; else goto _L9
_L9:
        if (0xff000000 != ai[i]) goto _L12; else goto _L11
_L11:
        a(abyte0, 20, i);
_L10:
        i = ai.length - 1;
_L16:
        if (i >= 0)
        {
            if (0xff000000 != ai[i])
            {
                break MISSING_BLOCK_LABEL_183;
            }
            a(abyte0, 24, ai.length - i - 2);
        }
        return;
_L4:
        i++;
          goto _L13
_L8:
        i--;
          goto _L14
_L12:
        i++;
          goto _L15
        i--;
          goto _L16
    }

    private static void a(OutputStream outputstream, int i)
    {
        outputstream.write(i >> 0 & 0xff);
        outputstream.write(i >> 8 & 0xff);
        outputstream.write(i >> 16 & 0xff);
        outputstream.write(i >> 24 & 0xff);
    }

    private static void a(byte abyte0[], int i, int j)
    {
        abyte0[i + 0] = (byte)(j >> 0);
        abyte0[i + 1] = (byte)(j >> 8);
        abyte0[i + 2] = (byte)(j >> 16);
        abyte0[i + 3] = (byte)(j >> 24);
    }

    private static void a(byte abyte0[], Rect rect)
    {
        rect.left = a(abyte0, 12);
        rect.right = a(abyte0, 16);
        rect.top = a(abyte0, 20);
        rect.bottom = a(abyte0, 24);
    }

    private static byte[] a(Bitmap bitmap)
    {
        int k = bitmap.getWidth();
        int j2 = bitmap.getHeight();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        for (int i = 0; i < 32; i++)
        {
            bytearrayoutputstream.write(0);
        }

        int ai[] = new int[k - 2];
        bitmap.getPixels(ai, 0, k, 1, 0, k - 2, 1);
        int j;
        boolean flag;
        boolean flag1;
        int k1;
        int k2;
        if (ai[0] == 0xff000000)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (ai[ai.length - 1] == 0xff000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = ai.length;
        k = 0;
        k1 = 0;
        int i1;
        for (j = 0; k < k2; j = i1)
        {
            int l1 = k1;
            i1 = j;
            if (k1 != ai[k])
            {
                i1 = j + 1;
                a(((OutputStream) (bytearrayoutputstream)), k);
                l1 = ai[k];
            }
            k++;
            k1 = l1;
        }

        k = j;
        if (flag)
        {
            k = j + 1;
            a(((OutputStream) (bytearrayoutputstream)), ai.length);
        }
        j = k + 1;
        if (flag1)
        {
            j--;
        }
        byte abyte0[];
        int l;
        boolean flag2;
        int j1;
        int i3;
        if (flag)
        {
            l = j - 1;
        } else
        {
            l = j;
        }
        ai = new int[j2 - 2];
        bitmap.getPixels(ai, 0, 1, 0, 1, 1, j2 - 2);
        if (ai[0] == 0xff000000)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (ai[ai.length - 1] == 0xff000000)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i3 = ai.length;
        k1 = 0;
        j2 = 0;
        int i2;
        for (j = 0; k1 < i3; j = i2)
        {
            int l2 = j2;
            i2 = j;
            if (j2 != ai[k1])
            {
                i2 = j + 1;
                a(((OutputStream) (bytearrayoutputstream)), k1);
                l2 = ai[k1];
            }
            k1++;
            j2 = l2;
        }

        k1 = j;
        if (flag1)
        {
            k1 = j + 1;
            a(((OutputStream) (bytearrayoutputstream)), ai.length);
        }
        j = k1 + 1;
        if (flag2)
        {
            j--;
        }
        j1 = j;
        if (flag1)
        {
            j1 = j - 1;
        }
        for (j = 0; j < l * j1; j++)
        {
            a(((OutputStream) (bytearrayoutputstream)), 1);
        }

        abyte0 = bytearrayoutputstream.toByteArray();
        abyte0[0] = 1;
        abyte0[1] = (byte)k;
        abyte0[2] = (byte)k1;
        abyte0[3] = (byte)(j1 * l);
        a(bitmap, abyte0);
        return abyte0;
    }
}
