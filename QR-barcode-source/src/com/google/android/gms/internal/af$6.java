// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, af, ad, gs, 
//            gv

class mT
    implements by
{

    final af mT;

    public void a(gv gv, Map map)
    {
        if (!mT.a(map))
        {
            return;
        } else
        {
            gs.S((new StringBuilder()).append("Received request to untrack: ").append(af.b(mT).aC()).toString());
            mT.destroy();
            return;
        }
    }

    (af af1)
    {
        mT = af1;
        super();
    }
}
