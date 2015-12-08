// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


// Referenced classes of package com.google.a.b:
//            ak, ar, ba, am

final class bb extends ak
{

    final ar a;
    final ba b;

    bb(ba ba, ar ar1)
    {
        b = ba;
        a = ar1;
        super();
    }

    final am c()
    {
        return b;
    }

    public final Object get(int i)
    {
        return ((java.util.Map.Entry)a.get(i)).getKey();
    }
}
