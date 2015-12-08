// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoPaymentSchedule
{
    public static final class Schedule extends ExtendableMessageNano
    {

        public Integer dayOfTheMonth;
        public Integer dayOfWeek;
        public Integer scheduleRecurrence;

        private Schedule clear()
        {
            scheduleRecurrence = null;
            dayOfWeek = null;
            dayOfTheMonth = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private Schedule mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       16: 59
        //                       24: 122
        //                       32: 136;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                dayOfWeek = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            dayOfTheMonth = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                scheduleRecurrence = Integer.valueOf(k);
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (dayOfWeek != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(2, dayOfWeek.intValue());
            }
            j = i;
            if (dayOfTheMonth != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, dayOfTheMonth.intValue());
            }
            i = j;
            if (scheduleRecurrence != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, scheduleRecurrence.intValue());
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (dayOfWeek != null)
            {
                codedoutputbytebuffernano.writeInt32(2, dayOfWeek.intValue());
            }
            if (dayOfTheMonth != null)
            {
                codedoutputbytebuffernano.writeInt32(3, dayOfTheMonth.intValue());
            }
            if (scheduleRecurrence != null)
            {
                codedoutputbytebuffernano.writeInt32(4, scheduleRecurrence.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Schedule()
        {
            clear();
        }
    }

    public static final class ScheduleChange extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.MoneyProto amount;
        public String fundingInstrumentSubId;
        public Schedule schedule;

        private ScheduleChange clear()
        {
            schedule = null;
            amount = null;
            fundingInstrumentSubId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ScheduleChange mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    if (schedule == null)
                    {
                        schedule = new Schedule();
                    }
                    codedinputbytebuffernano.readMessage(schedule);
                    break;

                case 26: // '\032'
                    if (amount == null)
                    {
                        amount = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
                    }
                    codedinputbytebuffernano.readMessage(amount);
                    break;

                case 34: // '"'
                    fundingInstrumentSubId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (schedule != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, schedule);
            }
            j = i;
            if (amount != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, amount);
            }
            i = j;
            if (fundingInstrumentSubId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(4, fundingInstrumentSubId);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (schedule != null)
            {
                codedoutputbytebuffernano.writeMessage(2, schedule);
            }
            if (amount != null)
            {
                codedoutputbytebuffernano.writeMessage(3, amount);
            }
            if (fundingInstrumentSubId != null)
            {
                codedoutputbytebuffernano.writeString(4, fundingInstrumentSubId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ScheduleChange()
        {
            clear();
        }
    }

}
