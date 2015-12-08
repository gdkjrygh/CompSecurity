// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import com.a.a.a;

public final class g
{

    private a a;
    private int b;
    private int c;
    private String d;

    public g(String s)
    {
        a = null;
        b = 480;
        c = 480;
        d = null;
        d = s;
        b = 640;
        c = 640;
        d = s;
    }

    public final int a()
    {
        int i;
        if (d == null)
        {
            i = 9;
        } else
        {
            if (a != null)
            {
                return 1;
            }
            a = new a();
            int j = a.a();
            i = j;
            if (j == 0)
            {
                int k = a.a(b, c);
                i = k;
                if (k == 0)
                {
                    int l = a.a(d);
                    i = l;
                    if (l != 0)
                    {
                        return l;
                    }
                }
            }
        }
        return i;
    }

    public final int a(byte abyte0[])
    {
        if (a == null)
        {
            return 9;
        } else
        {
            return a.a(abyte0, b, c);
        }
    }

    public final a b()
    {
        return a;
    }

    public final void c()
    {
        if (a != null)
        {
            a.b(true);
            a = null;
        }
    }
}
