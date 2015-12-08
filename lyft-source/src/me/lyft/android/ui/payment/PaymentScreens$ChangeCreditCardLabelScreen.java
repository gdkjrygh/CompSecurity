// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;


// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentScreens

public class cardLabel extends PaymentScreens
{

    private final String cardLabel;
    private final String cardLabelType;

    public String getCardLabel()
    {
        return cardLabel;
    }

    public String getCardLabelType()
    {
        return cardLabelType;
    }

    public (String s, String s1)
    {
        cardLabelType = s;
        cardLabel = s1;
    }
}
