// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.service.event;

import android.content.res.Configuration;

public class OnConfigurationChangedEvent
{

    protected Configuration newConfig;
    protected Configuration oldConfig;

    public OnConfigurationChangedEvent(Configuration configuration, Configuration configuration1)
    {
        oldConfig = configuration;
        newConfig = configuration1;
    }

    public Configuration getNewConfig()
    {
        return newConfig;
    }

    public Configuration getOldConfig()
    {
        return oldConfig;
    }
}
