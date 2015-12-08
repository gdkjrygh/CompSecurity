// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;


public final class ErrorCode extends Enum
{

    private static final ErrorCode $VALUES[];
    public static final ErrorCode CANCEL;
    public static final ErrorCode COMPRESSION_ERROR;
    public static final ErrorCode FLOW_CONTROL_ERROR;
    public static final ErrorCode FRAME_TOO_LARGE;
    public static final ErrorCode INTERNAL_ERROR;
    public static final ErrorCode INVALID_CREDENTIALS;
    public static final ErrorCode INVALID_STREAM;
    public static final ErrorCode NO_ERROR;
    public static final ErrorCode PROTOCOL_ERROR;
    public static final ErrorCode REFUSED_STREAM;
    public static final ErrorCode STREAM_ALREADY_CLOSED;
    public static final ErrorCode STREAM_CLOSED;
    public static final ErrorCode STREAM_IN_USE;
    public static final ErrorCode UNSUPPORTED_VERSION;
    public final int httpCode;
    public final int spdyGoAwayCode;
    public final int spdyRstCode;

    private ErrorCode(String s, int i, int j, int k, int l)
    {
        super(s, i);
        httpCode = j;
        spdyRstCode = k;
        spdyGoAwayCode = l;
    }

    public static ErrorCode fromHttp2(int i)
    {
        ErrorCode aerrorcode[] = values();
        int k = aerrorcode.length;
        for (int j = 0; j < k; j++)
        {
            ErrorCode errorcode = aerrorcode[j];
            if (errorcode.httpCode == i)
            {
                return errorcode;
            }
        }

        return null;
    }

    public static ErrorCode fromSpdy3Rst(int i)
    {
        ErrorCode aerrorcode[] = values();
        int k = aerrorcode.length;
        for (int j = 0; j < k; j++)
        {
            ErrorCode errorcode = aerrorcode[j];
            if (errorcode.spdyRstCode == i)
            {
                return errorcode;
            }
        }

        return null;
    }

    public static ErrorCode fromSpdyGoAway(int i)
    {
        ErrorCode aerrorcode[] = values();
        int k = aerrorcode.length;
        for (int j = 0; j < k; j++)
        {
            ErrorCode errorcode = aerrorcode[j];
            if (errorcode.spdyGoAwayCode == i)
            {
                return errorcode;
            }
        }

        return null;
    }

    public static ErrorCode valueOf(String s)
    {
        return (ErrorCode)Enum.valueOf(com/squareup/okhttp/internal/spdy/ErrorCode, s);
    }

    public static ErrorCode[] values()
    {
        return (ErrorCode[])$VALUES.clone();
    }

    static 
    {
        NO_ERROR = new ErrorCode("NO_ERROR", 0, 0, -1, 0);
        PROTOCOL_ERROR = new ErrorCode("PROTOCOL_ERROR", 1, 1, 1, 1);
        INVALID_STREAM = new ErrorCode("INVALID_STREAM", 2, 1, 2, -1);
        UNSUPPORTED_VERSION = new ErrorCode("UNSUPPORTED_VERSION", 3, 1, 4, -1);
        STREAM_IN_USE = new ErrorCode("STREAM_IN_USE", 4, 1, 8, -1);
        STREAM_ALREADY_CLOSED = new ErrorCode("STREAM_ALREADY_CLOSED", 5, 1, 9, -1);
        INTERNAL_ERROR = new ErrorCode("INTERNAL_ERROR", 6, 2, 6, 2);
        FLOW_CONTROL_ERROR = new ErrorCode("FLOW_CONTROL_ERROR", 7, 3, 7, -1);
        STREAM_CLOSED = new ErrorCode("STREAM_CLOSED", 8, 5, -1, -1);
        FRAME_TOO_LARGE = new ErrorCode("FRAME_TOO_LARGE", 9, 6, 11, -1);
        REFUSED_STREAM = new ErrorCode("REFUSED_STREAM", 10, 7, 3, -1);
        CANCEL = new ErrorCode("CANCEL", 11, 8, 5, -1);
        COMPRESSION_ERROR = new ErrorCode("COMPRESSION_ERROR", 12, 9, -1, -1);
        INVALID_CREDENTIALS = new ErrorCode("INVALID_CREDENTIALS", 13, -1, 10, -1);
        $VALUES = (new ErrorCode[] {
            NO_ERROR, PROTOCOL_ERROR, INVALID_STREAM, UNSUPPORTED_VERSION, STREAM_IN_USE, STREAM_ALREADY_CLOSED, INTERNAL_ERROR, FLOW_CONTROL_ERROR, STREAM_CLOSED, FRAME_TOO_LARGE, 
            REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, INVALID_CREDENTIALS
        });
    }
}
