// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.view.View;

public final class on
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private oq a;
    private View b;

    public on(oq oq1, View view)
    {
        a = oq1;
        b = view;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.a();
    }
}
