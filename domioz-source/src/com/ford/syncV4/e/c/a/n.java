// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class n extends Enum
{

    public static final n A;
    public static final n B;
    public static final n C;
    public static final n D;
    public static final n E;
    public static final n F;
    private static final n G[];
    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    public static final n o;
    public static final n p;
    public static final n q;
    public static final n r;
    public static final n s;
    public static final n t;
    public static final n u;
    public static final n v;
    public static final n w;
    public static final n x;
    public static final n y;
    public static final n z;

    private n(String s1, int i1)
    {
        super(s1, i1);
    }

    public static n a(String s1)
    {
        return valueOf(s1);
    }

    public static n valueOf(String s1)
    {
        return (n)Enum.valueOf(com/ford/syncV4/e/c/a/n, s1);
    }

    public static n[] values()
    {
        return (n[])G.clone();
    }

    static 
    {
        a = new n("SUCCESS", 0);
        b = new n("INVALID_DATA", 1);
        c = new n("UNSUPPORTED_REQUEST", 2);
        d = new n("OUT_OF_MEMORY", 3);
        e = new n("TOO_MANY_PENDING_REQUESTS", 4);
        f = new n("INVALID_ID", 5);
        g = new n("DUPLICATE_NAME", 6);
        h = new n("TOO_MANY_APPLICATIONS", 7);
        i = new n("APPLICATION_REGISTERED_ALREADY", 8);
        j = new n("UNSUPPORTED_VERSION", 9);
        k = new n("WRONG_LANGUAGE", 10);
        l = new n("APPLICATION_NOT_REGISTERED", 11);
        m = new n("IN_USE", 12);
        n = new n("VEHICLE_DATA_NOT_ALLOWED", 13);
        o = new n("VEHICLE_DATA_NOT_AVAILABLE", 14);
        p = new n("REJECTED", 15);
        q = new n("ABORTED", 16);
        r = new n("IGNORED", 17);
        s = new n("UNSUPPORTED_RESOURCE", 18);
        t = new n("FILE_NOT_FOUND", 19);
        u = new n("GENERIC_ERROR", 20);
        v = new n("DISALLOWED", 21);
        w = new n("USER_DISALLOWED", 22);
        x = new n("TIMED_OUT", 23);
        y = new n("CANCEL_ROUTE", 24);
        z = new n("TRUNCATED_DATA", 25);
        A = new n("RETRY", 26);
        B = new n("WARNINGS", 27);
        C = new n("SAVED", 28);
        D = new n("INVALID_CERT", 29);
        E = new n("EXPIRED_CERT", 30);
        F = new n("RESUME_FAILED", 31);
        G = (new n[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F
        });
    }
}
