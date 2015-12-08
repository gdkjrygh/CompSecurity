// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.app.Activity;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.gj;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, MaskedWalletRequest, NotifyTransactionStatusRequest

public class WalletClient
    implements GooglePlayServicesClient
{

    private final gj uq;

    public WalletClient(Activity activity, int i, String s, int j, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        uq = new gj(activity, connectioncallbacks, onconnectionfailedlistener, i, s, j);
    }

    public WalletClient(Activity activity, int i, String s, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        this(activity, i, s, 0, connectioncallbacks, onconnectionfailedlistener);
    }

    public void changeMaskedWallet(String s, String s1, int i)
    {
        uq.changeMaskedWallet(s, s1, i);
    }

    public void checkForPreAuthorization(int i)
    {
        uq.checkForPreAuthorization(i);
    }

    public void connect()
    {
        uq.connect();
    }

    public void disconnect()
    {
        uq.disconnect();
    }

    public boolean isConnected()
    {
        return uq.isConnected();
    }

    public boolean isConnecting()
    {
        return uq.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return uq.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return uq.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void loadFullWallet(FullWalletRequest fullwalletrequest, int i)
    {
        uq.loadFullWallet(fullwalletrequest, i);
    }

    public void loadMaskedWallet(MaskedWalletRequest maskedwalletrequest, int i)
    {
        uq.loadMaskedWallet(maskedwalletrequest, i);
    }

    public void notifyTransactionStatus(NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        uq.notifyTransactionStatus(notifytransactionstatusrequest);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        uq.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        uq.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        uq.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        uq.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
