// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.content.Intent;
import com.skype.SkyLib;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.util.NetworkUtil;

public class SeamlessCapabilityReceiver extends SkypeBroadcastReceiver
{

    SkyLib lib;
    NetworkUtil networkUtil;

    public SeamlessCapabilityReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        if (intent == null)
        {
            context = null;
        } else
        {
            context = intent.getAction();
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = networkUtil.g();
            lib.setSeamlessCapable(flag);
        }
    }
}
