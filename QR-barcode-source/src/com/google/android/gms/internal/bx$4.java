// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, bx, gv, gs, 
//            dk

static final class 
    implements by
{

    public void a(gv gv1, Map map)
    {
        gv1 = gv1.dt();
        if (gv1 == null)
        {
            gs.W("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            gv1.close();
            return;
        }
    }

    ()
    {
    }
}
