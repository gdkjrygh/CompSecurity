// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;


// Referenced classes of package com.soundcloud.android.creators.record:
//            CreateWaveView

static class spaceWidth
{

    private float accumulated;
    private float accumulations;
    private int barWidth;
    private float dumpIndex;
    private float groupIndex;
    private float groupValue;
    private final float spaceWidth;

    private void calculateGroupValue()
    {
        groupValue = getCurrentAverage();
        accumulations = 0.0F;
        accumulated = 0.0F;
    }

    private float getCurrentAverage()
    {
        return accumulated / accumulations;
    }

    float currentValue()
    {
        return groupValue;
    }

    void reset()
    {
        dumpIndex = -1F;
        groupValue = -1F;
        accumulations = 0.0F;
        accumulated = 0.0F;
        groupIndex = 0.0F;
    }

    boolean shouldShowSpace()
    {
        return dumpIndex > 0.0F;
    }

    void updateAmplitude(float f)
    {
        accumulated = accumulated + f;
        accumulations = accumulations + 1.0F;
        if (dumpIndex >= 0.0F)
        {
            if (dumpIndex == 0.0F)
            {
                calculateGroupValue();
            }
            dumpIndex = dumpIndex + 1.0F;
            if (dumpIndex == spaceWidth)
            {
                dumpIndex = -1F;
            }
        } else
        {
            if (groupIndex == 0.0F && getCurrentAverage() > groupValue)
            {
                calculateGroupValue();
            }
            groupIndex = groupIndex + 1.0F;
            if (groupIndex == (float)barWidth)
            {
                dumpIndex = 0.0F;
                groupIndex = 0.0F;
                return;
            }
        }
    }

    (int i, float f)
    {
        groupValue = -1F;
        groupIndex = 0.0F;
        dumpIndex = -1F;
        accumulated = 0.0F;
        accumulations = 0.0F;
        barWidth = i;
        spaceWidth = f;
    }
}
