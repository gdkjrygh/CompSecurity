// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;


// Referenced classes of package com.c.a.b:
//            i, m, r, k

final class s extends i
{

    final m a;
    final r b;

    s(r r, m m1)
    {
        b = r;
        a = m1;
        super();
    }

    final k d()
    {
        return b;
    }

    public final Object get(int j)
    {
        return ((java.util.Map.Entry)a.get(j)).getKey();
    }
}
