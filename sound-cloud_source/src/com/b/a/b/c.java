// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.b.a.b.a.d;
import com.b.a.b.g.a;

public final class c
{
    public static final class a
    {

        int a;
        int b;
        int c;
        public Drawable d;
        public Drawable e;
        public Drawable f;
        public boolean g;
        public boolean h;
        public boolean i;
        int j;
        public android.graphics.BitmapFactory.Options k;
        int l;
        boolean m;
        Object n;
        com.b.a.b.g.a o;
        com.b.a.b.g.a p;
        com.b.a.b.c.a q;
        Handler r;
        boolean s;

        public final a a()
        {
            l = 200;
            return this;
        }

        public final a a(com.b.a.b.c.a a1)
        {
            if (a1 == null)
            {
                throw new IllegalArgumentException("displayer can't be null");
            } else
            {
                q = a1;
                return this;
            }
        }

        public final c b()
        {
            return new c(this, (byte)0);
        }

        public a()
        {
            a = 0;
            b = 0;
            c = 0;
            d = null;
            e = null;
            f = null;
            g = false;
            h = false;
            i = false;
            j = d.b;
            k = new android.graphics.BitmapFactory.Options();
            l = 0;
            m = false;
            n = null;
            o = null;
            p = null;
            q = new com.b.a.b.c.c();
            r = null;
            s = false;
            k.inPurgeable = true;
            k.inInputShareable = true;
        }
    }


    final int a;
    final int b;
    final int c;
    final Drawable d;
    final Drawable e;
    final Drawable f;
    final boolean g;
    final boolean h;
    final boolean i;
    public final int j;
    public final android.graphics.BitmapFactory.Options k;
    final int l;
    public final boolean m;
    public final Object n;
    final com.b.a.b.g.a o;
    final com.b.a.b.g.a p;
    final com.b.a.b.c.a q;
    final Handler r;
    final boolean s;

    private c(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
        e = a1.e;
        f = a1.f;
        g = a1.g;
        h = a1.h;
        i = a1.i;
        j = a1.j;
        k = a1.k;
        l = a1.l;
        m = a1.m;
        n = a1.n;
        o = a1.o;
        p = a1.p;
        q = a1.q;
        r = a1.r;
        s = a1.s;
    }

    c(a a1, byte byte0)
    {
        this(a1);
    }

    public final boolean a()
    {
        return p != null;
    }
}
