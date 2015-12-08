// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            UserActionLogging

public static final class  extends Enum
{

    private static final boletto $VALUES[];
    public static final boletto boletto;
    public static final boletto creditCard;
    public static final boletto directDebit;
    public static final boletto ideal;
    public static final boletto paypal;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/UserActionLogging$PaymentType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        directDebit = new <init>("directDebit", 0);
        creditCard = new <init>("creditCard", 1);
        ideal = new <init>("ideal", 2);
        paypal = new <init>("paypal", 3);
        boletto = new <init>("boletto", 4);
        $VALUES = (new .VALUES[] {
            directDebit, creditCard, ideal, paypal, boletto
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
