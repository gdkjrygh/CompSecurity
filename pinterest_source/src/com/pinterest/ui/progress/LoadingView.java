// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.progress;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;

public class LoadingView extends RelativeLayout
{

    public static final int STATE_LOADED = 1;
    public static final int STATE_LOADING = 0;
    public static final int STATE_NONE = 2;
    private ObjectAnimator _anim;
    private com.pinterest.kit.utils.AnimationUtils.AnimationListener _animationListener;
    private boolean _attached;
    FrameLayout _refreshContainer;
    ImageView _refreshIc;
    private int _state;

    public LoadingView(Context context)
    {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _state = 2;
        _animationListener = new _cls1();
        init();
    }

    private void destroyAnimation()
    {
        if (_anim == null)
        {
            return;
        } else
        {
            _anim.removeAllListeners();
            _anim.removeAllUpdateListeners();
            _anim.cancel();
            _anim = null;
            return;
        }
    }

    private void ensureAnimation()
    {
        if (_anim != null)
        {
            return;
        } else
        {
            _anim = ObjectAnimator.ofFloat(_refreshIc, "rotation", new float[] {
                2.0F, 8F, 12F, 21F, 38F, 63F, 100F, 149F, 205F, 255F, 
                292F, 318F, 336F, 348F, 356F, 360F
            });
            _anim.setDuration(1000L);
            _anim.setRepeatCount(-1);
            _anim.setRepeatMode(1);
            _anim.addListener(_animationListener);
            return;
        }
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301e7, this, true);
        ButterKnife.a(this);
    }

    private void updateView()
    {
        if (!_attached)
        {
            return;
        }
        ensureAnimation();
        switch (_state)
        {
        default:
            return;

        case 0: // '\0'
            _refreshIc.setImageResource(0x7f0201e7);
            _anim.setRepeatCount(-1);
            _anim.start();
            setVisibility(0);
            return;

        case 1: // '\001'
            _refreshIc.setImageResource(0x7f0201e7);
            _anim.setRepeatCount(0);
            setVisibility(0);
            return;

        case 2: // '\002'
            destroyAnimation();
            break;
        }
        setVisibility(8);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        _attached = true;
        updateView();
    }

    protected void onDetachedFromWindow()
    {
        _attached = false;
        destroyAnimation();
        super.onDetachedFromWindow();
    }

    public void setLoadingBackground(Drawable drawable)
    {
        _refreshContainer.setBackgroundDrawable(drawable);
    }

    public void setState(int i)
    {
        _state = i;
        updateView();
    }



    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final LoadingView this$0;

        public void onAnimationRepeat(Animator animator)
        {
            if (!_attached || getVisibility() != 0)
            {
                destroyAnimation();
            }
        }

        _cls1()
        {
            this$0 = LoadingView.this;
            super();
        }
    }

}
