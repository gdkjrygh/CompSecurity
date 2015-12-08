// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.http;


// Referenced classes of package com.microsoft.applications.telemetry.http:
//            WrappedHttpRequest

private static final class status extends Enum
{

    private static final ABORTED $VALUES[];
    public static final ABORTED ABORTED;
    public static final ABORTED ERROR;
    public static final ABORTED OK;
    private final int status;

    public static status valueOf(String s)
    {
        return (status)Enum.valueOf(com/microsoft/applications/telemetry/http/WrappedHttpRequest$ErrorCode, s);
    }

    public static status[] values()
    {
        return (status[])$VALUES.clone();
    }

    public final int getValue()
    {
        return status;
    }

    static 
    {
        OK = new <init>("OK", 0, 0);
        ERROR = new <init>("ERROR", 1, -1);
        ABORTED = new <init>("ABORTED", 2, -2);
        $VALUES = (new .VALUES[] {
            OK, ERROR, ABORTED
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        status = j;
    }
}
