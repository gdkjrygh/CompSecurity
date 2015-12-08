// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dmz;
import faq;
import fos;

public class SleepTimerManager extends BroadcastReceiver
{

    public SleepTimerManager()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        dmz.a(fos);
        fos.e(context);
        (new faq(context)).a();
    }
}
