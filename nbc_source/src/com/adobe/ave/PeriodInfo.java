// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public class PeriodInfo
{

    public long duration;
    public int firstCuePointIndex;
    public int firstSubscribedTagIndex;
    public int lastCuePointIndex;
    public int lastSubscribedTagIndex;
    public long localStartTime;
    public boolean supportsTrickPlay;
    public long targetDuration;
    public int userData;
    public long virtualStartTime;

    private PeriodInfo(int i, long l, long l1, long l2, 
            int j, int k, int i1, int j1, boolean flag, long l3)
    {
        userData = i;
        localStartTime = l;
        virtualStartTime = l1;
        duration = l2;
        firstCuePointIndex = j;
        lastCuePointIndex = k;
        supportsTrickPlay = flag;
        firstSubscribedTagIndex = i1;
        lastSubscribedTagIndex = j1;
        targetDuration = l3;
    }
}
