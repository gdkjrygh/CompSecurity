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
    public static final class PeerStateTransition extends MessageNano
    {

        private static volatile PeerStateTransition _emptyArray[];
        public long deltaMs;
        public int state;

        public static PeerStateTransition[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PeerStateTransition[0];
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
                if (!(obj instanceof PeerStateTransition))
                {
                    return false;
                }
                obj = (PeerStateTransition)obj;
                if (state != ((PeerStateTransition) (obj)).state)
                {
                    return false;
                }
                if (deltaMs != ((PeerStateTransition) (obj)).deltaMs)
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

        public PeerStateTransition()
        {
            state = 1;
            deltaMs = 0L;
            cachedSize = -1;
        }
    }


    private static volatile transitions _emptyArray[];
    public int directPresenceRecieved;
    public int directPresenceSent;
    public String remoteJidHash;
    public PeerStateTransition transitions[];

    public static PeerStateTransition[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
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
            if (!(obj instanceof transitions))
            {
                return false;
            }
            obj = (transitions)obj;
            if (remoteJidHash == null)
            {
                if (((remoteJidHash) (obj)).remoteJidHash != null)
                {
                    return false;
                }
            } else
            if (!remoteJidHash.equals(((remoteJidHash) (obj)).remoteJidHash))
            {
                return false;
            }
            if (directPresenceRecieved != ((directPresenceRecieved) (obj)).directPresenceRecieved)
            {
                return false;
            }
            if (directPresenceSent != ((directPresenceSent) (obj)).directPresenceSent)
            {
                return false;
            }
            if (!InternalNano.equals(transitions, ((transitions) (obj)).transitions))
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

    public PeerStateTransition.cachedSize()
    {
        remoteJidHash = "";
        directPresenceRecieved = 0;
        directPresenceSent = 0;
        transitions = PeerStateTransition.emptyArray();
        cachedSize = -1;
    }
}
