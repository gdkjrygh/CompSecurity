// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;


public final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR LOADING;
    public static final ERROR SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/braintreepayments/api/dropin/view/LoadingHeader$HeaderState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADING = new <init>("LOADING", 0);
        SUCCESS = new <init>("SUCCESS", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            LOADING, SUCCESS, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
