// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

public abstract class q extends BroadcastReceiver
{

    public abstract void a(ArrayList arraylist);

    public void onReceive(Context context, Intent intent)
    {
        context = String.valueOf(intent);
        (new StringBuilder(String.valueOf(context).length() + 11)).append("onReceive: ").append(context);
        if (intent.getAction().equals("HWR_LANGUAGES"))
        {
            a(intent.getParcelableArrayListExtra("LANGUAGE_LIST"));
        }
    }

    public q()
    {
    }
}
