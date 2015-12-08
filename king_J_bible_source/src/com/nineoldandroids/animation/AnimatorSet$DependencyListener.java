// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.animation:
//            AnimatorSet, Animator

private static class mRule
    implements mRule
{

    private AnimatorSet mAnimatorSet;
    private startIfReady mNode;
    private int mRule;

    private void startIfReady(Animator animator)
    {
        if (!mAnimatorSet.mTerminated) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = null;
        int j = mNode.s.size();
        int i = 0;
        do
        {
label0:
            {
                mRule mrule = obj;
                if (i < j)
                {
                    mrule = (s)mNode.s.get(i);
                    if (mrule.s != mRule || mrule.mRule.mRule != animator)
                    {
                        break label0;
                    }
                    animator.removeListener(this);
                }
                mNode.s.remove(mrule);
                if (mNode.s.size() == 0)
                {
                    mNode.mNode.start();
                    AnimatorSet.access$000(mAnimatorSet).add(mNode.mNode);
                    return;
                }
            }
            if (true)
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        if (mRule == 1)
        {
            startIfReady(animator);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        if (mRule == 0)
        {
            startIfReady(animator);
        }
    }

    public (AnimatorSet animatorset,  , int i)
    {
        mAnimatorSet = animatorset;
        mNode = ;
        mRule = i;
    }
}
