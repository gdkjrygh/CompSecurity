// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardsHandler

final class val.id
    implements Predicate
{

    final int val$id;

    private boolean apply(com.google.wallet.proto.api.edDataValue eddatavalue)
    {
        return eddatavalue.sharedDataId.intValue() == val$id;
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((com.google.wallet.proto.api.edDataValue)obj);
    }

    ()
    {
        val$id = i;
        super();
    }
}
