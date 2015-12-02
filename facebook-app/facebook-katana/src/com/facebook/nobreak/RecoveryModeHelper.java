// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import java.io.File;

public class RecoveryModeHelper
{

    private static final String a = com/facebook/nobreak/RecoveryModeHelper.getSimpleName();
    private static final RecoveryModeHelper d = new RecoveryModeHelper();
    private boolean b;
    private boolean c;

    RecoveryModeHelper()
    {
        b = false;
        c = false;
    }

    public static RecoveryModeHelper a()
    {
        return d;
    }

    static String a(RecoveryModeHelper recoverymodehelper, Context context)
    {
        return c(context);
    }

    public static void b()
    {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    private static String c(Context context)
    {
        return (new File(context.getDir("recovery", 0).getAbsolutePath(), "recovery_file")).getAbsolutePath();
    }

    public final void a(Context context, Handler handler, Runnable runnable)
    {
        (new _cls1(context, handler, runnable)).start();
    }

    public final boolean a(Context context)
    {
        if (b)
        {
            return c;
        }
        b = true;
        context = new File(c(context));
        if (System.currentTimeMillis() - context.lastModified() < 60000L)
        {
            c = true;
        } else
        {
            context.delete();
        }
        return c;
    }

    public final void b(Context context)
    {
        (new File(c(context))).delete();
        context.sendBroadcast(new Intent(context, com/facebook/nobreak/RecoveryModeHelper$MainProcessReceiver));
        c = false;
    }


    private class _cls1 extends Thread
    {

        final Context a;
        final Handler b;
        final Runnable c;
        final RecoveryModeHelper d;

        public void run()
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(RecoveryModeHelper.a(d, a));
            NobreakUtils.a(a, arraylist);
            HandlerDetour.a(b, c, 0x6f0ae8b6);
        }

        _cls1(Context context, Handler handler, Runnable runnable)
        {
            d = RecoveryModeHelper.this;
            a = context;
            b = handler;
            c = runnable;
            super();
        }
    }

}
