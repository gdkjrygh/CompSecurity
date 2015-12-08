// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.m4b.maps.cz.c;
import com.google.android.m4b.maps.cz.d;
import com.google.android.m4b.maps.h.b;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.j.x;
import java.util.TimeZone;

// Referenced classes of package com.google.android.m4b.maps.e:
//            b

public final class com.google.android.m4b.maps.e.a
{
    public final class a
    {

        public int a;
        public String b;
        public String c;
        public String d;
        public final b e;
        public final com.google.android.m4b.maps.cp.d f;
        public boolean g;
        public com.google.android.m4b.maps.e.a h;

        private a(byte abyte0[])
        {
            this(abyte0, (byte)0);
        }

        private a(byte abyte0[], byte byte0)
        {
            h = com.google.android.m4b.maps.e.a.this;
            super();
            a = com.google.android.m4b.maps.e.a.a(h);
            b = com.google.android.m4b.maps.e.a.b(h);
            c = com.google.android.m4b.maps.e.a.c(h);
            d = com.google.android.m4b.maps.e.a.d(h);
            f = new com.google.android.m4b.maps.cp.d();
            g = false;
            c = com.google.android.m4b.maps.e.a.c(com.google.android.m4b.maps.e.a.this);
            d = com.google.android.m4b.maps.e.a.d(com.google.android.m4b.maps.e.a.this);
            f.a = com.google.android.m4b.maps.e.a.e(com.google.android.m4b.maps.e.a.this).a();
            com.google.android.m4b.maps.cp.d d1 = f;
            com.google.android.m4b.maps.e.a.f(com.google.android.m4b.maps.e.a.this);
            long l1 = f.a;
            d1.c = TimeZone.getDefault().getOffset(l1) / 1000;
            if (abyte0 != null)
            {
                f.b = abyte0;
            }
            e = null;
        }

        public a(byte abyte0[], char c1)
        {
            this(abyte0);
        }
    }

    public static interface b
    {

        public abstract byte[] a();
    }

    public static final class c
    {

        public c()
        {
        }
    }


    public static final com.google.android.m4b.maps.h.b.c a;
    public static final com.google.android.m4b.maps.h.b b;
    private static com.google.android.m4b.maps.h.b.b c;
    private static com.google.android.m4b.maps.e.b d = new com.google.android.m4b.maps.cv.a();
    private final String e;
    private final int f;
    private String g;
    private int h;
    private String i;
    private String j;
    private final boolean k;
    private final com.google.android.m4b.maps.e.b l;
    private final com.google.android.m4b.maps.cz.c m;
    private final c n;

    public com.google.android.m4b.maps.e.a(Context context, String s)
    {
        this(context, s, d, com.google.android.m4b.maps.cz.d.b(), new c());
    }

    private com.google.android.m4b.maps.e.a(Context context, String s, com.google.android.m4b.maps.e.b b1, com.google.android.m4b.maps.cz.c c1, c c2)
    {
        boolean flag = false;
        super();
        h = -1;
        e = context.getPackageName();
        f = a(context);
        h = -1;
        g = s;
        i = null;
        j = null;
        k = false;
        l = b1;
        m = c1;
        n = c2;
        if (k)
        {
            if (i == null)
            {
                flag = true;
            }
            x.b(flag, "can't be anonymous with an upload account");
        }
    }

    private static int a(Context context)
    {
        int i1;
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return 0;
        }
        return i1;
    }

    static int a(com.google.android.m4b.maps.e.a a1)
    {
        return a1.h;
    }

    static String b(com.google.android.m4b.maps.e.a a1)
    {
        return a1.g;
    }

    static String c(com.google.android.m4b.maps.e.a a1)
    {
        return a1.i;
    }

    static String d(com.google.android.m4b.maps.e.a a1)
    {
        return a1.j;
    }

    static com.google.android.m4b.maps.cz.c e(com.google.android.m4b.maps.e.a a1)
    {
        return a1.m;
    }

    static c f(com.google.android.m4b.maps.e.a a1)
    {
        return a1.n;
    }

    public static boolean g(com.google.android.m4b.maps.e.a a1)
    {
        return a1.k;
    }

    public static String h(com.google.android.m4b.maps.e.a a1)
    {
        return a1.e;
    }

    public static int i(com.google.android.m4b.maps.e.a a1)
    {
        return a1.f;
    }

    public static com.google.android.m4b.maps.e.b j(com.google.android.m4b.maps.e.a a1)
    {
        return a1.l;
    }

    static 
    {
        a = new com.google.android.m4b.maps.h.b.c();
        c = new com.google.android.m4b.maps.h.b.b() {

            public final com.google.android.m4b.maps.h.b.a a(Context context, Looper looper, g g1, Object obj, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1)
            {
                return new com.google.android.m4b.maps.cv.b(context, looper, b1, d1, g1.f);
            }

        };
        b = new com.google.android.m4b.maps.h.b("ClearcutLogger.API", c, a, new o[0]);
    }
}
