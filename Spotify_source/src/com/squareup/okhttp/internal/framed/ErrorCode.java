// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;


public final class ErrorCode extends Enum
{

    public static final ErrorCode a;
    public static final ErrorCode b;
    public static final ErrorCode c;
    public static final ErrorCode d;
    public static final ErrorCode e;
    public static final ErrorCode f;
    public static final ErrorCode g;
    public static final ErrorCode h;
    private static ErrorCode i;
    private static ErrorCode j;
    private static ErrorCode k;
    private static ErrorCode l;
    private static ErrorCode m;
    private static ErrorCode n;
    private static ErrorCode o;
    private static ErrorCode p;
    private static ErrorCode q;
    private static ErrorCode r;
    private static final ErrorCode s[];
    public final int httpCode;
    public final int spdyGoAwayCode;
    public final int spdyRstCode;

    private ErrorCode(String s1, int i1, int j1, int k1, int l1)
    {
        super(s1, i1);
        httpCode = j1;
        spdyRstCode = k1;
        spdyGoAwayCode = l1;
    }

    public static ErrorCode a(int i1)
    {
        ErrorCode aerrorcode[] = values();
        int k1 = aerrorcode.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            ErrorCode errorcode = aerrorcode[j1];
            if (errorcode.spdyRstCode == i1)
            {
                return errorcode;
            }
        }

        return null;
    }

    public static ErrorCode b(int i1)
    {
        ErrorCode aerrorcode[] = values();
        int k1 = aerrorcode.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            ErrorCode errorcode = aerrorcode[j1];
            if (errorcode.httpCode == i1)
            {
                return errorcode;
            }
        }

        return null;
    }

    public static ErrorCode c(int i1)
    {
        ErrorCode aerrorcode[] = values();
        int k1 = aerrorcode.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            ErrorCode errorcode = aerrorcode[j1];
            if (errorcode.spdyGoAwayCode == i1)
            {
                return errorcode;
            }
        }

        return null;
    }

    public static ErrorCode valueOf(String s1)
    {
        return (ErrorCode)Enum.valueOf(com/squareup/okhttp/internal/framed/ErrorCode, s1);
    }

    public static ErrorCode[] values()
    {
        return (ErrorCode[])s.clone();
    }

    static 
    {
        a = new ErrorCode("NO_ERROR", 0, 0, -1, 0);
        b = new ErrorCode("PROTOCOL_ERROR", 1, 1, 1, 1);
        c = new ErrorCode("INVALID_STREAM", 2, 1, 2, -1);
        i = new ErrorCode("UNSUPPORTED_VERSION", 3, 1, 4, -1);
        d = new ErrorCode("STREAM_IN_USE", 4, 1, 8, -1);
        j = new ErrorCode("STREAM_ALREADY_CLOSED", 5, 1, 9, -1);
        e = new ErrorCode("INTERNAL_ERROR", 6, 2, 6, 2);
        f = new ErrorCode("FLOW_CONTROL_ERROR", 7, 3, 7, -1);
        k = new ErrorCode("STREAM_CLOSED", 8, 5, -1, -1);
        l = new ErrorCode("FRAME_TOO_LARGE", 9, 6, 11, -1);
        g = new ErrorCode("REFUSED_STREAM", 10, 7, 3, -1);
        h = new ErrorCode("CANCEL", 11, 8, 5, -1);
        m = new ErrorCode("COMPRESSION_ERROR", 12, 9, -1, -1);
        n = new ErrorCode("CONNECT_ERROR", 13, 10, -1, -1);
        o = new ErrorCode("ENHANCE_YOUR_CALM", 14, 11, -1, -1);
        p = new ErrorCode("INADEQUATE_SECURITY", 15, 12, -1, -1);
        q = new ErrorCode("HTTP_1_1_REQUIRED", 16, 13, -1, -1);
        r = new ErrorCode("INVALID_CREDENTIALS", 17, -1, 10, -1);
        s = (new ErrorCode[] {
            a, b, c, i, d, j, e, f, k, l, 
            g, h, m, n, o, p, q, r
        });
    }
}
