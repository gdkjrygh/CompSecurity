// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.content.Context;
import android.os.Looper;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.j.q;
import com.google.android.m4b.maps.j.x;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.h:
//            o

public final class com.google.android.m4b.maps.h.b
{
    public static interface a
    {

        public abstract void a(d.c c1);

        public abstract void a(q q);

        public abstract void a(q q, Set set);

        public abstract void a(String s, PrintWriter printwriter);

        public abstract void d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public static interface b
    {

        public abstract a a(Context context, Looper looper, g g, Object obj, d.b b1, d.d d1);
    }

    public static final class c
    {

        public c()
        {
        }
    }

    public static interface d
    {
    }

    public static final class e
    {
    }


    final ArrayList a;
    final String b;
    private final b c;
    private final d d = null;
    private final c e;
    private final e f = null;

    public transient com.google.android.m4b.maps.h.b(String s, b b1, c c1, o ao[])
    {
        x.a(b1, "Cannot construct an Api with a null ClientBuilder");
        x.a(c1, "Cannot construct an Api with a null ClientKey");
        b = s;
        c = b1;
        e = c1;
        a = new ArrayList(Arrays.asList(ao));
    }

    public final b a()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return c;
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
        x.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return e;
    }
}
