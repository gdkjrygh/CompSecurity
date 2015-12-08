// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.preference.Preference;

public class OnPreferenceChangedEvent
{

    private Object newValue;
    private Preference preference;

    public OnPreferenceChangedEvent(Preference preference1, Object obj)
    {
        preference = preference1;
        newValue = obj;
    }

    public Object getNewValue()
    {
        return newValue;
    }

    public Preference getPreference()
    {
        return preference;
    }
}
