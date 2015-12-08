// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import android.view.View;
import android.widget.Button;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.WebBrowserView;

// Referenced classes of package me.lyft.android.ui.ride:
//            AcceptTermsView

public class 
    implements butterknife.iewInjector
{

    public volatile void inject(butterknife.iewInjector iewinjector, Object obj, Object obj1)
    {
        inject(iewinjector, (AcceptTermsView)obj, obj1);
    }

    public void inject(butterknife.iewInjector iewinjector, AcceptTermsView accepttermsview, Object obj)
    {
        accepttermsview.toolbar = (Toolbar)iewinjector.olbar((View)iewinjector.olbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        accepttermsview.webBrowserView = (WebBrowserView)iewinjector.bBrowserView((View)iewinjector.bBrowserView(obj, 0x7f0d0296, "field 'webBrowserView'"), 0x7f0d0296, "field 'webBrowserView'");
        accepttermsview.acceptButton = (Button)iewinjector.ceptButton((View)iewinjector.ceptButton(obj, 0x7f0d005e, "field 'acceptButton'"), 0x7f0d005e, "field 'acceptButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((AcceptTermsView)obj);
    }

    public void reset(AcceptTermsView accepttermsview)
    {
        accepttermsview.toolbar = null;
        accepttermsview.webBrowserView = null;
        accepttermsview.acceptButton = null;
    }

    public ()
    {
    }
}
