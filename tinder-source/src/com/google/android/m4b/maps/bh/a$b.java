// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bh;

import android.util.Pair;
import com.google.android.m4b.maps.bo.ac;

// Referenced classes of package com.google.android.m4b.maps.bh:
//            a

static final class c
    implements Comparable
{

    public Pair a;
    public ac b;
    private d c;

    public final int compareTo(Object obj)
    {
        obj = (c)obj;
        return Long.valueOf(c.d).compareTo(Long.valueOf(((d) (obj)).c.d));
    }

    public (Pair pair, ac ac,  )
    {
        a = pair;
        b = ac;
        c = ;
    }
}
