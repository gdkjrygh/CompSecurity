// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import java.util.Comparator;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelPublisher

final class I
    implements Comparator
{

    private static int compare(PaymentCard paymentcard, PaymentCard paymentcard1)
    {
        return paymentcard.getNickname().compareTo(paymentcard1.getNickname());
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((PaymentCard)obj, (PaymentCard)obj1);
    }

    I()
    {
    }
}
