// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;

final class ipx
    implements android.view.animation.Animation.AnimationListener
{

    private ipu a;

    ipx(ipu ipu1)
    {
        a = ipu1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        ipu.d(a).setVisibility(8);
        ((am) (a)).r.a(((am) (a)).t, ipu.e(a), ipu.f(a));
        a.O_().c().c();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
