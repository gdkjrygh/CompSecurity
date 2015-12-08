// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class odc
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private odb b;

    odc(odb odb1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        b = odb1;
        a = uncaughtexceptionhandler;
        super();
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Bundle bundle = new Bundle();
        ocw.a(bundle, odb.a(b));
        ocw.a(bundle, null);
        odb.b(b).a(new obu(null), bundle);
        if (a != null)
        {
            a.uncaughtException(thread, throwable);
        }
    }
}
