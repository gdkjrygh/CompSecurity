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
    public static final ErrorCode i;
    public static final ErrorCode j;
    public static final ErrorCode k;
    public static final ErrorCode l;
    public static final ErrorCode m;
    public static final ErrorCode n;
    public static final ErrorCode o;
    public static final ErrorCode p;
    public static final ErrorCode q;
    public static final ErrorCode r;
    private static final ErrorCode v[];
    public final int s;
    public final int t;
    public final int u;

    private ErrorCode(String s1, int i1, int j1, int k1, int l1)
    {
        super(s1, i1);
        s = j1;
        t = k1;
        u = l1;
    }

    public static ErrorCode a(int i1)
    {
        ErrorCode aerrorcode[] = values();
        int k1 = aerrorcode.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            ErrorCode errorcode = aerrorcode[j1];
            if (errorcode.t == i1)
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
            if (errorcode.s == i1)
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
            if (errorcode.u == i1)
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
        return (ErrorCode[])v.clone();
    }

    static 
    {
        a = new ErrorCode("NO_ERROR", 0, 0, -1, 0);
        b = new ErrorCode("PROTOCOL_ERROR", 1, 1, 1, 1);
        c = new ErrorCode("INVALID_STREAM", 2, 1, 2, -1);
        d = new ErrorCode("UNSUPPORTED_VERSION", 3, 1, 4, -1);
        e = new ErrorCode("STREAM_IN_USE", 4, 1, 8, -1);
        f = new ErrorCode("STREAM_ALREADY_CLOSED", 5, 1, 9, -1);
        g = new ErrorCode("INTERNAL_ERROR", 6, 2, 6, 2);
        h = new ErrorCode("FLOW_CONTROL_ERROR", 7, 3, 7, -1);
        i = new ErrorCode("STREAM_CLOSED", 8, 5, -1, -1);
        j = new ErrorCode("FRAME_TOO_LARGE", 9, 6, 11, -1);
        k = new ErrorCode("REFUSED_STREAM", 10, 7, 3, -1);
        l = new ErrorCode("CANCEL", 11, 8, 5, -1);
        m = new ErrorCode("COMPRESSION_ERROR", 12, 9, -1, -1);
        n = new ErrorCode("CONNECT_ERROR", 13, 10, -1, -1);
        o = new ErrorCode("ENHANCE_YOUR_CALM", 14, 11, -1, -1);
        p = new ErrorCode("INADEQUATE_SECURITY", 15, 12, -1, -1);
        q = new ErrorCode("HTTP_1_1_REQUIRED", 16, 13, -1, -1);
        r = new ErrorCode("INVALID_CREDENTIALS", 17, -1, 10, -1);
        v = (new ErrorCode[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
