// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;

final class az
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final Drawable b;

    az(View view, Drawable drawable)
    {
        a = view;
        b = drawable;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.setBackgroundDrawable(b);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
