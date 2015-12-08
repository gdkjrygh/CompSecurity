// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Arrays;

public final class jms
{

    public final Uri a;
    public final byte b[];
    public final long c;
    public final long d;
    private long e;
    private String f;
    private int g;

    private jms(Uri uri, long l, long l1, long l2, 
            String s, int i)
    {
        this(uri, null, l, l1, l2, s, 0);
    }

    public jms(Uri uri, long l, long l1, String s)
    {
        this(uri, l, l, -1L, null, 0);
    }

    private jms(Uri uri, byte abyte0[], long l, long l1, long l2, String s, int i)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (l2 > 0L || l2 == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        a = uri;
        b = null;
        e = l;
        c = l1;
        d = l2;
        f = s;
        g = i;
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(Arrays.toString(b));
        long l = e;
        long l1 = c;
        long l2 = d;
        String s2 = f;
        int i = g;
        return (new StringBuilder(String.valueOf(s).length() + 93 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("DataSpec[").append(s).append(", ").append(s1).append(", ").append(l).append(", ").append(l1).append(", ").append(l2).append(", ").append(s2).append(", ").append(i).append("]").toString();
    }
}
