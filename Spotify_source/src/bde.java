// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Arrays;

public final class bde
{

    public final Uri a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;

    public bde(Uri uri)
    {
        this(uri, 0L, -1L, null, 1);
    }

    private bde(Uri uri, long l, long l1, long l2, 
            String s, int i)
    {
        this(uri, l, l1, l2, s, i, (byte)0);
    }

    private bde(Uri uri, long l, long l1, long l2, 
            String s, int i, byte byte0)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.a(flag);
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.a(flag);
        if (l2 > 0L || l2 == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.a(flag);
        a = uri;
        b = l;
        c = l1;
        d = l2;
        e = s;
        f = i;
    }

    public bde(Uri uri, long l, long l1, String s)
    {
        this(uri, l, l, l1, s, 0);
    }

    public bde(Uri uri, long l, long l1, String s, int i)
    {
        this(uri, l, l, l1, s, i);
    }

    public final String toString()
    {
        return (new StringBuilder("DataSpec[")).append(a).append(", ").append(Arrays.toString(null)).append(", ").append(b).append(", ").append(c).append(", ").append(d).append(", ").append(e).append(", ").append(f).append("]").toString();
    }
}
