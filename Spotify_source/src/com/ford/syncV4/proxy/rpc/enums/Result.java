// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class Result extends Enum
{

    private static Result A;
    private static Result B;
    private static Result C;
    private static Result D;
    private static Result E;
    private static Result F;
    private static final Result G[];
    private static Result a;
    private static Result b;
    private static Result c;
    private static Result d;
    private static Result e;
    private static Result f;
    private static Result g;
    private static Result h;
    private static Result i;
    private static Result j;
    private static Result k;
    private static Result l;
    private static Result m;
    private static Result n;
    private static Result o;
    private static Result p;
    private static Result q;
    private static Result r;
    private static Result s;
    private static Result t;
    private static Result u;
    private static Result v;
    private static Result w;
    private static Result x;
    private static Result y;
    private static Result z;

    private Result(String s1, int i1)
    {
        super(s1, i1);
    }

    public static Result a(String s1)
    {
        return valueOf(s1);
    }

    public static Result valueOf(String s1)
    {
        return (Result)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/Result, s1);
    }

    public static Result[] values()
    {
        return (Result[])G.clone();
    }

    static 
    {
        a = new Result("SUCCESS", 0);
        b = new Result("INVALID_DATA", 1);
        c = new Result("UNSUPPORTED_REQUEST", 2);
        d = new Result("OUT_OF_MEMORY", 3);
        e = new Result("TOO_MANY_PENDING_REQUESTS", 4);
        f = new Result("INVALID_ID", 5);
        g = new Result("DUPLICATE_NAME", 6);
        h = new Result("TOO_MANY_APPLICATIONS", 7);
        i = new Result("APPLICATION_REGISTERED_ALREADY", 8);
        j = new Result("UNSUPPORTED_VERSION", 9);
        k = new Result("WRONG_LANGUAGE", 10);
        l = new Result("APPLICATION_NOT_REGISTERED", 11);
        m = new Result("IN_USE", 12);
        n = new Result("VEHICLE_DATA_NOT_ALLOWED", 13);
        o = new Result("VEHICLE_DATA_NOT_AVAILABLE", 14);
        p = new Result("REJECTED", 15);
        q = new Result("ABORTED", 16);
        r = new Result("IGNORED", 17);
        s = new Result("UNSUPPORTED_RESOURCE", 18);
        t = new Result("FILE_NOT_FOUND", 19);
        u = new Result("GENERIC_ERROR", 20);
        v = new Result("DISALLOWED", 21);
        w = new Result("USER_DISALLOWED", 22);
        x = new Result("TIMED_OUT", 23);
        y = new Result("CANCEL_ROUTE", 24);
        z = new Result("TRUNCATED_DATA", 25);
        A = new Result("RETRY", 26);
        B = new Result("WARNINGS", 27);
        C = new Result("SAVED", 28);
        D = new Result("INVALID_CERT", 29);
        E = new Result("EXPIRED_CERT", 30);
        F = new Result("RESUME_FAILED", 31);
        G = (new Result[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F
        });
    }
}
