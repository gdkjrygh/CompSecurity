// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


public final class ErrorCodes extends Enum
{

    public static final ErrorCodes Application_Close;
    public static final ErrorCodes Application_Close_NoStart;
    public static final ErrorCodes Application_Close_NoStart_Late;
    private static final ErrorCodes ENUM$VALUES[];
    public static final ErrorCodes Stream_Not_Found;

    private ErrorCodes(String s, int i)
    {
        super(s, i);
    }

    public static ErrorCodes valueOf(String s)
    {
        return (ErrorCodes)Enum.valueOf(com/akamai/android/analytics/ErrorCodes, s);
    }

    public static ErrorCodes[] values()
    {
        ErrorCodes aerrorcodes[] = ENUM$VALUES;
        int i = aerrorcodes.length;
        ErrorCodes aerrorcodes1[] = new ErrorCodes[i];
        System.arraycopy(aerrorcodes, 0, aerrorcodes1, 0, i);
        return aerrorcodes1;
    }

    static 
    {
        Application_Close_NoStart_Late = new ErrorCodes("Application_Close_NoStart_Late", 0);
        Application_Close_NoStart = new ErrorCodes("Application_Close_NoStart", 1);
        Application_Close = new ErrorCodes("Application_Close", 2);
        Stream_Not_Found = new ErrorCodes("Stream_Not_Found", 3);
        ENUM$VALUES = (new ErrorCodes[] {
            Application_Close_NoStart_Late, Application_Close_NoStart, Application_Close, Stream_Not_Found
        });
    }
}
