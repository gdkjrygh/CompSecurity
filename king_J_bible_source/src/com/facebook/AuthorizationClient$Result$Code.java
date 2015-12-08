// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AuthorizationClient

static final class loggingValue extends Enum
{

    public static final ERROR CANCEL;
    private static final ERROR ENUM$VALUES[];
    public static final ERROR ERROR;
    public static final ERROR SUCCESS;
    private final String loggingValue;

    public static loggingValue valueOf(String s)
    {
        return (loggingValue)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s);
    }

    public static loggingValue[] values()
    {
        loggingValue aloggingvalue[] = ENUM$VALUES;
        int i = aloggingvalue.length;
        loggingValue aloggingvalue1[] = new ENUM.VALUES[i];
        System.arraycopy(aloggingvalue, 0, aloggingvalue1, 0, i);
        return aloggingvalue1;
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
        ENUM$VALUES = (new ENUM.VALUES[] {
            SUCCESS, CANCEL, ERROR
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        loggingValue = s1;
    }
}
