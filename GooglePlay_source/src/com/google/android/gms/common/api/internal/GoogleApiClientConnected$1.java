// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnected, GoogleApiClientState

final class HandlerTask extends HandlerTask
{

    final GoogleApiClientConnected this$0;

    public final void runLocked()
    {
        onConnectionSuspended(1);
    }

    HandlerTask(GoogleApiClientState googleapiclientstate)
    {
        this$0 = GoogleApiClientConnected.this;
        super(googleapiclientstate);
    }
}
