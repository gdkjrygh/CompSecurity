// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.base.Device;
import com.pinterest.experience.ExperienceEnabled;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experience.NuxDisplayData;
import com.pinterest.experience.NuxStep;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXProgressCell

public class NUXProgressIndicatorView extends LinearLayout
    implements ExperienceEnabled
{

    public static int INTERESTS_STEP = 5;
    public int FACEBOOK_STEP;
    private int MAX_STEPS;
    private int SOCIAL_STEP;
    public int TWITTER_STEP;
    private int _interestStep;
    private boolean _isFbComplete;
    private boolean _isTwitterComplete;
    private boolean isFirstInterest;

    public NUXProgressIndicatorView(Context context)
    {
        super(context, null);
        MAX_STEPS = 7;
        _interestStep = 0;
        _isFbComplete = false;
        _isTwitterComplete = false;
        SOCIAL_STEP = 2;
        FACEBOOK_STEP = 6;
        TWITTER_STEP = 7;
        isFirstInterest = true;
    }

    public NUXProgressIndicatorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        MAX_STEPS = 7;
        _interestStep = 0;
        _isFbComplete = false;
        _isTwitterComplete = false;
        SOCIAL_STEP = 2;
        FACEBOOK_STEP = 6;
        TWITTER_STEP = 7;
        isFirstInterest = true;
        init();
    }

    private void init()
    {
        initIndicators();
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0x7f0a0173));
        setBackgroundColor(getResources().getColor(0x7f0e0074));
        setVisibility(4);
    }

    private void initIndicators()
    {
        applyExperience();
        int k = (int)(Device.getScreenWidth() / (float)MAX_STEPS);
        int j = 0;
        while (j < MAX_STEPS) 
        {
            NUXProgressCell nuxprogresscell = new NUXProgressCell(getContext());
            nuxprogresscell.setLayoutParams(new android.view.ViewGroup.LayoutParams(k + 1, (int)com.pinterest.kit.application.Resources.dimension(0x7f0a0173)));
            nuxprogresscell.setTag(Integer.valueOf(j));
            addView(nuxprogresscell);
            int i = 0x7f02023a;
            if (isFirstInterest)
            {
                if (j < INTERESTS_STEP)
                {
                    nuxprogresscell.setBackgroundColor(com.pinterest.kit.application.Resources.color(0x7f0e000a));
                } else
                {
                    nuxprogresscell.setBackgroundColor(com.pinterest.kit.application.Resources.color(0x7f0e006d));
                    i = 0x7f02023b;
                }
            } else
            if (j >= SOCIAL_STEP)
            {
                nuxprogresscell.setBackgroundColor(com.pinterest.kit.application.Resources.color(0x7f0e000a));
            } else
            {
                nuxprogresscell.setBackgroundColor(com.pinterest.kit.application.Resources.color(0x7f0e006d));
                i = 0x7f02023b;
            }
            nuxprogresscell.setIndicatorResource(i);
            j++;
        }
        _interestStep = 0;
        _isFbComplete = false;
        _isTwitterComplete = false;
        updateIndicators(0, 0);
    }

    private void updateIndicators(int i, int j)
    {
        int l = 0;
_L3:
        if (l >= getChildCount()) goto _L2; else goto _L1
_L1:
        NUXProgressCell nuxprogresscell;
        int k;
        int i1;
        if (!(getChildAt(l) instanceof NUXProgressCell))
        {
            continue; /* Loop/switch isn't completed */
        }
        nuxprogresscell = (NUXProgressCell)getChildAt(l);
        i1 = l + 1;
        AnimatorSet animatorset;
        if (i1 == FACEBOOK_STEP && _isFbComplete)
        {
            k = com.pinterest.kit.application.Resources.color(0x7f0e003f);
        } else
        if (i1 == TWITTER_STEP && _isTwitterComplete)
        {
            k = com.pinterest.kit.application.Resources.color(0x7f0e00bb);
        } else
        if (isFirstInterest)
        {
            if (i1 <= INTERESTS_STEP && i1 <= _interestStep)
            {
                k = com.pinterest.kit.application.Resources.color(0x7f0e005f);
            } else
            {
                if (i1 <= INTERESTS_STEP)
                {
                    break MISSING_BLOCK_LABEL_359;
                }
                k = com.pinterest.kit.application.Resources.color(0x7f0e006d);
            }
        } else
        if (i1 > SOCIAL_STEP && i1 <= SOCIAL_STEP + _interestStep)
        {
            k = com.pinterest.kit.application.Resources.color(0x7f0e005f);
        } else
        {
            if (i1 > SOCIAL_STEP)
            {
                break MISSING_BLOCK_LABEL_359;
            }
            k = com.pinterest.kit.application.Resources.color(0x7f0e006d);
        }
_L4:
        if (isFirstInterest && j == 1 && i1 == i)
        {
            nuxprogresscell.setProgressColor(k);
            animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(nuxprogresscell.getProgress(), "translationX", new float[] {
                    (float)(-nuxprogresscell.getWidth()), 0.0F
                })
            });
            animatorset.start();
        } else
        if (isFirstInterest && j == -1 && i1 == i)
        {
            AnimatorSet animatorset1 = new AnimatorSet();
            animatorset1.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(nuxprogresscell.getProgress(), "translationX", new float[] {
                    0.0F, (float)(-nuxprogresscell.getWidth())
                })
            });
            animatorset1.start();
        } else
        {
            nuxprogresscell.setProgressColor(k);
        }
        l++;
          goto _L3
