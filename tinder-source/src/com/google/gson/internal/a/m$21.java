// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class c
    implements s
{

    final Class a;
    final Class b;
    final r c;

    public final r a(e e, a a1)
    {
        e = a1.a;
        if (e == a || e == b)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[type=")).append(b.getName()).append("+").append(a.getName()).append(",adapter=").append(c).append("]").toString();
    }

    (Class class1, Class class2, r r)
    {
        a = class1;
        b = class2;
        c = r;
        super();
    }
}
