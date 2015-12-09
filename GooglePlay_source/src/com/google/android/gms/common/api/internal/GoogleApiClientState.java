// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;

public interface GoogleApiClientState
{

    public abstract void begin();

    public abstract void connect();

    public abstract void disconnect();

    public abstract BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl);

    public abstract BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl);

    public abstract void onConnected(Bundle bundle);

    public abstract void onConnectionFailed(ConnectionResult connectionresult, Api api, int i);

    public abstract void onConnectionSuspended(int i);
}
