// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.text.TextUtils;

public final class AppContentContext
{

    public final int clientVersion;
    public final String experimentOverride[];
    public final String screenName;

    public AppContentContext(String s, int i, String as[])
    {
        experimentOverride = as;
        screenName = s;
        clientVersion = i;
    }

    public final String getExperimentOverrideString()
    {
        if (experimentOverride == null || experimentOverride.length == 0)
        {
            return "";
        } else
        {
            return TextUtils.join(",", experimentOverride);
        }
    }
}
