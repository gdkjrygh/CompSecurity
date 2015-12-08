// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public class FeaturesSettingsData
{

    public final boolean collectAnalytics;
    public final boolean collectLoggedException;
    public final boolean collectReports;
    public final boolean promptEnabled;

    public FeaturesSettingsData(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        promptEnabled = flag;
        collectLoggedException = flag1;
        collectReports = flag2;
        collectAnalytics = flag3;
    }
}
