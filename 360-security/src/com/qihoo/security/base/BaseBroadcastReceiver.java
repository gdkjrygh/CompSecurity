// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public abstract class BaseBroadcastReceiver extends BroadcastReceiver
{

    protected String a;

    public BaseBroadcastReceiver()
    {
    }

    protected abstract void a(Context context, Intent intent);

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            a = intent.getAction();
            a(context, intent);
        }
    }
}
