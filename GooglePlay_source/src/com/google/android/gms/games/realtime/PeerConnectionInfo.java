// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime;


public final class PeerConnectionInfo
{

    public final Integer mConnectionSetupLatencyMs;
    public final String mError;
    public final String mPeerJid;
    public final Integer mUnreliableRoundTripLatencyMs = null;

    public PeerConnectionInfo(String s, Integer integer, String s1)
    {
        mPeerJid = s;
        mConnectionSetupLatencyMs = integer;
        mError = s1;
    }
}
