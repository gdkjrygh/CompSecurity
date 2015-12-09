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
    public static final class LatencyEvent extends MessageNano
    {

        private static volatile LatencyEvent _emptyArray[];
        public long deltaMs;
        public int eventType;

        public static LatencyEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new LatencyEvent[0];
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
            if (eventType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, eventType);
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
                if (!(obj instanceof LatencyEvent))
                {
                    return false;
                }
                obj = (LatencyEvent)obj;
                if (eventType != ((LatencyEvent) (obj)).eventType)
                {
                    return false;
                }
                if (deltaMs != ((LatencyEvent) (obj)).deltaMs)
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
        //                       16: 119;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
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
            if (eventType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, eventType);
            }
            if (deltaMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, deltaMs);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LatencyEvent()
        {
            eventType = 0;
            deltaMs = 0L;
            cachedSize = -1;
        }
    }


    public LatencyEvent events[];
    public int latencyId;
    public long startTimestampMs;

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (latencyId != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(1, latencyId);
        }
        i = j;
        if (startTimestampMs != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(2, startTimestampMs);
        }
        int l = i;
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
                    LatencyEvent latencyevent = events[k];
                    l = i;
                    if (latencyevent != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, latencyevent);
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
            if (latencyId != ((latencyId) (obj)).latencyId)
            {
                return false;
            }
            if (startTimestampMs != ((startTimestampMs) (obj)).startTimestampMs)
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
        return (((getClass().getName().hashCode() + 527) * 31 + latencyId) * 31 + (int)(startTimestampMs ^ startTimestampMs >>> 32)) * 31 + InternalNano.hashCode(events);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   8: 58
    //                   16: 279
    //                   26: 290;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 200: 
        case 201: 
        case 400: 
            latencyId = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        startTimestampMs = codedinputbytebuffernano.readRawVarint64();
        continue; /* Loop/switch isn't completed */
_L5:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        LatencyEvent alatencyevent[];
        int k;
        if (events == null)
        {
            k = 0;
        } else
        {
            k = events.length;
        }
        alatencyevent = new LatencyEvent[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(events, 0, alatencyevent, 0, k);
            l = k;
        }
        for (; l < alatencyevent.length - 1; l++)
        {
            alatencyevent[l] = new LatencyEvent();
            codedinputbytebuffernano.readMessage(alatencyevent[l]);
            codedinputbytebuffernano.readTag();
        }

        alatencyevent[l] = new LatencyEvent();
        codedinputbytebuffernano.readMessage(alatencyevent[l]);
        events = alatencyevent;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (latencyId != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, latencyId);
        }
        if (startTimestampMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, startTimestampMs);
        }
        if (events != null && events.length > 0)
        {
            for (int i = 0; i < events.length; i++)
            {
                LatencyEvent latencyevent = events[i];
                if (latencyevent != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, latencyevent);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public LatencyEvent.cachedSize()
    {
        latencyId = 0;
        startTimestampMs = 0L;
        events = LatencyEvent.emptyArray();
        cachedSize = -1;
    }
}
