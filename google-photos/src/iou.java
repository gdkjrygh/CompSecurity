// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;

public class iou
{

    final LinkedHashMap a = new iov(this, 4, 0.75F, true);
    private final Context b;

    public iou(Context context)
    {
        b = context;
    }

    private static int[] a(int ai[], int i, int j)
    {
        int ai1[];
        if (i % 2 == 1)
        {
            int k = 0;
            do
            {
                ai1 = ai;
                if (k >= 3)
                {
                    break;
                }
                ai = a(ai, i / 2, i / 2, j);
                k++;
            } while (true);
        } else
        {
            ai1 = a(a(a(ai, i / 2, i / 2 - 1, j), i / 2 - 1, i / 2, j), i / 2, i / 2, j);
        }
        return ai1;
    }

    private static int[] a(int ai[], int i, int j, int k)
    {
        int ai1[];
        int j1;
        int k1;
        boolean flag = false;
        ai1 = new int[ai.length];
        int l1 = 0;
        int l = 0;
        do
        {
            j1 = ((flag) ? 1 : 0);
            k1 = l;
            if (l1 >= j)
            {
                break;
            }
            j1 = ai[l1];
            l1++;
            l = j1 + l;
        } while (true);
          goto _L1
_L5:
        int i1 = k;
_L3:
        k1 += i1;
        ai1[j1] = k1 / (i + j + 1);
        i1 = k1;
        if (j1 - i >= 0)
        {
            i1 = k1 - ai[j1 - i];
        }
        j1++;
        k1 = i1;
_L1:
label0:
        {
            if (j1 >= ai.length)
            {
                break label0;
            }
            if (j1 + j >= ai.length)
            {
                break; /* Loop/switch isn't completed */
            }
            i1 = ai[j1 + j];
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (true) goto _L5; else goto _L4
_L4:
        return ai1;
    }

    Drawable a(int i, int j)
    {
        int j1 = j >>> 24;
        int k1 = 0xffffff & j;
        int l1 = (int)Math.floor(((double)(((float)i / 2.0F) * 3F) * Math.sqrt(6.2831853071795862D)) / 4D + 0.5D);
        i <<= 1;
        int i1 = i * 2 + 1;
        int ai1[] = new int[(int)Math.pow(i1, 2D)];
        int ai[] = new int[i + 1];
        i = 0;
        while (i < ai.length) 
        {
            if (i < ai.length / 2)
            {
                j = 0;
            } else
            {
                j = 255;
            }
            ai[i] = j;
            i++;
        }
        int ai2[] = a(ai, l1, 255);
        i = 0;
        ai = null;
        for (; i < ai2.length; i++)
        {
            ai = new int[ai2.length];
            j = 0;
            while (j < ai2.length) 
            {
                int k;
                if (j < ai2.length / 2)
                {
                    k = 0;
                } else
                {
                    k = ai2[i];
                }
                ai[j] = k;
                j++;
            }
            ai = a(ai, l1, ai2[i]);
            int l = i * i1;
            int i2 = (i1 - i - 1) * i1;
            j = 0;
            while (j < ai.length) 
            {
                int j2 = (ai[j] * j1) / 255 << 24 | k1;
                ai1[l + j] = j2;
                ai1[(l + i1) - j - 1] = j2;
                if (i == ai.length - 1)
                {
                    ai1[i1 * j + ai.length] = j2;
                    ai1[(i1 - j - 1) * i1 + ai.length] = j2;
                } else
                {
                    ai1[i2 + j] = j2;
                    ai1[(i2 + i1) - j - 1] = j2;
                }
                j++;
            }
        }

        ai1[ai1.length / 2] = (ai[ai.length - 1] * j1) / 255 << 24 | k1;
        ByteBuffer bytebuffer = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        bytebuffer.put((byte)1);
        bytebuffer.put((byte)2);
        bytebuffer.put((byte)2);
        bytebuffer.put((byte)9);
        bytebuffer.putInt(0);
        bytebuffer.putInt(0);
        bytebuffer.putInt(0);
        bytebuffer.putInt(0);
        bytebuffer.putInt(0);
        bytebuffer.putInt(0);
        bytebuffer.putInt(0);
        bytebuffer.putInt(i1 / 2);
        bytebuffer.putInt(i1 / 2 + 1);
        bytebuffer.putInt(i1 / 2);
        bytebuffer.putInt(i1 / 2 + 1);
        for (i = 0; i < 9; i++)
        {
            bytebuffer.putInt(1);
        }

        Bitmap bitmap = Bitmap.createBitmap(ai1, i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
        return new NinePatchDrawable(b.getResources(), bitmap, bytebuffer.array(), new Rect(), null);
    }
}
