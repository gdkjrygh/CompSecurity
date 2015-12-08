// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientStateHolder, GoogleApiClientImpl

private final class mClients extends mClients
{

    private final ArrayList mClients;
    final GoogleApiClientConnecting this$0;

    public final void runLocked()
    {
        if (mHolder.mApiClient.mValidatedScopes.isEmpty())
        {
            mHolder.mApiClient.mValidatedScopes = determineValidatedScopes();
        }
        for (Iterator iterator = mClients.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.viceTask.mClients)iterator.next()).mClients(mResolvedAccountAccessor, mHolder.mApiClient.mValidatedScopes)) { }
    }

    public (ArrayList arraylist)
    {
        this$0 = GoogleApiClientConnecting.this;
        super(GoogleApiClientConnecting.this, (byte)0);
        mClients = arraylist;
    }
}
