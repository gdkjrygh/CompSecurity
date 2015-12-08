// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.u;
import java.io.PrintWriter;
import java.util.Set;

public final class com.google.android.gms.common.api.a
{
    public static abstract class a
    {

        public abstract b a(Context context, Looper looper, g g, Object obj, c.b b1, c.c c1);

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(c.e e1);

        public abstract void a(o o);

        public abstract void a(o o, Set set);

        public abstract void a(String s, PrintWriter printwriter);

        public abstract boolean b();

        public abstract boolean c();

        public abstract IBinder d();
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


    public final e a = null;
    public final f b = null;
    public final String c;
    private final a d;
    private final c e;

    public com.google.android.gms.common.api.a(String s, a a1, c c1)
    {
        u.a(a1, "Cannot construct an Api with a null ClientBuilder");
        u.a(c1, "Cannot construct an Api with a null ClientKey");
        c = s;
        d = a1;
        e = c1;
    }

    public final a a()
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return d;
    }

    public final c b()
    {
        boolean flag;
        if (e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return e;
    }
}
