// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            SameDayPickUpCustomerServiceActivity

class bh extends DebouncingOnClickListener
{

    final SameDayPickUpCustomerServiceActivity a;
    final SameDayPickUpCustomerServiceActivity..ViewInjector b;

    bh(SameDayPickUpCustomerServiceActivity..ViewInjector viewinjector, SameDayPickUpCustomerServiceActivity samedaypickupcustomerserviceactivity)
    {
        b = viewinjector;
        a = samedaypickupcustomerserviceactivity;
        super();
    }

    public void doClick(View view)
    {
        a.termsButtonClick();
    }
}
