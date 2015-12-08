// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.domain.payment:
//            ChargeAccount

public class FacebookChargeAccount extends ChargeAccount
{

    private final String lastFour;
    private final String type;

    public FacebookChargeAccount(String s, String s1)
    {
        lastFour = (String)Objects.firstNonNull(s, "");
        type = (String)Objects.firstNonNull(s1, "");
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getType()
    {
        return type;
    }
}
