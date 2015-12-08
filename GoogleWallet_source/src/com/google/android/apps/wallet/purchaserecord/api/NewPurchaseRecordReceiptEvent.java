// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord.api;

import com.google.common.base.Optional;

public class NewPurchaseRecordReceiptEvent
{

    private final Optional notificationType;
    private final Optional purchaseRecordLookupId;
    private final String targetUris[];

    public NewPurchaseRecordReceiptEvent()
    {
        purchaseRecordLookupId = Optional.absent();
        targetUris = null;
        notificationType = Optional.absent();
    }

    public NewPurchaseRecordReceiptEvent(String as[], Integer integer)
    {
        purchaseRecordLookupId = Optional.absent();
        targetUris = as;
        notificationType = Optional.of(integer);
    }

    public final Optional getNotificationType()
    {
        return notificationType;
    }

    public final String[] getTargetUris()
    {
        return targetUris;
    }
}
