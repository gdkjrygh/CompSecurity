// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.Context;
import b.a.a.a.a.b.j;
import b.a.a.a.a.g.o;

final class Q
{

    final o a;
    private final Context b;

    public Q(Context context, o o)
    {
        b = context;
        a = o;
    }

    final String a(String s, String s1)
    {
        s = j.b(b, s);
        boolean flag;
        if (s == null || s.length() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return s1;
        } else
        {
            return s;
        }
    }
}
