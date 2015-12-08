// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class dum
{

    public final dui a;
    public final long b;
    public final long c;
    public final String d;
    public final int e;
    public final dul f;
    public final Bundle g;
    private final Object h;

    dum(dun dun1)
    {
        d = dun1.f;
        e = dun1.g;
        a = (dui)p.a(dun1.a);
        p.a(dun1.b);
        b = dun1.c;
        h = dun1.d;
        c = dun1.e;
        f = dun1.h;
        g = dun1.i;
    }

    public final Object a(Class class1)
    {
        if (h == null)
        {
            return null;
        }
        if (class1.isInstance(h))
        {
            return class1.cast(h);
        } else
        {
            class1 = String.valueOf(class1);
            String s = String.valueOf(h.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(class1).length() + 44 + String.valueOf(s).length())).append("Expected payload of type ").append(class1).append(" but it is of type ").append(s).toString());
        }
    }
}
