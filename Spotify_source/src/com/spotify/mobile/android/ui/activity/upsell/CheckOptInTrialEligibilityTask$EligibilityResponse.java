// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class mTrialDuration
    implements JacksonModel
{

    private final int mTrialDuration;
    private final boolean mViable;

    public int getTrialDurationDays()
    {
        return mTrialDuration;
    }

    public boolean isViable()
    {
        return mViable;
    }

    public (boolean flag, int i)
    {
        mViable = flag;
        mTrialDuration = i;
    }
}
