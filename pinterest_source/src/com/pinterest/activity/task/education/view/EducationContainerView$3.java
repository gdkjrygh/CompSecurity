// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationContainerView

class val.uri extends com.pinterest.kit.utils.istener
{

    final EducationContainerView this$0;
    final int val$destination;
    final String val$uri;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        EducationContainerView.access$600(EducationContainerView.this, val$destination, val$uri);
    }

    I()
    {
        this$0 = final_educationcontainerview;
        val$destination = i;
        val$uri = String.this;
        super();
    }
}
