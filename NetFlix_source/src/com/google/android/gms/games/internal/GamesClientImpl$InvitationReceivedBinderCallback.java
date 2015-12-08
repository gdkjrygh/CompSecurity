// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class IT extends AbstractGamesCallbacks
{

    final GamesClientImpl IJ;
    private final OnInvitationReceivedListener IT;

    public void l(DataHolder dataholder)
    {
        InvitationBuffer invitationbuffer;
        invitationbuffer = new InvitationBuffer(dataholder);
        dataholder = null;
        if (invitationbuffer.getCount() > 0)
        {
            dataholder = (Invitation)((Invitation)invitationbuffer.get(0)).freeze();
        }
        invitationbuffer.close();
        if (dataholder != null)
        {
            IJ.a(new (IJ, IT, dataholder));
        }
        return;
        dataholder;
        invitationbuffer.close();
        throw dataholder;
    }

    public void onInvitationRemoved(String s)
    {
        IJ.a(new IJ(IJ, IT, s));
    }

    (GamesClientImpl gamesclientimpl, OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        IJ = gamesclientimpl;
        super();
        IT = oninvitationreceivedlistener;
    }
}
