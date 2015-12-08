// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public class SettingsRequest
{

    public final String apiKey;
    public final String buildVersion;
    public final String deviceId;
    public final String displayVersion;
    public final String iconHash;
    public final String instanceId;
    public final int source;

    public SettingsRequest(String s, String s1, String s2, String s3, String s4, int i, String s5)
    {
        apiKey = s;
        deviceId = s1;
        instanceId = s2;
        displayVersion = s3;
        buildVersion = s4;
        source = i;
        iconHash = s5;
    }
}
