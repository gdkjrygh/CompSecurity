// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            f, j

final class k
    implements f
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void a(Map map)
    {
        map = ((Map) (map.get("event")));
        if (map != null)
        {
            j.a(a, map.toString());
        }
    }
}
