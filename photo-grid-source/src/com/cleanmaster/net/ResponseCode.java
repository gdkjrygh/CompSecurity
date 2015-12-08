// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.net;


public final class ResponseCode extends Enum
{

    public static final ResponseCode AuthError;
    public static final ResponseCode BadRequest;
    public static final ResponseCode Canced;
    public static final ResponseCode Conflict;
    public static final ResponseCode DEFAULT;
    public static final ResponseCode Failed;
    public static final ResponseCode Forbidden;
    public static final ResponseCode GZipError;
    public static final ResponseCode IOError;
    public static final ResponseCode InternalError;
    public static final ResponseCode NeedReRequst;
    public static final ResponseCode NetworkError;
    public static final ResponseCode NotFound;
    public static final ResponseCode ParamError;
    public static final ResponseCode ParseError;
    public static final ResponseCode Succeed;
    public static final ResponseCode Timeout;
    public static final ResponseCode UnAuthorized;
    private static final ResponseCode a[];

    private ResponseCode(String s, int i)
    {
        super(s, i);
    }

    public static ResponseCode valueOf(String s)
    {
        return (ResponseCode)Enum.valueOf(com/cleanmaster/net/ResponseCode, s);
    }

    public static ResponseCode[] values()
    {
        return (ResponseCode[])a.clone();
    }

    static 
    {
        Succeed = new ResponseCode("Succeed", 0);
        Timeout = new ResponseCode("Timeout", 1);
        NetworkError = new ResponseCode("NetworkError", 2);
        AuthError = new ResponseCode("AuthError", 3);
        ParamError = new ResponseCode("ParamError", 4);
        Failed = new ResponseCode("Failed", 5);
        BadRequest = new ResponseCode("BadRequest", 6);
        UnAuthorized = new ResponseCode("UnAuthorized", 7);
        Forbidden = new ResponseCode("Forbidden", 8);
        NotFound = new ResponseCode("NotFound", 9);
        Conflict = new ResponseCode("Conflict", 10);
        InternalError = new ResponseCode("InternalError", 11);
        Canced = new ResponseCode("Canced", 12);
        NeedReRequst = new ResponseCode("NeedReRequst", 13);
        GZipError = new ResponseCode("GZipError", 14);
        ParseError = new ResponseCode("ParseError", 15);
        IOError = new ResponseCode("IOError", 16);
        DEFAULT = new ResponseCode("DEFAULT", 17);
        a = (new ResponseCode[] {
            Succeed, Timeout, NetworkError, AuthError, ParamError, Failed, BadRequest, UnAuthorized, Forbidden, NotFound, 
            Conflict, InternalError, Canced, NeedReRequst, GZipError, ParseError, IOError, DEFAULT
        });
    }
}
