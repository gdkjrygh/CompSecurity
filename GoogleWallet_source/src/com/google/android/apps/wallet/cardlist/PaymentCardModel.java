// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.Arrays;

public final class PaymentCardModel
{

    private final ImmutableList paymentCards;

    public PaymentCardModel(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        paymentCards = ImmutableList.copyOf(iterable);
    }

    private static transient int hash(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    private Predicate isValidForUse(final int use)
    {
        return new Predicate() {

            final PaymentCardModel this$0;
            final int val$use;

            private boolean apply(PaymentCard paymentcard)
            {
                return !paymentcard.isInapplicableForUse(use);
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((PaymentCard)obj);
            }

            
            {
                this$0 = PaymentCardModel.this;
                use = i;
                super();
            }
        };
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PaymentCardModel))
        {
            return false;
        } else
        {
            obj = (PaymentCardModel)obj;
            return Objects.equal(paymentCards, ((PaymentCardModel) (obj)).paymentCards);
        }
    }

    public final ImmutableList getAllCredentials()
    {
        return paymentCards;
    }

    public final ImmutableList getValidCredentials(int i)
    {
        return ImmutableList.builder().addAll(Iterables.filter(getAllCredentials(), isValidForUse(i))).build();
    }

    public final boolean hasCards()
    {
        return !paymentCards.isEmpty();
    }

    public final int hashCode()
    {
        return hash(new Object[] {
            paymentCards
        });
    }
}
