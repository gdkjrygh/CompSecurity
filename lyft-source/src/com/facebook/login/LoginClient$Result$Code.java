// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


final class loggingValue extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR CANCEL;
    public static final ERROR ERROR;
    public static final ERROR SUCCESS;
    private final String loggingValue;

    public static loggingValue valueOf(String s)
    {
        return (loggingValue)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
    }

    public static loggingValue[] values()
    {
        return (loggingValue[])$VALUES.clone();
    }

    String getLoggingValue()
    {
        return loggingValue;
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0, "success");
        CANCEL = new <init>("CANCEL", 1, "cancel");
        ERROR = new <init>("ERROR", 2, "error");
        $VALUES = (new .VALUES[] {
            SUCCESS, CANCEL, ERROR
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        loggingValue = s1;
    }
}
