// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            ak

private static final class b
{

    private final b a;
    private final int b;

    public final boolean equals(Object obj)
    {
        if (obj instanceof t)
        {
            if (a == ((a) (obj = (a)obj)).a && b == ((b) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode() * 65535 + b;
    }

    t(t t, int i)
    {
        a = t;
        b = i;
    }
}
