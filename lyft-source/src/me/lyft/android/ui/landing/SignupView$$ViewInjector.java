// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.EmailAutoFillEditText;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupView

public class >
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SignupView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, final SignupView target, Object obj)
    {
        target.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        target.firstNameEdit = (AdvancedEditText)viewinjector.Text((View)viewinjector.Text(obj, 0x7f0d0253, "field 'firstNameEdit'"), 0x7f0d0253, "field 'firstNameEdit'");
        target.errorFistNameTextView = (TextView)viewinjector.errorFistNameTextView((View)viewinjector.errorFistNameTextView(obj, 0x7f0d0255, "field 'errorFistNameTextView'"), 0x7f0d0255, "field 'errorFistNameTextView'");
        target.lastNameEdit = (AdvancedEditText)viewinjector.Text((View)viewinjector.Text(obj, 0x7f0d0254, "field 'lastNameEdit'"), 0x7f0d0254, "field 'lastNameEdit'");
        target.errorLastNameTextView = (TextView)viewinjector.errorLastNameTextView((View)viewinjector.errorLastNameTextView(obj, 0x7f0d0257, "field 'errorLastNameTextView'"), 0x7f0d0257, "field 'errorLastNameTextView'");
        View view = (View)viewinjector.errorLastNameTextView(obj, 0x7f0d0256, "field 'emailEdit' and method 'onEmailEditorAction'");
        target.emailEdit = (EmailAutoFillEditText)viewinjector.lEditText(view, 0x7f0d0256, "field 'emailEdit'");
        ((TextView)view).setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final SignupView..ViewInjector this$0;
            final SignupView val$target;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                return target.onEmailEditorAction(textview, i, keyevent);
            }

            
            {
                this$0 = SignupView..ViewInjector.this;
                target = signupview;
                super();
            }
        });
        target.errorEmailTextView = (TextView)viewinjector.errorEmailTextView((View)viewinjector.errorEmailTextView(obj, 0x7f0d0258, "field 'errorEmailTextView'"), 0x7f0d0258, "field 'errorEmailTextView'");
        target.nextButton = (Button)viewinjector.nextButton((View)viewinjector.nextButton(obj, 0x7f0d025a, "field 'nextButton'"), 0x7f0d025a, "field 'nextButton'");
        ((View)viewinjector.nextButton(obj, 0x7f0d0263, "method 'loginWithFacebook'")).setOnClickListener(new DebouncingOnClickListener() {

            final SignupView..ViewInjector this$0;
            final SignupView val$target;

            public void doClick(View view1)
            {
                target.loginWithFacebook();
            }

            
            {
                this$0 = SignupView..ViewInjector.this;
                target = signupview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((SignupView)obj);
    }

    public void reset(SignupView signupview)
    {
        signupview.toolbar = null;
        signupview.firstNameEdit = null;
        signupview.errorFistNameTextView = null;
        signupview.lastNameEdit = null;
        signupview.errorLastNameTextView = null;
        signupview.emailEdit = null;
        signupview.errorEmailTextView = null;
        signupview.nextButton = null;
    }

    public >()
    {
    }
}
