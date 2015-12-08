// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

// Referenced classes of package com.jcp.activities:
//            SameDayPickUpCustomerServiceWebView

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, SameDayPickUpCustomerServiceWebView samedaypickupcustomerservicewebview, Object obj)
    {
        samedaypickupcustomerservicewebview.mWebView = (WebView)jector.w((View)jector.w(obj, 0x7f0e024a, "field 'mWebView'"), 0x7f0e024a, "field 'mWebView'");
        samedaypickupcustomerservicewebview.headerTitle = (TextView)jector.itle((View)jector.itle(obj, 0x7f0e0247, "field 'headerTitle'"), 0x7f0e0247, "field 'headerTitle'");
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (SameDayPickUpCustomerServiceWebView)obj, obj1);
    }

    public void reset(SameDayPickUpCustomerServiceWebView samedaypickupcustomerservicewebview)
    {
        samedaypickupcustomerservicewebview.mWebView = null;
        samedaypickupcustomerservicewebview.headerTitle = null;
    }

    public volatile void reset(Object obj)
    {
        reset((SameDayPickUpCustomerServiceWebView)obj);
    }

    public ()
    {
    }
}
