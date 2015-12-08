// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.a.b;
import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bg extends am
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
        b b1;
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
        b1 = (b)class1.getField(s).getAnnotation(com/google/a/a/b);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = b1.a();
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
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        } else
        {
            return (Enum)a.get(a1.h());
        }
    }

    public final void a(f f1, Object obj)
    {
        obj = (Enum)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (String)b.get(obj);
        }
        f1.b(((String) (obj)));
    }
}
