// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.widget.TextView;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.views:
//            PeekStack

class val.newPagerY
    implements android.animation.r.AnimatorUpdateListener
{

    final PeekStack this$0;
    final float val$newPagerY;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        getBackground().setAlpha((int)o.a(f, 0.0F, 1.0F, 1.0F, 0.0F));
        PeekStack.access$600(PeekStack.this).setAlpha(o.a(f, 0.0F, PeekStack.access$600(PeekStack.this).getAlpha(), 1.0F, 0.0F));
        PeekStack.access$100(PeekStack.this).setTranslationY(o.a(f, 0.0F, 0.0F, 1.0F, val$newPagerY));
    }

    or()
    {
        this$0 = final_peekstack;
        val$newPagerY = F.this;
        super();
    }
}
