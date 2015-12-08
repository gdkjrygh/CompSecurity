// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class isl
    implements Runnable
{

    private isk a;

    isl(isk isk1)
    {
        a = isk1;
        super();
    }

    public final void run()
    {
        isk.a(a);
        isk.c(a).postDelayed(isk.b(a), 8000L);
    }
}
