// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameEventListenerRegistry

final class meEventDeliverable extends meEventDeliverable
{

    final GameEventListenerRegistry this$0;

    protected final void deliver(IInterface iinterface)
        throws RemoteException
    {
        iinterface = getGamesCallbacks(iinterface);
        if (mIsTombstone)
        {
            String s = mEventId;
            ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onTurnBasedMatchRemoved(s);
            return;
        } else
        {
            DataHolder dataholder = mDataHolder;
            iinterface.audit(new DataHolder[] {
                dataholder
            });
            ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onTurnBasedMatchReceived(dataholder);
            return;
        }
    }

    meEventDeliverable(String s, DataHolder dataholder, String s1, boolean flag)
    {
        this$0 = GameEventListenerRegistry.this;
        super(s, dataholder, s1, flag);
    }
}
