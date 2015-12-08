// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            m

final class a
    implements android.view.animation.ation.AnimationListener
{

    final b a;
    final m b;

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
        a.b();
        on on = a;
        on.a(on.a());
        a.a(a.e);
        if (b.b)
        {
            b.b = false;
            animation.setDuration(1332L);
            a.a(false);
            return;
        } else
        {
            m.a(b, (m.a(b) + 1.0F) % 5F);
            return;
        }
    }

    public final void onAnimationStart(Animation animation)
    {
        m.a(b, 0.0F);
    }

    on(m m1, on on)
    {
        b = m1;
        a = on;
        super();
    }
}
