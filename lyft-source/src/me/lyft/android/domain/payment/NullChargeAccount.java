// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            ChargeAccount

public final class NullChargeAccount extends ChargeAccount
{

    private static final NullChargeAccount INSTANCE = new NullChargeAccount();

    public NullChargeAccount()
    {
    }

    public static NullChargeAccount getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }

}
