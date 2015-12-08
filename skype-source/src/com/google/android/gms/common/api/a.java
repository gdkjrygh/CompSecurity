// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.y;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class com.google.android.gms.common.api.a
{
    public static abstract class a
    {

        public abstract b a(Context context, Looper looper, i i, Object obj, c.b b1, c.c c1);

        public List a()
        {
            return Collections.emptyList();
        }

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract void a(c.e e1);

        public abstract void a(r r);

        public abstract void a(r r, Set set);

        public abstract void a(String s, PrintWriter printwriter);

        public abstract void d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public static final class c
    {

        public c()
        {
        }
    }

    public static interface d
    {

        public abstract String a();

        public abstract String b();

        public abstract IInterface c();
    }

    public static interface e
    {

        public abstract d a();

        public abstract int b();
    }

    public static final class f
    {
    }


    private final a a;
    private final e b = null;
    private final c c;
    private final f d = null;
    private final String e;

    public com.google.android.gms.common.api.a(String s, a a1, c c1)
    {
        y.a(a1, "Cannot construct an Api with a null ClientBuilder");
        y.a(c1, "Cannot construct an Api with a null ClientKey");
        e = s;
        a = a1;
        c = c1;
    }

    public final a a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return a;
    }

    public final e b()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public final c c()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }

    public final boolean d()
    {
        return d != null;
    }

    public final String e()
    {
        return e;
    }
}
