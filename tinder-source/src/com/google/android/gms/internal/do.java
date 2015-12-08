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

abstract class do extends BroadcastReceiver
{

    protected Context a;

    do()
    {
    }

    public static do a(Context context, do do1)
    {
        com.google.android.gms.common.b.a();
        return b(context, do1);
    }

    public static do b(Context context, do do1)
    {
        Object obj = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        ((IntentFilter) (obj)).addDataScheme("package");
        context.registerReceiver(do1, ((IntentFilter) (obj)));
        do1.a = context;
        obj = do1;
        if (!com.google.android.gms.common.b.a(context, "com.google.android.gms"))
        {
            do1.a();
            do1.b();
            obj = null;
        }
        return ((do) (obj));
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
