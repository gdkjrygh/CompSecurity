// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.skype.android.util:
//            PropertyAnimationUtil

final class a
    implements android.animation.on._cls1
{

    final a a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        valueanimator = (Integer)valueanimator.getAnimatedValue();
        a(a).getLayoutParams().a = valueanimator.intValue();
        a(a).requestLayout();
    }

    ( )
    {
        a = ;
        super();
    }
}
