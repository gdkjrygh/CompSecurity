// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.a.c;
import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.d;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bh extends al
{

    private final Map a;
    private final Map b;

    public bh(Class class1)
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
        c1 = (c)class1.getField(s).getAnnotation(com/google/b/a/c);
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

    public final Object a(a a1)
    {
        if (a1.f() == com.google.b.d.c.i)
        {
            a1.j();
            return null;
        } else
        {
            return (Enum)a.get(a1.h());
        }
    }

    public final void a(d d1, Object obj)
    {
        obj = (Enum)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (String)b.get(obj);
        }
        d1.b(((String) (obj)));
    }
}
