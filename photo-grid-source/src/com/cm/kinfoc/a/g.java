// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc.a;


// Referenced classes of package com.cm.kinfoc.a:
//            a, j

public abstract class g
{

    private static g b = null;
    protected a a;

    public g()
    {
        a = null;
    }

    public static g a()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b;
        }
    }

    public static void a(g g1)
    {
        b = g1;
    }

    public abstract void a(j j);

}
