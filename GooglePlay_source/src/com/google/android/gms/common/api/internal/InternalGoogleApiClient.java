// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public interface InternalGoogleApiClient
{
    public static interface InternalCallbacks
    {

        public abstract void handleOnConnectionFailed(ConnectionResult connectionresult);

        public abstract void handleOnConnectionSuccess(Bundle bundle);

        public abstract void handleOnConnectionSuspended(int i);
    }


    public abstract ConnectionResult blockingConnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl);

    public abstract BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl);

    public abstract boolean isConnected();
}
