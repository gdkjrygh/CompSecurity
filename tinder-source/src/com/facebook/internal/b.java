// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.b.d;
import com.facebook.appevents.AppEventsLogger;
import java.util.Iterator;
import java.util.Set;

public final class b extends BroadcastReceiver
{

    private static b a;
    private Context b;

    private b(Context context)
    {
        b = context.getApplicationContext();
    }

    public static b a(Context context)
    {
        if (a != null)
        {
            return a;
        } else
        {
            context = new b(context);
            a = context;
            d.a(((b) (context)).b).a(context, new IntentFilter("com.parse.bolts.measurement_event"));
            return a;
        }
    }

    protected final void finalize()
        throws Throwable
    {
        d.a(b).a(this);
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = AppEventsLogger.c(context);
        String s = (new StringBuilder("bf_")).append(intent.getStringExtra("event_name")).toString();
        intent = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        String s1;
        for (Iterator iterator = intent.keySet().iterator(); iterator.hasNext(); bundle.putString(s1.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String)intent.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        context.a(s, bundle);
    }
}
