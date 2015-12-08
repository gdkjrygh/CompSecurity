// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;

// Referenced classes of package com.skype.android.app:
//            GoogleApiClientActivity

public abstract class AppCompatGoogleApiActivity extends AppCompatActivity
    implements GoogleApiClientActivity
{

    private c googleApiClient;
    private Bundle savedInstanceState;

    public AppCompatGoogleApiActivity()
    {
    }

    public void onConnected(Bundle bundle)
    {
        onGoogleApiConnected(googleApiClient, bundle, savedInstanceState);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        onConnectionFailed(googleApiClient, connectionresult, savedInstanceState);
    }

    public void onConnectionSuspended(int i)
    {
        onConnectionSuspended(googleApiClient, i, savedInstanceState);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        savedInstanceState = bundle;
        com.google.android.gms.common.api.c.a a = new com.google.android.gms.common.api.c.a(this);
        a.a(this).a(this);
        onPrepareGoogleApiClient(a, bundle);
        googleApiClient = a.b();
        onGoogleApiClientCreated(googleApiClient, bundle);
    }

    protected void onStart()
    {
        super.onStart();
        googleApiClient.b();
    }

    protected void onStop()
    {
        googleApiClient.c();
        super.onStop();
    }
}
