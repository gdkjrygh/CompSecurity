// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            c, Room

public final class a extends f
{

    public a(d d)
    {
        super(d);
    }

    protected Object a(int i, int j)
    {
        return b(i, j);
    }

    protected Room b(int i, int j)
    {
        return new c(jf, i, j);
    }

    protected String getPrimaryDataMarkerColumn()
    {
        return "external_match_id";
    }
}
