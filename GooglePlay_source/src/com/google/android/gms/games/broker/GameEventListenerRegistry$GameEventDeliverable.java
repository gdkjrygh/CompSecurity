// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameEventListenerRegistry

private static abstract class mIsTombstone
{

    protected final DataHolder mDataHolder;
    protected final String mEventId;
    protected final String mExternalGameId;
    protected final boolean mIsTombstone;

    protected abstract void deliver(IInterface iinterface)
        throws RemoteException;

    protected final WrappedGamesCallbacks getGamesCallbacks(IInterface iinterface)
    {
        Preconditions.checkState(iinterface instanceof IGamesCallbacks, "The AIDL interface was not IGamesCallbacks");
        return new WrappedGamesCallbacks((IGamesCallbacks)iinterface, mExternalGameId);
    }

    public (String s, DataHolder dataholder, String s1, boolean flag)
    {
        mExternalGameId = s;
        mDataHolder = dataholder;
        mEventId = s1;
        mIsTombstone = flag;
    }
}
