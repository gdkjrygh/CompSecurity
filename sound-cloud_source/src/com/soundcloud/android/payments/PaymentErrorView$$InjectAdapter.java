// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentErrorView

public final class  extends b
    implements Provider
{

    public final PaymentErrorView get()
    {
        return new PaymentErrorView();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.payments.PaymentErrorView", "members/com.soundcloud.android.payments.PaymentErrorView", false, com/soundcloud/android/payments/PaymentErrorView);
    }
}
