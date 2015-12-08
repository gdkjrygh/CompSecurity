// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;


// Referenced classes of package com.skype.android.config:
//            ApplicationConfig

public class OnApplicationConfigUpdated
{

    private ApplicationConfig config;

    public OnApplicationConfigUpdated(ApplicationConfig applicationconfig)
    {
        config = applicationconfig;
    }

    public ApplicationConfig getConfig()
    {
        return config;
    }
}
