// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;


// Referenced classes of package com.b.a.c:
//            h, x, bn

public final class s
{

    private float a;
    private x b;
    private bn c;
    private boolean d;

    public s()
    {
        a = -1F;
        d = false;
    }

    public final h a()
    {
        if (a < 0.0F)
        {
            a = 1.0F;
        }
        return new h(a, b, c, d);
    }

    public final s a(boolean flag)
    {
        d = flag;
        return this;
    }
}
