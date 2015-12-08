// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.landing:
//            IntroductionView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (IntroductionView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, IntroductionView introductionview, Object obj)
    {
        introductionview.loginView = (View)viewinjector.loginView(obj, 0x7f0d0260, "field 'loginView'");
        introductionview.lyftLogo = (View)viewinjector.lyftLogo(obj, 0x7f0d0081, "field 'lyftLogo'");
        introductionview.signupView = (View)viewinjector.signupView(obj, 0x7f0d0261, "field 'signupView'");
        introductionview.environmentName = (TextView)viewinjector.environmentName((View)viewinjector.environmentName(obj, 0x7f0d025e, "field 'environmentName'"), 0x7f0d025e, "field 'environmentName'");
        introductionview.developmentView = (TextView)viewinjector.developmentView((View)viewinjector.developmentView(obj, 0x7f0d025f, "field 'developmentView'"), 0x7f0d025f, "field 'developmentView'");
    }

    public volatile void reset(Object obj)
    {
        reset((IntroductionView)obj);
    }

    public void reset(IntroductionView introductionview)
    {
        introductionview.loginView = null;
        introductionview.lyftLogo = null;
        introductionview.signupView = null;
        introductionview.environmentName = null;
        introductionview.developmentView = null;
    }

    public ()
    {
    }
}
