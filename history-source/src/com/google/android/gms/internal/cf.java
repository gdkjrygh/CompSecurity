// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, cg, gu

public class cf
    implements cd
{

    private final cg qa;

    public cf(cg cg1)
    {
        qa = cg1;
    }

    public void a(gu gu, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        qa.d(flag);
    }
}
