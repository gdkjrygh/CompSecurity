// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.StartCallback;
import java.util.Map;

// Referenced classes of package com.leanplum:
//            Leanplum

final class z extends StartCallback
{

    private final String a;
    private final Map b;
    private final Map c;

    z(String s, Map map, Map map1)
    {
        a = s;
        b = map;
        c = map1;
        super();
    }

    public final void onResponse(boolean flag)
    {
        Leanplum.b(a, b, c);
    }
}
