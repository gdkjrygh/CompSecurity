// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterPhoneView, LandingFlow

public class LoginPhoneView extends LinearLayout
{

    private Binder binder;
    EnterPhoneView enterPhoneView;
    LandingFlow landingFlow;
    Toolbar toolbar;

    public LoginPhoneView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Binder binder1 = binder;
            binder = Binder.attach(this);
            binder.bind(toolbar.observeItemClick(), new Action1() {

                final LoginPhoneView this$0;

                public void call(Integer integer)
                {
                    enterPhoneView.requestPhoneAuth();
                }

                public volatile void call(Object obj)
                {
                    call((Integer)obj);
                }

            
            {
                this$0 = LoginPhoneView.this;
                super();
            }
            });
            binder.bind(enterPhoneView.observeVerificationRequested(), new Action1() {

                final LoginPhoneView this$0;

                public volatile void call(Object obj)
                {
                    call((String)obj);
                }

                public void call(String s)
                {
                    landingFlow.openLoginVerifyPhoneScreen(s);
                }

            
            {
                this$0 = LoginPhoneView.this;
                super();
            }
            });
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.setTitle(getResources().getString(0x7f0701d9)).addItem(0x7f0d001d, getResources().getString(0x7f07020e), 0, getResources().getColor(0x7f0c007e), 1);
            return;
        }
    }
}
