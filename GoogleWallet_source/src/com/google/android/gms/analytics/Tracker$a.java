// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.g;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker

final class wa
{

    private boolean Cl;
    private int Cm;
    private long Cn;
    private boolean Co;
    final Tracker Cq;
    private e wa;

    public final boolean fk()
    {
        boolean flag = Co;
        Co = false;
        return flag;
    }

    public (Tracker tracker)
    {
        Cq = tracker;
        super();
        Cl = false;
        Cm = 0;
        Cn = -1L;
        Co = false;
        wa = g.jj();
    }
}
