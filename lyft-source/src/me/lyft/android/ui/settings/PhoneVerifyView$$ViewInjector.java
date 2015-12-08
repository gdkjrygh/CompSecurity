// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.KeyboardlessEditText;
import me.lyft.android.controls.NumericKeyboard;

// Referenced classes of package me.lyft.android.ui.settings:
//            PhoneVerifyView

public class 
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PhoneVerifyView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, PhoneVerifyView phoneverifyview, Object obj)
    {
        phoneverifyview.phoneTextView = (TextView)viewinjector.phoneTextView((View)viewinjector.phoneTextView(obj, 0x7f0d0417, "field 'phoneTextView'"), 0x7f0d0417, "field 'phoneTextView'");
        phoneverifyview.codeEditText = (KeyboardlessEditText)viewinjector.ext((View)viewinjector.ext(obj, 0x7f0d026b, "field 'codeEditText'"), 0x7f0d026b, "field 'codeEditText'");
        phoneverifyview.verifyCodeNote = (TextView)viewinjector.verifyCodeNote((View)viewinjector.verifyCodeNote(obj, 0x7f0d0418, "field 'verifyCodeNote'"), 0x7f0d0418, "field 'verifyCodeNote'");
        phoneverifyview.resendCodeView = (View)viewinjector.resendCodeView(obj, 0x7f0d026d, "field 'resendCodeView'");
        phoneverifyview.keyboard = (NumericKeyboard)viewinjector.keyboard((View)viewinjector.keyboard(obj, 0x7f0d025d, "field 'keyboard'"), 0x7f0d025d, "field 'keyboard'");
        phoneverifyview.verifyButton = (Button)viewinjector.verifyButton((View)viewinjector.verifyButton(obj, 0x7f0d026e, "field 'verifyButton'"), 0x7f0d026e, "field 'verifyButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((PhoneVerifyView)obj);
    }

    public void reset(PhoneVerifyView phoneverifyview)
    {
        phoneverifyview.phoneTextView = null;
        phoneverifyview.codeEditText = null;
        phoneverifyview.verifyCodeNote = null;
        phoneverifyview.resendCodeView = null;
        phoneverifyview.keyboard = null;
        phoneverifyview.verifyButton = null;
    }

    public ()
    {
    }
}
