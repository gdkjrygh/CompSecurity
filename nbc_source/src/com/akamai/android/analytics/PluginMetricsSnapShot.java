// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            InternalCodes

class PluginMetricsSnapShot
{

    float averageFpsSum500ms;
    long currentMaxBandwidth;
    int heartBeatInterval;
    int isSessionWithRebufferLimit;
    float playBackBitRateSum500ms;
    int total500msCount;
    long totalBandwidthSum500ms;

    public PluginMetricsSnapShot(int i, float f, long l, float f1, long l1, 
            int j, int k)
    {
        total500msCount = 0;
        playBackBitRateSum500ms = 0.0F;
        totalBandwidthSum500ms = 0L;
        averageFpsSum500ms = 0.0F;
        currentMaxBandwidth = 0L;
        heartBeatInterval = 0;
        isSessionWithRebufferLimit = InternalCodes.DEFAULT_ISSESSIONWITHREBUFFER_LIMIT;
        total500msCount = i;
        playBackBitRateSum500ms = f;
        totalBandwidthSum500ms = l;
        averageFpsSum500ms = f1;
        currentMaxBandwidth = l1;
        heartBeatInterval = j;
        isSessionWithRebufferLimit = k;
    }
}
