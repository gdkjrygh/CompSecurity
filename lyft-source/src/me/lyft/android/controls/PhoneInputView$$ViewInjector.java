// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;

// Referenced classes of package me.lyft.android.controls:
//            PhoneInputView, KeyboardlessEditText

public class 
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PhoneInputView)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, PhoneInputView phoneinputview, Object obj)
    {
        phoneinputview.phoneEditText = (KeyboardlessEditText)viewinjector.Text((View)viewinjector.Text(obj, 0x7f0d0201, "field 'phoneEditText'"), 0x7f0d0201, "field 'phoneEditText'");
    }

    public volatile void reset(Object obj)
    {
        reset((PhoneInputView)obj);
    }

    public void reset(PhoneInputView phoneinputview)
    {
        phoneinputview.phoneEditText = null;
    }

    public ()
    {
    }
}
