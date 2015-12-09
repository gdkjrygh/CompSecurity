// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;

public final class bls
    implements Thread.UncaughtExceptionHandler
{

    final Thread.UncaughtExceptionHandler a;
    private final bmc b;
    private final Context c;
    private blr d;
    private blt e;

    public bls(bmc bmc1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Context context)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        a = uncaughtexceptionhandler;
        b = bmc1;
        d = new bmb(context, new ArrayList());
        c = context.getApplicationContext();
        context = new StringBuilder("ExceptionReporter created, original handler is ");
        if (uncaughtexceptionhandler == null)
        {
            bmc1 = "null";
        } else
        {
            bmc1 = uncaughtexceptionhandler.getClass().getName();
        }
        bmo.b(context.append(bmc1).toString());
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = "UncaughtException";
        if (d != null)
        {
            bmc bmc1;
            bly bly1;
            if (thread != null)
            {
                obj = thread.getName();
            } else
            {
                obj = null;
            }
            obj = d.a(((String) (obj)), throwable);
        }
        bmo.b((new StringBuilder("Reporting uncaught exception: ")).append(((String) (obj))).toString());
        bmc1 = b;
        bly1 = new bly();
        bly1.a("&exd", ((String) (obj)));
        bly1.a("&exf", bmz.a());
        bmc1.a(bly1.a());
        if (e == null)
        {
            e = blt.a(c);
        }
        obj = e;
        ((bod) (obj)).e.c().b();
        ((bod) (obj)).e.c().c();
        if (a != null)
        {
            bmo.b("Passing exception to the original handler");
            a.uncaughtException(thread, throwable);
        }
    }
}
