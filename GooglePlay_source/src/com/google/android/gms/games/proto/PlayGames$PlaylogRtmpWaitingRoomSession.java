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
    public static final class RtmpWaitingRoomEvent extends MessageNano
    {

        private static volatile RtmpWaitingRoomEvent _emptyArray[];
        public long deltaMs;
        public int eventType;

        public static RtmpWaitingRoomEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RtmpWaitingRoomEvent[0];
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
            if (eventType != 1)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, eventType);
            }
            j = i;
            if (deltaMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(4, deltaMs);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof RtmpWaitingRoomEvent))
                {
                    return false;
                }
                obj = (RtmpWaitingRoomEvent)obj;
                if (eventType != ((RtmpWaitingRoomEvent) (obj)).eventType)
                {
                    return false;
                }
                if (deltaMs != ((RtmpWaitingRoomEvent) (obj)).deltaMs)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + eventType) * 31 + (int)(deltaMs ^ deltaMs >>> 32);
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
        //                       32: 87;
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
                eventType = j;
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
            if (eventType != 1)
            {
                codedoutputbytebuffernano.writeInt32(1, eventType);
            }
            if (deltaMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, deltaMs);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RtmpWaitingRoomEvent()
        {
            eventType = 1;
            deltaMs = 0L;
            cachedSize = -1;
        }
    }


    public RtmpWaitingRoomEvent events[];
    public long onStopTimeMs;
    public int resultCode;
    public String roomId;
    public long sessionStartTimeMs;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!roomId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, roomId);
        }
        j = i;
        if (sessionStartTimeMs != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, sessionStartTimeMs);
        }
        int l = j;
        if (resultCode != 0)
        {
            l = j + CodedOutputByteBufferNano.computeInt32Size(3, resultCode);
        }
        i = l;
        if (onStopTimeMs != 0L)
        {
            i = l + CodedOutputByteBufferNano.computeInt64Size(4, onStopTimeMs);
        }
        l = i;
        if (events != null)
        {
            l = i;
            if (events.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= events.length)
                    {
                        break;
                    }
                    RtmpWaitingRoomEvent rtmpwaitingroomevent = events[k];
                    l = i;
                    if (rtmpwaitingroomevent != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(5, rtmpwaitingroomevent);
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
            if (!(obj instanceof events))
            {
                return false;
            }
            obj = (events)obj;
            if (roomId == null)
            {
                if (((roomId) (obj)).roomId != null)
                {
                    return false;
                }
            } else
            if (!roomId.equals(((roomId) (obj)).roomId))
            {
                return false;
            }
            if (sessionStartTimeMs != ((sessionStartTimeMs) (obj)).sessionStartTimeMs)
            {
                return false;
            }
            if (resultCode != ((resultCode) (obj)).resultCode)
            {
                return false;
            }
            if (onStopTimeMs != ((onStopTimeMs) (obj)).onStopTimeMs)
            {
                return false;
            }
            if (!InternalNano.equals(events, ((events) (obj)).events))
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
        if (roomId == null)
        {
            i = 0;
        } else
        {
            i = roomId.hashCode();
        }
        return (((((j + 527) * 31 + i) * 31 + (int)(sessionStartTimeMs ^ sessionStartTimeMs >>> 32)) * 31 + resultCode) * 31 + (int)(onStopTimeMs ^ onStopTimeMs >>> 32)) * 31 + InternalNano.hashCode(events);
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
                roomId = codedinputbytebuffernano.readString();
                break;

            case 16: // '\020'
                sessionStartTimeMs = codedinputbytebuffernano.readRawVarint64();
                break;

            case 24: // '\030'
                resultCode = codedinputbytebuffernano.readRawVarint32();
                break;

            case 32: // ' '
                onStopTimeMs = codedinputbytebuffernano.readRawVarint64();
                break;

            case 42: // '*'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                RtmpWaitingRoomEvent artmpwaitingroomevent[];
                int j;
                if (events == null)
                {
                    j = 0;
                } else
                {
                    j = events.length;
                }
                artmpwaitingroomevent = new RtmpWaitingRoomEvent[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(events, 0, artmpwaitingroomevent, 0, j);
                    k = j;
                }
                for (; k < artmpwaitingroomevent.length - 1; k++)
                {
                    artmpwaitingroomevent[k] = new RtmpWaitingRoomEvent();
                    codedinputbytebuffernano.readMessage(artmpwaitingroomevent[k]);
                    codedinputbytebuffernano.readTag();
                }

                artmpwaitingroomevent[k] = new RtmpWaitingRoomEvent();
                codedinputbytebuffernano.readMessage(artmpwaitingroomevent[k]);
                events = artmpwaitingroomevent;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!roomId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, roomId);
        }
        if (sessionStartTimeMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, sessionStartTimeMs);
        }
        if (resultCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, resultCode);
        }
        if (onStopTimeMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(4, onStopTimeMs);
        }
        if (events != null && events.length > 0)
        {
            for (int i = 0; i < events.length; i++)
            {
                RtmpWaitingRoomEvent rtmpwaitingroomevent = events[i];
                if (rtmpwaitingroomevent != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, rtmpwaitingroomevent);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public RtmpWaitingRoomEvent.cachedSize()
    {
        roomId = "";
        sessionStartTimeMs = 0L;
        resultCode = 0;
        onStopTimeMs = 0L;
        events = RtmpWaitingRoomEvent.emptyArray();
        cachedSize = -1;
    }
}
