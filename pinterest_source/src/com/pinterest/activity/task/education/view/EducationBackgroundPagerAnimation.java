// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.view.View;

public class EducationBackgroundPagerAnimation
    implements android.support.v4.view.ModifiedViewPager.PageTransformer
{

    private static final float MIN_ALPHA = 0.5F;
    private static final float MIN_SCALE = 0.5F;

    public EducationBackgroundPagerAnimation()
    {
    }

    public void transformPage(View view, float f, boolean flag, int i)
    {
        i = view.getWidth();
        int j = view.getHeight();
        if (f >= -1F && f <= 1.0F)
        {
            float f1;
            float f2;
            float f3;
            if (f <= 0.0F)
            {
                f1 = Math.min(1.0F, Math.max(0.5F, 1.15F + f));
            } else
            {
                f1 = Math.max(0.5F, 1.0F - f);
            }
            f2 = ((float)j * (1.0F - f1)) / 2.0F;
            f3 = ((float)i * (1.0F - f1)) / 2.0F;
            if (f < 0.0F)
            {
                view.setTranslationX(f3 - f2 / 2.0F);
            } else
            {
                view.setTranslationX(-f3 + f2 / 2.0F);
            }
            view.setScaleX(f1);
            view.setScaleY(f1);
            view.setAlpha(((f1 - 0.5F) / 0.5F) * 0.5F + 0.5F);
            return;
        } else
        {
            view.setAlpha(0.0F);
            return;
        }
    }
}
