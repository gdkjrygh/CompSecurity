// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.Phone;
import me.lyft.android.domain.User;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.settings:
//            PhoneVerifyView

public class EditPhoneVerifyNumberView extends ScrollView
{

    AppFlow appFlow;
    ImageButton backButton;
    PhoneVerifyView phoneVerifyView;
    IUserProvider userProvider;

    public EditPhoneVerifyNumberView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        phoneVerifyView.setPhoneNumberForVerification(userProvider.getUser().getPhone().getNumber());
        backButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditPhoneVerifyNumberView this$0;

            public void onClick(View view)
            {
                appFlow.goUp();
            }

            
            {
                this$0 = EditPhoneVerifyNumberView.this;
                super();
            }
        });
        Binder.attach(this).bind(phoneVerifyView.observeVerificationCompleted(), new Action1() {

            final EditPhoneVerifyNumberView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                appFlow.resetTo(new SettingsScreens.SettingsScreen());
            }

            
            {
                this$0 = EditPhoneVerifyNumberView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
