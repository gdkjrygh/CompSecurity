// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class this._cls0
    implements android.animation.atorUpdateListener
{

    final PagingIndicator this$0;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PagingIndicator.access$302(PagingIndicator.this, ((Float)valueanimator.getAnimatedValue()).floatValue());
        PagingIndicator.access$400(PagingIndicator.this).startIfNecessary(PagingIndicator.access$300(PagingIndicator.this));
        postInvalidateOnAnimation();
    }

    ndingRetreatAnimator()
    {
        this$0 = PagingIndicator.this;
        super();
    }
}
