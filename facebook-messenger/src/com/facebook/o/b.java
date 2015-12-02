// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.o;

import com.b.a.c;
import com.facebook.common.e.h;

public class b
    implements c
{

    private final h a;

    public b(h h1)
    {
        a = h1;
    }

    public void report(String s)
    {
        if (s == null)
        {
            return;
        }
        String s1 = s.split("\n")[0];
        String as[] = s1.split(": ");
        if (as.length > 1)
        {
            s1 = as[1];
        }
        a.a(s1, s1, s);
    }
}
