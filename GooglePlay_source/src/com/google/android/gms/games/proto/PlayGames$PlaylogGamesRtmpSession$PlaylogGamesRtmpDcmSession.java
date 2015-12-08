// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{
    public static final class PlaylogGamesRtmpPeerConnectionRetryInfo extends MessageNano
    {

        private static volatile PlaylogGamesRtmpPeerConnectionRetryInfo _emptyArray[];
        public String participantId;
        public int reconnectRetryCount;
        public int reconnectRetrySucessfulCount;

        public static PlaylogGamesRtmpPeerConnectionRetryInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesRtmpPeerConnectionRetryInfo[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!participantId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, participantId);
            }
            j = i;
            if (reconnectRetryCount != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, reconnectRetryCount);
            }
            i = j;
            if (reconnectRetrySucessfulCount != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, reconnectRetrySucessfulCount);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesRtmpPeerConnectionRetryInfo))
                {
                    return false;
                }
                obj = (PlaylogGamesRtmpPeerConnectionRetryInfo)obj;
                if (participantId == null)
                {
                    if (((PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).participantId != null)
                    {
                        return false;
                    }
                } else
                if (!participantId.equals(((PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).participantId))
                {
                    return false;
                }
                if (reconnectRetryCount != ((PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).reconnectRetryCount)
                {
                    return false;
                }
                if (reconnectRetrySucessfulCount != ((PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).reconnectRetrySucessfulCount)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (participantId == null)
            {
                i = 0;
            } else
            {
                i = participantId.hashCode();
            }
            return (((j + 527) * 31 + i) * 31 + reconnectRetryCount) * 31 + reconnectRetrySucessfulCount;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    participantId = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    reconnectRetryCount = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 24: // '\030'
                    reconnectRetrySucessfulCount = codedinputbytebuffernano.readRawVarint32();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!participantId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, participantId);
            }
            if (reconnectRetryCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, reconnectRetryCount);
            }
            if (reconnectRetrySucessfulCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, reconnectRetrySucessfulCount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpPeerConnectionRetryInfo()
        {
            participantId = "";
            reconnectRetryCount = 0;
            reconnectRetrySucessfulCount = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesRtmpPeerSession extends MessageNano
    {

        private static volatile PlaylogGamesRtmpPeerSession _emptyArray[];
        public int directPresenceRecieved;
        public int directPresenceSent;
        public String remoteJidHash;
        public PeerStateTransition transitions[];

        public static PlaylogGamesRtmpPeerSession[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesRtmpPeerSession[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!remoteJidHash.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, remoteJidHash);
            }
            j = i;
            if (directPresenceRecieved != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, directPresenceRecieved);
            }
            i = j;
            if (directPresenceSent != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, directPresenceSent);
            }
            int l = i;
            if (transitions != null)
            {
                l = i;
                if (transitions.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= transitions.length)
                        {
                            break;
                        }
                        PeerStateTransition peerstatetransition = transitions[k];
                        l = i;
                        if (peerstatetransition != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, peerstatetransition);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesRtmpPeerSession))
                {
                    return false;
                }
                obj = (PlaylogGamesRtmpPeerSession)obj;
                if (remoteJidHash == null)
                {
                    if (((PlaylogGamesRtmpPeerSession) (obj)).remoteJidHash != null)
                    {
                        return false;
                    }
                } else
                if (!remoteJidHash.equals(((PlaylogGamesRtmpPeerSession) (obj)).remoteJidHash))
                {
                    return false;
                }
                if (directPresenceRecieved != ((PlaylogGamesRtmpPeerSession) (obj)).directPresenceRecieved)
                {
                    return false;
                }
                if (directPresenceSent != ((PlaylogGamesRtmpPeerSession) (obj)).directPresenceSent)
                {
                    return false;
                }
                if (!InternalNano.equals(transitions, ((PlaylogGamesRtmpPeerSession) (obj)).transitions))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (remoteJidHash == null)
            {
                i = 0;
            } else
            {
                i = remoteJidHash.hashCode();
            }
            return ((((j + 527) * 31 + i) * 31 + directPresenceRecieved) * 31 + directPresenceSent) * 31 + InternalNano.hashCode(transitions);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    remoteJidHash = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    directPresenceRecieved = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 24: // '\030'
                    directPresenceSent = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    PeerStateTransition apeerstatetransition[];
                    int j;
                    if (transitions == null)
                    {
                        j = 0;
                    } else
                    {
                        j = transitions.length;
                    }
                    apeerstatetransition = new PeerStateTransition[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(transitions, 0, apeerstatetransition, 0, j);
                        k = j;
                    }
                    for (; k < apeerstatetransition.length - 1; k++)
                    {
                        apeerstatetransition[k] = new PeerStateTransition();
                        codedinputbytebuffernano.readMessage(apeerstatetransition[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    apeerstatetransition[k] = new PeerStateTransition();
                    codedinputbytebuffernano.readMessage(apeerstatetransition[k]);
                    transitions = apeerstatetransition;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!remoteJidHash.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, remoteJidHash);
            }
            if (directPresenceRecieved != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, directPresenceRecieved);
            }
            if (directPresenceSent != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, directPresenceSent);
            }
            if (transitions != null && transitions.length > 0)
            {
                for (int i = 0; i < transitions.length; i++)
                {
                    PeerStateTransition peerstatetransition = transitions[i];
                    if (peerstatetransition != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, peerstatetransition);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpPeerSession()
        {
            remoteJidHash = "";
            directPresenceRecieved = 0;
            directPresenceSent = 0;
            transitions = PeerStateTransition.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesRtmpPeerSession.PeerStateTransition extends MessageNano
    {

        private static volatile PlaylogGamesRtmpPeerSession.PeerStateTransition _emptyArray[];
        public long deltaMs;
        public int state;

        public static PlaylogGamesRtmpPeerSession.PeerStateTransition[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesRtmpPeerSession.PeerStateTransition[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (state != 1)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, state);
            }
            j = i;
            if (deltaMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, deltaMs);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesRtmpPeerSession.PeerStateTransition))
                {
                    return false;
                }
                obj = (PlaylogGamesRtmpPeerSession.PeerStateTransition)obj;
                if (state != ((PlaylogGamesRtmpPeerSession.PeerStateTransition) (obj)).state)
                {
                    return false;
                }
                if (deltaMs != ((PlaylogGamesRtmpPeerSession.PeerStateTransition) (obj)).deltaMs)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + state) * 31 + (int)(deltaMs ^ deltaMs >>> 32);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       16: 111;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                state = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            deltaMs = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (state != 1)
            {
                codedoutputbytebuffernano.writeInt32(1, state);
            }
            if (deltaMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, deltaMs);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpPeerSession.PeerStateTransition()
        {
            state = 1;
            deltaMs = 0L;
            cachedSize = -1;
        }
    }


    public String myJidHash;
    public PlaylogGamesRtmpPeerSession peers[];
    public PlaylogGamesRtmpPeerConnectionRetryInfo retryInfo[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (!myJidHash.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(1, myJidHash);
        }
        i = j;
        if (peers != null)
        {
            i = j;
            if (peers.length > 0)
            {
                int l = 0;
                do
                {
                    i = j;
                    if (l >= peers.length)
                    {
                        break;
                    }
                    PlaylogGamesRtmpPeerSession playloggamesrtmppeersession = peers[l];
                    i = j;
                    if (playloggamesrtmppeersession != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(2, playloggamesrtmppeersession);
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        int i1 = i;
        if (retryInfo != null)
        {
            i1 = i;
            if (retryInfo.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= retryInfo.length)
                    {
                        break;
                    }
                    PlaylogGamesRtmpPeerConnectionRetryInfo playloggamesrtmppeerconnectionretryinfo = retryInfo[k];
                    i1 = i;
                    if (playloggamesrtmppeerconnectionretryinfo != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, playloggamesrtmppeerconnectionretryinfo);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof retryInfo))
            {
                return false;
            }
            obj = (retryInfo)obj;
            if (myJidHash == null)
            {
                if (((myJidHash) (obj)).myJidHash != null)
                {
                    return false;
                }
            } else
            if (!myJidHash.equals(((myJidHash) (obj)).myJidHash))
            {
                return false;
            }
            if (!InternalNano.equals(peers, ((peers) (obj)).peers))
            {
                return false;
            }
            if (!InternalNano.equals(retryInfo, ((retryInfo) (obj)).retryInfo))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int i;
        if (myJidHash == null)
        {
            i = 0;
        } else
        {
            i = myJidHash.hashCode();
        }
        return (((j + 527) * 31 + i) * 31 + InternalNano.hashCode(peers)) * 31 + InternalNano.hashCode(retryInfo);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                myJidHash = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                PlaylogGamesRtmpPeerSession aplayloggamesrtmppeersession[];
                int j;
                if (peers == null)
                {
                    j = 0;
                } else
                {
                    j = peers.length;
                }
                aplayloggamesrtmppeersession = new PlaylogGamesRtmpPeerSession[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(peers, 0, aplayloggamesrtmppeersession, 0, j);
                    l = j;
                }
                for (; l < aplayloggamesrtmppeersession.length - 1; l++)
                {
                    aplayloggamesrtmppeersession[l] = new PlaylogGamesRtmpPeerSession();
                    codedinputbytebuffernano.readMessage(aplayloggamesrtmppeersession[l]);
                    codedinputbytebuffernano.readTag();
                }

                aplayloggamesrtmppeersession[l] = new PlaylogGamesRtmpPeerSession();
                codedinputbytebuffernano.readMessage(aplayloggamesrtmppeersession[l]);
                peers = aplayloggamesrtmppeersession;
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                PlaylogGamesRtmpPeerConnectionRetryInfo aplayloggamesrtmppeerconnectionretryinfo[];
                int k;
                if (retryInfo == null)
                {
                    k = 0;
                } else
                {
                    k = retryInfo.length;
                }
                aplayloggamesrtmppeerconnectionretryinfo = new PlaylogGamesRtmpPeerConnectionRetryInfo[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(retryInfo, 0, aplayloggamesrtmppeerconnectionretryinfo, 0, k);
                    i1 = k;
                }
                for (; i1 < aplayloggamesrtmppeerconnectionretryinfo.length - 1; i1++)
                {
                    aplayloggamesrtmppeerconnectionretryinfo[i1] = new PlaylogGamesRtmpPeerConnectionRetryInfo();
                    codedinputbytebuffernano.readMessage(aplayloggamesrtmppeerconnectionretryinfo[i1]);
                    codedinputbytebuffernano.readTag();
                }

                aplayloggamesrtmppeerconnectionretryinfo[i1] = new PlaylogGamesRtmpPeerConnectionRetryInfo();
                codedinputbytebuffernano.readMessage(aplayloggamesrtmppeerconnectionretryinfo[i1]);
                retryInfo = aplayloggamesrtmppeerconnectionretryinfo;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!myJidHash.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, myJidHash);
        }
        if (peers != null && peers.length > 0)
        {
            for (int i = 0; i < peers.length; i++)
            {
                PlaylogGamesRtmpPeerSession playloggamesrtmppeersession = peers[i];
                if (playloggamesrtmppeersession != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, playloggamesrtmppeersession);
                }
            }

        }
        if (retryInfo != null && retryInfo.length > 0)
        {
            for (int j = 0; j < retryInfo.length; j++)
            {
                PlaylogGamesRtmpPeerConnectionRetryInfo playloggamesrtmppeerconnectionretryinfo = retryInfo[j];
                if (playloggamesrtmppeerconnectionretryinfo != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, playloggamesrtmppeerconnectionretryinfo);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public PlaylogGamesRtmpPeerSession.cachedSize()
    {
        myJidHash = "";
        peers = PlaylogGamesRtmpPeerSession.emptyArray();
        retryInfo = PlaylogGamesRtmpPeerConnectionRetryInfo.emptyArray();
        cachedSize = -1;
    }
}
