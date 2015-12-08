// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.api;

import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.c.d;

public class WearAPI
{

    DominosPrefs_ mPrefs;

    public WearAPI()
    {
    }

    public boolean isWearIntroTriggered()
    {
        return mPrefs.triggredWearIntro().a(Boolean.valueOf(false)).booleanValue();
    }

    public void setTriggerWearIntro(boolean flag)
    {
        mPrefs.triggredWearIntro().b(Boolean.valueOf(flag));
    }
}
