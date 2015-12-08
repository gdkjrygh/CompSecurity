// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.animation.ValueAnimator;

// Referenced classes of package com.braintreepayments.cardform.view:
//            FloatingLabelEditText

class this._cls0
    implements android.animation.dateListener
{

    final FloatingLabelEditText this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        FloatingLabelEditText.access$202(FloatingLabelEditText.this, ((Integer)valueanimator.getAnimatedValue()).intValue());
        invalidate();
    }

    A()
    {
        this$0 = FloatingLabelEditText.this;
        super();
    }
}
