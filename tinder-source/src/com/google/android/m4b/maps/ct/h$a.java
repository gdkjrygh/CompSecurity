// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            h

static final class b
{

    private final Object a;
    private final int b;

    public final boolean equals(Object obj)
    {
        if (obj instanceof b)
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
        return System.identityHashCode(a) * 65535 + b;
    }

    (Object obj, int i)
    {
        a = obj;
        b = i;
    }
}
