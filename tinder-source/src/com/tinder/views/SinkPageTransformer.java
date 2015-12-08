// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.views:
//            FadingLayout

public class SinkPageTransformer
    implements android.support.v4.view.ViewPager.g
{

    private static final float END_BOUNDARY = 0F;
    private static final float MIN_ALPHA = 0.85F;
    private static final float MIN_SCALE = 1F;
    private static final float NO_OFFSET = 0F;
    private static final float PAGE_HIDE_THRESHOLD = 1.2F;
    private static final float SLOW_DOWN_UNTIL_BOUNDARY = 0.2F;
    private static final float SPEED_UP_UNTIL_BOUNDARY = 0.35F;
    private static final float START_BOUNDARY = 1F;
    private float mOvershootMargin;
    private boolean mShouldBounce;

    public SinkPageTransformer(Context context)
    {
        mShouldBounce = true;
        mOvershootMargin = context.getResources().getDimensionPixelSize(0x7f090164);
    }

    public void setShouldBounce(boolean flag)
    {
        mShouldBounce = false;
    }

    public void transformPage(View view, float f)
    {
        int i = view.getWidth();
        if (f >= -1F)
        {
            if (f <= 0.0F)
            {
                if (view.getVisibility() == 8)
                {
                    view.setVisibility(0);
                }
                float f1 = o.a(1.0F + f, 0.0F, 0.0F, 1.0F, 1.0F);
                float f3 = o.a(1.0F + f, 0.0F, 0.85F, 1.0F, 1.0F);
                if (view instanceof FadingLayout)
                {
                    ((FadingLayout)view).setTransitionPercent(1.0F - f1);
                }
                view.setAlpha(f3);
                view.setTranslationX(((float)i / 1.2F) * -f);
                f = (1.0F - Math.abs(f)) * 0.0F + 1.0F;
                view.setScaleX(f);
                view.setScaleY(f);
                if (view.getAlpha() == 0.85F)
                {
                    view.setVisibility(8);
                }
                return;
            }
            if (f <= 1.0F)
            {
                view.setVisibility(0);
                if (mShouldBounce)
                {
                    float f2;
                    if (f > 0.35F)
                    {
                        f2 = o.a(f, 1.0F, 0.0F, 0.35F, -i);
                    } else
                    if (f > 0.2F)
                    {
                        f2 = o.a(f, 0.2F, (float)(-i) - mOvershootMargin, 0.35F, -i);
                    } else
                    {
                        f2 = o.a(f, 0.0F, -i, 0.2F, (float)(-i) - mOvershootMargin);
                    }
                    f = f2 + (float)i * (1.0F - f);
                } else
                {
                    f = 0.0F;
                }
                view.setTranslationX(f);
                view.setScaleX(1.0F);
                view.setScaleY(1.0F);
                return;
            }
        }
        view.setVisibility(8);
    }
}
