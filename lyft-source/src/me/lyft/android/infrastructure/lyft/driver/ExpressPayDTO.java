// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driver;

import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.driver:
//            ExpressPayAccountDTO

public class ExpressPayDTO
{

    public final ExpressPayAccountDTO expressAccount;
    public final List lineItems;
    public final String payoutInfoText;

    public ExpressPayDTO(ExpressPayAccountDTO expresspayaccountdto, String s, List list)
    {
        expressAccount = expresspayaccountdto;
        payoutInfoText = s;
        lineItems = list;
    }
}
