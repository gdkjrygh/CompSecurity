// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.activities:
//            CartCheckoutActivity

class f
    implements android.content.DialogInterface.OnClickListener
{

    final CartCheckoutActivity a;

    f(CartCheckoutActivity cartcheckoutactivity)
    {
        a = cartcheckoutactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.g();
        a.finish();
    }
}
