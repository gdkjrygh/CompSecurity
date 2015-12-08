// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import android.view.View;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.WebBrowserView;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpTermsView

public class _cls9
    implements butterknife.iewInjector
{

    public volatile void inject(butterknife.iewInjector iewinjector, Object obj, Object obj1)
    {
        inject(iewinjector, (HelpTermsView)obj, obj1);
    }

    public void inject(butterknife.iewInjector iewinjector, HelpTermsView helptermsview, Object obj)
    {
        helptermsview.toolbar = (Toolbar)iewinjector.olbar((View)iewinjector.olbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        helptermsview.webBrowserView = (WebBrowserView)iewinjector.bBrowserView((View)iewinjector.bBrowserView(obj, 0x7f0d0296, "field 'webBrowserView'"), 0x7f0d0296, "field 'webBrowserView'");
    }

    public volatile void reset(Object obj)
    {
        reset((HelpTermsView)obj);
    }

    public void reset(HelpTermsView helptermsview)
    {
        helptermsview.toolbar = null;
        helptermsview.webBrowserView = null;
    }

    public _cls9()
    {
    }
}
