// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class q
{

    private final HashSet a = new HashSet();
    private final HashMap b = new HashMap();
    private final HashSet c = new HashSet();
    private Date d;
    private String e;
    private int f;
    private Location g;
    private boolean h;
    private String i;
    private int j;

    public q()
    {
        f = -1;
        h = false;
        j = -1;
    }

    static Date a(q q1)
    {
        return q1.d;
    }

    static String b(q q1)
    {
        return q1.e;
    }

    static int c(q q1)
    {
        return q1.f;
    }

    static HashSet d(q q1)
    {
        return q1.a;
    }

    static Location e(q q1)
    {
        return q1.g;
    }

    static boolean f(q q1)
    {
        return q1.h;
    }

    static HashMap g(q q1)
    {
        return q1.b;
    }

    static String h(q q1)
    {
        return q1.i;
    }

    static int i(q q1)
    {
        return q1.j;
    }

    static HashSet j(q q1)
    {
        return q1.c;
    }
}
