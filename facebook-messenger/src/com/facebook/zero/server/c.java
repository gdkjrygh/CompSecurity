// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.server;

import com.facebook.common.s.a;
import com.facebook.zero.a.b;

public class c extends a
{

    public c(String s)
    {
        super(s);
    }

    public static c a(int i)
    {
        switch (i)
        {
        case 8: // '\b'
        default:
            return b.a;

        case 7: // '\007'
            return b.b;

        case 9: // '\t'
            return b.c;

        case 0: // '\0'
            return b.d;

        case 4: // '\004'
            return b.e;

        case 5: // '\005'
            return b.f;

        case 2: // '\002'
            return b.g;

        case 3: // '\003'
            return b.h;

        case 1: // '\001'
            return b.i;

        case 6: // '\006'
            return b.j;
        }
    }

    public c a(String s)
    {
        return new c(s);
    }

    public a b(String s)
    {
        return a(s);
    }
}
