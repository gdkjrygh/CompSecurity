// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.RelativeLayout;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            d

public class ProgressView extends RelativeLayout
{
    private final class a
    {

        final ProgressView a;
        private int b;
        private int c[];
        private int d[];
        private AnimatorSet e;

        private AnimatorSet c()
        {
            Object aobj[] = new Keyframe[c.length];
            for (int i = 0; i < c.length; i++)
            {
                aobj[i] = Keyframe.ofFloat((new float[] {
                    0.0F, 0.15F, 0.65F, 0.8F, 1.0F
                })[i], c[i]);
            }

            aobj[c.length - 1].setInterpolator(new OvershootInterpolator(1.0F));
            Object obj = PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, ((Keyframe []) (aobj)));
            aobj = new ObjectAnimator[5];
            for (int j = 0; j < 5; j++)
            {
                ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(a.getChildAt(j), new PropertyValuesHolder[] {
                    obj
                });
                objectanimator.setDuration(b);
                objectanimator.setRepeatCount(-1);
                objectanimator.setStartDelay(d[j]);
                aobj[j] = objectanimator;
            }

            obj = new AnimatorSet();
            ((AnimatorSet) (obj)).playTogether(((android.animation.Animator []) (aobj)));
            return ((AnimatorSet) (obj));
        }

        public final boolean a()
        {
            if (!e.isRunning())
            {
                e.start();
                return true;
            } else
            {
                return false;
            }
        }

        public final boolean b()
        {
            if (e.isRunning())
            {
                e.end();
                return true;
            } else
            {
                return false;
            }
        }

        public a(int i)
        {
            a = ProgressView.this;
            super();
            int j = Math.round((float)i / 25F);
            float f = (float)i / 10F + 30F;
            int l = Math.round((float)i * 0.416666F);
            int i1 = Math.round((float)i * 0.166668F);
            float f1 = (float)(i1 * 1000) / f;
            float f2 = (f1 / 0.3333F - f1) / 2.0F;
            int k = Math.round((float)(j * 1000) / f);
            j = k;
            if (k > 333)
            {
                j = 333;
            }
            d = (new int[] {
                0, j, j * 2, j * 3, j * 4
            });
            b = Math.round((float)j * 4F + (2.0F * f2 + f1) + 250F);
            c = (new int[] {
                ProgressView.a(a) * -1, l, l + i1, ProgressView.a(a) + i, ProgressView.a(a) * -1
            });
            e = c();
        }
    }


    private static final int a = Color.rgb(121, 121, 121);
    private a b;
    private int c;

    public ProgressView(Context context)
    {
        super(context);
        c();
    }

    public ProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c();
    }

    public ProgressView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c();
    }

    static int a(ProgressView progressview)
    {
        return progressview.c;
    }

    private void c()
    {
        android.util.DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        c = d.a(2.6F, displaymetrics);
        int i = d.a(2.6F, displaymetrics);
        setPadding(0, i, 0, i);
        for (int j = 0; j < 5; j++)
        {
            View view = new View(getContext());
            view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(c, c));
            view.setBackgroundColor(a);
            view.setX(c * -1);
            addView(view);
        }

        b = new a(getWidth());
    }

    public final boolean a()
    {
        return b != null && b.a();
    }

    public final boolean b()
    {
        return b != null && b.b();
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        boolean flag = b();
        b = new a(i);
        if (flag)
        {
            a();
        }
    }

}
