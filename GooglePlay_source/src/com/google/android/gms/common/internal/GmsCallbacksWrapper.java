// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            IGmsCallbacks, GetServicePostProcessor, GetServiceRequest

public final class GmsCallbacksWrapper extends IGmsCallbacks.Stub
{

    private final IGmsCallbacks mCallbacks;
    private final GetServiceRequest mRequest;
    final List postProcessorList = new LinkedList();

    public GmsCallbacksWrapper(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
    {
        mCallbacks = igmscallbacks;
        mRequest = getservicerequest;
    }

    public final IBinder asBinder()
    {
        return mCallbacks.asBinder();
    }

    public final void onAccountValidationComplete(int i, Bundle bundle)
        throws RemoteException
    {
        mCallbacks.onAccountValidationComplete(i, bundle);
    }

    public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        for (Iterator iterator = postProcessorList.iterator(); iterator.hasNext(); ((GetServicePostProcessor)iterator.next()).process$18b81057(mRequest, i)) { }
        mCallbacks.onPostInitComplete(i, ibinder, bundle);
    }
}
