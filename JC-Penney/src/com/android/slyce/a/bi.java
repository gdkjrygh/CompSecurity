// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;


// Referenced classes of package com.android.slyce.a:
//            bl, aj, bj, am

class bi extends bl
{

    bj a;

    public bi(int i, bj bj1)
    {
        super(i);
        if (i <= 0)
        {
            throw new IllegalArgumentException("length should be > 0");
        } else
        {
            a = bj1;
            return;
        }
    }

    public bl a(am am, aj aj1)
    {
        am = new byte[c];
        aj1.a(am);
        a.a(am);
        return null;
    }
}
