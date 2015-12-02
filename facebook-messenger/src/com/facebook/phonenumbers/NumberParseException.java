// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.phonenumbers;


public class NumberParseException extends Exception
{

    private ErrorType errorType;
    private String message;

    public NumberParseException(ErrorType errortype, String s)
    {
        super(s);
        message = s;
        errorType = errortype;
    }

    public ErrorType getErrorType()
    {
        return errorType;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Error type: ").append(errorType).append(". ").append(message).toString();
    }
}
