// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class val.leftJoiningDot
    implements android.animation.atorUpdateListener
{

    final PagingIndicator this$0;
    final int val$leftJoiningDot;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PagingIndicator.access$600(PagingIndicator.this, val$leftJoiningDot, valueanimator.getAnimatedFraction());
    }

    I()
    {
        this$0 = final_pagingindicator;
        val$leftJoiningDot = I.this;
        super();
    }
}
