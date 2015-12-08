// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

abstract class cmt extends BroadcastReceiver
{

    private Context a;

    cmt()
    {
    }

    public static cmt a(Context context, cmt cmt1)
    {
        bqi.a();
        return b(context, cmt1);
    }

    public static cmt b(Context context, cmt cmt1)
    {
        Object obj = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        ((IntentFilter) (obj)).addDataScheme("package");
        context.registerReceiver(cmt1, ((IntentFilter) (obj)));
        cmt1.a = context;
        obj = cmt1;
        if (!bqi.a(context, "com.google.android.gms"))
        {
            cmt1.a();
            cmt1.b();
            obj = null;
        }
        return ((cmt) (obj));
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
