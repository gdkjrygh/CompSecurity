// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions.shared;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface NanoPurchaseRecordStatus
{
    public static final class DeclineDetails extends ExtendableMessageNano
    {

        public Integer reason;

        private DeclineDetails clear()
        {
            reason = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeclineDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
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
            case 57: // '9'
            case 58: // ':'
            case 59: // ';'
            case 60: // '<'
                reason = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (reason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, reason.intValue());
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
            if (reason != null)
            {
                codedoutputbytebuffernano.writeInt32(1, reason.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeclineDetails()
        {
            clear();
        }
    }

    public static final class PurchaseRecordStatus extends ExtendableMessageNano
    {

        public DeclineDetails declineDetails;
        public int pendingReason[];
        public Integer status;

        private PurchaseRecordStatus clear()
        {
            status = null;
            declineDetails = null;
            pendingReason = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PurchaseRecordStatus mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 60
        //                       0: 70
        //                       8: 72
        //                       18: 171
        //                       24: 200
        //                       26: 388;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            i = codedinputbytebuffernano.readInt32();
            switch (i)
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
                status = Integer.valueOf(i);
                break;
            }
              goto _L8
_L4:
            if (declineDetails == null)
            {
                declineDetails = new DeclineDetails();
            }
            codedinputbytebuffernano.readMessage(declineDetails);
              goto _L8
_L5:
            int ai[];
            int j;
            int i1;
            i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
            ai = new int[i1];
            j = 0;
            i = 0;
_L15:
            if (j >= i1) goto _L10; else goto _L9
_L9:
            int j1;
            if (j != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j1 = codedinputbytebuffernano.readInt32();
            j1;
            JVM INSTR tableswitch 1 3: default 272
        //                       1 281
        //                       2 281
        //                       3 281;
               goto _L11 _L12 _L12 _L12
_L11:
            j++;
              goto _L13
_L12:
            int k = i + 1;
            ai[i] = j1;
            i = k;
            if (true) goto _L11; else goto _L10
_L10:
            if (i != 0)
            {
                if (pendingReason == null)
                {
                    j = 0;
                } else
                {
                    j = pendingReason.length;
                }
                if (j == 0 && i == i1)
                {
                    pendingReason = ai;
                } else
                {
                    int ai1[] = new int[j + i];
                    if (j != 0)
                    {
                        System.arraycopy(pendingReason, 0, ai1, 0, j);
                    }
                    System.arraycopy(ai, 0, ai1, j, i);
                    pendingReason = ai1;
                }
            }
              goto _L8
_L13:
            if (true) goto _L15; else goto _L14
_L14:
_L6:
            int l;
            l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            j = 0;
            i = codedinputbytebuffernano.getPosition();
_L24:
            if (codedinputbytebuffernano.getBytesUntilLimit() <= 0) goto _L17; else goto _L16
_L16:
            switch (codedinputbytebuffernano.readInt32())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                j++;
                break;
            }
              goto _L18
_L17:
            if (j == 0) goto _L20; else goto _L19
_L19:
            codedinputbytebuffernano.rewindToPosition(i);
            if (pendingReason == null)
            {
                i = 0;
            } else
            {
                i = pendingReason.length;
            }
            ai = new int[i + j];
            j = i;
            if (i != 0)
            {
                System.arraycopy(pendingReason, 0, ai, 0, i);
                j = i;
            }
_L22:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readInt32();
                switch (i)
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    ai[j] = i;
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            pendingReason = ai;
_L20:
            codedinputbytebuffernano.popLimit(l);
            continue; /* Loop/switch isn't completed */
            if (true) goto _L22; else goto _L21
_L21:
_L18:
            if (true) goto _L24; else goto _L23
_L23:
_L8:
            if (true) goto _L7; else goto _L25
_L25:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (status != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
            }
            i = j;
            if (declineDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, declineDetails);
            }
            j = i;
            if (pendingReason != null)
            {
                j = i;
                if (pendingReason.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < pendingReason.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(pendingReason[j]);
                    }

                    j = i + k + pendingReason.length * 1;
                }
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
            if (declineDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(2, declineDetails);
            }
            if (pendingReason != null && pendingReason.length > 0)
            {
                for (int i = 0; i < pendingReason.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(3, pendingReason[i]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PurchaseRecordStatus()
        {
            clear();
        }
    }

}
