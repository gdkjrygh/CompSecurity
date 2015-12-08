// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.bo.ac;
import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            t

public static final class 
    implements Comparator
{

    int a;
    int b;

    public final int compare(Object obj, Object obj1)
    {
        obj = (ac)obj;
        obj1 = (ac)obj1;
        int i = ((ac) (obj)).a;
        int j = ((ac) (obj1)).a;
        if (i != j)
        {
            return j - i;
        } else
        {
            i = 0x20000000 >> i;
            int i1 = ((ac) (obj)).e;
            int j1 = ((ac) (obj)).f;
            int l = ((ac) (obj1)).e;
            int k = ((ac) (obj1)).f;
            i1 = Math.abs((i1 + i) - a);
            j1 = Math.abs((j1 + i) - b);
            l = Math.abs((l + i) - a);
            return (i1 + j1) - (Math.abs((i + k) - b) + l);
        }
    }

    public ()
    {
    }
}
