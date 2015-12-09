// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class g extends b
{

    public g()
    {
    }

    public int a(double d)
    {
        return Double.compare(d, 0.0D) < 0 || Double.compare(d, 2D) >= 0 ? 0 : 2;
    }

    public int a(int i)
    {
        return i < 0 || i >= 2 ? 0 : 2;
    }
}
