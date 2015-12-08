// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


// Referenced classes of package io.fabric.sdk.android.services.settings:
//            AppIconSettingsData

public class AppSettingsData
{

    public static final String STATUS_ACTIVATED = "activated";
    public static final String STATUS_CONFIGURED = "configured";
    public static final String STATUS_NEW = "new";
    public final AppIconSettingsData icon;
    public final String identifier;
    public final String reportsUrl;
    public final String status;
    public final boolean updateRequired;
    public final String url;

    public AppSettingsData(String s, String s1, String s2, String s3, boolean flag, AppIconSettingsData appiconsettingsdata)
    {
        identifier = s;
        status = s1;
        url = s2;
        reportsUrl = s3;
        updateRequired = flag;
        icon = appiconsettingsdata;
    }
}
