// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, bg, ey

public class bf
    implements bd
{

    private final bg na;

    public bf(bg bg1)
    {
        na = bg1;
    }

    public void b(ey ey, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        na.b(flag);
    }
}
