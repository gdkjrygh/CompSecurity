// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import com.facebook.widget.text.f;

// Referenced classes of package com.facebook.zero.ui:
//            CarrierBottomBanner, c

class b extends f
{

    final String a;
    final CarrierBottomBanner b;

    b(CarrierBottomBanner carrierbottombanner, String s)
    {
        b = carrierbottombanner;
        a = s;
        super();
    }

    public void a()
    {
        if (CarrierBottomBanner.a(b) != null)
        {
            CarrierBottomBanner.a(b).a(a);
        }
    }
}
