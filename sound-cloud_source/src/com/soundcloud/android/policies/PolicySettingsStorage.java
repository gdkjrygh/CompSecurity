// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.content.SharedPreferences;

public class PolicySettingsStorage
{

    private static final String LAST_POLICY_CHECK_TIME = "last_policy_check_time";
    private static final String LAST_POLICY_UPDATE_TIME = "last_policy_update_time";
    private final SharedPreferences sharedPreferences;

    public PolicySettingsStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public long getLastPolicyCheckTime()
    {
        return sharedPreferences.getLong("last_policy_check_time", -1L);
    }

    public long getPolicyUpdateTime()
    {
        return sharedPreferences.getLong("last_policy_update_time", -1L);
    }

    public void setLastPolicyCheckTime(long l)
    {
        sharedPreferences.edit().putLong("last_policy_check_time", l).apply();
    }

    public void setPolicyUpdateTime(long l)
    {
        sharedPreferences.edit().putLong("last_policy_update_time", l).apply();
    }
}
