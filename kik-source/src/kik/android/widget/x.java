// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package kik.android.widget:
//            y, FragmentContainerFrame

final class x
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final FragmentContainerFrame b;

    x(FragmentContainerFrame fragmentcontainerframe, View view)
    {
        b = fragmentcontainerframe;
        a = view;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.setVisibility(4);
        b.post(new y(this));
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
