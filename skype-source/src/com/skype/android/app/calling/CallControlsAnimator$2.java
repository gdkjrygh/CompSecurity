// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.animation.ValueAnimator;

// Referenced classes of package com.skype.android.app.calling:
//            CallControlsAnimator

final class this._cls0
    implements android.animation.pdateListener
{

    final CallControlsAnimator this$0;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Float)valueanimator.getAnimatedValue()).intValue();
        if (CallControlsAnimator.access$100(CallControlsAnimator.this) != null)
        {
            CallControlsAnimator.access$100(CallControlsAnimator.this).onCallControlsAnimationUpdate(i);
        }
    }

    llControlsAnimationListener()
    {
        this$0 = CallControlsAnimator.this;
        super();
    }
}
