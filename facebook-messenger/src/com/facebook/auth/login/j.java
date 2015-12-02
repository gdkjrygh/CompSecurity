// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.animation.AnimationSet;
import android.widget.ImageView;

// Referenced classes of package com.facebook.auth.login:
//            g, AuthFragmentLogoViewGroup, k

class j
    implements Runnable
{

    final Runnable a;
    final g b;

    j(g g1, Runnable runnable)
    {
        b = g1;
        a = runnable;
        super();
    }

    public void run()
    {
        AnimationSet animationset = g.a(b, AuthFragmentLogoViewGroup.access$1200(b.a), AuthFragmentLogoViewGroup.access$600(b.a));
        AnimationSet animationset1 = g.a(b, AuthFragmentLogoViewGroup.access$1400(b.a), AuthFragmentLogoViewGroup.access$800(b.a));
        animationset.setDuration(500L);
        animationset1.setDuration(500L);
        animationset.setAnimationListener(new k(this));
        AuthFragmentLogoViewGroup.access$1200(b.a).startAnimation(animationset);
        AuthFragmentLogoViewGroup.access$1400(b.a).startAnimation(animationset1);
        b.a.postDelayed(a, 375L);
    }
}
