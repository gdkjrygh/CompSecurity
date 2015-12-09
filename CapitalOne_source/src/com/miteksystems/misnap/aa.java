// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            u, MiSnap, MiSnapAPI, s

final class aa
    implements android.view.animation.Animation.AnimationListener
{

    final u a;

    aa(u u1)
    {
        a = u1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (u.K(a))
        {
            a.b.setVisible(true, true);
        }
        u.I(a).setVisibility(4);
        u.m(a).postDelayed(a.r, u.n(a).a.J());
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        u.I(a).setVisibility(0);
        animation = u.J(a);
        if (a.k != null)
        {
            a.k.a(animation);
        }
    }
}
