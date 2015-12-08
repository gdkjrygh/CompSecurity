// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.d;

import android.graphics.Bitmap;
import com.roidapp.imagelib.ImageLibrary;
import java.lang.reflect.Array;

// Referenced classes of package com.roidapp.imagelib.d:
//            a

public final class e extends a
{

    int b;
    public boolean c;
    public int d;
    public int e;
    public android.graphics.Bitmap.Config f;
    public int g;
    public int h;
    public String i;

    public e()
    {
        b = 3;
        c = true;
        d = 0;
        e = 0;
    }

    private void a(int ai[], int j, int k, int l)
    {
        long l17 = System.currentTimeMillis();
        if (l <= 0)
        {
            return;
        }
        int i17 = j - 1;
        int j16 = k - 1;
        int i1 = j * k;
        int k16 = l + l + 1;
        short aword0[] = new short[i1];
        short aword1[] = new short[i1];
        short aword2[] = new short[i1];
        int ai1[] = new int[Math.max(j, k)];
        i1 = k16 + 1 >> 1;
        int j2 = i1 * i1;
        short aword3[] = new short[j2 * 256];
        for (int j1 = 0; j1 < j2 * 256; j1++)
        {
            aword3[j1] = (short)(j1 / j2);
        }

        int ai2[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            k16, 3
        });
        int l16 = l + 1;
        int k7 = 0;
        int i9 = 0;
        for (int i7 = 0; i7 < k; i7++)
        {
            e = i7;
            int k1 = 0;
            int j8 = -l;
            int j3 = 0;
            int i4 = 0;
            int k4 = 0;
            int i5 = 0;
            int k5 = 0;
            int i6 = 0;
            int k6 = 0;
            int k2 = 0;
            while (j8 <= l) 
            {
                int l9 = ai[Math.min(i17, Math.max(j8, 0)) + i9];
                int ai3[] = ai2[j8 + l];
                ai3[0] = (0xff0000 & l9) >> 16;
                ai3[1] = (0xff00 & l9) >> 8;
                ai3[2] = l9 & 0xff;
                l9 = l16 - Math.abs(j8);
                k6 += ai3[0] * l9;
                i6 += ai3[1] * l9;
                k5 += l9 * ai3[2];
                if (j8 > 0)
                {
                    j3 += ai3[0];
                    k2 += ai3[1];
                    k1 += ai3[2];
                } else
                {
                    i5 += ai3[0];
                    k4 += ai3[1];
                    i4 += ai3[2];
                }
                j8++;
            }
            j8 = 0;
            int l10 = l;
            int i10 = k6;
            k6 = i6;
            i6 = k5;
            k5 = l10;
            int k12 = j3;
            int i12 = k2;
            int k11 = k1;
            while (j8 < j) 
            {
                d = j8;
                int i16 = k11;
                int k15 = i12;
                int i15 = k12;
                int k14 = i4;
                int i14 = k4;
                int k13 = i5;
                int i13 = i9;
                int i11 = k5;
                int k3 = i6;
                int l2 = k6;
                int l1 = i10;
                if (i10 < aword3.length)
                {
                    i16 = k11;
                    k15 = i12;
                    i15 = k12;
                    k14 = i4;
                    i14 = k4;
                    k13 = i5;
                    i13 = i9;
                    i11 = k5;
                    k3 = i6;
                    l2 = k6;
                    l1 = i10;
                    if (k6 < aword3.length)
                    {
                        i16 = k11;
                        k15 = i12;
                        i15 = k12;
                        k14 = i4;
                        i14 = k4;
                        k13 = i5;
                        i13 = i9;
                        i11 = k5;
                        k3 = i6;
                        l2 = k6;
                        l1 = i10;
                        if (i6 < aword3.length)
                        {
                            aword0[i9] = aword3[i10];
                            aword1[i9] = aword3[k6];
                            aword2[i9] = aword3[i6];
                            int ai4[] = ai2[((k5 - l) + k16) % k16];
                            k13 = ai4[0];
                            i14 = ai4[1];
                            i13 = ai4[2];
                            if (i7 == 0)
                            {
                                ai1[j8] = Math.min(j8 + l + 1, i17);
                            }
                            l1 = ai[ai1[j8] + k7];
                            ai4[0] = (0xff0000 & l1) >> 16;
                            ai4[1] = (0xff00 & l1) >> 8;
                            ai4[2] = l1 & 0xff;
                            k12 += ai4[0];
                            i12 += ai4[1];
                            k11 += ai4[2];
                            l1 = (i10 - i5) + k12;
                            l2 = (k6 - k4) + i12;
                            k3 = (i6 - i4) + k11;
                            i11 = (k5 + 1) % k16;
                            ai4 = ai2[i11 % k16];
                            k13 = (i5 - k13) + ai4[0];
                            i14 = (k4 - i14) + ai4[1];
                            k14 = (i4 - i13) + ai4[2];
                            i15 = k12 - ai4[0];
                            k15 = i12 - ai4[1];
                            i16 = k11 - ai4[2];
                            i13 = i9 + 1;
                        }
                    }
                }
                j8++;
                k11 = i16;
                i12 = k15;
                k12 = i15;
                i4 = k14;
                k4 = i14;
                i5 = k13;
                i9 = i13;
                k5 = i11;
                i6 = k3;
                k6 = l2;
                i10 = l1;
            }
            k7 += j;
        }

