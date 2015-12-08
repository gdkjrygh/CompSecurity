// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;

final class bg extends bh
{

    private am a;
    private bb b;

    bg(bb bb1, View view, Animation animation, am am1)
    {
        b = bb1;
        a = am1;
        super(view, animation);
    }

    public final void onAnimationEnd(Animation animation)
    {
        super.onAnimationEnd(animation);
        if (a.k != null)
        {
            a.k = null;
            b.a(a, a.l, 0, 0, false);
        }
    }
}
