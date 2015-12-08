// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.responses;


// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.responses:
//            Response

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ERROR;
    public static final UNKNOWN OK;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/wallet/rest/responses/Response$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OK = new <init>("OK", 0);
        ERROR = new <init>("ERROR", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            OK, ERROR, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
