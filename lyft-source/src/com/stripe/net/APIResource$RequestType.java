// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;


public final class  extends Enum
{

    private static final MULTIPART $VALUES[];
    public static final MULTIPART MULTIPART;
    public static final MULTIPART NORMAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/stripe/net/APIResource$RequestType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        MULTIPART = new <init>("MULTIPART", 1);
        $VALUES = (new .VALUES[] {
            NORMAL, MULTIPART
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
