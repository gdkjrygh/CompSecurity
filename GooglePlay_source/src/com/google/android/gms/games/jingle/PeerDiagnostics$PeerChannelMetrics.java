// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


// Referenced classes of package com.google.android.gms.games.jingle:
//            PeerDiagnostics

public static class 
{

    private final int mConnectionEstablishmentLatencyMs = 0;
    private final int mConnectionStartTimestampMs = 0;
    private final mRoundTripLatencyMs mNumBytesReceived = new t>();
    private final t> mNumBytesSent = new t>();
    private final int mNumMessagesLost = 0;
    private final int mNumMessagesReceived = 0;
    private final int mNumMessagesSent = 0;
    private final t> mRoundTripLatencyMs = new t>();

    public int getConnectionEstablishmentLatencyMs()
    {
        return mConnectionEstablishmentLatencyMs;
    }

    public int getConnectionStartTimestampMs()
    {
        return mConnectionStartTimestampMs;
    }

    public mConnectionStartTimestampMs getNumBytesReceived()
    {
        return mNumBytesReceived;
    }

    public mNumBytesReceived getNumBytesSent()
    {
        return mNumBytesSent;
    }

    public int getNumMessagesLost()
    {
        return mNumMessagesLost;
    }

    public int getNumMessagesReceived()
    {
        return mNumMessagesReceived;
    }

    public int getNumMessagesSent()
    {
        return mNumMessagesSent;
    }

    public mNumMessagesSent getRoundTripLatencyMs()
    {
        return mRoundTripLatencyMs;
    }

    public ()
    {
    }
}
