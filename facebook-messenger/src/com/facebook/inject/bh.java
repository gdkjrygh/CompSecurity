// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.inject.a;

// Referenced classes of package com.facebook.inject:
//            au, be, ThreadLocalScoped

public class bh
    implements au
{

    private static bh a = new bh();

    private bh()
    {
    }

    public static bh get()
    {
        return a;
    }

    public javax.inject.a a(a a1, javax.inject.a a2)
    {
        return new be(a2);
    }

    public Class annotationType()
    {
        return com/facebook/inject/ThreadLocalScoped;
    }

}
