// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.fragment;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;

// Referenced classes of package com.pinterest.activity.task.education.fragment:
//            EducationBackgroundPageFragment

class this._cls0 extends com.pinterest.kit.utils.ckgroundPageFragment._cls2
{

    final EducationBackgroundPageFragment this$0;

    public void onAnimationCancel(Animator animator)
    {
label0:
        {
            super.nAnimationCancel(animator);
            if (EducationBackgroundPageFragment.access$300(EducationBackgroundPageFragment.this) != null)
            {
                if (!(EducationBackgroundPageFragment.access$300(EducationBackgroundPageFragment.this).getBackground() instanceof BitmapDrawable))
                {
                    break label0;
                }
                animator = ((BitmapDrawable)EducationBackgroundPageFragment.access$300(EducationBackgroundPageFragment.this).getBackground()).getBitmap();
                EducationBackgroundPageFragment.access$300(EducationBackgroundPageFragment.this).setBackgroundDrawable(null);
                if (animator != null)
                {
                    animator.recycle();
                }
            }
            return;
        }
        EducationBackgroundPageFragment.access$300(EducationBackgroundPageFragment.this).setBackgroundDrawable(null);
    }

    public void onAnimationEnd(Animator animator)
    {
        onAnimationCancel(animator);
    }

    ()
    {
        this$0 = EducationBackgroundPageFragment.this;
        super();
    }
}
