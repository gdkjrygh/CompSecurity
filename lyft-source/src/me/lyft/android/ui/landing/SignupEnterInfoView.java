// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.persistence.landing.SignupUser;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingFlow, EnterInfoView

public class SignupEnterInfoView extends LinearLayout
    implements IHandleBack
{

    private Binder binder;
    EnterInfoView enterInfoView;
    LandingFlow landingFlow;
    Toolbar toolbar;

    public SignupEnterInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    public void goBack()
    {
        landingFlow.openSignupScreen();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            binder.bind(enterInfoView.observeSubmitProfile(), new Action1() {

                final SignupEnterInfoView this$0;

                public volatile void call(Object obj)
                {
                    call((SignupUser)obj);
                }

                public void call(SignupUser signupuser)
                {
                    landingFlow.goToNextScreenInSignupFlow();
                }

            
            {
                this$0 = SignupEnterInfoView.this;
                super();
            }
            });
            binder.bind(toolbar.observeHomeClick(), new Action1() {

                final SignupEnterInfoView this$0;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    goBack();
                }

            
            {
                this$0 = SignupEnterInfoView.this;
                super();
            }
            });
            binder.bind(toolbar.observeItemClick(), new Action1() {

                final SignupEnterInfoView this$0;

                public void call(Integer integer)
                {
                    enterInfoView.submitProfileInfo();
                }

                public volatile void call(Object obj)
                {
                    call((Integer)obj);
                }

            
            {
                this$0 = SignupEnterInfoView.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onBack()
    {
        goBack();
        return true;
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
            toolbar.showTitle().setTitle(getResources().getString(0x7f0701d4)).addItem(0x7f0d001d, getResources().getString(0x7f07020e), 0, getResources().getColor(0x7f0c007e), 1);
            return;
        }
    }
}
