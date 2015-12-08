// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.ads.internal.util:
//            j, r

class n
    implements j
{
    private static class a
        implements Callable
    {

        private final int a[];
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        public Void a()
        {
            n.a(a, b, c, d, e, f, g);
            return null;
        }

        public Object call()
        {
            return a();
        }

        public a(int ai[], int i, int k, int l, int i1, int j1, int k1)
        {
            a = ai;
            b = i;
            c = k;
            d = l;
            e = i1;
            f = j1;
            g = k1;
        }
    }


    private static final short a[] = {
        512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 
        271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 
        298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 
        273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 
        312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 
        404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 
        282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 
        417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 
        320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 
        507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 
        412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 
        341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 
        287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 
        489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 
        422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 
        368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 
        324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 
        287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 
        257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 
        460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 
        416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 
        377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 
        344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 
        315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 
        289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 
        267, 265, 263, 261, 259
    };
    private static final byte b[] = {
        9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 
        15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 
        17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 
        18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 
        19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 
        20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 
        20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 
        21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 
        21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 
        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 
        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 
        22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 
        22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 
        23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 
        23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 
        23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 
        23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 
        23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 
        23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
        24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
        24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
        24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
        24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
        24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
        24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
        24, 24, 24, 24, 24
    };

    n()
    {
    }

    static void a(int ai[], int i, int k, int l, int i1, int j1, int k1)
    {
        b(ai, i, k, l, i1, j1, k1);
    }

    private static void b(int ai[], int i, int k, int l, int i1, int j1, int k1)
    {
        int k3 = i - 1;
        int l3 = k - 1;
        int i4 = l * 2 + 1;
        int j4 = a[l];
        byte byte0 = b[l];
        int ai1[] = new int[i4];
        if (k1 == 1)
        {
            k1 = (j1 * k) / i1;
            l3 = ((j1 + 1) * k) / i1;
            i1 = k1;
            while (i1 < l3) 
            {
                long l7 = 0L;
                j1 = i * i1;
                long l6 = 0L;
                long l4 = 0L;
                long l10 = 0L;
                long l11 = 0L;
                long l12 = 0L;
                k = 0;
                long l5 = 0L;
                for (; k <= l; k++)
                {
                    ai1[k] = ai[j1];
                    l12 += (ai[j1] >>> 16 & 0xff) * (k + 1);
                    l11 += (ai[j1] >>> 8 & 0xff) * (k + 1);
                    l10 += (ai[j1] & 0xff) * (k + 1);
                    l4 += ai[j1] >>> 16 & 0xff;
                    l6 += ai[j1] >>> 8 & 0xff;
                    l5 += ai[j1] & 0xff;
                }

                long l9 = 0L;
                k = 1;
                long l8 = 0L;
                while (k <= l) 
                {
                    k1 = j1;
                    if (k <= k3)
                    {
                        k1 = j1 + 1;
                    }
                    ai1[k + l] = ai[k1];
                    l12 += (ai[k1] >>> 16 & 0xff) * ((l + 1) - k);
                    l11 += (ai[k1] >>> 8 & 0xff) * ((l + 1) - k);
                    l10 += (ai[k1] & 0xff) * ((l + 1) - k);
                    l9 += ai[k1] >>> 16 & 0xff;
                    l8 += ai[k1] >>> 8 & 0xff;
                    l7 += ai[k1] & 0xff;
                    k++;
                    j1 = k1;
                }
                int l1;
                int i2;
                int k2;
                int l2;
                int j3;
                int k4;
                long l13;
                long l14;
                long l15;
                if (l > k3)
                {
                    k = k3;
                } else
                {
                    k = l;
                }
                k1 = l;
                j1 = 0;
                l2 = k + i1 * i;
                l1 = k;
                i2 = i1 * i;
                l13 = l9;
                l14 = l8;
                l15 = l7;
                k = k1;
                l9 = l12;
                l8 = l11;
                l7 = l10;
                l12 = l13;
                l11 = l14;
                l10 = l15;
                k1 = i2;
                while (j1 < i) 
                {
                    ai[k1] = (int)((long)(ai[k1] & 0xff000000) | ((long)j4 * l9 >>> byte0 & 255L) << 16 | ((long)j4 * l8 >>> byte0 & 255L) << 8 | (long)j4 * l7 >>> byte0 & 255L);
                    i2 = (k + i4) - l;
                    int i3 = i2;
                    if (i2 >= i4)
                    {
                        i3 = i2 - i4;
                    }
                    l15 = ai1[i3] >>> 16 & 0xff;
                    l14 = ai1[i3] >>> 8 & 0xff;
                    l13 = ai1[i3] & 0xff;
                    int j2 = l2;
                    i2 = l1;
                    if (l1 < k3)
                    {
                        j2 = l2 + 1;
                        i2 = l1 + 1;
                    }
                    ai1[i3] = ai[j2];
                    l12 += ai[j2] >>> 16 & 0xff;
                    l11 += ai[j2] >>> 8 & 0xff;
                    l10 += ai[j2] & 0xff;
                    l9 = (l9 - l4) + l12;
                    l8 = (l8 - l6) + l11;
                    l7 = (l7 - l5) + l10;
                    l1 = k + 1;
                    k = l1;
                    if (l1 >= i4)
                    {
                        k = 0;
                    }
                    l4 = (l4 - l15) + (long)(ai1[k] >>> 16 & 0xff);
                    l6 = (l6 - l14) + (long)(ai1[k] >>> 8 & 0xff);
                    l5 = (l5 - l13) + (long)(ai1[k] & 0xff);
                    l12 -= ai1[k] >>> 16 & 0xff;
                    l11 -= ai1[k] >>> 8 & 0xff;
                    l10 -= ai1[k] & 0xff;
                    j1++;
                    k1++;
                    l2 = j2;
                    l1 = i2;
                }
                i1++;
            }
        } else
        if (k1 == 2)
        {
            k1 = (j1 * i) / i1;
            k4 = ((j1 + 1) * i) / i1;
            i1 = k1;
            while (i1 < k4) 
            {
                l13 = 0L;
                j1 = 0;
                l4 = 0L;
                l5 = 0L;
                l6 = 0L;
                l7 = 0L;
                l8 = 0L;
                l9 = 0L;
                for (; j1 <= l; j1++)
                {
                    ai1[j1] = ai[i1];
                    l9 += (ai[i1] >>> 16 & 0xff) * (j1 + 1);
                    l8 += (ai[i1] >>> 8 & 0xff) * (j1 + 1);
                    l7 += (ai[i1] & 0xff) * (j1 + 1);
                    l6 += ai[i1] >>> 16 & 0xff;
                    l5 += ai[i1] >>> 8 & 0xff;
                    l4 += ai[i1] & 0xff;
                }

                l14 = 0L;
                l15 = 0L;
                j1 = 1;
                k1 = i1;
                l12 = l9;
                l11 = l8;
                l10 = l7;
                l9 = l15;
                l8 = l14;
                l7 = l13;
                while (j1 <= l) 
                {
                    l1 = k1;
                    if (j1 <= l3)
                    {
                        l1 = k1 + i;
                    }
                    ai1[j1 + l] = ai[l1];
                    l12 += (ai[l1] >>> 16 & 0xff) * ((l + 1) - j1);
                    l11 += (ai[l1] >>> 8 & 0xff) * ((l + 1) - j1);
                    l10 += (ai[l1] & 0xff) * ((l + 1) - j1);
                    l9 += ai[l1] >>> 16 & 0xff;
                    l8 += ai[l1] >>> 8 & 0xff;
                    l7 += ai[l1] & 0xff;
                    j1++;
                    k1 = l1;
                }
                if (l > l3)
                {
                    j1 = l3;
                } else
                {
                    j1 = l;
                }
                j3 = j1 * i + i1;
                i2 = l;
                k1 = 0;
                k2 = j1;
                l1 = i1;
                j1 = i2;
                for (i2 = k2; k1 < k; i2 = k2)
                {
                    ai[l1] = (int)((long)(ai[l1] & 0xff000000) | ((long)j4 * l12 >>> byte0 & 255L) << 16 | ((long)j4 * l11 >>> byte0 & 255L) << 8 | (long)j4 * l10 >>> byte0 & 255L);
                    k2 = (j1 + i4) - l;
                    k3 = k2;
                    if (k2 >= i4)
                    {
                        k3 = k2 - i4;
                    }
                    l15 = ai1[k3] >>> 16 & 0xff;
                    l14 = ai1[k3] >>> 8 & 0xff;
                    l13 = ai1[k3] & 0xff;
                    l2 = j3;
                    k2 = i2;
                    if (i2 < l3)
                    {
                        l2 = j3 + i;
                        k2 = i2 + 1;
                    }
                    ai1[k3] = ai[l2];
                    l9 += ai[l2] >>> 16 & 0xff;
                    l8 += ai[l2] >>> 8 & 0xff;
                    l7 += ai[l2] & 0xff;
                    l12 = (l12 - l6) + l9;
                    l11 = (l11 - l5) + l8;
                    l10 = (l10 - l4) + l7;
                    i2 = j1 + 1;
                    j1 = i2;
                    if (i2 >= i4)
                    {
                        j1 = 0;
                    }
                    l6 = (l6 - l15) + (long)(ai1[j1] >>> 16 & 0xff);
                    l5 = (l5 - l14) + (long)(ai1[j1] >>> 8 & 0xff);
                    l4 = (l4 - l13) + (long)(ai1[j1] & 0xff);
                    l9 -= ai1[j1] >>> 16 & 0xff;
                    l8 -= ai1[j1] >>> 8 & 0xff;
                    l7 -= ai1[j1] & 0xff;
                    k1++;
                    l1 += i;
                    j3 = l2;
                }

                i1++;
            }
        }
    }

    public Bitmap a(Bitmap bitmap, float f)
    {
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        int ai[] = new int[k * l];
        bitmap.getPixels(ai, 0, k, 0, 0, k, l);
        int i1 = r.a;
        bitmap = new ArrayList(i1);
        ArrayList arraylist = new ArrayList(i1);
        for (int i = 0; i < i1; i++)
        {
            bitmap.add(new a(ai, k, l, (int)f, i1, i, 1));
            arraylist.add(new a(ai, k, l, (int)f, i1, i, 2));
        }

        try
        {
            r.b.invokeAll(bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return null;
        }
        try
        {
            r.b.invokeAll(arraylist);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return null;
        }
        return Bitmap.createBitmap(ai, k, l, android.graphics.Bitmap.Config.ARGB_8888);
    }

}
