// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            au, ar, ao

final class as extends au
{

    final ar a;

    as(ar ar1, ao ao, CharSequence charsequence)
    {
        a = ar1;
        super(ao, charsequence);
    }

    public final int a(int i)
    {
        i = a.a + i;
        if (i < b.length())
        {
            return i;
        } else
        {
            return -1;
        }
    }

    public final int b(int i)
    {
        return i;
    }
}
