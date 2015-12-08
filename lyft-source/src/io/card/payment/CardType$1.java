// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


// Referenced classes of package io.card.payment:
//            CardType

class 
{

    static final int $SwitchMap$io$card$payment$CardType[];

    static 
    {
        $SwitchMap$io$card$payment$CardType = new int[CardType.values().length];
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.AMEX.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.DINERSCLUB.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.DISCOVER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.JCB.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.MASTERCARD.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.VISA.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.INSUFFICIENT_DIGITS.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$io$card$payment$CardType[CardType.UNKNOWN.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
