// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, cb, gv

public class ca
    implements by
{

    private final cb pJ;

    public ca(cb cb1)
    {
        pJ = cb1;
    }

    public void a(gv gv, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        pJ.b(flag);
    }
}
