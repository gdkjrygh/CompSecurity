// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.pandora.android.personalization.view:
//            a

static final class a
    implements android.animation.eAnimator.AnimatorUpdateListener
{

    final View a;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
        valueanimator = a.getLayoutParams();
        valueanimator.width = i;
        a.setLayoutParams(valueanimator);
    }

    eListener(View view)
    {
        a = view;
        super();
    }
}
