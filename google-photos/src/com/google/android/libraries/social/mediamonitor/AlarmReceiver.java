// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.mediamonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import nks;
import olm;

public final class AlarmReceiver extends BroadcastReceiver
{

    public AlarmReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!TextUtils.equals("com.google.android.libraries.social.mediamonitor.FIRE_ALARM", intent.getAction()))
        {
            return;
        } else
        {
            ((nks)olm.a(context, nks)).a(intent);
            return;
        }
    }
}
