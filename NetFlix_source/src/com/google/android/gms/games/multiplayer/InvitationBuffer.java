// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationRef, Invitation

public final class InvitationBuffer extends d
{

    public InvitationBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object c(int i, int j)
    {
        return getEntry(i, j);
    }

    protected Invitation getEntry(int i, int j)
    {
        return new InvitationRef(BB, i, j);
    }

    protected String getPrimaryDataMarkerColumn()
    {
        return "external_invitation_id";
    }
}
