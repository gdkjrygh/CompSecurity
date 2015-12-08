// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.p;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            cy

final class ds
    implements j
{

    private final cy a;

    public ds(cy cy1)
    {
        a = cy1;
    }

    public final void a(Object obj)
    {
        if (obj instanceof p)
        {
            a.onEnergyLevel((p)obj);
        }
    }
}
