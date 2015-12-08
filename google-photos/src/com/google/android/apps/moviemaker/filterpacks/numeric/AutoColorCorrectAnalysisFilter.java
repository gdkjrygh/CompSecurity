// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.numeric;

import ahn;
import ahs;
import ahv;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import android.graphics.Bitmap;
import android.graphics.Color;
import cdz;
import cea;
import ddl;

public class AutoColorCorrectAnalysisFilter extends ahn
{

    private static final int BASE_FIX_EXPOSURE = 75;
    private static final int COLOR_DEPTH = 256;
    private static final int FINE_TUNE_COLOR = 100;
    private static final int LOOKUP_TABLE_MAX = 4096;
    private static final int LOOKUP_TABLE_MAX_IDX = 4095;
    private static final int LOOKUP_TABLE_MIN = -2048;
    private static final int LOOKUP_TABLE_ZERO = 2048;
    private static final int LOOKUP_TEXTURE_SIZE = 768;
    private static final int MAX_VALUE = 2047;
    private static final int SCALE_FACTOR = 8;
    private long mHistogramB[];
    private long mHistogramG[];
    private long mHistogramR[];
    public cdz mListener;
    private long mTotalCount;

    public AutoColorCorrectAnalysisFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private static int a(int i)
    {
        return ddl.a((int)((float)i / 8F + 0.5F), 0, 255);
    }

    private static int a(int i, int j, int k)
    {
        return Math.min(Math.min(i, j), k);
    }

    private int a(long al[])
    {
        long l = 0L;
        for (int i = 1; i < al.length; i++)
        {
            l += (long)i * al[i];
        }

        return (int)(l / mTotalCount);
    }

    private int a(long al[], int i)
    {
        long l = 0L;
        int j;
        for (j = 255; l < (mTotalCount * (long)i) / 1000L; j--)
        {
            l += al[j];
        }

        return j << 3;
    }

    private static int[] a(int i, int j, int k, int l, int i1)
    {
        int ai[] = new int[6144];
        for (int j1 = -2048; j1 < 0; j1++)
        {
            ai[j1 + 2048] = j1;
        }

        for (int k1 = 0; k1 < 2048; k1++)
        {
            ai[k1 + 2048] = (k1 - i << 11) / (j - i);
        }

        for (i = 2048; i < 4096; i++)
        {
            ai[i + 2048] = i;
        }

        for (i = -2048; i < 4096; i++)
        {
            if (ai[i + 2048] < 0)
            {
                ai[i + 2048] = 0;
            }
            if (ai[i + 2048] > 2047)
            {
                ai[i + 2048] = 2047;
            }
        }

        int ai1[] = new int[6144];
        for (i = -2048; i < 4096; i++)
        {
            int l1 = i - k;
            if (l1 < -2048)
            {
                l1 = -2048;
            }
            int l2 = i + k;
            j = l2;
            if (l2 > 4095)
            {
                j = 4095;
            }
            l1 = ai[l1 + 2048];
            l2 = ai[i + 2048];
            ai1[i + 2048] = ai[j + 2048] + (l1 + l2);
        }

        for (i = -2048; i < 4096; i++)
        {
            int i2 = ((i * 2 - k) + 1) / 2;
            j = i2;
            if (i2 < -2048)
            {
                j = -2048;
            }
            int i3 = (i * 2 + k + 1) / 2;
            i2 = i3;
            if (i3 > 4095)
            {
                i2 = 4095;
            }
            j = (ai1[j + 2048] + ai1[i + 2048] + ai1[i2 + 2048] + 4) / 9;
            ai[i + 2048] = Math.min(ai[i + 2048], j);
        }

        ai1 = new int[6144];
        for (i = -2048; i < 4096; i++)
        {
            k = i - l;
            if (k < -2048)
            {
                k = -2048;
            }
            int j2 = i + l;
            j = j2;
            if (j2 > 4095)
            {
                j = 4095;
            }
            k = ai[k + 2048];
            j2 = ai[i + 2048];
            ai1[i + 2048] = ai[j + 2048] + (k + j2);
        }

        for (i = -2048; i < 4096; i++)
        {
            k = ((i * 2 - l) + 1) / 2;
            j = k;
            if (k < -2048)
            {
                j = -2048;
            }
            int k2 = (i * 2 + l + 1) / 2;
            k = k2;
            if (k2 > 4095)
            {
                k = 4095;
            }
            j = (ai1[j + 2048] + ai1[i + 2048] + ai1[k + 2048] + 4) / 9;
            ai[i + 2048] = Math.max(ai[i + 2048], j);
        }

        for (i = -2048; i < 4096; i++)
        {
            double d1 = ((double)i - 1024D) / 1024D;
            ai[i + 2048] = ai[i + 2048] + (int)Math.floor((1.0D - d1 * d1) * (double)i1 + 0.5D);
        }

        return ai;
    }

    private int b(long al[], int i)
    {
        long l = 0L;
        int j;
        for (j = 0; l < (mTotalCount * (long)i) / 1000L; j++)
        {
            l += al[j];
        }

        return j << 3;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("image", 1, aif2).a();
    }

    protected final void d()
    {
        mHistogramR = new long[256];
        mHistogramG = new long[256];
        mHistogramB = new long[256];
        mTotalCount = 0L;
    }

