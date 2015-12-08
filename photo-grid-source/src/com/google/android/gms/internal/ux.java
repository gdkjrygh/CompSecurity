// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.b;

abstract class ux extends BroadcastReceiver
{

    protected Context a;

    ux()
    {
    }

    public static ux a(Context context, ux ux1)
    {
        com.google.android.gms.common.b.a();
        return b(context, ux1);
    }

    public static ux b(Context context, ux ux1)
    {
        Object obj = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        ((IntentFilter) (obj)).addDataScheme("package");
        context.registerReceiver(ux1, ((IntentFilter) (obj)));
        ux1.a = context;
        obj = ux1;
        if (!com.google.android.gms.common.b.a(context, "com.google.android.gms"))
        {
            ux1.a();
            ux1.b();
            obj = null;
        }
        return ((ux) (obj));
    }

    protected abstract void a();

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.unregisterReceiver(this);
        }
        a = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getData();
        context = null;
        if (intent != null)
        {
            context = intent.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(context))
        {
            a();
            b();
        }
    }
}
