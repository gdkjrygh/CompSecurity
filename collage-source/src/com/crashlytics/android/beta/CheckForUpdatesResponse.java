// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;


class CheckForUpdatesResponse
{

    public final String buildVersion;
    public final String displayVersion;
    public final String instanceId;
    public final String packageName;
    public final String url;
    public final String versionString;

    public CheckForUpdatesResponse(String s, String s1, String s2, String s3, String s4, String s5)
    {
        url = s;
        versionString = s1;
        displayVersion = s2;
        buildVersion = s3;
        packageName = s4;
        instanceId = s5;
    }
}