_L2:
        return;
        k = 0;
          goto _L4
    }

    public void applyExperience()
    {
        Object obj;
        byte byte0;
        byte0 = 2;
        obj = Experiences.a(Experiences.b);
        break MISSING_BLOCK_LABEL_10;
        if (obj != null && (((ExperienceValue) (obj)).f instanceof NuxDisplayData))
        {
            obj = (NuxDisplayData)((ExperienceValue) (obj)).f;
            NuxStep nuxstep = ((NuxDisplayData) (obj)).a();
            if (nuxstep != null)
            {
                isFirstInterest = ((NuxDisplayData) (obj)).b;
                if (nuxstep.l > 0)
                {
                    INTERESTS_STEP = nuxstep.l;
                }
                int i;
                if (nuxstep.j > 1)
                {
                    i = 2;
                } else
                {
                    i = 0;
                }
                SOCIAL_STEP = i;
                MAX_STEPS = INTERESTS_STEP + SOCIAL_STEP;
                if (isFirstInterest)
                {
                    i = INTERESTS_STEP + 1;
                } else
                {
                    i = 1;
                }
                FACEBOOK_STEP = i;
                i = byte0;
                if (isFirstInterest)
                {
                    i = INTERESTS_STEP + 2;
                }
                TWITTER_STEP = i;
                return;
            }
        }
        return;
    }

    public void updateProgress(com.pinterest.activity.nux.NUXActivity.NUXProgressChangeEvent nuxprogresschangeevent)
    {
        int i;
        boolean flag;
        boolean flag2;
        i = 0;
        flag2 = true;
        flag = true;
        if (nuxprogresschangeevent.getEventType() == null)
        {
            return;
        }
        if (nuxprogresschangeevent.getEventType() != com.pinterest.activity.nux.NUXActivity.NUXProgressChangeEvent.EventType.FACEBOOK) goto _L2; else goto _L1
_L1:
        if (nuxprogresschangeevent.getStepChange() != 1)
        {
            flag = false;
        }
        _isFbComplete = flag;
        i = FACEBOOK_STEP;
_L4:
        updateIndicators(i, nuxprogresschangeevent.getStepChange());
        return;
_L2:
        if (nuxprogresschangeevent.getEventType() == com.pinterest.activity.nux.NUXActivity.NUXProgressChangeEvent.EventType.TWITTER)
        {
            boolean flag1;
            if (nuxprogresschangeevent.getStepChange() == 1)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            _isTwitterComplete = flag1;
            i = TWITTER_STEP;
        } else
        if (_interestStep + nuxprogresschangeevent.getStepChange() >= 0)
        {
            _interestStep = _interestStep + nuxprogresschangeevent.getStepChange();
            if (nuxprogresschangeevent.getStepChange() == 1)
            {
                i = _interestStep;
            } else
            {
                i = _interestStep + 1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
