// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            m, l

final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (l)obj;
        obj1 = (l)obj1;
        int i = Float.compare(((l) (obj)).f(), ((l) (obj1)).f());
        if (i != 0)
        {
            return i;
        } else
        {
            return ((l) (obj)).e().compareTo(((l) (obj1)).e());
        }
    }

    ()
    {
    }
}
