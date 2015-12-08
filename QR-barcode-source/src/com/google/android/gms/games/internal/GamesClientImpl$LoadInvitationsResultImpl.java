// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class WW extends a
    implements com.google.android.gms.games.multiplayer.
{

    private final InvitationBuffer WW;

    public InvitationBuffer getInvitations()
    {
        return WW;
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        WW = new InvitationBuffer(dataholder);
    }
}
