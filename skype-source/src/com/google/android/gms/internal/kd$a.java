// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            kd, jx

public static final class d
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/internal/kd$a$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NETWORK", 0);
            b = new a("DISK", 1);
            c = new a("DEFAULT", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status a;
    private final a b;
    private final byte c[];
    private final long d;
    private final jx e;
    private final a f;

    public final Status a()
    {
        return a;
    }

    public final a b()
    {
        return b;
    }

    public final byte[] c()
    {
        return c;
    }

    public final jx d()
    {
        return e;
    }

    public final e e()
    {
        return f;
    }

    public final long f()
    {
        return d;
    }

    public a(Status status, jx jx, a a1)
    {
        this(status, jx, null, null, a1, 0L);
    }

    public a(Status status, jx jx, byte abyte0[], tus tus, a a1, long l)
    {
        a = status;
        e = jx;
        c = abyte0;
        f = tus;
        b = a1;
        d = l;
    }
}
