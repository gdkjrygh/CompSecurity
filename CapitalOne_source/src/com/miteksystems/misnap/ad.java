// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            u

final class ad
    implements android.view.animation.Animation.AnimationListener
{

    final u a;

    ad(u u1)
    {
        a = u1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        u.i(a).setVisibility(4);
        u.d(a, false);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        u.d(a, true);
    }
}
