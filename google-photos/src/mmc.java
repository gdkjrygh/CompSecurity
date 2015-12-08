// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

final class mmc extends mka
{

    private mmb a;

    mmc(mmb mmb1)
    {
        a = mmb1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a(animator))
        {
            mmb.a(a, null);
        } else
        {
            mmb.a(a, mmb.a(a), false);
            a.b();
            if (mmb.b(a) != null)
            {
                mmb.b(a).run();
                mmb.a(a, null);
                return;
            }
        }
    }
}
