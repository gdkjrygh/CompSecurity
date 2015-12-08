// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ah, ek, v, em

public final class u
    implements ah
{

    private final v a;

    public u(v v1)
    {
        a = v1;
    }

    public final void a(em em, Map map)
    {
        em = (String)map.get("name");
        if (em == null)
        {
            ek.d("App event with no name parameter.");
            return;
        } else
        {
            a.a(em, (String)map.get("info"));
            return;
        }
    }
}
