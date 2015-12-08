// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            aj

public static final class b
{

    private static final Integer c[] = new Integer[0];
    a a;
    Set b;

    public final aj a()
    {
        if (b.contains(Integer.valueOf(-1)))
        {
            b.clear();
        }
        return new aj(a, (Integer[])b.toArray(c));
    }


    public ()
    {
        b = new HashSet();
    }
}
