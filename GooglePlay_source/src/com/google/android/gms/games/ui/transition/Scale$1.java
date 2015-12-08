// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            Scale

final class this._cls0
    implements android.animation.mator.AnimatorUpdateListener
{

    final Scale this$0;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        Scale.access$002(Scale.this, ((Float)valueanimator.getAnimatedValue()).floatValue());
    }

    ner()
    {
        this$0 = Scale.this;
        super();
    }
}
