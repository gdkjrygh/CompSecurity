// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//            StateListAnimator

class this._cls0
    implements android.view.animation.istener
{

    final StateListAnimator this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (StateListAnimator.access$000(StateListAnimator.this) == animation)
        {
            StateListAnimator.access$002(StateListAnimator.this, null);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = StateListAnimator.this;
        super();
    }
}
