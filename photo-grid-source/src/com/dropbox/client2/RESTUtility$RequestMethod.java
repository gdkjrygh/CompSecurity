// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;


public final class  extends Enum
{

    private static final POST $VALUES[];
    public static final POST GET;
    public static final POST POST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dropbox/client2/RESTUtility$RequestMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GET = new <init>("GET", 0);
        POST = new <init>("POST", 1);
        $VALUES = (new .VALUES[] {
            GET, POST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
