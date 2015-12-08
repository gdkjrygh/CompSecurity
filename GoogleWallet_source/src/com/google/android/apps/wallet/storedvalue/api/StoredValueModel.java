// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue.api;

import com.google.common.base.Objects;
import com.google.protobuf.nano.MessageNano;

public final class StoredValueModel
{

    private final com.google.wallet.proto.NanoWalletEntities.StoredValue storedValue;

    public StoredValueModel(com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue)
    {
        storedValue = storedvalue;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof StoredValueModel)
        {
            obj = (StoredValueModel)obj;
            return MessageNano.messageNanoEquals(storedValue, ((StoredValueModel) (obj)).storedValue);
        } else
        {
            return false;
        }
    }

    public final com.google.wallet.proto.NanoWalletEntities.StoredValue getStoredValue()
    {
        return storedValue;
    }

    public final int hashCode()
    {
        Object obj;
        if (storedValue == null)
        {
            obj = "";
        } else
        {
            obj = MessageNano.toByteArray(storedValue);
        }
        return Objects.hashCode(new Object[] {
            obj
        });
    }

    public final boolean isStoredValueNegative()
    {
        return storedValue != null && storedValue.balance.amount.micros.longValue() < 0L;
    }
}
