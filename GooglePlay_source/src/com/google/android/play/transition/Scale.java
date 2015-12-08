// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public final class Scale extends Transition
{

    private static final String sTransitionProperties[] = {
        "play:scale:bounds", "play:scale:windowX", "play:scale:windowY"
    };
    private final boolean mIsEntering;
    boolean mMaintainAspectRatio;
    private int mTempLocation[];

    public Scale(boolean flag)
    {
        mTempLocation = new int[2];
        mIsEntering = flag;
    }

    private void captureValues(TransitionValues transitionvalues)
    {
        Object obj = transitionvalues.view;
        obj = new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom());
        transitionvalues.values.put("play:scale:bounds", obj);
        transitionvalues.view.getLocationInWindow(mTempLocation);
        transitionvalues.values.put("play:scale:windowX", Integer.valueOf(mTempLocation[0]));
        transitionvalues.values.put("play:scale:windowY", Integer.valueOf(mTempLocation[1]));
    }

    private static Rect matchAspectRatio(float f, Rect rect)
    {
        Rect rect1;
label0:
        {
            rect1 = new Rect(rect);
            if ((float)rect.width() / (float)rect.height() != f)
            {
                if (rect.width() <= rect.height())
                {
                    break label0;
                }
                int i = (int)(((float)rect.width() - (float)rect.height() * f) / 2.0F);
                rect1.set(rect.left + i, rect.top, rect.right - i, rect.bottom);
            }
            return rect1;
        }
        int j = (int)((float)(rect.height() - (int)((float)rect.width() * f)) / 2.0F);
        rect1.set(rect.left, rect.top + j, rect.right, rect.bottom - j);
        return rect1;
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
        if (transitionvalues == null || transitionvalues1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Rect rect;
        obj = (Rect)transitionvalues.values.get("play:scale:bounds");
        rect = (Rect)transitionvalues1.values.get("play:scale:bounds");
        if (!mIsEntering) goto _L4; else goto _L3
_L3:
        ((Rect) (obj)).inset(0, 0);
        viewgroup = ((ViewGroup) (obj));
        transitionvalues = rect;
        if (mMaintainAspectRatio)
        {
            viewgroup = matchAspectRatio((float)rect.width() / (float)rect.height(), ((Rect) (obj)));
            transitionvalues = rect;
        }
_L5:
        obj = transitionvalues1.view;
        transitionvalues1 = getPathMotion().getPath(((Rect) (viewgroup)).left, ((Rect) (viewgroup)).top, ((Rect) (transitionvalues)).left, ((Rect) (transitionvalues)).top);
        transitionvalues1 = ObjectAnimator.ofFloat(obj, View.X, View.Y, transitionvalues1);
        ((View) (obj)).setPivotX(0.0F);
        ((View) (obj)).setPivotY(0.0F);
        float f = (float)viewgroup.width() / (float)transitionvalues.width();
        float f1 = (float)viewgroup.height() / (float)transitionvalues.height();
        ((View) (obj)).setX(((Rect) (viewgroup)).left);
        ((View) (obj)).setY(((Rect) (viewgroup)).top);
        ((View) (obj)).setScaleX(f);
        ((View) (obj)).setScaleY(f1);
        viewgroup = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
            f, 1.0F
        });
        transitionvalues = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
            f1, 1.0F
        });
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            viewgroup, transitionvalues, transitionvalues1
        });
        ((AnimatorSet) (obj)).setDuration(400L);
        ((AnimatorSet) (obj)).setInterpolator(getInterpolator());
        return ((Animator) (obj));
_L4:
        rect.inset(0, 0);
        viewgroup = ((ViewGroup) (obj));
        transitionvalues = rect;
        if (mMaintainAspectRatio)
        {
            transitionvalues = matchAspectRatio((float)((Rect) (obj)).width() / (float)((Rect) (obj)).height(), rect);
            viewgroup = ((ViewGroup) (obj));
        }
        if (true) goto _L5; else goto _L2
_L2:
        return null;
    }

    public final String[] getTransitionProperties()
    {
        return sTransitionProperties;
    }

}
