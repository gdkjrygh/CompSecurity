// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            o, i, l

public class j
    implements o
{

    private final Set yo = new HashSet();

    j()
    {
        yo.add(Integer.valueOf(302));
        yo.add(Integer.valueOf(404));
        yo.add(Integer.valueOf(502));
    }

    public int eb()
    {
        return 2036;
    }

    public int ec()
    {
        return 8192;
    }

    public int ed()
    {
        return 8192;
    }

    public int ee()
    {
        return 20;
    }

    public long ef()
    {
        return 3600L;
    }

    public String eg()
    {
        return "/collect";
    }

    public String eh()
    {
        return "/batch";
    }

    public i ei()
    {
        return i.yx;
    }

    public l ej()
    {
        return l.yJ;
    }

    public Set ek()
    {
        return yo;
    }
}
