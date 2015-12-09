// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.realtime.PeerConnectionInfo;

public interface DataConnectionCallbacks
{

    public abstract void onDataConnectionFailed(PeerConnectionInfo peerconnectioninfo);

    public abstract void onDataConnectionSucceeded(PeerConnectionInfo peerconnectioninfo);

    public abstract void onNetworkDisconnected();

    public abstract void onNetworkFailedForMatch();

    public abstract void onNetworkReadyForMatch(String s, int i);

    public abstract void onReceiveBuzzNotification(String s, String s1);

    public abstract void onReliableReceiveData(String s, byte abyte0[]);

    public abstract void onReliableSendResult(int i, String s, boolean flag);

    public abstract void onUnreliableReceiveData(String s, byte abyte0[]);
}
