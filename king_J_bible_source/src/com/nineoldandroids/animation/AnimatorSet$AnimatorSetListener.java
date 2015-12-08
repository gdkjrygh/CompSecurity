// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.nineoldandroids.animation:
//            AnimatorSet, Animator

private class mAnimatorSet
    implements mAnimatorSet
{

    private AnimatorSet mAnimatorSet;
    final AnimatorSet this$0;

    public void onAnimationCancel(Animator animator)
    {
        if (!mTerminated && AnimatorSet.access$000(AnimatorSet.this).size() == 0 && mListeners != null)
        {
            int j = mListeners.size();
            for (int i = 0; i < j; i++)
            {
                ((this._cls0)mListeners.get(i)).ationCancel(mAnimatorSet);
            }

        }
    }

    public void onAnimationEnd(Animator animator)
    {
label0:
        {
            animator.removeListener(this);
            AnimatorSet.access$000(AnimatorSet.this).remove(animator);
            ((this._cls0)AnimatorSet.access$100(mAnimatorSet).get(animator)).mAnimatorSet = true;
            if (mTerminated)
            {
                break label0;
            }
            animator = AnimatorSet.access$200(mAnimatorSet);
            boolean flag1 = true;
            int k = animator.size();
            int i = 0;
label1:
            do
            {
label2:
                {
                    boolean flag = flag1;
                    if (i < k)
                    {
                        if (((mAnimatorSet)animator.get(i)).mAnimatorSet)
                        {
                            break label2;
                        }
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    if (mListeners != null)
                    {
                        animator = (ArrayList)mListeners.clone();
                        int j = animator.size();
                        for (i = 0; i < j; i++)
                        {
                            ((mAnimatorSet)animator.get(i)).ationEnd(mAnimatorSet);
                        }

                    }
                    break label1;
                }
                i++;
            } while (true);
            AnimatorSet.access$302(mAnimatorSet, false);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    (AnimatorSet animatorset1)
    {
        this$0 = AnimatorSet.this;
        super();
        mAnimatorSet = animatorset1;
    }
}
