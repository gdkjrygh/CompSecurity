// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.antivirus.update:
//            UpdateService

private class <init> extends BroadcastReceiver
{

    final UpdateService a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getStringExtra("com.qihoo.action.INTENT_EXTRA_PRODUCT");
            int i = intent.getIntExtra("com.qihoo.action.INTENT_EXTRA_UPDATE_STOP_TYPE", 0);
            intent = Message.obtain();
            intent.what = 2;
            intent.obj = context;
            intent.arg1 = i;
            UpdateService.g.sendMessage(intent);
        }
    }

    private (UpdateService updateservice)
    {
        a = updateservice;
        super();
    }

    a(UpdateService updateservice, a a1)
    {
        this(updateservice);
    }
}
