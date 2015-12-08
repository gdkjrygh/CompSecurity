// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.os.Handler;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXAnimatedPinView

class ner extends com.pinterest.kit.utils.ionListener
{

    final NUXAnimatedPinView this$0;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        if (_adapter != null)
        {
            NUXAnimatedPinView.access$500(NUXAnimatedPinView.this).postDelayed(animateRunnable, 400L);
        }
    }

    ner()
    {
        this$0 = NUXAnimatedPinView.this;
        super();
    }
}
