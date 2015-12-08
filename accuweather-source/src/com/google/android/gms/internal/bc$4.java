// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, bc, ey, ev, 
//            cg

static final class 
    implements bd
{

    public void b(ey ey1, Map map)
    {
        ey1 = ey1.bV();
        if (ey1 == null)
        {
            ev.D("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            ey1.close();
            return;
        }
    }

    ()
    {
    }
}
