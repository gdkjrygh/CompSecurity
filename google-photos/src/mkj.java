// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Choreographer;

final class mkj extends mkd
{

    private Choreographer a;

    public mkj()
    {
        a = Choreographer.getInstance();
    }

    public final void a(mkf mkf1)
    {
        a.postFrameCallback(mkf1.b());
    }

    public final void b(mkf mkf1)
    {
        a.removeFrameCallback(mkf1.b());
    }
}
