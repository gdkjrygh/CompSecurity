// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;


// Referenced classes of package com.soundcloud.android.api:
//            ApiRequestException

public static final class  extends Enum
{

    private static final SERVER_ERROR $VALUES[];
    public static final SERVER_ERROR AUTH_ERROR;
    public static final SERVER_ERROR BAD_REQUEST;
    public static final SERVER_ERROR MALFORMED_INPUT;
    public static final SERVER_ERROR NETWORK_ERROR;
    public static final SERVER_ERROR NOT_ALLOWED;
    public static final SERVER_ERROR NOT_FOUND;
    public static final SERVER_ERROR RATE_LIMITED;
    public static final SERVER_ERROR SERVER_ERROR;
    public static final SERVER_ERROR UNEXPECTED_RESPONSE;
    public static final SERVER_ERROR VALIDATION_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/api/ApiRequestException$Reason, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AUTH_ERROR = new <init>("AUTH_ERROR", 0);
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 1);
        NOT_FOUND = new <init>("NOT_FOUND", 2);
        NOT_ALLOWED = new <init>("NOT_ALLOWED", 3);
        RATE_LIMITED = new <init>("RATE_LIMITED", 4);
        UNEXPECTED_RESPONSE = new <init>("UNEXPECTED_RESPONSE", 5);
        BAD_REQUEST = new <init>("BAD_REQUEST", 6);
        VALIDATION_ERROR = new <init>("VALIDATION_ERROR", 7);
        MALFORMED_INPUT = new <init>("MALFORMED_INPUT", 8);
        SERVER_ERROR = new <init>("SERVER_ERROR", 9);
        $VALUES = (new .VALUES[] {
            AUTH_ERROR, NETWORK_ERROR, NOT_FOUND, NOT_ALLOWED, RATE_LIMITED, UNEXPECTED_RESPONSE, BAD_REQUEST, VALIDATION_ERROR, MALFORMED_INPUT, SERVER_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
