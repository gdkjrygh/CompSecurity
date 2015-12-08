// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, cj, hi

public final class ci
    implements cf
{

    private final cj a;

    public ci(cj cj1)
    {
        a = cj1;
    }

    public final void a(hi hi, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        a.b(flag);
    }
}
