// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.NumericKeyboard;
import me.lyft.android.controls.PhoneInputView;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterPhoneView, TermsOfServiceView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EnterPhoneView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, EnterPhoneView enterphoneview, Object obj)
    {
        enterphoneview.phoneInputView = (PhoneInputView)viewinjector.phoneInputView((View)viewinjector.phoneInputView(obj, 0x7f0d025b, "field 'phoneInputView'"), 0x7f0d025b, "field 'phoneInputView'");
        enterphoneview.phoneHintTextView = (TextView)viewinjector.phoneHintTextView((View)viewinjector.phoneHintTextView(obj, 0x7f0d025c, "field 'phoneHintTextView'"), 0x7f0d025c, "field 'phoneHintTextView'");
        enterphoneview.keyboard = (NumericKeyboard)viewinjector.keyboard((View)viewinjector.keyboard(obj, 0x7f0d025d, "field 'keyboard'"), 0x7f0d025d, "field 'keyboard'");
        enterphoneview.termsOfServiceView = (TermsOfServiceView)viewinjector.View((View)viewinjector.View(obj, 0x7f0d0259, "field 'termsOfServiceView'"), 0x7f0d0259, "field 'termsOfServiceView'");
        enterphoneview.nextButton = (Button)viewinjector.nextButton((View)viewinjector.nextButton(obj, 0x7f0d025a, "field 'nextButton'"), 0x7f0d025a, "field 'nextButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((EnterPhoneView)obj);
    }

    public void reset(EnterPhoneView enterphoneview)
    {
        enterphoneview.phoneInputView = null;
        enterphoneview.phoneHintTextView = null;
        enterphoneview.keyboard = null;
        enterphoneview.termsOfServiceView = null;
        enterphoneview.nextButton = null;
    }

    public ()
    {
    }
}
