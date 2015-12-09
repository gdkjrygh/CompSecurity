// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.repository;

import android.content.Context;
import com.netflix.mediaclient.util.PreferenceUtils;

public class PlayerRepository
{

    private boolean displayDebugData;

    PlayerRepository(Context context)
    {
        displayDebugData = false;
        displayDebugData = PreferenceUtils.getBooleanPref(context, "ui.playeroverlay", false);
    }

    public boolean isDisplayDebugData()
    {
        return displayDebugData;
    }

    public void setDisplayDebugData(boolean flag)
    {
        displayDebugData = flag;
    }
}
