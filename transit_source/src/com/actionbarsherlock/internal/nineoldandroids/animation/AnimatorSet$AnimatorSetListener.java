// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            AnimatorSet, Animator

private class mAnimatorSet
    implements mAnimatorSet
{

    private AnimatorSet mAnimatorSet;
    final AnimatorSet this$0;

    public void onAnimationCancel(Animator animator)
    {
        if (mTerminated || AnimatorSet.access$2(AnimatorSet.this).size() != 0 || mListeners == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = mListeners.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((this._cls0)mListeners.get(i)).ationCancel(mAnimatorSet);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onAnimationEnd(Animator animator)
    {
        animator.removeListener(this);
        AnimatorSet.access$2(AnimatorSet.this).remove(animator);
        ((this._cls0)AnimatorSet.access$3(mAnimatorSet).get(animator)).mAnimatorSet = true;
        if (mTerminated) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        animator = AnimatorSet.access$4(mAnimatorSet);
        j = 1;
        k = animator.size();
        i = 0;
_L6:
        if (i >= k)
        {
            i = j;
        } else
        {
label0:
            {
                if (((mAnimatorSet)animator.get(i)).mAnimatorSet)
                {
                    break label0;
                }
                i = 0;
            }
        }
        if (i == 0) goto _L2; else goto _L3
_L3:
        if (mListeners == null) goto _L5; else goto _L4
_L4:
        animator = (ArrayList)mListeners.clone();
        j = animator.size();
        i = 0;
_L7:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_146;
        }
_L5:
        AnimatorSet.access$5(mAnimatorSet, false);
_L2:
        return;
        i++;
          goto _L6
        ((mAnimatorSet)animator.get(i)).ationEnd(mAnimatorSet);
        i++;
          goto _L7
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
