// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ac.a;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ap

public static final class c
{

    private final String a[];
    private final int b;
    private final a c;

    public final String a()
    {
        String s;
        String s1;
        if (a.length > 0)
        {
            s = a[0];
        } else
        {
            s = "";
        }
        if (a.length > 1)
        {
            s1 = a[1];
        } else
        {
            s1 = "";
        }
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length())).append(s).append(", ").append(s1).toString();
    }

    public (int i, String as[], a a1)
    {
        b = i;
        a = as;
        c = a1;
    }
}
