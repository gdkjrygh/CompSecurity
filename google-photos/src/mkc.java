// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

final class mkc extends mkf
{

    private mkb a;

    mkc(mkb mkb1)
    {
        a = mkb1;
        super();
    }

    public final void a()
    {
        if (!a.a(a.a) && !a.a.isStarted())
        {
            if (mkb.a(a) != null)
            {
                mkb.a(a).run();
            }
            a.a.start();
        }
    }
}
