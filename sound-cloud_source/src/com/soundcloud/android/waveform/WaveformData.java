// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.objects.MoreObjects;
import java.util.Arrays;

public class WaveformData
{

    public static final WaveformData EMPTY = new WaveformData(-1, new int[0]);
    public final int maxAmplitude;
    public final int samples[];

    public WaveformData(int i, int ai[])
    {
        maxAmplitude = i;
        samples = ai;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (WaveformData)obj;
            if (!MoreObjects.equal(Integer.valueOf(maxAmplitude), Integer.valueOf(((WaveformData) (obj)).maxAmplitude)) || !Arrays.equals(samples, ((WaveformData) (obj)).samples))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            Integer.valueOf(maxAmplitude)
        }) + Arrays.hashCode(samples);
    }

    public WaveformData scale(double d)
    {
        double d4;
        int i1;
        boolean flag;
        if (d >= 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "invalid width");
        d4 = (double)samples.length / d;
        i1 = (int)Math.ceil(d);
        if (d == (double)samples.length)
        {
            return this;
        }
        int ai[] = new int[i1];
        int i = 0;
        for (int j = 0; j < i1; j++)
        {
            d = (double)j * d4;
            double d5 = d4 * (double)(j + 1);
            int k = (int)d;
            d = 1.0D - (d - (double)k);
            double d1 = (double)samples[k] * d;
            for (k++; k < (int)d5 && k < samples.length; k++)
            {
                d1 += samples[k];
                d++;
            }

            double d3 = d;
            double d2 = d1;
            if (d5 < (double)samples.length)
            {
                int l = (int)d5;
                d3 = d5 - (double)l;
                d2 = d1 + (double)samples[l] * d3;
                d3 = d + d3;
            }
            ai[j] = (int)Math.round(d2 / d3);
            if (ai[j] > i)
            {
                i = ai[j];
            }
        }

        return new WaveformData(i, ai);
    }

}
