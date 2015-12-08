// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupEnterInfoView, EnterInfoView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SignupEnterInfoView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, SignupEnterInfoView signupenterinfoview, Object obj)
    {
        signupenterinfoview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        signupenterinfoview.enterInfoView = (EnterInfoView)viewinjector.enterInfoView((View)viewinjector.enterInfoView(obj, 0x7f0d0266, "field 'enterInfoView'"), 0x7f0d0266, "field 'enterInfoView'");
    }

    public volatile void reset(Object obj)
    {
        reset((SignupEnterInfoView)obj);
    }

    public void reset(SignupEnterInfoView signupenterinfoview)
    {
        signupenterinfoview.toolbar = null;
        signupenterinfoview.enterInfoView = null;
    }

    public ()
    {
    }
}
