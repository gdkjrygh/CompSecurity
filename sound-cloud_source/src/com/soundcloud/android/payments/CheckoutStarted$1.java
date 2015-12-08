// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            CheckoutStarted

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((CheckoutStarted)obj);
    }

    public final String call(CheckoutStarted checkoutstarted)
    {
        return checkoutstarted.token;
    }

    ()
    {
    }
}
