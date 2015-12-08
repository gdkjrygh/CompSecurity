// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;


// Referenced classes of package com.adobe.adobepass.accessenabler.models:
//            AuthenticationToken

public static final class  extends Enum
{

    private static final ANY $VALUES[];
    public static final ANY ANY;
    public static final ANY AUTHN_PER_REQUESTOR;
    public static final ANY NON_AUTHN_PER_REQUESTOR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/adobepass/accessenabler/models/AuthenticationToken$TokenType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AUTHN_PER_REQUESTOR = new <init>("AUTHN_PER_REQUESTOR", 0);
        NON_AUTHN_PER_REQUESTOR = new <init>("NON_AUTHN_PER_REQUESTOR", 1);
        ANY = new <init>("ANY", 2);
        $VALUES = (new .VALUES[] {
            AUTHN_PER_REQUESTOR, NON_AUTHN_PER_REQUESTOR, ANY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
