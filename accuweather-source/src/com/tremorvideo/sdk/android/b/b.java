// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.b;

import java.util.Comparator;

final class b
    implements Comparator
{

    b()
    {
    }

    public int a(String as[], String as1[])
    {
        int j = as[0].compareTo(as1[0]);
        int i = j;
        if (j == 0)
        {
            i = as[1].compareTo(as1[1]);
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((String[])obj, (String[])obj1);
    }
}
