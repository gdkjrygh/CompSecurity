// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.NumericKeyboard;
import me.lyft.android.controls.PhoneInputView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.landing:
//            LoginView

public class t>
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (LoginView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, final LoginView target, Object obj)
    {
        target.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        target.phoneInputView = (PhoneInputView)viewinjector.iew((View)viewinjector.iew(obj, 0x7f0d0264, "field 'phoneInputView'"), 0x7f0d0264, "field 'phoneInputView'");
        target.keyboard = (NumericKeyboard)viewinjector.oard((View)viewinjector.oard(obj, 0x7f0d025d, "field 'keyboard'"), 0x7f0d025d, "field 'keyboard'");
        target.inlinePhoneTextView = (TextView)viewinjector.inlinePhoneTextView((View)viewinjector.inlinePhoneTextView(obj, 0x7f0d0265, "field 'inlinePhoneTextView'"), 0x7f0d0265, "field 'inlinePhoneTextView'");
        ((View)viewinjector.inlinePhoneTextView(obj, 0x7f0d0263, "method 'loginWithFacebook'")).setOnClickListener(new DebouncingOnClickListener() {

            final LoginView..ViewInjector this$0;
            final LoginView val$target;

            public void doClick(View view)
            {
                target.loginWithFacebook();
            }

            
            {
                this$0 = LoginView..ViewInjector.this;
                target = loginview;
                super();
            }
        });
        ((View)viewinjector.(obj, 0x7f0d025a, "method 'onClickNext'")).setOnClickListener(new DebouncingOnClickListener() {

            final LoginView..ViewInjector this$0;
            final LoginView val$target;

            public void doClick(View view)
            {
                target.onClickNext();
            }

            
            {
                this$0 = LoginView..ViewInjector.this;
                target = loginview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((LoginView)obj);
    }

    public void reset(LoginView loginview)
    {
        loginview.toolbar = null;
        loginview.phoneInputView = null;
        loginview.keyboard = null;
        loginview.inlinePhoneTextView = null;
    }

    public t>()
    {
    }
}
