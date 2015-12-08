// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            ai, aa, ae

public final class ab
    implements ai
{

    private final Set a = new HashSet();

    ab()
    {
        a.add(Integer.valueOf(302));
        a.add(Integer.valueOf(404));
        a.add(Integer.valueOf(502));
    }

    public final String a()
    {
        return "/collect";
    }

    public final String b()
    {
        return "/batch";
    }

    public final aa c()
    {
        return aa.b;
    }

    public final ae d()
    {
        return ae.b;
    }

    public final Set e()
    {
        return a;
    }
}
