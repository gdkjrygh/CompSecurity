// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Choreographer;

final class ggy extends ggv
{

    private ggy()
    {
    }

    ggy(byte byte0)
    {
        this();
    }

    public final gha a(Runnable runnable)
    {
        return new ggz(runnable);
    }

    public final void a(gha gha)
    {
        Choreographer.getInstance().postFrameCallback((android.view.Choreographer.FrameCallback)gha);
    }

    public final void b(gha gha)
    {
        Choreographer.getInstance().removeFrameCallback((android.view.Choreographer.FrameCallback)gha);
    }

    public final void c(gha gha)
    {
        Choreographer.getInstance().postFrameCallbackDelayed((android.view.Choreographer.FrameCallback)gha, 16L);
    }
}
