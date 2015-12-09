// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.lang.reflect.Array;

public final class dfn
{

    public static void a(Bitmap bitmap, int i)
    {
        if (i <= 0)
        {
            return;
        }
        int i12 = bitmap.getWidth();
        int j12 = bitmap.getHeight();
        int ai[] = new int[i12 * j12];
        bitmap.getPixels(ai, 0, i12, 0, 0, i12, j12);
        int j10 = i12 - 1;
        int k12 = j12 - 1;
        int j = i12 * j12;
        int l12 = i + i + 1;
        int ai1[] = new int[j];
        int ai2[] = new int[j];
        int ai3[] = new int[j];
        int ai4[] = new int[Math.max(i12, j12)];
        j = l12 + 1 >> 1;
        int j1 = j * j;
        int ai5[] = new int[j1 << 8];
        for (int k = 0; k < j1 << 8; k++)
        {
            ai5[k] = k / j1;
        }

        int ai6[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            l12, 3
        });
        int i13 = i + 1;
        int j6 = 0;
        int l6 = 0;
        for (int l5 = 0; l5 < j12; l5++)
        {
            int l = 0;
            int j7 = -i;
            int i2 = 0;
            int k2 = 0;
            int i3 = 0;
            int k3 = 0;
            int i4 = 0;
            int l4 = 0;
            int j5 = 0;
            int k1 = 0;
            while (j7 <= i) 
            {
                int i8 = ai[Math.min(j10, Math.max(j7, 0)) + l6];
                int ai7[] = ai6[j7 + i];
                ai7[0] = i8 >> 16 & 0xff;
                ai7[1] = i8 >> 8 & 0xff;
                ai7[2] = i8 & 0xff;
                i8 = i13 - Math.abs(j7);
                j5 += ai7[0] * i8;
                l4 += ai7[1] * i8;
                i4 += i8 * ai7[2];
                if (j7 > 0)
                {
                    i2 += ai7[0];
                    k1 += ai7[1];
                    l += ai7[2];
                } else
                {
                    k3 += ai7[0];
                    i3 += ai7[1];
                    k2 += ai7[2];
                }
                j7++;
            }
            j7 = l4;
            boolean flag = false;
            l4 = i;
            int j8 = j5;
            j5 = i4;
            for (int j4 = ((flag) ? 1 : 0); j4 < i12; j4++)
            {
                ai1[l6] = ai5[j8];
                ai2[l6] = ai5[j7];
                ai3[l6] = ai5[j5];
                int ai8[] = ai6[((l4 - i) + l12) % l12];
                int j13 = ai8[0];
                int j11 = ai8[1];
                int j9 = ai8[2];
                if (l5 == 0)
                {
                    ai4[j4] = Math.min(j4 + i + 1, j10);
                }
                int k13 = ai[ai4[j4] + j6];
                ai8[0] = k13 >> 16 & 0xff;
                ai8[1] = k13 >> 8 & 0xff;
                ai8[2] = k13 & 0xff;
                i2 += ai8[0];
                k1 += ai8[1];
                l += ai8[2];
                j8 = (j8 - k3) + i2;
                j7 = (j7 - i3) + k1;
                j5 = (j5 - k2) + l;
                l4 = (l4 + 1) % l12;
                ai8 = ai6[l4 % l12];
                k3 = (k3 - j13) + ai8[0];
                i3 = (i3 - j11) + ai8[1];
                k2 = (k2 - j9) + ai8[2];
                i2 -= ai8[0];
                k1 -= ai8[1];
                l -= ai8[2];
                l6++;
            }

            j6 += i12;
        }

        for (int i1 = 0; i1 < i12; i1++)
        {
            int i6 = 0;
            int k5 = -i;
            int k6 = -i;
            int i5 = 0;
            int j3 = 0;
            int l3 = 0;
            int k4 = 0;
            int l1 = 0;
            int l2 = 0;
            int j2 = 0;
            int i7 = k5 * i12;
            k5 = 0;
            while (k6 <= i) 
            {
                int k7 = Math.max(0, i7) + i1;
                int ai9[] = ai6[k6 + i];
                ai9[0] = ai1[k7];
                ai9[1] = ai2[k7];
                ai9[2] = ai3[k7];
                int k8 = i13 - Math.abs(k6);
                int k9 = ai1[k7];
                int k10 = ai2[k7];
                int k11 = ai3[k7];
                if (k6 > 0)
                {
                    i5 += ai9[0];
                    k5 += ai9[1];
                    i6 += ai9[2];
                } else
                {
                    k4 += ai9[0];
                    l3 += ai9[1];
                    j3 += ai9[2];
                }
                k7 = i7;
                if (k6 < k12)
                {
                    k7 = i7 + i12;
                }
                k6++;
                l1 = k11 * k8 + l1;
                l2 = k10 * k8 + l2;
                j2 = k9 * k8 + j2;
                i7 = k7;
            }
            int l8 = l2;
            int l9 = j2;
            boolean flag1 = false;
            j2 = i;
            k6 = i6;
            i7 = k5;
            int l7 = i5;
            l2 = j3;
            j3 = l3;
            l3 = k4;
            int l10 = i1;
            i6 = l9;
            k5 = l8;
            i5 = l1;
            l1 = ((flag1) ? 1 : 0);
            k4 = j2;
            j2 = l10;
            for (; l1 < j12; l1++)
            {
                ai[j2] = 0xff000000 & ai[j2] | ai5[i6] << 16 | ai5[k5] << 8 | ai5[i5];
                int ai10[] = ai6[((k4 - i) + l12) % l12];
                int i11 = ai10[0];
                int i10 = ai10[1];
                int i9 = ai10[2];
                if (i1 == 0)
                {
                    ai4[l1] = Math.min(l1 + i13, k12) * i12;
                }
                int l11 = ai4[l1] + i1;
                ai10[0] = ai1[l11];
                ai10[1] = ai2[l11];
                ai10[2] = ai3[l11];
                l7 += ai10[0];
                i7 += ai10[1];
                k6 += ai10[2];
                i6 = (i6 - l3) + l7;
                k5 = (k5 - j3) + i7;
                i5 = (i5 - l2) + k6;
                k4 = (k4 + 1) % l12;
                ai10 = ai6[k4];
                l3 = (l3 - i11) + ai10[0];
                j3 = (j3 - i10) + ai10[1];
                l2 = (l2 - i9) + ai10[2];
                l7 -= ai10[0];
                i7 -= ai10[1];
                k6 -= ai10[2];
                j2 += i12;
            }

        }

        bitmap.setPixels(ai, 0, i12, 0, 0, i12, j12);
    }
}
