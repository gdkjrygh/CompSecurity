// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.observers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.dncs.DncsHelper;
import com.fitbit.e.a;

public abstract class DncsObserver extends BroadcastReceiver
{

    private static final String a = "DncsObserver";

    public DncsObserver()
    {
    }

    public abstract void a(Context context, Intent intent);

    protected boolean a(Context context)
    {
        return DncsHelper.a();
    }

    public final void onReceive(Context context, Intent intent)
    {
        com.fitbit.e.a.a("DncsObserver", String.valueOf(intent), new Object[0]);
        if (a(context))
        {
            a(context, intent);
            return;
        } else
        {
            com.fitbit.e.a.a("DncsObserver", "Observer is disabled", new Object[0]);
            return;
        }
    }
}
