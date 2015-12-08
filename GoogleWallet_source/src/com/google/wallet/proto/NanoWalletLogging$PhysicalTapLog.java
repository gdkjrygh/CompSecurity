// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{
    public static final class PhysicalTapLogEvent extends ExtendableMessageNano
    {

        private static volatile PhysicalTapLogEvent _emptyArray[];
        public Long clientEventTimeMillis;
        public Integer type;

        private PhysicalTapLogEvent clear()
        {
            clientEventTimeMillis = null;
            type = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static PhysicalTapLogEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PhysicalTapLogEvent[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private PhysicalTapLogEvent mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       16: 65;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            clientEventTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
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
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 38: // '&'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
                type = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (clientEventTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientEventTimeMillis.longValue());
            }
            j = i;
            if (type != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, type.intValue());
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (clientEventTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, clientEventTimeMillis.longValue());
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(2, type.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PhysicalTapLogEvent()
        {
            clear();
        }
    }


    public Long clientStartTimeMillis;
    public Long durationMillis;
    public PhysicalTapLogEvent events[];

    private PhysicalTapLogEvent clear()
    {
        clientStartTimeMillis = null;
        durationMillis = null;
        events = PhysicalTapLogEvent.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                clientStartTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 16: // '\020'
                durationMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                PhysicalTapLogEvent aphysicaltaplogevent[];
                int j;
                if (events == null)
                {
                    j = 0;
                } else
                {
                    j = events.length;
                }
                aphysicaltaplogevent = new PhysicalTapLogEvent[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(events, 0, aphysicaltaplogevent, 0, j);
                    k = j;
                }
                for (; k < aphysicaltaplogevent.length - 1; k++)
                {
                    aphysicaltaplogevent[k] = new PhysicalTapLogEvent();
                    codedinputbytebuffernano.readMessage(aphysicaltaplogevent[k]);
                    codedinputbytebuffernano.readTag();
                }

                aphysicaltaplogevent[k] = new PhysicalTapLogEvent();
                codedinputbytebuffernano.readMessage(aphysicaltaplogevent[k]);
                events = aphysicaltaplogevent;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (clientStartTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(1, clientStartTimeMillis.longValue());
        }
        i = j;
        if (durationMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(2, durationMillis.longValue());
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
                    PhysicalTapLogEvent physicaltaplogevent = events[k];
                    l = i;
                    if (physicaltaplogevent != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, physicaltaplogevent);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (clientStartTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(1, clientStartTimeMillis.longValue());
        }
        if (durationMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, durationMillis.longValue());
        }
        if (events != null && events.length > 0)
        {
            for (int i = 0; i < events.length; i++)
            {
                PhysicalTapLogEvent physicaltaplogevent = events[i];
                if (physicaltaplogevent != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, physicaltaplogevent);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public PhysicalTapLogEvent.clear()
    {
        clear();
    }
}
