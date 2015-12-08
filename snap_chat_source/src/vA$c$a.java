// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public static final class il.HashSet
{

    public String a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public Set f;

    public final ct a(ct ct)
    {
        if (ct != null)
        {
            a = ct.a;
            b = ct.b;
            c = ct.c;
            d = ct.d;
            e = ct.e;
            f = ct.f;
        }
        return this;
    }

    public final f a()
    {
        if (a == null)
        {
            throw new IllegalArgumentException("Cannot build EditionViewState with null ID.");
        } else
        {
            return new nit>(this, (byte)0);
        }
    }

    public il.Set()
    {
        d = 0;
        e = 0;
        f = new HashSet();
    }
}
