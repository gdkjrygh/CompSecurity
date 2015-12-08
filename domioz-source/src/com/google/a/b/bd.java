// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


// Referenced classes of package com.google.a.b:
//            ak, ar, bc, am

final class bd extends ak
{

    final ar a;
    final bc b;

    bd(bc bc, ar ar1)
    {
        b = bc;
        a = ar1;
        super();
    }

    final am c()
    {
        return b;
    }

    public final Object get(int i)
    {
        return ((java.util.Map.Entry)a.get(i)).getValue();
    }
}
