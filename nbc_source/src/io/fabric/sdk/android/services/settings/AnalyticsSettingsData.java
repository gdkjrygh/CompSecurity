// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public class AnalyticsSettingsData
{

    public final String analyticsURL;
    public final int flushIntervalSeconds;
    public final int maxByteSizePerFile;
    public final int maxFileCountPerSend;
    public final int maxPendingSendFileCount;

    public AnalyticsSettingsData(String s, int i, int j, int k, int l)
    {
        analyticsURL = s;
        flushIntervalSeconds = i;
        maxByteSizePerFile = j;
        maxFileCountPerSend = k;
        maxPendingSendFileCount = l;
    }
}
