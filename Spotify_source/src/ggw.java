// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class ggw extends ggv
{

    private final Handler a;

    private ggw()
    {
        a = new Handler();
    }

    ggw(byte byte0)
    {
        this();
    }

    public final gha a(Runnable runnable)
    {
        return new ggx(runnable);
    }

    public final void a(gha gha)
    {
        a.post((Runnable)gha);
    }

    public final void b(gha gha)
    {
        a.removeCallbacks((Runnable)gha);
    }

    public final void c(gha gha)
    {
        a.postDelayed((Runnable)gha, 16L);
    }
}
