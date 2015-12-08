// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.snapchat.android.ui.ImageResourceView;

public final class xM extends xG
    implements xF
{
    final class a
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private xM a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            a.b.b(((Integer)valueanimator.getAnimatedValue()).intValue());
        }

        private a()
        {
            a = xM.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private ImageResourceView c;
    private int d;

    public xM(xG.a a1, ImageResourceView imageresourceview, View view, View view1)
    {
        super(a1, view, view1);
        c = imageresourceview;
    }

    public final android.animation.AnimatorSet.Builder a(AnimatorSet animatorset, int i, Rect rect)
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            a.getMeasuredHeight(), d
        });
        valueanimator.addUpdateListener(new a((byte)0));
        return super.a(animatorset, i, rect).with(valueanimator);
    }

    public final android.animation.AnimatorSet.Builder a(AnimatorSet animatorset, int i, Rect rect, boolean flag)
    {
        animatorset = super.a(animatorset, i, rect, flag);
        if (flag)
        {
            a();
            return animatorset;
        } else
        {
            rect = ValueAnimator.ofInt(new int[] {
                d, c.getRootView().getHeight()
            });
            rect.addUpdateListener(new a((byte)0));
            animatorset.with(rect);
            return animatorset;
        }
    }

    public final void a(Rect rect)
    {
        if (c.getDrawable() != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
            layoutparams.height = rect.height();
            a.setLayoutParams(layoutparams);
            d = layoutparams.height;
        }
    }
}
