// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupPhoneView, EnterPhoneView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SignupPhoneView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, SignupPhoneView signupphoneview, Object obj)
    {
        signupphoneview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        signupphoneview.enterPhoneView = (EnterPhoneView)viewinjector.enterPhoneView((View)viewinjector.enterPhoneView(obj, 0x7f0d0267, "field 'enterPhoneView'"), 0x7f0d0267, "field 'enterPhoneView'");
    }

    public volatile void reset(Object obj)
    {
        reset((SignupPhoneView)obj);
    }

    public void reset(SignupPhoneView signupphoneview)
    {
        signupphoneview.toolbar = null;
        signupphoneview.enterPhoneView = null;
    }

    public ()
    {
    }
}
