// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;

import com.tinder.model.GlobalConfig;
import com.tinder.model.UserMeta;

public class EventGlobalsLoaded
{

    private GlobalConfig globalConfig;
    private UserMeta userMeta;

    public EventGlobalsLoaded(GlobalConfig globalconfig, UserMeta usermeta)
    {
        globalConfig = globalconfig;
        userMeta = usermeta;
    }

    public GlobalConfig getGlobalConfig()
    {
        return globalConfig;
    }

    public UserMeta getUserMeta()
    {
        return userMeta;
    }
}
