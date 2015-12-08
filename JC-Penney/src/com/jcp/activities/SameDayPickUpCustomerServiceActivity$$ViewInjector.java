// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.Button;

// Referenced classes of package com.jcp.activities:
//            SameDayPickUpCustomerServiceActivity, bh, bi

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, SameDayPickUpCustomerServiceActivity samedaypickupcustomerserviceactivity, Object obj)
    {
        View view = (View)jector.jector(obj, 0x7f0e0248, "field 'termsButton' and method 'termsButtonClick'");
        samedaypickupcustomerserviceactivity.termsButton = (Button)jector.tton(view, 0x7f0e0248, "field 'termsButton'");
        view.setOnClickListener(new bh(this, samedaypickupcustomerserviceactivity));
        obj = (View)jector.jector(obj, 0x7f0e0249, "field 'faqButton' and method 'faqButtonClick'");
        samedaypickupcustomerserviceactivity.faqButton = (Button)jector.on(((View) (obj)), 0x7f0e0249, "field 'faqButton'");
        ((View) (obj)).setOnClickListener(new bi(this, samedaypickupcustomerserviceactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (SameDayPickUpCustomerServiceActivity)obj, obj1);
    }

    public void reset(SameDayPickUpCustomerServiceActivity samedaypickupcustomerserviceactivity)
    {
        samedaypickupcustomerserviceactivity.termsButton = null;
        samedaypickupcustomerserviceactivity.faqButton = null;
    }

    public volatile void reset(Object obj)
    {
        reset((SameDayPickUpCustomerServiceActivity)obj);
    }

    public ()
    {
    }
}
