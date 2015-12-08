// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            af

final class bw
{

    private long a;
    private long b;
    private long c;
    private boolean d;

    public bw()
    {
        a = 0L;
        b = -1L;
        c = -1L;
        d = false;
        af.b();
        a = 0L;
        b = -1L;
        c = -1L;
        d = false;
    }

    public final bw a()
    {
        af.b();
        if (!d)
        {
            b = System.currentTimeMillis();
            c = -1L;
            d = true;
        }
        return this;
    }

    public final void b()
    {
        af.b();
        if (d)
        {
            c = System.currentTimeMillis();
            boolean flag;
            if (c >= b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            af.a(flag);
            a = a + (c - b);
            d = false;
        }
    }
}
