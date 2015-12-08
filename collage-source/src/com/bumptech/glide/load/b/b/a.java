// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import android.content.Context;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.a.f;
import com.bumptech.glide.load.b.d;
import com.bumptech.glide.load.b.k;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.b.m;

public class com.bumptech.glide.load.b.b.a
    implements l
{
    public static class a
        implements m
    {

        private final k a = new k(500);

        public l a(Context context, com.bumptech.glide.load.b.c c)
        {
            return new com.bumptech.glide.load.b.b.a(a);
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    private final k a;

    public com.bumptech.glide.load.b.b.a()
    {
        this(null);
    }

    public com.bumptech.glide.load.b.b.a(k k1)
    {
        a = k1;
    }

    public c a(d d1, int i, int j)
    {
        d d2 = d1;
        if (a != null)
        {
            d2 = (d)a.a(d1, 0, 0);
            if (d2 == null)
            {
                a.a(d1, 0, 0, d1);
                d2 = d1;
            }
        }
        return new f(d2);
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((d)obj, i, j);
    }
}
