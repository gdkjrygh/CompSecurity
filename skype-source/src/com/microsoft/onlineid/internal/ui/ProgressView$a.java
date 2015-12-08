// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.OvershootInterpolator;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            ProgressView

private final class c
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

    public (ProgressView progressview, int i)
    {
        a = progressview;
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
