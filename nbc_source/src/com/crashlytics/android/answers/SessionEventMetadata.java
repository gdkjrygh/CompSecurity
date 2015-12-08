// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


public final class SessionEventMetadata
{

    public final String advertisingId;
    public final String androidId;
    public final String appBundleId;
    public final String appVersionCode;
    public final String appVersionName;
    public final String betaDeviceToken;
    public final String buildId;
    public final String deviceModel;
    public final String executionId;
    public final String installationId;
    public final String osVersion;

    public SessionEventMetadata(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10)
    {
        appBundleId = s;
        executionId = s1;
        installationId = s2;
        androidId = s3;
        advertisingId = s4;
        betaDeviceToken = s5;
        buildId = s6;
        osVersion = s7;
        deviceModel = s8;
        appVersionCode = s9;
        appVersionName = s10;
    }
}
