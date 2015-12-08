// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.google.android.play.animation.PlayInterpolators;
import java.util.Map;

public final class LevelViewSharedTransition extends Transition
{

    private static final String sTransitionProperties[] = {
        "android:silhouetteExpando:bounds", "android:silhouetteExpando:windowX", "android:silhouetteExpando:windowY"
    };
    private Rect mEndBounds;
    private boolean mIsEntering;
    private Rect mStartBounds;
    private int mTempLocation[];

    public LevelViewSharedTransition(boolean flag)
    {
        mTempLocation = new int[2];
        mIsEntering = flag;
    }

    private void captureValues(TransitionValues transitionvalues)
    {
        Object obj = (TextView)transitionvalues.view;
        obj = new Rect(((TextView) (obj)).getLeft(), ((TextView) (obj)).getTop(), ((TextView) (obj)).getRight(), ((TextView) (obj)).getBottom());
        transitionvalues.values.put("android:silhouetteExpando:bounds", obj);
        transitionvalues.view.getLocationInWindow(mTempLocation);
        transitionvalues.values.put("android:silhouetteExpando:windowX", Integer.valueOf(mTempLocation[0]));
        transitionvalues.values.put("android:silhouetteExpando:windowY", Integer.valueOf(mTempLocation[1]));
    }

    public final void captureEndValues(TransitionValues transitionvalues)
    {
        captureValues(transitionvalues);
    }

    public final void captureStartValues(TransitionValues transitionvalues)
    {
        captureValues(transitionvalues);
    }

    public final Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
    {
        if (transitionvalues != null && transitionvalues1 != null)
        {
            mStartBounds = (Rect)transitionvalues.values.get("android:silhouetteExpando:bounds");
            mEndBounds = (Rect)transitionvalues1.values.get("android:silhouetteExpando:bounds");
            transitionvalues1 = (TextView)transitionvalues1.view;
            float f = (float)mStartBounds.width() / (float)mEndBounds.width();
            float f1 = (float)mStartBounds.height() / (float)mEndBounds.height();
            int i = (mStartBounds.left + mStartBounds.width() / 2) - mEndBounds.width() / 2;
            int j = (mStartBounds.top + mStartBounds.height() / 2) - mEndBounds.height() / 2;
            transitionvalues1.setX(i);
            transitionvalues1.setY(j);
            transitionvalues1.setScaleX(f);
            transitionvalues1.setScaleY(f1);
            viewgroup = new AnimatorSet();
            viewgroup.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(transitionvalues1, "scaleX", new float[] {
                    f, 0.0F
                }), ObjectAnimator.ofFloat(transitionvalues1, "scaleY", new float[] {
                    f1, 0.0F
                })
            });
            viewgroup.setInterpolator(PlayInterpolators.fastOutSlowIn(transitionvalues1.getContext()));
            viewgroup.setDuration(150L);
            transitionvalues = new AnimatorSet();
            Object obj;
            if (mIsEntering)
            {
                transitionvalues.playTogether(new Animator[] {
                    ObjectAnimator.ofFloat(transitionvalues1, "scaleX", new float[] {
                        0.0F, 1.0F
                    }), ObjectAnimator.ofFloat(transitionvalues1, "scaleY", new float[] {
                        0.0F, 1.0F
                    })
                });
            } else
            {
                transitionvalues.play(ObjectAnimator.ofFloat(transitionvalues1, "alpha", new float[] {
                    0.0F, 0.0F
                }));
            }
            transitionvalues.setInterpolator(new OvershootInterpolator());
            transitionvalues.setDuration(150L);
            obj = getPathMotion().getPath(i, j, mEndBounds.left, mEndBounds.top);
            transitionvalues1 = ObjectAnimator.ofFloat(transitionvalues1, View.X, View.Y, ((android.graphics.Path) (obj)));
            transitionvalues1.setDuration(150L);
            obj = new AnimatorSet();
            ((AnimatorSet) (obj)).playSequentially(new Animator[] {
                viewgroup, transitionvalues1, transitionvalues
            });
            return ((Animator) (obj));
        } else
        {
            return null;
        }
    }

    public final String[] getTransitionProperties()
    {
        return sTransitionProperties;
    }

}
