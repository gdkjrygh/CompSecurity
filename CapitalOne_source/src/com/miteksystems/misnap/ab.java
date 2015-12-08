// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            u, MiSnap

final class ab
    implements android.view.animation.Animation.AnimationListener
{

    final u a;

    ab(u u1)
    {
        a = u1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        u.c(a, false);
        u.p(a).setVisibility(0);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        u.c(a, true);
        u.n(a).a(R.string.uxp_ghost_image_begins);
    }
}
