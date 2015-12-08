// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;


// Referenced classes of package com.android.b:
//            n

public class ac extends Exception
{

    public final n a;
    private long b;

    public ac()
    {
        a = null;
    }

    public ac(n n)
    {
        a = n;
    }

    public ac(Throwable throwable)
    {
        super(throwable);
        a = null;
    }

    void a(long l)
    {
        b = l;
    }
}
