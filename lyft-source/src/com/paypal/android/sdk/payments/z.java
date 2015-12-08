// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.view.View;

// Referenced classes of package com.paypal.android.sdk.payments:
//            p

final class z
    implements android.view.View.OnClickListener
{

    private p a;

    z(p p1)
    {
        a = p1;
        super();
    }

    public final void onClick(View view)
    {
        p.e(a);
    }
}
