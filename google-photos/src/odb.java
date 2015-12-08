// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class odb
    implements mrx
{

    private final ocw a = new ocw();
    private final odf b;
    private final int c;

    odb(Context context)
    {
        b = new odf(context);
        c = b.g(context);
        if (c == 300)
        {
            throw new IllegalStateException("Context must have a bound AppId.");
        } else
        {
            return;
        }
    }

    static int a(odb odb1)
    {
        return odb1.c;
    }

    static odf b(odb odb1)
    {
        return odb1.b;
    }

    public final Thread.UncaughtExceptionHandler a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        return new odc(this, uncaughtexceptionhandler);
    }
}
