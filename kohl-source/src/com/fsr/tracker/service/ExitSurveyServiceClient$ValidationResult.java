// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.service;


// Referenced classes of package com.fsr.tracker.service:
//            ExitSurveyServiceClient

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN INVALID_FORMAT;
    public static final UNKNOWN REQUIRED_FIELD;
    public static final UNKNOWN SERVER_ERROR;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN VALID;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fsr/tracker/service/ExitSurveyServiceClient$ValidationResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VALID = new <init>("VALID", 0);
        REQUIRED_FIELD = new <init>("REQUIRED_FIELD", 1);
        INVALID_FORMAT = new <init>("INVALID_FORMAT", 2);
        SERVER_ERROR = new <init>("SERVER_ERROR", 3);
        UNKNOWN = new <init>("UNKNOWN", 4);
        $VALUES = (new .VALUES[] {
            VALID, REQUIRED_FIELD, INVALID_FORMAT, SERVER_ERROR, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
