// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;


// Referenced classes of package com.google.android.m4b.maps.bv:
//            ah

public final class r
{

    boolean a;
    int b;
    boolean c;
    ah d;

    public r()
    {
        a();
    }

    public final int a(float f, float f1)
    {
        if (b() && a)
        {
            if (c)
            {
                d.b(10, -1);
            }
            int i = d.a((int)f, (int)f1);
            if (i == b)
            {
                a();
                return i;
            }
        }
        a();
        return -1;
    }

    final void a()
    {
        a = false;
        b = -1;
        c = false;
    }

    final boolean b()
    {
        return d != null;
    }
}