        c = false;
        for (int i2 = 0; i2 < j; i2++)
        {
            d = i2;
            int j7 = 0;
            int l6 = -l;
            int l7 = -l;
            int j6 = 0;
            int j4 = 0;
            int l4 = 0;
            int j5 = 0;
            int i3 = 0;
            int l3 = 0;
            int l5 = 0;
            int k8 = l6 * j;
            l6 = 0;
            while (l7 <= l) 
            {
                int j9 = Math.max(0, k8) + i2;
                int ai5[] = ai2[l7 + l];
                ai5[0] = aword0[j9];
                ai5[1] = aword1[j9];
                ai5[2] = aword2[j9];
                int j10 = l16 - Math.abs(l7);
                l5 += aword0[j9] * j10;
                l3 += aword1[j9] * j10;
                j9 = i3 + aword2[j9] * j10;
                if (l7 > 0)
                {
                    j6 += ai5[0];
                    l6 += ai5[1];
                    j7 += ai5[2];
                } else
                {
                    j5 += ai5[0];
                    l4 += ai5[1];
                    j4 += ai5[2];
                }
                i3 = k8;
                if (l7 < j16)
                {
                    i3 = k8 + j;
                }
                l7++;
                k8 = i3;
                i3 = j9;
            }
            l7 = l;
            boolean flag = false;
            int j11 = j7;
            int l11 = l6;
            int j12 = j6;
            j6 = j4;
            l6 = l4;
            j7 = j5;
            k8 = i2;
            j4 = ((flag) ? 1 : 0);
            j5 = l3;
            l4 = i3;
            l3 = l7;
            i3 = k8;
            while (j4 < k) 
            {
                e = j4;
                int l15 = j11;
                int j15 = l11;
                int l14 = j12;
                int j14 = j6;
                int l13 = l6;
                int j13 = j7;
                int l12 = i3;
                int k10 = l3;
                int k9 = l4;
                int l8 = j5;
                int i8 = l5;
                if (l5 < aword3.length)
                {
                    l15 = j11;
                    j15 = l11;
                    l14 = j12;
                    j14 = j6;
                    l13 = l6;
                    j13 = j7;
                    l12 = i3;
                    k10 = l3;
                    k9 = l4;
                    l8 = j5;
                    i8 = l5;
                    if (j5 < aword3.length)
                    {
                        l15 = j11;
                        j15 = l11;
                        l14 = j12;
                        j14 = j6;
                        l13 = l6;
                        j13 = j7;
                        l12 = i3;
                        k10 = l3;
                        k9 = l4;
                        l8 = j5;
                        i8 = l5;
                        if (l4 < aword3.length)
                        {
                            ai[i3] = 0xff000000 | aword3[l5] << 16 | aword3[j5] << 8 | aword3[l4];
                            int ai6[] = ai2[((l3 - l) + k16) % k16];
                            j13 = ai6[0];
                            l13 = ai6[1];
                            l12 = ai6[2];
                            if (i2 == 0)
                            {
                                ai1[j4] = Math.min(j4 + l16, j16) * j;
                            }
                            i8 = ai1[j4] + i2;
                            ai6[0] = aword0[i8];
                            ai6[1] = aword1[i8];
                            ai6[2] = aword2[i8];
                            j12 += ai6[0];
                            l11 += ai6[1];
                            j11 += ai6[2];
                            i8 = (l5 - j7) + j12;
                            l8 = (j5 - l6) + l11;
                            k9 = (l4 - j6) + j11;
                            k10 = (l3 + 1) % k16;
                            ai6 = ai2[k10];
                            j13 = (j7 - j13) + ai6[0];
                            l13 = (l6 - l13) + ai6[1];
                            j14 = (j6 - l12) + ai6[2];
                            l14 = j12 - ai6[0];
                            j15 = l11 - ai6[1];
                            l15 = j11 - ai6[2];
                            l12 = i3 + j;
                        }
                    }
                }
                j4++;
                j11 = l15;
                l11 = j15;
                j12 = l14;
                j6 = j14;
                l6 = l13;
                j7 = j13;
                i3 = l12;
                l3 = k10;
                l4 = k9;
                j5 = l8;
                l5 = i8;
            }
        }

        System.gc();
        long l18 = System.currentTimeMillis();
        (new StringBuilder("StackBlurFilter time=")).append(l18 - l17);
    }

    public final Bitmap a(Bitmap bitmap)
    {
        int j = bitmap.getWidth();
        int k = bitmap.getHeight();
        int l = bitmap.getRowBytes();
        f = bitmap.getConfig();
        int ai[] = new int[j * k];
        bitmap.getPixels(ai, 0, j, 0, 0, j, k);
        bitmap = (new StringBuilder("BlurExp:/")).append(j).append("/").append(k).append("/").append(l).append("/").append(l * k).append("/").append(b).append("/").append(f).append("/").append(i).toString();
        ImageLibrary.a().a((new StringBuilder("/")).append(bitmap).toString());
        long l1 = System.currentTimeMillis();
        g = j;
        h = k;
        a(ai, j, k, b);
        long l2 = System.currentTimeMillis();
        (new StringBuilder("StackBlurFilter used time=")).append(l2 - l1);
        bitmap = Bitmap.createBitmap(j, k, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.setPixels(ai, 0, j, 0, 0, j, k);
        return bitmap;
    }

    public final void a(int j)
    {
        b = j;
    }

    public final void a(String s)
    {
        if (s != null)
        {
            i = s.substring(s.lastIndexOf(".") + 1, s.length());
        }
    }
}
