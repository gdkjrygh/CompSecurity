// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.constant;


public final class ResponseStatus extends Enum
{

    private static final ResponseStatus $VALUES[];
    public static final ResponseStatus FAILURE;
    public static final ResponseStatus SUCCESS;
    public static final ResponseStatus WARNING;

    private ResponseStatus(String s, int i)
    {
        super(s, i);
    }

    public static ResponseStatus valueOf(String s)
    {
        return (ResponseStatus)Enum.valueOf(com/dominos/android/sdk/constant/ResponseStatus, s);
    }

    public static ResponseStatus[] values()
    {
        return (ResponseStatus[])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new ResponseStatus("SUCCESS", 0);
        WARNING = new ResponseStatus("WARNING", 1);
        FAILURE = new ResponseStatus("FAILURE", 2);
        $VALUES = (new ResponseStatus[] {
            SUCCESS, WARNING, FAILURE
        });
    }
}
