// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            d

public class ar extends d
{

    private final com.google.inject.a a;
    private volatile a b;

    public ar(com.google.inject.a a1)
    {
        a = a1;
    }

    public Object b()
    {
        if (b == null)
        {
            b = b(a);
        }
        return b.b();
    }
}
