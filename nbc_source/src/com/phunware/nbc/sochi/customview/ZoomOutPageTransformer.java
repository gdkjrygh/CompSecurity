// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.customview;

import android.view.View;
import com.phunware.nbc.sochi.system.NBCSystem;

public class ZoomOutPageTransformer
    implements android.support.v4.view.ViewPager.PageTransformer
{

    private static float MIN_ALPHA = 0.5F;
    private static float MIN_SCALE = 0.85F;

    public ZoomOutPageTransformer()
    {
    }

    public void transformPage(View view, float f)
    {
        if (NBCSystem.IS_TAB)
        {
            view.setRotationY(-30F * f);
            return;
        }
        int i = view.getWidth();
        int j = view.getHeight();
        if (f < -1F)
        {
            view.setAlpha(0.0F);
            return;
        }
        if (f <= 1.0F)
        {
            float f1 = Math.max(MIN_SCALE, 1.0F - Math.abs(f));
            float f2 = ((float)j * (1.0F - f1)) / 2.0F;
            float f3 = ((float)i * (1.0F - f1)) / 2.0F;
            if (f < 0.0F)
            {
                view.setTranslationX(f3 - f2 / 2.0F);
            } else
            {
                view.setTranslationX(-f3 + f2 / 2.0F);
            }
            view.setScaleX(f1);
            view.setScaleY(f1);
            view.setAlpha(MIN_ALPHA + ((f1 - MIN_SCALE) / (1.0F - MIN_SCALE)) * (1.0F - MIN_ALPHA));
            return;
        } else
        {
            view.setAlpha(0.0F);
            return;
        }
    }

}
