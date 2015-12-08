// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import java.util.List;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentScreens

public class creditRestrictions extends PaymentScreens
{

    private final String creditHeader;
    private final List creditRestrictions;

    public String getCreditHeader()
    {
        return creditHeader;
    }

    public List getCreditRestrictions()
    {
        return creditRestrictions;
    }

    public (String s, List list)
    {
        creditHeader = s;
        creditRestrictions = list;
    }
}
