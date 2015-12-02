// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class SlidingPercentile
{

    private static final Comparator a = new _cls1();
    private static final Comparator b = new _cls2();
    private final int c;
    private final ArrayList d = new ArrayList();
    private final Sample e[] = new Sample[5];
    private int f;
    private int g;
    private int h;
    private int i;

    public SlidingPercentile(int j)
    {
        c = j;
        f = -1;
    }

    private void a()
    {
        if (f != 1)
        {
            Collections.sort(d, a);
            f = 1;
        }
    }

    private void b()
    {
        if (f != 0)
        {
            Collections.sort(d, b);
            f = 0;
        }
    }

    public final float a(float f1)
    {
        b();
        float f2 = h;
        int j = 0;
        int k = 0;
        for (; j < d.size(); j++)
        {
            Sample sample = (Sample)d.get(j);
            k += sample.b;
            if ((float)k >= f1 * f2)
            {
                return sample.c;
            }
        }

        if (d.isEmpty())
        {
            return (0.0F / 0.0F);
        } else
        {
            return ((Sample)d.get(d.size() - 1)).c;
        }
    }

    public final void a(int j, float f1)
    {
        a();
        Sample sample;
        int l;
        if (i > 0)
        {
            Sample asample[] = e;
            int k = i - 1;
            i = k;
            sample = asample[k];
        } else
        {
            sample = new Sample((byte)0);
        }
        l = g;
        g = l + 1;
        sample.a = l;
        sample.b = j;
        sample.c = f1;
        d.add(sample);
        h = h + j;
        do
        {
            if (h <= c)
            {
                break;
            }
            j = h - c;
            sample = (Sample)d.get(0);
            if (sample.b <= j)
            {
                h = h - sample.b;
                d.remove(0);
                if (i < 5)
                {
                    Sample asample1[] = e;
                    j = i;
                    i = j + 1;
                    asample1[j] = sample;
                }
            } else
            {
                sample.b = sample.b - j;
                h = h - j;
            }
        } while (true);
    }


    private class Sample
    {

        public int a;
        public int b;
        public float c;

        private Sample()
        {
        }

        Sample(byte byte0)
        {
            this();
        }
    }


    private class _cls1
        implements Comparator
    {

        private static int a(Sample sample, Sample sample1)
        {
            return sample.a - sample1.a;
        }

        public final int compare(Object obj, Object obj1)
        {
            return a((Sample)obj, (Sample)obj1);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Comparator
    {

        private static int a(Sample sample, Sample sample1)
        {
            if (sample.c < sample1.c)
            {
                return -1;
            }
            return sample1.c >= sample.c ? 0 : 1;
        }

        public final int compare(Object obj, Object obj1)
        {
            return a((Sample)obj, (Sample)obj1);
        }

        _cls2()
        {
        }
    }

}
