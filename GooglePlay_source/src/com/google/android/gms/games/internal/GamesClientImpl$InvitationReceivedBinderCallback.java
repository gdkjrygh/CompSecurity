// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class mListener extends AbstractGamesCallbacks
{

    private final ListenerHolder mListener;

    public final void onInvitationReceived(DataHolder dataholder)
    {
        InvitationBuffer invitationbuffer;
        invitationbuffer = new InvitationBuffer(dataholder);
        dataholder = null;
        if (invitationbuffer.getCount() > 0)
        {
            dataholder = (Invitation)((Invitation)invitationbuffer.get(0)).freeze();
        }
        invitationbuffer.release();
        if (dataholder != null)
        {
            mListener.notifyListener(new (dataholder));
        }
        return;
        dataholder;
        invitationbuffer.release();
        throw dataholder;
    }

    public final void onInvitationRemoved(String s)
    {
        mListener.notifyListener(new mListener(s));
    }

    public (ListenerHolder listenerholder)
    {
        mListener = listenerholder;
    }
}
