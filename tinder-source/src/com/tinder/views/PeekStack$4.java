// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package com.tinder.views:
//            PeekStack

class this._cls0
    implements android.animation.r.AnimatorUpdateListener
{

    final PeekStack this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PeekStack.access$600(PeekStack.this).setAlpha(valueanimator.getAnimatedFraction());
        getBackground().setAlpha(((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    or()
    {
        this$0 = PeekStack.this;
        super();
    }
}
