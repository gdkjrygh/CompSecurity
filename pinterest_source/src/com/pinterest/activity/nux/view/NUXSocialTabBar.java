// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import com.pinterest.kit.utils.AnimationUtils;
import com.pinterest.ui.tab.Tab;
import com.pinterest.ui.tab.TabBar;
import com.pinterest.ui.tab.TabBarUtils;
import java.util.ArrayList;
import java.util.Iterator;

public class NUXSocialTabBar extends TabBar
{

    private boolean _isFacebookConnected;
    private boolean _isTwitterConnected;
    private ArrayList _tabs;

    public NUXSocialTabBar(Context context)
    {
        this(context, null);
    }

    public NUXSocialTabBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        disableUnderline();
        init();
    }

    private void animateTabButtonFade(final Tab button)
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(button, "alpha", new float[] {
                0.3F, 1.0F
            })
        });
        animatorset.setDuration(500L);
        animatorset.addListener(new _cls1());
        animatorset.start();
    }

    private void animateTabButtonImage(ImageView imageview, int i)
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            AnimationUtils.springAnimate(imageview, "scaleX", 0.4F, 1.0F, 0.7F, 1.15F), AnimationUtils.springAnimate(imageview, "scaleY", 0.4F, 1.0F, 0.7F, 1.15F), AnimationUtils.springAnimate(imageview, "alpha", 0.2F, 1.0F, 0.6F, 0.8F)
        });
        animatorset.setStartDelay(i);
        animatorset.start();
    }

    private void init()
    {
        _isFacebookConnected = false;
        _isTwitterConnected = false;
    }

    private void popInSocialIcons()
    {
        Tab tab = (Tab)_tabs.get(0);
        Tab tab1 = (Tab)_tabs.get(1);
        if (_selectedIndex == 2)
        {
            tab.setIcon(0x7f020239);
            tab.setBackgroundResource(0x7f02027b);
            tab.getImageView().setAlpha(0.0F);
            animateTabButtonImage(tab.getImageView(), 1000);
            tab1.setIcon(0x7f02023f);
            tab1.setBackgroundResource(0x7f02027b);
            tab1.getImageView().setAlpha(0.0F);
            animateTabButtonImage(tab1.getImageView(), 1500);
        }
    }

    private void updateTabStyle()
    {
        Tab tab1;
label0:
        {
            Tab tab = (Tab)_tabs.get(0);
            tab1 = (Tab)_tabs.get(1);
            if (_isFacebookConnected)
            {
                tab.setBackgroundResource(0x7f02027c);
                if (_selectedIndex == 0)
                {
                    tab.setIcon(0x7f020237, 2);
                    tab.setIcon(0x7f020237);
                    animateTabButtonFade(tab);
                } else
                {
                    tab.setIcon(0x7f020238, 2);
                    tab.setIcon(0x7f020238);
                }
            }
            if (_isTwitterConnected)
            {
                tab1.setBackgroundResource(0x7f02027d);
                if (_selectedIndex != 1)
                {
                    break label0;
                }
                animateTabButtonFade(tab1);
                tab1.setIcon(0x7f02023d, 2);
                tab1.setIcon(0x7f02023d);
            }
            return;
        }
        tab1.setIcon(0x7f02023e, 2);
        tab1.setIcon(0x7f02023e);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        _tabs = new ArrayList();
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (view instanceof Checkable)
            {
                _tabs.add((Tab)view);
            }
        }

        for (Iterator iterator = _tabs.iterator(); iterator.hasNext(); ((Tab)iterator.next()).bringToFront()) { }
    }

    public void setCurrentIndex(int i)
    {
        if (_selectedIndex == i)
        {
            return;
        }
        _selectedIndex = TabBarUtils.setCurrentTab(this, _selectedIndex, i);
        if (i != 0) goto _L2; else goto _L1
_L1:
        _isFacebookConnected = true;
_L4:
        popInSocialIcons();
        updateTabStyle();
        updateTabButtons();
        return;
_L2:
        if (i == 1)
        {
            _isTwitterConnected = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void updateTabButtons()
    {
        int i = 0;
        while (i < getChildCount()) 
        {
            View view = getChildAt(i);
            if (view instanceof Tab)
            {
                if (_selectedIndex != 2 && i != _selectedIndex)
                {
                    view.setAlpha(0.3F);
                } else
                {
                    view.setAlpha(1.0F);
                }
            }
            i++;
        }
    }

    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final NUXSocialTabBar this$0;
        final Tab val$button;

        public void onAnimationEnd(Animator animator)
        {
            button.setAlpha(1.0F);
            button.getImageView().setAlpha(1.0F);
            super.onAnimationEnd(animator);
        }

        _cls1()
        {
            this$0 = NUXSocialTabBar.this;
            button = tab;
            super();
        }
    }

}
