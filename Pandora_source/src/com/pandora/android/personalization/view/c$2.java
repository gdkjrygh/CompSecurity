// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.ValueAnimator;

// Referenced classes of package com.pandora.android.personalization.view:
//            c, d

class a
    implements android.animation.eAnimator.AnimatorUpdateListener
{

    final c a;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
        valueanimator = c.c(a);
        boolean flag;
        if (i >= 5 && i <= 7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        valueanimator.a(flag, c.b(a)[7]);
        c.c(a).a(c.b(a)[i]);
    }

    eListener(c c1)
    {
        a = c1;
        super();
    }
}
