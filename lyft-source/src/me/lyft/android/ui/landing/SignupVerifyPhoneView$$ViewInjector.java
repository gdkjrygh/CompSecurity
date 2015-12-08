// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupVerifyPhoneView, VerifyPhoneNumberView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SignupVerifyPhoneView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, SignupVerifyPhoneView signupverifyphoneview, Object obj)
    {
        signupverifyphoneview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        signupverifyphoneview.phoneVerifyView = (VerifyPhoneNumberView)viewinjector.((View)viewinjector.(obj, 0x7f0d0269, "field 'phoneVerifyView'"), 0x7f0d0269, "field 'phoneVerifyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((SignupVerifyPhoneView)obj);
    }

    public void reset(SignupVerifyPhoneView signupverifyphoneview)
    {
        signupverifyphoneview.toolbar = null;
        signupverifyphoneview.phoneVerifyView = null;
    }

    public ()
    {
    }
}
