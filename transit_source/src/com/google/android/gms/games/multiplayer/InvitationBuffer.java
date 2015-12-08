// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            b, Invitation

public final class InvitationBuffer extends f
{

    public InvitationBuffer(d d)
    {
        super(d);
    }

    protected Object a(int i, int j)
    {
        return getEntry(i, j);
    }

    protected Invitation getEntry(int i, int j)
    {
        return new b(jf, i, j);
    }

    protected String getPrimaryDataMarkerColumn()
    {
        return "external_invitation_id";
    }
}
