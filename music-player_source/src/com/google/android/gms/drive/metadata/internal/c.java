// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.internal.il;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.is;
import java.util.HashMap;
import java.util.Map;

public final class c
{

    private static Map a = new HashMap();

    public static b a(String s)
    {
        return (b)a.get(s);
    }

    private static void a(b b1)
    {
        if (a.containsKey(b1.a()))
        {
            throw new IllegalArgumentException((new StringBuilder("Duplicate field name registered: ")).append(b1.a()).toString());
        } else
        {
            a.put(b1.a(), b1);
            return;
        }
    }

    static 
    {
        a(il.a);
        a(il.b);
        a(il.c);
        a(il.d);
        a(il.e);
        a(il.f);
        a(il.g);
        a(il.h);
        a(il.i);
        a(il.j);
        a(il.k);
        a(il.l);
        a(il.m);
        a(il.n);
        a(il.o);
        a(il.p);
        a(il.q);
        a(il.r);
        a(il.s);
        a(il.t);
        a(il.u);
        a(il.v);
        a(il.w);
        a(il.x);
        a(il.y);
        a(ip.c);
        a(ip.a);
        a(ip.b);
        a(ip.d);
        a(ip.e);
        a(is.a);
        a(is.b);
    }
}
