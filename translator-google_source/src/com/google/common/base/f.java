// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            e

final class f extends e
{

    final String b;
    final e c;

    f(e e1, e e2, String s)
    {
        c = e1;
        b = s;
        super(e2);
    }

    public final e a(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    final CharSequence a(Object obj)
    {
        if (obj == null)
        {
            return b;
        } else
        {
            return c.a(obj);
        }
    }
}
