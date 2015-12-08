// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums;


public final class ErrorType extends Enum
{

    public static final ErrorType BAD_INPUT;
    public static final ErrorType INVALID_API_KEY;
    public static final ErrorType NO_DEVICE_IDENTIFIER;
    public static final ErrorType REQUIRED_FIELD_MISSING;
    public static final ErrorType RESPONSE_PARSE_ERROR;
    public static final ErrorType UNRECOGNIZED_ERROR;
    private static final ErrorType a[];

    private ErrorType(String s, int i)
    {
        super(s, i);
    }

    public static ErrorType valueOf(String s)
    {
        return (ErrorType)Enum.valueOf(com/appboy/enums/ErrorType, s);
    }

    public static ErrorType[] values()
    {
        return (ErrorType[])a.clone();
    }

    static 
    {
        REQUIRED_FIELD_MISSING = new ErrorType("REQUIRED_FIELD_MISSING", 0);
        BAD_INPUT = new ErrorType("BAD_INPUT", 1);
        NO_DEVICE_IDENTIFIER = new ErrorType("NO_DEVICE_IDENTIFIER", 2);
        INVALID_API_KEY = new ErrorType("INVALID_API_KEY", 3);
        RESPONSE_PARSE_ERROR = new ErrorType("RESPONSE_PARSE_ERROR", 4);
        UNRECOGNIZED_ERROR = new ErrorType("UNRECOGNIZED_ERROR", 5);
        a = (new ErrorType[] {
            REQUIRED_FIELD_MISSING, BAD_INPUT, NO_DEVICE_IDENTIFIER, INVALID_API_KEY, RESPONSE_PARSE_ERROR, UNRECOGNIZED_ERROR
        });
    }
}
