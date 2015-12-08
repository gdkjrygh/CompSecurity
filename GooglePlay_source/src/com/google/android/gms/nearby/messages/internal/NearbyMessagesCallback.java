// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class NearbyMessagesCallback extends INearbyMessagesCallback.Stub
{

    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mStatusCallback;

    private NearbyMessagesCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
    {
        mStatusCallback = resultholder;
    }

    static NearbyMessagesCallback withStatus(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
    {
        return new NearbyMessagesCallback(resultholder);
    }

    public final void onStatusReceived(Status status)
        throws RemoteException
    {
        mStatusCallback.setResult(status);
    }
}
