// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ProgressController, ProgressAnimator, ProgressHelper

class this._cls0 extends AnimatorListenerAdapter
{

    final ProgressController this$0;

    public void onAnimationEnd(Animator animator)
    {
        ProgressController.access$000(ProgressController.this).removeListener(this);
        ProgressController.access$200(ProgressController.this).setValueFromProportion(ProgressController.access$100(ProgressController.this), 0.0F);
    }

    ()
    {
        this$0 = ProgressController.this;
        super();
    }
}
