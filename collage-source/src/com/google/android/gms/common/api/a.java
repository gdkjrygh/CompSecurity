// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class com.google.android.gms.common.api.a
{
    public static interface a
    {
    }

    public static interface a.a
        extends a
    {
    }

    public static final class a.b
        implements a.c
    {

        private a.b()
        {
        }
    }

    public static interface a.c
        extends a
    {
    }

    public static interface a.d
        extends a.a, a.c
    {
    }

    public static abstract class b
    {

        public int a()
        {
            return 0x7fffffff;
        }

        public abstract c a(Context context, Looper looper, i i, Object obj, c.b b1, c.c c1);

        public List a(Object obj)
        {
            return Collections.emptyList();
        }

        public b()
        {
        }
    }

    public static interface c
    {

        public abstract void disconnect();

        public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

        public abstract boolean isConnected();

        public abstract void zza(c.e e1);

        public abstract void zza(r r);

        public abstract void zza(r r, Set set);

        public abstract boolean zzlm();
    }

    public static final class d
    {

        public d()
        {
        }
    }

    public static interface e
    {

        public abstract IInterface a(IBinder ibinder);

        public abstract String a();

        public abstract void a(int i, IInterface iinterface);

        public abstract String b();
    }

    public static interface f
    {

        public abstract int a();

        public abstract e a(Object obj);
    }

    public static final class g
    {
    }


    private final b a;
    private final f b = null;
    private final d c;
    private final g d = null;
    private final String e;

    public com.google.android.gms.common.api.a(String s, b b1, d d1)
    {
        z.a(b1, "Cannot construct an Api with a null ClientBuilder");
        z.a(d1, "Cannot construct an Api with a null ClientKey");
        e = s;
        a = b1;
        c = d1;
    }

    public b a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return a;
    }

    public f b()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public d c()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }

    public boolean d()
    {
        return d != null;
    }

    public String e()
    {
        return e;
    }
}
