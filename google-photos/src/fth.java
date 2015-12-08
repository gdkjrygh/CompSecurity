// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;

final class fth
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    private ftf a;

    fth(ftf ftf1, fsv fsv1)
    {
        a = ftf1;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        valueanimator = a;
        int i = (int)(((Float)a.k.getAnimatedValue()).floatValue() * 255F);
        ((ftf) (valueanimator)).b.setAlpha((int)(((float)((ftf) (valueanimator)).c * (float)i) / 255F));
        ((ftf) (valueanimator)).f.setAlpha(i);
        fsv.g(a.r).invalidate();
    }
}
