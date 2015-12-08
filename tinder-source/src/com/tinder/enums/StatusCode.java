// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class StatusCode extends Enum
{

    private static final StatusCode $VALUES[];
    public static final StatusCode BAD_REQUEST;
    public static final StatusCode ERROR;
    public static final StatusCode NOT_FOUND;
    public static final StatusCode OK;
    public static final StatusCode UNAUTHORIZED;
    private final int mCode;

    private StatusCode(String s, int i, int j)
    {
        super(s, i);
        mCode = j;
    }

    public static StatusCode valueOf(String s)
    {
        return (StatusCode)Enum.valueOf(com/tinder/enums/StatusCode, s);
    }

    public static StatusCode[] values()
    {
        return (StatusCode[])$VALUES.clone();
    }

    public final int getCode()
    {
        return mCode;
    }

    static 
    {
        OK = new StatusCode("OK", 0, 200);
        BAD_REQUEST = new StatusCode("BAD_REQUEST", 1, 400);
        UNAUTHORIZED = new StatusCode("UNAUTHORIZED", 2, 401);
        NOT_FOUND = new StatusCode("NOT_FOUND", 3, 404);
        ERROR = new StatusCode("ERROR", 4, 500);
        $VALUES = (new StatusCode[] {
            OK, BAD_REQUEST, UNAUTHORIZED, NOT_FOUND, ERROR
        });
    }
}
