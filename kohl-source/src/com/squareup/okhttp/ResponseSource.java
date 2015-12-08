// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


public final class ResponseSource extends Enum
{

    private static final ResponseSource $VALUES[];
    public static final ResponseSource CACHE;
    public static final ResponseSource CONDITIONAL_CACHE;
    public static final ResponseSource NETWORK;

    private ResponseSource(String s, int i)
    {
        super(s, i);
    }

    public static ResponseSource valueOf(String s)
    {
        return (ResponseSource)Enum.valueOf(com/squareup/okhttp/ResponseSource, s);
    }

    public static ResponseSource[] values()
    {
        return (ResponseSource[])$VALUES.clone();
    }

    public boolean requiresConnection()
    {
        return this == CONDITIONAL_CACHE || this == NETWORK;
    }

    static 
    {
        CACHE = new ResponseSource("CACHE", 0);
        CONDITIONAL_CACHE = new ResponseSource("CONDITIONAL_CACHE", 1);
        NETWORK = new ResponseSource("NETWORK", 2);
        $VALUES = (new ResponseSource[] {
            CACHE, CONDITIONAL_CACHE, NETWORK
        });
    }
}
