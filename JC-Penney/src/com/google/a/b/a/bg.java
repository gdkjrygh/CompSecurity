// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.a.c;
import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.d;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bg extends af
{

    private final Map a;
    private final Map b;

    public bg(Class class1)
    {
        a = new HashMap();
        b = new HashMap();
        String s;
        Enum aenum[];
        Enum enum;
        c c1;
        int i;
        int j;
        try
        {
            aenum = (Enum[])class1.getEnumConstants();
            j = aenum.length;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError();
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        enum = aenum[i];
        s = enum.name();
        c1 = (c)class1.getField(s).getAnnotation(com/google/a/a/c);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = c1.a();
        a.put(s, enum);
        b.put(enum, s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
    }

    public Enum a(a a1)
    {
        if (a1.f() == com.google.a.d.c.i)
        {
            a1.j();
            return null;
        } else
        {
            return (Enum)a.get(a1.h());
        }
    }

    public void a(d d1, Enum enum)
    {
        if (enum == null)
        {
            enum = null;
        } else
        {
            enum = (String)b.get(enum);
        }
        d1.b(enum);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Enum)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
