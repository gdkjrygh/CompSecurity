// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.landing:
//            LoginPhoneView, EnterPhoneView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (LoginPhoneView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, LoginPhoneView loginphoneview, Object obj)
    {
        loginphoneview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        loginphoneview.enterPhoneView = (EnterPhoneView)viewinjector.((View)viewinjector.(obj, 0x7f0d0267, "field 'enterPhoneView'"), 0x7f0d0267, "field 'enterPhoneView'");
    }

    public volatile void reset(Object obj)
    {
        reset((LoginPhoneView)obj);
    }

    public void reset(LoginPhoneView loginphoneview)
    {
        loginphoneview.toolbar = null;
        loginphoneview.enterPhoneView = null;
    }

    public ()
    {
    }
}
