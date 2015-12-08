// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import com.android.volley.a;
import com.android.volley.g;
import com.android.volley.k;
import com.android.volley.m;
import com.bumptech.glide.integration.volley.b;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class e extends k
{

    private final b a;
    private final com.android.volley.k.a b;
    private final Map c;

    public e(String s, b b1, com.android.volley.k.a a1, Map map)
    {
        super(0, s, b1);
        a = b1;
        b = a1;
        c = map;
    }

    protected m a(g g1)
    {
        return m.a(g1.b, com.android.volley.toolbox.e.a(g1));
    }

    protected void a(byte abyte0[])
    {
        a.a(new ByteArrayInputStream(abyte0));
    }

    protected void b(Object obj)
    {
        a((byte[])obj);
    }

    public Map k()
        throws a
    {
        return c;
    }

    public com.android.volley.k.a u()
    {
        return b;
    }
}
