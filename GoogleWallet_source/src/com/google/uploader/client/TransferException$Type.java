// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


// Referenced classes of package com.google.uploader.client:
//            TransferException

public static final class recoverable extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN BAD_URL;
    public static final UNKNOWN CANCELED;
    public static final UNKNOWN CONNECTION_ERROR;
    public static final UNKNOWN REQUEST_BODY_READ_ERROR;
    public static final UNKNOWN SERVER_ERROR;
    public static final UNKNOWN UNKNOWN;
    private final boolean recoverable;

    public static recoverable valueOf(String s)
    {
        return (recoverable)Enum.valueOf(com/google/uploader/client/TransferException$Type, s);
    }

    public static recoverable[] values()
    {
        return (recoverable[])$VALUES.clone();
    }

    final boolean isRecoverable()
    {
        return recoverable;
    }

    static 
    {
        BAD_URL = new <init>("BAD_URL", 0, false);
        CANCELED = new <init>("CANCELED", 1, false);
        REQUEST_BODY_READ_ERROR = new <init>("REQUEST_BODY_READ_ERROR", 2, false);
        CONNECTION_ERROR = new <init>("CONNECTION_ERROR", 3, true);
        SERVER_ERROR = new <init>("SERVER_ERROR", 4, true);
        UNKNOWN = new <init>("UNKNOWN", 5, false);
        $VALUES = (new .VALUES[] {
            BAD_URL, CANCELED, REQUEST_BODY_READ_ERROR, CONNECTION_ERROR, SERVER_ERROR, UNKNOWN
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        recoverable = flag;
    }
}
