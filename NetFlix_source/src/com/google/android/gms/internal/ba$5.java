// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ba, dz, dw, 
//            cc

static final class 
    implements bb
{

    public void b(dz dz1, Map map)
    {
        dz1 = dz1.bH();
        if (dz1 == null)
        {
            dw.z("A GMSG tried to use a custom close button on something that wasn't an overlay.");
            return;
        } else
        {
            dz1.i("1".equals(map.get("custom_close")));
            return;
        }
    }

    ()
    {
    }
}
