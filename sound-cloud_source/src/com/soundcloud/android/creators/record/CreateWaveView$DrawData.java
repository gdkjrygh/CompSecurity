// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;


// Referenced classes of package com.soundcloud.android.creators.record:
//            CreateWaveView

static class currentAmplitudeHelper
{

    private litudeData ampData;
    private final float baselineRatio;
    private final plitudeHelper currentAmplitudeHelper;
    private int endIndex;
    public int height;
    public int lastDrawX;
    public int recIndex;
    public int size;
    private int startIndex;

    private int getAmplitudePoints(float af[], float af1[], float af2[], float af3[])
    {
        int i = 0;
        float f = (float)height * baselineRatio;
        float f1 = height;
        float f2 = height;
        float f3 = baselineRatio;
        currentAmplitudeHelper.reset();
        int j = 0;
        while (i < lastDrawX && j < af.length + 3) 
        {
            currentAmplitudeHelper.updateAmplitude(getInterpolatedValue(i, lastDrawX));
            float f4 = currentAmplitudeHelper.currentValue();
            float af4[];
            float af5[];
            if (currentAmplitudeHelper.shouldShowSpace())
            {
                af4 = af2;
            } else
            {
                af4 = af;
            }
            if (currentAmplitudeHelper.shouldShowSpace())
            {
                af5 = af3;
            } else
            {
                af5 = af1;
            }
            af4[j] = i;
            af4[j + 1] = f - f4 * f;
            af4[j + 2] = i;
            af4[j + 3] = f;
            af5[j] = i;
            af5[j + 1] = f;
            af5[j + 2] = i;
            af5[j + 3] = f4 * (f1 - f2 * f3) + f;
            j += 4;
            i++;
        }
        return lastDrawX * 4;
    }

    public void configure(litudeData litudedata, float f, boolean flag, boolean flag1, int i, int j)
    {
        ampData = litudedata;
        height = i;
        if (flag1)
        {
            i = ampData.preRecSize;
        } else
        {
            i = litudedata.recordStartIndexWithTrim;
        }
        if (flag)
        {
            if (ampData.totalSize < j)
            {
                startIndex = (int)((float)i - (float)i * f);
            } else
            if (ampData.writtenSize < j)
            {
                startIndex = i - (int)((float)(j - ampData.writtenSize) * f);
            } else
            {
                startIndex = Math.max(0, i + (int)((float)(ampData.writtenSize - j) * f));
            }
        } else
        if (ampData.totalSize < j)
        {
            startIndex = Math.max(0, (int)((float)i * f));
        } else
        {
            int k = ampData.totalSize;
            startIndex = (int)Math.max(0.0F, (float)(ampData.totalSize - j) - (float)(k - j - i) * f);
        }
        if (flag1)
        {
            i = ampData.totalSize;
        } else
        {
            i = litudedata.recordEndIndexWithTrim;
        }
        endIndex = i;
        size = endIndex - startIndex;
        recIndex = Math.max(0, ampData.preRecSize - startIndex);
        if (flag)
        {
            i = j;
            if (size < j)
            {
                i = (int)((float)j - (float)(j - size) * f);
            }
            lastDrawX = i;
            return;
        }
        i = j;
        if (size < j)
        {
            i = (int)((float)size + (float)(j - size) * f);
        }
        lastDrawX = i;
    }

    public float get(int i)
    {
        return ampData.get(startIndex + i);
    }

    public float getInterpolatedValue(int i, int j)
    {
        if (size > j)
        {
            return get((int)Math.min(size - 1, ((float)i / (float)j) * (float)size));
        } else
        {
            float f = Math.min(size - 1, ((float)size * (float)i) / (float)j);
            float f1 = get((int)Math.floor(f));
            float f2 = get((int)Math.ceil(f));
            return (f - (float)(int)f) * (f2 - f1) + f1;
        }
    }


    public plitudeHelper(float f, plitudeHelper plitudehelper)
    {
        baselineRatio = f;
        currentAmplitudeHelper = plitudehelper;
    }
}
