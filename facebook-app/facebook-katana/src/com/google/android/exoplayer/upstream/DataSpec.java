// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import com.google.android.exoplayer.util.Assertions;
import java.util.Arrays;

public final class DataSpec
{

    public final Uri a;
    public final byte b[];
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public DataSpec(Uri uri, int i)
    {
        this(uri, 0L, -1L, null, i);
    }

    private DataSpec(Uri uri, long l, long l1, long l2, 
            String s, int i)
    {
        this(uri, null, l, l1, l2, s, i);
    }

    public DataSpec(Uri uri, long l, long l1, String s)
    {
        this(uri, l, l, l1, s, 0);
    }

    public DataSpec(Uri uri, long l, long l1, String s, int i)
    {
        this(uri, l, l, l1, s, i);
    }

    public DataSpec(Uri uri, byte abyte0[], long l, long l1, long l2, String s, int i)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        if (l2 > 0L || l2 == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        a = uri;
        b = abyte0;
        c = l;
        d = l1;
        e = l2;
        f = s;
        g = i;
    }

    public final String toString()
    {
        return (new StringBuilder("DataSpec[")).append(a).append(", ").append(Arrays.toString(b)).append(", ").append(c).append(", ").append(d).append(", ").append(e).append(", ").append(f).append(", ").append(g).append("]").toString();
    }
}
