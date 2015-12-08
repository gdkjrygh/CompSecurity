// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.google.android.gms.internal:
//            jx

public final class kd
    implements g
{
    public static final class a
    {

        private final Status a;
        private final a b;
        private final byte c[];
        private final long d;
        private final jx e;
        private final ke.c f;

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

        public final ke.c e()
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

        public a(Status status, jx jx, byte abyte0[], ke.c c1, a a1, long l)
        {
            a = status;
            e = jx;
            c = abyte0;
            f = c1;
            b = a1;
            d = l;
        }
    }

    public static final class a.a extends Enum
    {

        public static final a.a a;
        public static final a.a b;
        public static final a.a c;
        private static final a.a d[];

        public static a.a valueOf(String s)
        {
            return (a.a)Enum.valueOf(com/google/android/gms/internal/kd$a$a, s);
        }

        public static a.a[] values()
        {
            return (a.a[])d.clone();
        }

        static 
        {
            a = new a.a("NETWORK", 0);
            b = new a.a("DISK", 1);
            c = new a.a("DEFAULT", 2);
            d = (new a.a[] {
                a, b, c
            });
        }

        private a.a(String s, int i)
        {
            super(s, i);
        }
    }


    private final a a;

    public kd(a a1)
    {
        a = a1;
    }

    public final a a()
    {
        return a;
    }

    public final Status getStatus()
    {
        return a.a();
    }
}
