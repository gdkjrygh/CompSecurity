// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationPulsarView

class this._cls0 extends AnimatorListenerAdapter
{

    final EducationPulsarView this$0;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        EducationPulsarView.access$000(EducationPulsarView.this).start();
    }

    ()
    {
        this$0 = EducationPulsarView.this;
        super();
    }
}
