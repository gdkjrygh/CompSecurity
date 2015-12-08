// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.skype.android.app.chat.picker:
//            ExtensiblePickerDialogFragment

private final class bottomBar
{

    private bottomBar animationState;
    private View bottomBar;
    private boolean enabled;
    final ExtensiblePickerDialogFragment this$0;

    private void show()
    {
        if (enabled && bottomBar.getTranslationY() != 0.0F && animationState != ANIMATING_UP)
        {
            animationState = ANIMATING_UP;
            bottomBar.animate().translationY(0.0F).setListener(new AnimatorListenerAdapter() {

                final ExtensiblePickerDialogFragment.b this$1;

                public final void onAnimationEnd(Animator animator)
                {
                    animationState = ExtensiblePickerDialogFragment.a.IDLE;
                }

            
            {
                this$1 = ExtensiblePickerDialogFragment.b.this;
                super();
            }
            });
        }
    }

    public final void hide()
    {
        if (enabled && bottomBar.getTranslationY() != (float)bottomBar.getMeasuredHeight() && animationState != ANIMATING_DOWN)
        {
            animationState = ANIMATING_DOWN;
            bottomBar.animate().translationY(bottomBar.getMeasuredHeight()).setListener(new AnimatorListenerAdapter() {

                final ExtensiblePickerDialogFragment.b this$1;

                public final void onAnimationEnd(Animator animator)
                {
                    animationState = ExtensiblePickerDialogFragment.a.IDLE;
                }

            
            {
                this$1 = ExtensiblePickerDialogFragment.b.this;
                super();
            }
            });
        }
    }

    protected final void setEnabled(boolean flag)
    {
        enabled = flag;
        android.widget.erDialogFragment erdialogfragment = (android.widget.erDialogFragment.b.enabled)ExtensiblePickerDialogFragment.access$500(ExtensiblePickerDialogFragment.this).getLayoutParams();
        int i;
        if (flag)
        {
            i = -1;
        } else
        {
            i = bottomBar.getId();
        }
        erdialogfragment.le(2, i);
    }



/*
    static _cls2 access$602(_cls2 _pcls2, _cls2 _pcls2_1)
    {
        _pcls2.animationState = _pcls2_1;
        return _pcls2_1;
    }

*/

    public _cls2.this._cls1(View view)
    {
        this$0 = ExtensiblePickerDialogFragment.this;
        super();
        animationState = IDLE;
        enabled = true;
        bottomBar = view;
    }
}
