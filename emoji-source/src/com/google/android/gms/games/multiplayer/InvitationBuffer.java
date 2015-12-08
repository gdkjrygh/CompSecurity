// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationRef, Invitation

public final class InvitationBuffer extends g
{

    public InvitationBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object c(int i, int j)
    {
        return g(i, j);
    }

    protected String eZ()
    {
        return "external_invitation_id";
    }

    protected Invitation g(int i, int j)
    {
        return new InvitationRef(DG, i, j);
    }
}
