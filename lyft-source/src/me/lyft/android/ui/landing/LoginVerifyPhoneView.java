// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ScrollView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            VerifyPhoneNumberView, LandingFlow

public class LoginVerifyPhoneView extends ScrollView
{

    AppFlow appFlow;
    private Binder binder;
    LandingFlow landingFlow;
    private final LandingScreens.LoginVerifyPhoneScreen params;
    VerifyPhoneNumberView phoneVerifyView;
    Toolbar toolbar;
    IUserProvider userProvider;

    public LoginVerifyPhoneView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (LandingScreens.LoginVerifyPhoneScreen)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            phoneVerifyView.setPhoneNumberForVerification(params.getPhoneNumber());
            binder = Binder.attach(this);
            binder.bind(phoneVerifyView.observeVerificationCompleted(), new Action1() {

                final LoginVerifyPhoneView this$0;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    landingFlow.goToNextScreenInLoginFlow();
                }

            
            {
                this$0 = LoginVerifyPhoneView.this;
                super();
            }
            });
            binder.bind(toolbar.observeItemClick(), new Action1() {

                final LoginVerifyPhoneView this$0;

                public void call(Integer integer)
                {
                    phoneVerifyView.verifyPhoneNumber();
                }

                public volatile void call(Object obj)
                {
                    call((Integer)obj);
                }

            
            {
                this$0 = LoginVerifyPhoneView.this;
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
            toolbar.showTitle().setTitle(getResources().getString(0x7f0701e0)).addItem(0x7f0d001d, getResources().getString(0x7f07020e), 0, getResources().getColor(0x7f0c007e), 1);
            return;
        }
    }
}
