// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.apps.translate.anim.a;

// Referenced classes of package com.google.android.apps.translate.widget:
//            FloatingInputCard

public final class f extends a
{

    final FloatingInputCard a;

    public f(FloatingInputCard floatinginputcard)
    {
        a = floatinginputcard;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        FloatingInputCard.c(a).getLayoutParams().height = -2;
        FloatingInputCard.c(a).requestLayout();
    }
}