    protected final void e()
    {
        ahv ahv1 = a("image").a().h();
        Object obj = ahv1.q();
        int k = ((Bitmap) (obj)).getWidth();
        int l = ((Bitmap) (obj)).getHeight();
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < l; j++)
            {
                int i1 = ((Bitmap) (obj)).getPixel(i, j);
                long al[] = mHistogramR;
                int j1 = Color.red(i1);
                al[j1] = al[j1] + 1L;
                al = mHistogramG;
                j1 = Color.green(i1);
                al[j1] = al[j1] + 1L;
                al = mHistogramB;
                i1 = Color.blue(i1);
                al[i1] = al[i1] + 1L;
                mTotalCount = mTotalCount + 1L;
            }

        }

        obj = b("image");
        if (obj != null)
        {
            ((aju) (obj)).a(ahv1);
        }
    }

    protected final void f()
    {
        if (mListener == null)
        {
            return;
        }
        int l1 = a(mHistogramR);
        int i2 = a(mHistogramG);
        int j2 = a(mHistogramB);
        int k1 = b(mHistogramR, 15);
        int j1 = b(mHistogramG, 15);
        int i1 = b(mHistogramB, 15);
        int l4 = b(mHistogramR, 100);
        int k4 = b(mHistogramG, 100);
        int j4 = b(mHistogramB, 100);
        int l = a(mHistogramR, 15);
        int k = a(mHistogramG, 15);
        int k2 = a(mHistogramB, 15);
        int i4 = a(mHistogramR, 100);
        int l3 = a(mHistogramG, 100);
        int k3 = a(mHistogramB, 100);
        int j3 = a(l, k, k2) / 8;
        int i5 = a(i4, l3, k3) / 8;
        int j5 = a(l1, i2, j2);
        int i = a(k1, j1, i1) / 8;
        int l2 = a(l4, k4, j4) / 8;
        int j = j3 - i;
        int i3 = i5 - l2;
        int k5 = l2 + i5 + j5;
        j3 -= i5;
        i5 = l2 - i;
        i = 100;
        if (j < 140)
        {
            i = 100 - ((140 - j) * 45) / 140;
        }
        j = i;
        if (i3 < 90)
        {
            j = i - ((90 - i3) * 55) / 90;
        }
        i = j;
        if (k5 < 150)
        {
            i = j - ((150 - k5) * 35) / 150;
        }
        j = (i * 75) / 100;
        i = j;
        if (j5 < 60)
        {
            i = Math.min(22, j);
        }
        j = i;
        if (l2 < 5)
        {
            j = i;
            if (j5 < 80)
            {
                j = Math.min(30, i);
            }
        }
        i = j;
        if (i3 < 50)
        {
            i = Math.min(27, j);
        }
        j = i;
        if (j3 - i5 > 30)
        {
            j = i;
            if (l2 < 20)
            {
                j = i;
                if ((i5 * 100) / j3 < 20)
                {
                    j = Math.min(30, i);
                }
            }
        }
        i = j;
        if (j < 15)
        {
            i = 15;
        }
        l2 = Math.min(100, Math.max(0, (int)Math.floor(65.5D) + i));
        i3 = i / 2;
        j3 = i / 4;
        int ai[];
        int ai1[];
        int ai2[];
        Bitmap bitmap;
        if (i < 50)
        {
            j = i << 1;
            k1 = (k1 * j) / 100;
            j1 = (j1 * j) / 100;
            i1 = (i1 * j) / 100;
            l = (l * j + (100 - j) * 2047) / 100;
            k = (k * j + (100 - j) * 2047) / 100;
            j = (k2 * j + (100 - j) * 2047) / 100;
        } else
        {
            j = i - 50 << 1;
            k1 = (k1 * (100 - j) + l4 * j) / 100;
            j1 = (k4 * j + j1 * (100 - j)) / 100;
            i1 = (j4 * j + (100 - j) * i1) / 100;
            l = (i4 * j + (100 - j) * l) / 100;
            k = (l3 * j + (100 - j) * k) / 100;
            j = (k3 * j + (100 - j) * k2) / 100;
        }
        k3 = a(k1, j1, i1);
        l3 = Math.max(l, Math.max(k, j));
        k1 = (k1 * l2 + (100 - l2) * k3) / 100;
        k2 = (j1 * l2 + (100 - l2) * k3) / 100;
        k3 = (i1 * l2 + k3 * (100 - l2)) / 100;
        j1 = (l * l2 + (100 - l2) * l3) / 100;
        l = (k * l2 + (100 - l2) * l3) / 100;
        i1 = (j * l2 + (100 - l2) * l3) / 100;
        j = j1;
        if (j1 <= k1)
        {
            j = k1 + 1;
        }
        k = l;
        if (l <= k2)
        {
            k = k2 + 1;
        }
        l = i1;
        if (i1 <= k3)
        {
            l = k3 + 1;
        }
        i1 = j3 * 5;
        j1 = i3 * 5;
        l1 = ((l1 - (i2 + l1 + j2) / 3) * -1 * l2) / 100;
        i2 = (l1 * -1 * l2) / 100;
        j2 = (l1 * -1 * l2) / 100;
        ai = a(k1, j, i1, j1, l1);
        ai1 = a(k2, k, i1, j1, i2);
        ai2 = a(k3, l, i1, j1, j2);
        bitmap = Bitmap.createBitmap(768, 1, android.graphics.Bitmap.Config.ARGB_8888);
        for (j = 0; j < 768; j++)
        {
            bitmap.setPixel(j, 0, Color.rgb(a(ai[j << 3]), a(ai1[j << 3]), a(ai2[j << 3])));
        }

        float f1 = (100F - (float)i / 8F) / 100F;
        mListener.a(new cea(bitmap, f1));
        mHistogramR = null;
        mHistogramG = null;
        mHistogramB = null;
    }
}
