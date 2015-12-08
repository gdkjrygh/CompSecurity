// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.WebBrowserView;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentHelpView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PaymentHelpView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PaymentHelpView paymenthelpview, Object obj)
    {
        paymenthelpview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        paymenthelpview.webBrowserView = (WebBrowserView)viewinjector.webBrowserView((View)viewinjector.webBrowserView(obj, 0x7f0d0296, "field 'webBrowserView'"), 0x7f0d0296, "field 'webBrowserView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PaymentHelpView)obj);
    }

    public void reset(PaymentHelpView paymenthelpview)
    {
        paymenthelpview.toolbar = null;
        paymenthelpview.webBrowserView = null;
    }

    public ()
    {
    }
}
