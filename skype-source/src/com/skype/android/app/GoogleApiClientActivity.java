// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;

public interface GoogleApiClientActivity
    extends com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c
{

    public abstract void onConnectionFailed(c c, ConnectionResult connectionresult, Bundle bundle);

    public abstract void onConnectionSuspended(c c, int i, Bundle bundle);

    public abstract void onGoogleApiClientCreated(c c, Bundle bundle);

    public abstract void onGoogleApiConnected(c c, Bundle bundle, Bundle bundle1);

    public abstract void onPrepareGoogleApiClient(com.google.android.gms.common.api.c.a a, Bundle bundle);
}
