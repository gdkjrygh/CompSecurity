// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import android.content.Context;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.b.m;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            d

public class b
    implements d
{
    public static class a
        implements m
    {

        public l a(Context context, com.bumptech.glide.load.b.c c)
        {
            return new b();
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    private final String a;

    public b()
    {
        this("");
    }

    public b(String s)
    {
        a = s;
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((byte[])obj, i, j);
    }

    public c a(byte abyte0[], int i, int j)
    {
        return new com.bumptech.glide.load.a.b(abyte0, a);
    }
}
