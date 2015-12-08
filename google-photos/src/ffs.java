// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;

public final class ffs
    implements android.view.animation.Animation.AnimationListener
{

    private final View a;

    public ffs(View view)
    {
        a = view;
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
