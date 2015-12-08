// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;

final class ftg
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private ftf a;

    ftg(ftf ftf1, fsv fsv1)
    {
        a = ftf1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.p = ((Float)a.j.getAnimatedValue()).floatValue();
        fsv.g(a.r).invalidate();
    }
}
