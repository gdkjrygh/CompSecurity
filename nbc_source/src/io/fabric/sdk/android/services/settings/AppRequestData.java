// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import java.util.Collection;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            IconRequest

public class AppRequestData
{

    public final String apiKey;
    public final String appId;
    public final String buildVersion;
    public final String builtSdkVersion;
    public final String displayVersion;
    public final IconRequest icon;
    public final String instanceIdentifier;
    public final String minSdkVersion;
    public final String name;
    public final Collection sdkKits;
    public final int source;

    public AppRequestData(String s, String s1, String s2, String s3, String s4, String s5, int i, 
            String s6, String s7, IconRequest iconrequest, Collection collection)
    {
        apiKey = s;
        appId = s1;
        displayVersion = s2;
        buildVersion = s3;
        instanceIdentifier = s4;
        name = s5;
        source = i;
        minSdkVersion = s6;
        builtSdkVersion = s7;
        icon = iconrequest;
        sdkKits = collection;
    }
}
