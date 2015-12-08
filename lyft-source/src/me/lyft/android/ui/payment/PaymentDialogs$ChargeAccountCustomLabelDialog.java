// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;


// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentDialogs

public class cardLabelType extends PaymentDialogs
{

    private final String cardLabelType;
    private final String customLabel;

    public String getCardLabelType()
    {
        return cardLabelType;
    }

    public String getCustomLabel()
    {
        return customLabel;
    }

    public (String s, String s1)
    {
        customLabel = s1;
        cardLabelType = s;
    }
}
