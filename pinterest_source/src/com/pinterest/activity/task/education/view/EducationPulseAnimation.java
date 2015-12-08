// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.pinterest.schemas.experiences.EducationAction;
import com.pinterest.ui.spring.SpringInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nl.codesoup.CubicBezierInterpolator;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationPulseGraphic

public class EducationPulseAnimation
{

    private AnimatorSet _anim;
    private float _initX;
    private float _initY;

    public EducationPulseAnimation()
    {
    }

    private void swipeAnimation(final EducationPulseGraphic pulse, EducationAction educationaction, View view)
    {
        float f;
        String s;
        _anim = new AnimatorSet();
        s = "";
        f = 0.0F;
        _cls3..SwitchMap.com.pinterest.schemas.experiences.EducationAction[educationaction.ordinal()];
        JVM INSTR tableswitch 1 4: default 56
    //                   1 539
    //                   2 561
    //                   3 582
    //                   4 604;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        educationaction = s;
_L7:
        pulse.setScaleX(0.6F);
        pulse.setScaleY(0.6F);
        pulse.setAlpha(0.0F);
        educationaction = ObjectAnimator.ofFloat(pulse, educationaction, new float[] {
            f
        }).setDuration(550L);
        educationaction.setStartDelay(700L);
        view = ObjectAnimator.ofFloat(pulse, "alpha", new float[] {
            1.0F
        }).setDuration(200L);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(pulse, "alpha", new float[] {
            1.0F
        }).setDuration(500L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(pulse, "alpha", new float[] {
            0.0F
        }).setDuration(550L);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(pulse, "scaleX", new float[] {
            0.8F
        }).setDuration(450L);
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(pulse, "scaleX", new float[] {
            0.8F
        }).setDuration(250L);
        ObjectAnimator objectanimator4 = ObjectAnimator.ofFloat(pulse, "scaleX", new float[] {
            0.5F
        }).setDuration(150L);
        ObjectAnimator objectanimator5 = ObjectAnimator.ofFloat(pulse, "scaleX", new float[] {
            0.5F
        }).setDuration(400L);
        objectanimator2.setInterpolator(new SpringInterpolator(0.6F, 0.25F));
        ObjectAnimator objectanimator6 = ObjectAnimator.ofFloat(pulse, "scaleY", new float[] {
            0.8F
        }).setDuration(450L);
        ObjectAnimator objectanimator7 = ObjectAnimator.ofFloat(pulse, "scaleY", new float[] {
            0.8F
        }).setDuration(250L);
        ObjectAnimator objectanimator8 = ObjectAnimator.ofFloat(pulse, "scaleY", new float[] {
            0.5F
        }).setDuration(150L);
        ObjectAnimator objectanimator9 = ObjectAnimator.ofFloat(pulse, "scaleY", new float[] {
            0.5F
        }).setDuration(400L);
        objectanimator6.setInterpolator(new SpringInterpolator(0.6F, 0.25F));
        _anim.play(view).with(objectanimator2).with(objectanimator6).with(educationaction);
        _anim.play(view).before(objectanimator);
        _anim.play(objectanimator).before(objectanimator1);
        _anim.play(objectanimator2).before(objectanimator3);
        _anim.play(objectanimator3).before(objectanimator4);
        _anim.play(objectanimator4).before(objectanimator5);
        _anim.play(objectanimator6).before(objectanimator7);
        _anim.play(objectanimator7).before(objectanimator8);
        _anim.play(objectanimator8).before(objectanimator9);
        _anim.addListener(new _cls2());
        _anim.start();
        return;
_L2:
        educationaction = "translationY";
        f = -((float)view.getMeasuredHeight() * 0.6F) + _initY;
        continue; /* Loop/switch isn't completed */
_L3:
        educationaction = "translationY";
        f = (float)view.getMeasuredHeight() * 0.6F + _initY;
        continue; /* Loop/switch isn't completed */
_L4:
        educationaction = "translationX";
        f = -((float)view.getMeasuredWidth() * 0.6F) + _initX;
        continue; /* Loop/switch isn't completed */
_L5:
        educationaction = "translationX";
        f = (float)view.getMeasuredWidth() * 0.6F + _initX;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void tapAnimation(EducationPulseGraphic educationpulsegraphic)
    {
        _anim = new AnimatorSet();
        ArrayList arraylist = new ArrayList();
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(0L);
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(educationpulsegraphic.getOuter(), "scaleX", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getOuter(), "scaleY", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getOuter(), "alpha", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getInner(), "scaleX", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getInner(), "scaleY", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getInner(), "alpha", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic, "scaleX", new float[] {
                0.8F
            }), ObjectAnimator.ofFloat(educationpulsegraphic, "scaleY", new float[] {
                0.8F
            }), ObjectAnimator.ofFloat(educationpulsegraphic, "alpha", new float[] {
                0.0F
            })
        });
        arraylist.add(animatorset);
        animatorset = new AnimatorSet();
        animatorset.setInterpolator(new CubicBezierInterpolator(0.55F));
        animatorset.setDuration(200L);
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(educationpulsegraphic, "scaleX", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic, "scaleY", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(educationpulsegraphic, "alpha", new float[] {
                1.0F
            })
        });
        arraylist.add(animatorset);
        animatorset = new AnimatorSet();
        animatorset.setInterpolator(new CubicBezierInterpolator(0.55F));
        animatorset.setDuration(200L);
        animatorset.setStartDelay(50L);
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(educationpulsegraphic, "scaleX", new float[] {
                0.75F
            }), ObjectAnimator.ofFloat(educationpulsegraphic, "scaleY", new float[] {
                0.75F
            }), ObjectAnimator.ofFloat(educationpulsegraphic, "alpha", new float[] {
                1.0F
            })
        });
        arraylist.add(animatorset);
        animatorset = new AnimatorSet();
        animatorset.setDuration(1400L);
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(educationpulsegraphic.getOuter(), "scaleX", new float[] {
                1.4F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getOuter(), "scaleY", new float[] {
                1.4F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getOuter(), "alpha", new float[] {
                0.0F
            })
        });
        AnimatorSet animatorset1 = new AnimatorSet();
        animatorset1.setDuration(700L);
        animatorset1.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(educationpulsegraphic.getInner(), "scaleX", new float[] {
                1.3F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getInner(), "scaleY", new float[] {
                1.3F
            }), ObjectAnimator.ofFloat(educationpulsegraphic.getInner(), "alpha", new float[] {
                0.0F
            })
        });
        educationpulsegraphic = new AnimatorSet();
        educationpulsegraphic.setStartDelay(50L);
        educationpulsegraphic.setInterpolator(new CubicBezierInterpolator(0.0F));
        educationpulsegraphic.playTogether(new Animator[] {
            animatorset, animatorset1
        });
        arraylist.add(educationpulsegraphic);
        _anim.addListener(new _cls1());
        _anim.playSequentially(arraylist);
        _anim.start();
    }

    public void cancel(EducationPulseGraphic educationpulsegraphic)
    {
        if (_anim == null)
        {
            return;
        }
        _anim.removeAllListeners();
        for (Iterator iterator = _anim.getChildAnimations().iterator(); iterator.hasNext(); ((Animator)iterator.next()).cancel()) { }
        _anim.cancel();
        _anim = null;
        educationpulsegraphic.clearAnimation();
        educationpulsegraphic.getOuter().clearAnimation();
        educationpulsegraphic.getInner().clearAnimation();
        educationpulsegraphic.setTranslationX(_initX);
        educationpulsegraphic.setTranslationY(_initY);
        educationpulsegraphic.getOuter().setAlpha(1.0F);
        educationpulsegraphic.getInner().setAlpha(1.0F);
    }

    public void perform(EducationPulseGraphic educationpulsegraphic, EducationAction educationaction, View view)
    {
        _initX = educationpulsegraphic.getX();
        _initY = educationpulsegraphic.getY();
        if (educationaction == EducationAction.TAP)
        {
            tapAnimation(educationpulsegraphic);
            return;
        } else
        {
            swipeAnimation(educationpulsegraphic, educationaction, view);
            return;
        }
    }




    private class _cls3
    {

        static final int $SwitchMap$com$pinterest$schemas$experiences$EducationAction[];

        static 
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationAction = new int[EducationAction.values().length];
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_UP.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_DOWN.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_LEFT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_RIGHT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationPulseAnimation this$0;
        final EducationPulseGraphic val$pulse;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            pulse.setScaleX(0.6F);
            pulse.setScaleY(0.6F);
            pulse.setTranslationX(_initX);
            pulse.setTranslationY(_initY);
            _anim.setStartDelay(500L);
            _anim.start();
        }

        _cls2()
        {
            this$0 = EducationPulseAnimation.this;
            pulse = educationpulsegraphic;
            super();
        }
    }


    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationPulseAnimation this$0;

        public void onAnimationCancel(Animator animator)
        {
            if (_anim != null)
            {
                _anim.setStartDelay(600L);
                _anim.start();
            }
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(null);
        }

        _cls1()
        {
            this$0 = EducationPulseAnimation.this;
            super();
        }
    }

}
