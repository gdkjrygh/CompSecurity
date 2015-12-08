// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, Container

class aeT
    implements aeT
{

    final o aeS;
    final boolean aeT;

    public boolean b(Container container)
    {
        if (!aeT) goto _L2; else goto _L1
_L1:
        if (container.getLastRefreshTime() + 0x2932e00L < o.a(aeS).currentTimeMillis()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (container.isDefault())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    ainer(o o1, boolean flag)
    {
        aeS = o1;
        aeT = flag;
        super();
    }
}
