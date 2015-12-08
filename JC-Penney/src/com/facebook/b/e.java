// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.a.f;
import com.facebook.a.a;
import java.util.Iterator;
import java.util.Set;

public class e extends BroadcastReceiver
{

    private static e a;
    private Context b;

    private e(Context context)
    {
        b = context.getApplicationContext();
    }

    public static e a(Context context)
    {
        if (a != null)
        {
            return a;
        } else
        {
            a = new e(context);
            a.a();
            return a;
        }
    }

    private void a()
    {
        f.a(b).a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    private void b()
    {
        f.a(b).a(this);
    }

    protected void finalize()
    {
        b();
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public void onReceive(Context context, Intent intent)
    {
        context = com.facebook.a.a.b(context);
        String s = (new StringBuilder()).append("bf_").append(intent.getStringExtra("event_name")).toString();
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
