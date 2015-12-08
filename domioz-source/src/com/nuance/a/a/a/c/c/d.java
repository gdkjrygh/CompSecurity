// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.c;

import com.nuance.a.a.a.a.c.a;

public final class d extends a
{

    public static final d a = new d((short)0);
    public static final d b = new d((short)1);
    public static final d c = new d((short)2);
    public static final d d = new d((short)3);
    public static final d e = new d((short)4);
    public static final d f = new d((short)5);
    public static final d g = new d((short)6);
    public static final d h = new d((short)7);
    public static final d i = new d((short)8);
    public static final d j = new d((short)9);

    private d(short word0)
    {
        super(word0);
    }

    public final String toString()
    {
        if (a(b))
        {
            return "nmsp";
        }
        if (a(c))
        {
            return "app";
        }
        if (a(d))
        {
            return "nss";
        }
        if (a(e))
        {
            return "slog";
        }
        if (a(f))
        {
            return "nsslog";
        }
        if (a(g))
        {
            return "gwlog";
        }
        if (a(h))
        {
            return "svsp";
        }
        if (a(i))
        {
            return "sip";
        }
        if (a(j))
        {
            return "sdp";
        }
        if (a(a))
        {
            return "sdk";
        } else
        {
            return null;
        }
    }

}
