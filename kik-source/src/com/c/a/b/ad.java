// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;


// Referenced classes of package com.c.a.b:
//            ao

final class ad extends ao
{

    final ao a;

    ad(ao ao1)
    {
        a = ao1;
        super();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return ((java.util.Map.Entry)a.next()).getValue();
    }
}
