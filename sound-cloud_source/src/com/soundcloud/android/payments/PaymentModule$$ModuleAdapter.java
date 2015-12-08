// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.payments.UpgradeActivity"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final PaymentModule newModule()
    {
        return new PaymentModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/payments/PaymentModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
