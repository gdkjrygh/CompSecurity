// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;
import com.pinterest.experience.NuxStep;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.AnimationUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;

public class NUXContinueBar extends RelativeLayout
{

    PButton _continueBt;
    NUXNextFragmentListener _continueListener;
    PTextView _descTv;
    android.view.View.OnClickListener continueBtListener;

    public NUXContinueBar(Context context)
    {
        this(context, null);
    }

    public NUXContinueBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NUXContinueBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        continueBtListener = new _cls1();
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301ee, this);
        ButterKnife.a(this);
        ViewHelper.setVisibility(_continueBt, 4);
        _continueBt.setEnabled(false);
        _continueBt.setOnClickListener(continueBtListener);
        _descTv.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD);
        setBackgroundColor(Resources.color(0x7f0e000b));
    }

    public void applyExperience(NuxStep nuxstep)
    {
        setContinueText(nuxstep.k);
    }

    public void enableButton(boolean flag)
    {
        if (_continueBt.isEnabled() == flag)
        {
            return;
        }
        _continueBt.setEnabled(flag);
        if (flag)
        {
            ViewHelper.setVisibility(_continueBt, 0);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                AnimationUtils.springAnimate(_continueBt, "scaleX", 0.7F, 1.0F, 1.0F, 1.25F), AnimationUtils.springAnimate(_continueBt, "scaleY", 0.7F, 1.0F, 1.0F, 1.25F), AnimationUtils.springAnimate(_continueBt, "alpha", 0.0F, 1.0F, 1.0F, 0.75F)
            });
            animatorset.start();
            return;
        } else
        {
            AnimatorSet animatorset1 = new AnimatorSet();
            animatorset1.playTogether(new Animator[] {
                AnimationUtils.springAnimate(_continueBt, "scaleX", 1.0F, 0.7F, 1.0F, 0.75F), AnimationUtils.springAnimate(_continueBt, "scaleY", 1.0F, 0.7F, 1.0F, 0.75F), AnimationUtils.springAnimate(_continueBt, "alpha", 1.0F, 0.0F, 1.0F, 0.75F)
            });
            animatorset1.start();
            return;
        }
    }

    public void popInAnimate()
    {
        if (getVisibility() == 4)
        {
            setVisibility(0);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                AnimationUtils.springAnimate(this, "translationY", getHeight(), Resources.dimension(0x7f0a016d), 1.25F, 1.0F)
            });
            animatorset.setDuration(500L).start();
        }
    }

    public void setContinueListener(NUXNextFragmentListener nuxnextfragmentlistener)
    {
        _continueListener = nuxnextfragmentlistener;
    }

    public void setContinueText(String s)
    {
        if (_continueBt != null && s != null)
        {
            _continueBt.setText(s);
        }
    }

    public void updateText(int i)
    {
        _descTv.setText(getResources().getString(i));
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NUXContinueBar this$0;

        public void onClick(View view)
        {
            if (_continueBt.isEnabled() && _continueBt.getVisibility() == 0)
            {
                _continueListener.nextFragment();
            }
        }

        _cls1()
        {
            this$0 = NUXContinueBar.this;
            super();
        }
    }

}
