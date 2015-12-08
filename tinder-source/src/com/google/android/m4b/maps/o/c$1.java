// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.o:
//            c

final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (c)obj;
        obj1 = (c)obj1;
        int j = Integer.valueOf(((c) (obj1)).c).compareTo(Integer.valueOf(((c) (obj)).c));
        int i = j;
        if (j == 0)
        {
            i = Integer.valueOf(((c) (obj)).a()).compareTo(Integer.valueOf(((c) (obj1)).a()));
        }
        return i;
    }

    ()
    {
    }
}
