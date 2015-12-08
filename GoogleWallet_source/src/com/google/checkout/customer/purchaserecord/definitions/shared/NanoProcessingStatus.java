// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions.shared;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoProcessingStatus
{
    public static final class ProcessingStatus extends ExtendableMessageNano
    {

        public Integer declineCode;
        public Integer declineReason;
        public Long processingTime;
        public Integer status;

        private ProcessingStatus clear()
        {
            status = null;
            processingTime = null;
            declineReason = null;
            declineCode = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProcessingStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       8: 67
        //                       16: 134
        //                       24: 148
        //                       32: 318;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
            case 8: // '\b'
                status = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            processingTime = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
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
                declineReason = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            declineCode = Integer.valueOf(codedinputbytebuffernano.readInt32());
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
            }
            j = i;
            if (processingTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, processingTime.longValue());
            }
            i = j;
            if (declineReason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, declineReason.intValue());
            }
            j = i;
            if (declineCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, declineCode.intValue());
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
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(1, status.intValue());
            }
            if (processingTime != null)
            {
                codedoutputbytebuffernano.writeInt64(2, processingTime.longValue());
            }
            if (declineReason != null)
            {
                codedoutputbytebuffernano.writeInt32(3, declineReason.intValue());
            }
            if (declineCode != null)
            {
                codedoutputbytebuffernano.writeInt32(4, declineCode.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProcessingStatus()
        {
            clear();
        }
    }

}
