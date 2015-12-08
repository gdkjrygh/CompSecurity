// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.text.style.URLSpan;
import android.view.View;

// Referenced classes of package com.paypal.android.sdk.payments:
//            c

final class aO extends URLSpan
{

    private c a;

    aO(URLSpan urlspan, c c1)
    {
        super(urlspan.getURL());
        a = c1;
    }

    public final void onClick(View view)
    {
        a.a();
        super.onClick(view);
    }
}
