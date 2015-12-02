// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import android.net.Uri;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.UriUtil;

public final class RangedUri
{

    public final long a;
    public final long b;
    private final String c;
    private final String d;
    private int e;

    public RangedUri(String s, String s1, long l, long l1)
    {
        boolean flag;
        if (s != null || s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        c = s;
        d = s1;
        a = l;
        b = l1;
    }

    public final Uri a()
    {
        return UriUtil.a(c, d);
    }

    public final RangedUri a(RangedUri rangeduri)
    {
        long l = -1L;
        if (rangeduri != null && b().equals(rangeduri.b()))
        {
            if (b != -1L && a + b == rangeduri.a)
            {
                String s = c;
                String s2 = d;
                long l1 = a;
                if (rangeduri.b != -1L)
                {
                    l = b + rangeduri.b;
                }
                return new RangedUri(s, s2, l1, l);
            }
            if (rangeduri.b != -1L && rangeduri.a + rangeduri.b == a)
            {
                String s1 = c;
                String s3 = d;
                long l2 = rangeduri.a;
                if (b != -1L)
                {
                    l = rangeduri.b + b;
                }
                return new RangedUri(s1, s3, l2, l);
            }
        }
        return null;
    }

    public final String b()
    {
        return UriUtil.b(c, d);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RangedUri)obj;
            if (a != ((RangedUri) (obj)).a || b != ((RangedUri) (obj)).b || !b().equals(((RangedUri) (obj)).b()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (e == 0)
        {
            e = (((int)a + 527) * 31 + (int)b) * 31 + b().hashCode();
        }
        return e;
    }
}
