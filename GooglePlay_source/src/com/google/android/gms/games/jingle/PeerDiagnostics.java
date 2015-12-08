// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


public class PeerDiagnostics
{
    public static class AggregateStats
    {

        private final long mCount = 0L;
        private final long mMax = 0L;
        private final long mMin = 0L;
        private final long mSum = 0L;

        public long getCount()
        {
            return mCount;
        }

        public long getMax()
        {
            return mMax;
        }

        public long getMin()
        {
            return mMin;
        }

        public long getSum()
        {
            return mSum;
        }

        public AggregateStats()
        {
        }
    }

    public static class PeerChannelMetrics
    {

        private final int mConnectionEstablishmentLatencyMs = 0;
        private final int mConnectionStartTimestampMs = 0;
        private final AggregateStats mNumBytesReceived = new AggregateStats();
        private final AggregateStats mNumBytesSent = new AggregateStats();
        private final int mNumMessagesLost = 0;
        private final int mNumMessagesReceived = 0;
        private final int mNumMessagesSent = 0;
        private final AggregateStats mRoundTripLatencyMs = new AggregateStats();

        public int getConnectionEstablishmentLatencyMs()
        {
            return mConnectionEstablishmentLatencyMs;
        }

        public int getConnectionStartTimestampMs()
        {
            return mConnectionStartTimestampMs;
        }

        public AggregateStats getNumBytesReceived()
        {
            return mNumBytesReceived;
        }

        public AggregateStats getNumBytesSent()
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

        public AggregateStats getRoundTripLatencyMs()
        {
            return mRoundTripLatencyMs;
        }

        public PeerChannelMetrics()
        {
        }
    }


    private final PeerChannelMetrics mReliableChannelMetrics = new PeerChannelMetrics();
    private final PeerChannelMetrics mUnreliableChannelMetrics = new PeerChannelMetrics();

    public PeerDiagnostics()
    {
    }

    public PeerChannelMetrics getReliableChannelMetrics()
    {
        return mReliableChannelMetrics;
    }

    public PeerChannelMetrics getUnreliableChannelMetrics()
    {
        return mUnreliableChannelMetrics;
    }
}
