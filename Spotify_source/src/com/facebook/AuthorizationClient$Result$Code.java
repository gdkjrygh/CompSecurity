// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


final class loggingValue extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    final String loggingValue;

    public static loggingValue valueOf(String s)
    {
        return (loggingValue)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s);
    }

    public static loggingValue[] values()
    {
        return (loggingValue[])d.clone();
    }

    static 
    {
        a = new <init>("SUCCESS", 0, "success");
        b = new <init>("CANCEL", 1, "cancel");
        c = new <init>("ERROR", 2, "error");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        loggingValue = s1;
    }
}
