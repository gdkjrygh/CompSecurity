// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.view.View;

// Referenced classes of package com.facebook.zero.ui:
//            CarrierBottomBanner, c

class a
    implements android.view.View.OnClickListener
{

    final CarrierBottomBanner a;

    a(CarrierBottomBanner carrierbottombanner)
    {
        a = carrierbottombanner;
        super();
    }

    public void onClick(View view)
    {
        if (CarrierBottomBanner.a(a) != null)
        {
            CarrierBottomBanner.a(a).a();
        }
    }
}
