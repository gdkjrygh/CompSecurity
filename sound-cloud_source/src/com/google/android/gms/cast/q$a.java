// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;


// Referenced classes of package com.google.android.gms.cast:
//            q

public static final class nit>
{

    public final q a;

    public final nit> a(int i)
        throws IllegalArgumentException
    {
        q q1 = a;
        if (i < 0 || i > 5)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid subtype ")).append(i).toString());
        }
        if (i != 0 && q1.b != 1)
        {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        } else
        {
            q1.f = i;
            return this;
        }
    }

    public final on a(String s)
    {
        a.c = s;
        return this;
    }

    public final a b(String s)
    {
        a.d = s;
        return this;
    }

    public on(long l, int i)
        throws IllegalArgumentException
    {
        a = new q(l, i);
    }
}
