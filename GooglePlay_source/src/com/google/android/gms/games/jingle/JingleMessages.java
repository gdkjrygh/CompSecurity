// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


public final class JingleMessages
{
    public static final class BuzzNotifReceiveData extends JingleMessageBase
    {

        public final String notification;
        public final String recipientData;

        public BuzzNotifReceiveData(String s, String s1)
        {
            super(202);
            notification = s;
            recipientData = s1;
        }
    }

    public static final class BuzzSubscriptionResultData extends JingleMessageBase
    {

        public final boolean result;

        public BuzzSubscriptionResultData(boolean flag)
        {
            super(201);
            result = flag;
        }
    }

    public static final class CallStateChangedOpData extends JingleMessageBase
    {

        public final int error;
        public final String localJid;
        public final int newState;
        public final String remoteJid;
        public final String sessionId;

        public CallStateChangedOpData(String s, String s1, String s2, int i, int j)
        {
            super(2);
            localJid = s;
            remoteJid = s1;
            sessionId = s2;
            newState = i;
            error = j;
        }
    }

    public static final class DirectedPresenceReceipt extends JingleMessageBase
    {

        public final boolean available;
        public final String barePeerJid;

        public DirectedPresenceReceipt(boolean flag, String s)
        {
            super(401);
            available = flag;
            barePeerJid = s;
        }
    }

    public static final class IbbDataReceiveData extends JingleMessageBase
    {

        public final String fromJid;
        public final byte recieveData[];

        public IbbDataReceiveData(String s, byte abyte0[])
        {
            super(101);
            fromJid = s;
            recieveData = abyte0;
        }
    }

    public static final class IbbSendResultData extends JingleMessageBase
    {

        public final String peerJid;
        public final boolean success;
        public final int token;

        public IbbSendResultData(int i, String s, boolean flag)
        {
            super(102);
            token = i;
            peerJid = s;
            success = flag;
        }
    }

    public static abstract class JingleMessageBase
    {

        final int mMessageId;

        protected JingleMessageBase(int i)
        {
            mMessageId = i;
        }
    }

    public static final class P2pDataConnectionResult extends JingleMessageBase
    {

        public final int latencyMs;
        public final String sessionId;
        public final boolean success;

        public P2pDataConnectionResult(String s, boolean flag, int i)
        {
            super(301);
            sessionId = s;
            success = flag;
            latencyMs = i;
        }
    }

    public static final class P2pDataReceive extends JingleMessageBase
    {

        public final byte recieveData[];
        public final String sessionId;

        public P2pDataReceive(String s, byte abyte0[])
        {
            super(302);
            sessionId = s;
            recieveData = abyte0;
        }
    }

    public static final class SigninStateChangedOpData extends JingleMessageBase
    {

        public final int latencyMs;
        public final String localJid;
        public final boolean signedIn;

        public SigninStateChangedOpData(boolean flag, String s, int i)
        {
            super(1);
            signedIn = flag;
            localJid = s;
            latencyMs = i;
        }
    }

}
