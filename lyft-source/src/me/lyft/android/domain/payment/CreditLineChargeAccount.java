// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.domain.payment:
//            ChargeAccount

public class CreditLineChargeAccount extends ChargeAccount
{

    private Boolean requestNotes;

    public CreditLineChargeAccount()
    {
    }

    public Boolean isRequestNotes()
    {
        return (Boolean)Objects.firstNonNull(requestNotes, Boolean.FALSE);
    }

    public void setRequestNotes(Boolean boolean1)
    {
        requestNotes = boolean1;
    }
}
