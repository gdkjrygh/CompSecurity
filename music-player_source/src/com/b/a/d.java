// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import b.a.b;
import b.a.j;

// Referenced classes of package com.b.a:
//            i

public final class d extends i
{

    private j a;
    private b b;

    public d(b b1, j j1)
    {
        b = b1;
        a = j1;
    }

    public final boolean a()
    {
        return a.b();
    }

    public final boolean a(boolean flag)
    {
        long l = System.currentTimeMillis();
        long l1 = a.a();
        return l - b.c >= l1;
    }
}
