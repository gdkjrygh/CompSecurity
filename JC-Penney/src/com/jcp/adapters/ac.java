// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            CouponAdapter

class ac
    implements android.view.View.OnClickListener
{

    final int a;
    final CouponAdapter b;

    ac(CouponAdapter couponadapter, int i)
    {
        b = couponadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        CouponAdapter.a(b, a);
    }
}
