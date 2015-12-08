// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;

final class fsz
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private fsv a;

    fsz(fsv fsv1)
    {
        a = fsv1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        fsv.g(a).invalidate();
    }
}
