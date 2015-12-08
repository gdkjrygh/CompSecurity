// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            ap, al

final class an
    implements android.view.animation.Animation.AnimationListener
{

    final ap a;
    final al b;

    an(al al1, ap ap1)
    {
        b = al1;
        a = ap1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
        a.b();
        ap ap1 = a;
        ap1.a(ap1.a());
        a.a(a.e);
        if (b.b)
        {
            b.b = false;
            animation.setDuration(1332L);
            a.a(false);
            return;
        } else
        {
            al.a(b, (al.a(b) + 1.0F) % 5F);
            return;
        }
    }

    public final void onAnimationStart(Animation animation)
    {
        al.a(b, 0.0F);
    }
}
