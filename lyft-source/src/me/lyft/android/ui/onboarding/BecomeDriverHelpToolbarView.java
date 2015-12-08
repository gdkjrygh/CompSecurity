// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.BackButtonToolbar;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

public class BecomeDriverHelpToolbarView extends BackButtonToolbar
{

    AppFlow appFlow;
    Binder binder;

    public BecomeDriverHelpToolbarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(observeItemClick(), new Action1() {

            final BecomeDriverHelpToolbarView this$0;

            public void call(Integer integer)
            {
                if (integer.intValue() == 0x7f0d0016)
                {
                    appFlow.goTo(new OnboardingScreens.DriverOnboardingHelp());
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = BecomeDriverHelpToolbarView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        setTitle(getResources().getString(0x7f070071)).addItem(0x7f0d0016, 0x7f020105);
    }

    public void showHelpButton(boolean flag)
    {
        if (flag)
        {
            showItem(0x7f0d0016);
            return;
        } else
        {
            hideItem(0x7f0d0016);
            return;
        }
    }
}
