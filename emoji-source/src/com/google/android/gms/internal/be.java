// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bc, bf, ex

public class be
    implements bc
{

    private final bf nc;

    public be(bf bf1)
    {
        nc = bf1;
    }

    public void b(ex ex, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        nc.b(flag);
    }
}
