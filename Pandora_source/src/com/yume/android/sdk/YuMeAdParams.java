// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


// Referenced classes of package com.yume.android.sdk:
//            YuMeStorageMode

public class YuMeAdParams
{

    public String adServerUrl;
    public int adTimeout;
    public Boolean bEnableAutoPrefetch;
    public Boolean bEnableCBToggle;
    public Boolean bEnableCaching;
    public Boolean bEnableConsoleLogging;
    public Boolean bEnableFileLogging;
    public Boolean bEnableLocationSupport;
    public Boolean bRequireVastAds;
    public Boolean bSupport3GPP;
    public Boolean bSupportAutoNetworkDetect;
    public Boolean bSupportHighBitRate;
    public Boolean bSupportMP4;
    public String domainId;
    public String qsParams;
    public YuMeStorageMode storageMode;
    public float storageSize;
    public int videoTimeout;

    public YuMeAdParams()
    {
        bEnableCaching = Boolean.valueOf(true);
        bEnableAutoPrefetch = Boolean.valueOf(true);
        bEnableCBToggle = Boolean.valueOf(true);
        bEnableLocationSupport = Boolean.valueOf(true);
        bEnableFileLogging = Boolean.valueOf(true);
        bEnableConsoleLogging = Boolean.valueOf(true);
        storageMode = YuMeStorageMode.NONE;
        bRequireVastAds = Boolean.valueOf(true);
    }
}
