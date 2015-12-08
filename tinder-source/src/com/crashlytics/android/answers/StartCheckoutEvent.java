// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.math.BigDecimal;

// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent

public class StartCheckoutEvent extends PredefinedEvent
{

    static final BigDecimal a = BigDecimal.valueOf(0xf4240L);

    public StartCheckoutEvent()
    {
    }

    final String a()
    {
        return "startCheckout";
    }

}
