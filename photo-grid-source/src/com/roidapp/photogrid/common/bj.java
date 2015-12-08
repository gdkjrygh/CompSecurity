// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.roidapp.photogrid.common:
//            be

final class bj
    implements android.view.animation.Animation.AnimationListener
{

    final be a;

    bj(be be1)
    {
        a = be1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (be.e(a) != null)
        {
            be.e(a).setVisibility(8);
            be.e(a).removeAllViews();
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
