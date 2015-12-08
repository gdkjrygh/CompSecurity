// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import android.view.View;
import android.widget.Button;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpLegalView

public class _cls9
    implements butterknife.iewInjector
{

    public volatile void inject(butterknife.iewInjector iewinjector, Object obj, Object obj1)
    {
        inject(iewinjector, (HelpLegalView)obj, obj1);
    }

    public void inject(butterknife.iewInjector iewinjector, HelpLegalView helplegalview, Object obj)
    {
        helplegalview.toolbar = (Toolbar)iewinjector.olbar((View)iewinjector.olbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        helplegalview.termsOfServiceButton = (Button)iewinjector.rmsOfServiceButton((View)iewinjector.rmsOfServiceButton(obj, 0x7f0d0234, "field 'termsOfServiceButton'"), 0x7f0d0234, "field 'termsOfServiceButton'");
        helplegalview.privacyPolicynButton = (Button)iewinjector.ivacyPolicynButton((View)iewinjector.ivacyPolicynButton(obj, 0x7f0d0235, "field 'privacyPolicynButton'"), 0x7f0d0235, "field 'privacyPolicynButton'");
        helplegalview.licensesButton = (Button)iewinjector.censesButton((View)iewinjector.censesButton(obj, 0x7f0d0236, "field 'licensesButton'"), 0x7f0d0236, "field 'licensesButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((HelpLegalView)obj);
    }

    public void reset(HelpLegalView helplegalview)
    {
        helplegalview.toolbar = null;
        helplegalview.termsOfServiceButton = null;
        helplegalview.privacyPolicynButton = null;
        helplegalview.licensesButton = null;
    }

    public _cls9()
    {
    }
}
