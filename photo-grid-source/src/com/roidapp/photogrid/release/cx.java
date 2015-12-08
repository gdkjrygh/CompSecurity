// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.animation.Animation;

// Referenced classes of package com.roidapp.photogrid.release:
//            cs, PhotoGridActivity

final class cx
    implements android.view.animation.Animation.AnimationListener
{

    final cs a;

    cx(cs cs1)
    {
        a = cs1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        cs.d(a).b(false);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
