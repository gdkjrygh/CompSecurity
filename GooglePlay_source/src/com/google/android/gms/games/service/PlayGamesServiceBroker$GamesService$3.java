// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.GameEventListenerRegistry;
import com.google.android.gms.games.internal.AbstractGamesCallbacks;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.ui.popup.InvitationPopup;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesServiceBroker

final class this._cls0 extends AbstractGamesCallbacks
{

    final tDefaultGamesContext this$0;

    public final void onInvitationReceived(DataHolder dataholder)
    {
        Object obj;
        obj = GameEventListenerRegistry.getInstance();
        dataholder = new InvitationBuffer(dataholder);
        obj = ((GameEventListenerRegistry) (obj)).getPopupLocationInfo(lientContext.getResolvedAccountName(), xternalGameId);
        if (dataholder.getCount() > 0)
        {
            InvitationPopup.show(tDefaultGamesContext(false), ((com.google.android.gms.games.internal.DefaultGamesContext) (obj)), (Invitation)((Invitation)dataholder.get(0)).freeze());
        }
        dataholder.release();
        return;
        Exception exception;
        exception;
        dataholder.release();
        throw exception;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
