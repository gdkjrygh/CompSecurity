// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.time.Clock;

public class DeviceModule
{

    public DeviceModule()
    {
    }

    static PreferencesManager a()
    {
        return Preferences.persisted();
    }

    static Clock b()
    {
        return Clock.a;
    }
}
