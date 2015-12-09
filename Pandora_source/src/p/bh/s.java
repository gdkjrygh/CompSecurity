// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class s extends Enum
{

    public static final s A;
    public static final s B;
    public static final s C;
    public static final s D;
    public static final s E;
    public static final s F;
    private static final s G[];
    public static final s a;
    public static final s b;
    public static final s c;
    public static final s d;
    public static final s e;
    public static final s f;
    public static final s g;
    public static final s h;
    public static final s i;
    public static final s j;
    public static final s k;
    public static final s l;
    public static final s m;
    public static final s n;
    public static final s o;
    public static final s p;
    public static final s q;
    public static final s r;
    public static final s s;
    public static final s t;
    public static final s u;
    public static final s v;
    public static final s w;
    public static final s x;
    public static final s y;
    public static final s z;

    private s(String s1, int i1)
    {
        super(s1, i1);
    }

    public static s a(String s1)
    {
        return valueOf(s1);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(p/bh/s, s1);
    }

    public static s[] values()
    {
        return (s[])G.clone();
    }

    static 
    {
        a = new s("SUCCESS", 0);
        b = new s("INVALID_DATA", 1);
        c = new s("UNSUPPORTED_REQUEST", 2);
        d = new s("OUT_OF_MEMORY", 3);
        e = new s("TOO_MANY_PENDING_REQUESTS", 4);
        f = new s("INVALID_ID", 5);
        g = new s("DUPLICATE_NAME", 6);
        h = new s("TOO_MANY_APPLICATIONS", 7);
        i = new s("APPLICATION_REGISTERED_ALREADY", 8);
        j = new s("UNSUPPORTED_VERSION", 9);
        k = new s("WRONG_LANGUAGE", 10);
        l = new s("APPLICATION_NOT_REGISTERED", 11);
        m = new s("IN_USE", 12);
        n = new s("VEHICLE_DATA_NOT_ALLOWED", 13);
        o = new s("VEHICLE_DATA_NOT_AVAILABLE", 14);
        p = new s("REJECTED", 15);
        q = new s("ABORTED", 16);
        r = new s("IGNORED", 17);
        s = new s("UNSUPPORTED_RESOURCE", 18);
        t = new s("FILE_NOT_FOUND", 19);
        u = new s("GENERIC_ERROR", 20);
        v = new s("DISALLOWED", 21);
        w = new s("USER_DISALLOWED", 22);
        x = new s("TIMED_OUT", 23);
        y = new s("CANCEL_ROUTE", 24);
        z = new s("TRUNCATED_DATA", 25);
        A = new s("RETRY", 26);
        B = new s("WARNINGS", 27);
        C = new s("SAVED", 28);
        D = new s("INVALID_CERT", 29);
        E = new s("EXPIRED_CERT", 30);
        F = new s("RESUME_FAILED", 31);
        G = (new s[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F
        });
    }
}
