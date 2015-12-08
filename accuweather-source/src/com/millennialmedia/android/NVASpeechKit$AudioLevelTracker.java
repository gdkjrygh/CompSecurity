// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit

static class reset
{

    private static final double MAX = 80D;
    private static final double MIN = 40D;
    private static final double NORMALIZE_FACTOR = 4.0040040040040044D;
    private static final double SCALE = 9.9900000000000002D;
    double audioLevel;
    int audioLevelCount;
    double averageLevel;
    boolean isTrackingAudioSample;

    private static double normalize(double d)
    {
        return Math.min(9.9900000000000002D, Math.max(Math.floor(d - 40D) / 4.0040040040040044D, 0.0D));
    }

    public boolean isTrackingAudioSample()
    {
        return isTrackingAudioSample;
    }

    public void reset()
    {
        averageLevel = 0.0D;
        audioLevelCount = 0;
        isTrackingAudioSample = false;
    }

    public void startTrackingAudioSample()
    {
        reset();
        isTrackingAudioSample = true;
    }

    public boolean update(double d)
    {
        double d1 = averageLevel;
        double d2 = audioLevel;
        audioLevel = d;
        audioLevelCount = audioLevelCount + 1;
        for (averageLevel = ((double)(audioLevelCount - 1) * d1 + d) / (double)audioLevelCount; isTrackingAudioSample || audioLevel == d2;)
        {
            return false;
        }

        return true;
    }


    public ()
    {
        reset();
    }
}
