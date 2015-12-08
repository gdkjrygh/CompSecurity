// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.responses;


// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.responses:
//            Response

public static final class  extends Enum
{

    private static final BAD_REQUEST $VALUES[];
    public static final BAD_REQUEST API_ERROR;
    public static final BAD_REQUEST AUTHENTICATION_ERROR;
    public static final BAD_REQUEST BAD_REQUEST;
    public static final BAD_REQUEST CONNECTION_ERROR;
    public static final BAD_REQUEST HTTP_ERROR;
    public static final BAD_REQUEST NOT_FOUND;
    public static final BAD_REQUEST PARSE_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kohls/mcommerce/opal/wallet/rest/responses/Response$ErrorType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HTTP_ERROR = new <init>("HTTP_ERROR", 0);
        API_ERROR = new <init>("API_ERROR", 1);
        CONNECTION_ERROR = new <init>("CONNECTION_ERROR", 2);
        AUTHENTICATION_ERROR = new <init>("AUTHENTICATION_ERROR", 3);
        PARSE_ERROR = new <init>("PARSE_ERROR", 4);
        NOT_FOUND = new <init>("NOT_FOUND", 5);
        BAD_REQUEST = new <init>("BAD_REQUEST", 6);
        $VALUES = (new .VALUES[] {
            HTTP_ERROR, API_ERROR, CONNECTION_ERROR, AUTHENTICATION_ERROR, PARSE_ERROR, NOT_FOUND, BAD_REQUEST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
