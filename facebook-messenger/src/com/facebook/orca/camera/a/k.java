// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;


// Referenced classes of package com.facebook.orca.camera.a:
//            d, c

class k
{

    int a;
    long b;
    c c;
    private int d;
    private final d e;

    public k(d d1, int i)
    {
        d = -1;
        e = d1;
        a = i;
    }

    public boolean a()
    {
        if (d >= e.b() - 1)
        {
            return false;
        } else
        {
            d d1 = e;
            int i = d + 1;
            d = i;
            c = d1.a(i);
            b = c.b();
            return true;
        }
    }
}
