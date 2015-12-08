// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class val.this._cls0
    implements android.animation.icator.PendingRetreatAnimator._cls1
{

    final is._cls0 this$1;
    final PagingIndicator val$this$0;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PagingIndicator.access$1202(_fld0, ((Float)valueanimator.getAnimatedValue()).floatValue());
        postInvalidateOnAnimation();
        valueanimator = PagingIndicator.access$1100(_fld0);
        int j = valueanimator.length;
        for (int i = 0; i < j; i++)
        {
            valueanimator[i].rtIfNecessary(PagingIndicator.access$1200(_fld0));
        }

    }

    ()
    {
        this$1 = final_;
        val$this$0 = PagingIndicator.this;
        super();
    }
}
