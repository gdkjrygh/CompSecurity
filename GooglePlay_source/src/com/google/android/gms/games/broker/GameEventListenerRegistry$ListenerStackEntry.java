// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.os.IInterface;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.internal.IGamesClient;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameEventListenerRegistry

private static final class mListener
{

    final long mClientId;
    final IInterface mListener;

    public (long l, IInterface iinterface)
    {
        boolean flag;
        if ((iinterface instanceof IGamesClient) || (iinterface instanceof IGamesCallbacks))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "The callbacks must be IGamesClient or IGamesCallbacks");
        mClientId = l;
        mListener = iinterface;
    }
}
