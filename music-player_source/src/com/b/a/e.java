// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            i

public final class e extends i
{

    private long a;
    private long b;

    public e(int j)
    {
        b = 0L;
        a = j;
        b = System.currentTimeMillis();
    }

    public final boolean a()
    {
        return System.currentTimeMillis() - b < a;
    }

    public final boolean a(boolean flag)
    {
        return System.currentTimeMillis() - b >= a;
    }
}
