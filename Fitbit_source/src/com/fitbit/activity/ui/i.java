// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Intent;
import android.text.TextUtils;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.util.threading.c;

public abstract class i extends c
{

    public i()
    {
    }

    protected void a(Intent intent)
    {
        if (intent != null && TextUtils.equals("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED", intent.getAction()))
        {
            intent = (LiveDataPacket)intent.getParcelableExtra("com.fitbit.livedata.LiveDataBroadcaster.EXTRA_LIVE_DATA_PACKET");
            if (intent != null)
            {
                a(((LiveDataPacket) (intent)));
            }
        }
    }

    protected abstract void a(LiveDataPacket livedatapacket);
}
