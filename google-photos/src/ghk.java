// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

final class ghk
    implements Runnable
{

    private ghj a;

    ghk(ghj ghj1)
    {
        a = ghj1;
        super();
    }

    public final void run()
    {
        a.a.cancel();
        a.a.start();
    }
}
