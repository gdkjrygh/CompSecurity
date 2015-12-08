// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.config.ecs:
//            EcsClient

public class SkyLibEcsClient
    implements EcsClient
{

    private final SkyLib lib;

    public SkyLibEcsClient(SkyLib skylib)
    {
        lib = skylib;
    }

    public void addQueryParameter(String s, String s1, String s2)
    {
        lib.ecsAddQueryParameter(s, s1, s2);
    }

    public String getETag()
    {
        return lib.ecsGetETag();
    }

    public boolean getSettingAsBool(String s, String s1, boolean flag)
    {
        return lib.ecsGetSettingsAsBool(s, s1, flag);
    }

    public int getSettingAsInt(String s, String s1, int i)
    {
        return lib.ecsGetSettingsAsInt(s, s1, i);
    }

    public String getSettingAsString(String s, String s1, String s2)
    {
        return lib.ecsGetSettingsAsString(s, s1, s2);
    }

    public void removeQueryParameter(String s, String s1)
    {
        lib.ecsRemoveQueryParameter(s, s1);
    }

    public void removeQueryParameterByNamespace(String s)
    {
        lib.ecsRemoveQueryParameterByNamespace(s);
    }
}
