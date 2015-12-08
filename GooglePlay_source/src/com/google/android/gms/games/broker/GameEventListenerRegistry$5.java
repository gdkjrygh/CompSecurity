// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.IGamesClient;
import com.google.android.gms.games.internal.PopupLocationInfoParcelable;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameEventListenerRegistry

final class meEventDeliverable extends meEventDeliverable
{

    final GameEventListenerRegistry this$0;
    final com.google.android.gms.games.internal.fo val$holderObject[];

    protected final void deliver(IInterface iinterface)
        throws RemoteException
    {
        Preconditions.checkState(iinterface instanceof IGamesClient, "The AIDL interface was not IGamesClient");
        iinterface = ((IGamesClient)iinterface).getPopupLocationInfo();
        com.google.android.gms.games.internal.fo afo[] = val$holderObject;
        if (iinterface == null)
        {
            iinterface = null;
        } else
        {
            iinterface = new com.google.android.gms.games.internal.fo(((PopupLocationInfoParcelable) (iinterface)).mInfoBundle, ((PopupLocationInfoParcelable) (iinterface)).mWindowToken);
        }
        afo[0] = iinterface;
    }

    Info(com.google.android.gms.games.internal.fo afo[])
    {
        this$0 = final_gameeventlistenerregistry;
        val$holderObject = afo;
        super(String.this, null, null, false);
    }
}
