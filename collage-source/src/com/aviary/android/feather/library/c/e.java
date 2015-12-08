// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.c;

import android.net.Uri;
import java.util.List;

public class e
{

    Uri a;
    List b;
    final int c[] = {
        -1, -1
    };
    final int d[] = {
        -1, -1
    };
    int e;

    public e()
    {
    }

    public List a()
    {
        return b;
    }

    public void a(int i)
    {
        e = i;
    }

    public void a(int i, int j)
    {
        c[0] = i;
        c[1] = j;
    }

    public void a(Uri uri)
    {
        a = uri;
    }

    public void a(List list)
    {
        b = list;
    }

    public void b(int i, int j)
    {
        d[0] = i;
        d[1] = j;
    }

    public int[] b()
    {
        return c;
    }

    public int c()
    {
        return e;
    }

    public String toString()
    {
        int i = 0;
        Uri uri = a;
        int j = e;
        int k = c[0];
        int l = c[1];
        int i1 = d[0];
        int j1 = d[1];
        if (b != null)
        {
            i = b.size();
        }
        return String.format("{uri:%s, orientation:%d, originalSize:%dx%d, decodedSize:%dx%d, tags:%d}", new Object[] {
            uri, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(i)
        });
    }
}
