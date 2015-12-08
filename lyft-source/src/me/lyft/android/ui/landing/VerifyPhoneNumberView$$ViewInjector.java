// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.KeyboardlessEditText;
import me.lyft.android.controls.NumericKeyboard;

// Referenced classes of package me.lyft.android.ui.landing:
//            VerifyPhoneNumberView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (VerifyPhoneNumberView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, VerifyPhoneNumberView verifyphonenumberview, Object obj)
    {
        verifyphonenumberview.inlinePhoneTextView = (TextView)viewinjector.inlinePhoneTextView((View)viewinjector.inlinePhoneTextView(obj, 0x7f0d026c, "field 'inlinePhoneTextView'"), 0x7f0d026c, "field 'inlinePhoneTextView'");
        verifyphonenumberview.codeEditText = (KeyboardlessEditText)viewinjector.codeEditText((View)viewinjector.codeEditText(obj, 0x7f0d026b, "field 'codeEditText'"), 0x7f0d026b, "field 'codeEditText'");
        verifyphonenumberview.resendCodeView = (View)viewinjector.resendCodeView(obj, 0x7f0d026d, "field 'resendCodeView'");
        verifyphonenumberview.keyboard = (NumericKeyboard)viewinjector.keyboard((View)viewinjector.keyboard(obj, 0x7f0d025d, "field 'keyboard'"), 0x7f0d025d, "field 'keyboard'");
        verifyphonenumberview.verifyButton = (Button)viewinjector.verifyButton((View)viewinjector.verifyButton(obj, 0x7f0d026e, "field 'verifyButton'"), 0x7f0d026e, "field 'verifyButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((VerifyPhoneNumberView)obj);
    }

    public void reset(VerifyPhoneNumberView verifyphonenumberview)
    {
        verifyphonenumberview.inlinePhoneTextView = null;
        verifyphonenumberview.codeEditText = null;
        verifyphonenumberview.resendCodeView = null;
        verifyphonenumberview.keyboard = null;
        verifyphonenumberview.verifyButton = null;
    }

    public ()
    {
    }
}
