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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class PartnerCallRecord extends ExtendableMessageNano
    {

        private static volatile PartnerCallRecord _emptyArray[];
        public Long callTimeMillis;
        public NanoWalletPartnerError.Error error;
        public String partnerId;
        public String partnerResponse;
        public String requestName;
        public Boolean success;

        private PartnerCallRecord clear()
        {
            callTimeMillis = null;
            partnerId = null;
            requestName = null;
            partnerResponse = null;
            success = null;
            error = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static PartnerCallRecord[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PartnerCallRecord[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private PartnerCallRecord mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    callTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    partnerId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    requestName = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    partnerResponse = codedinputbytebuffernano.readString();
                    break;

                case 40: // '('
                    success = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 50: // '2'
                    if (error == null)
                    {
                        error = new NanoWalletPartnerError.Error();
                    }
                    codedinputbytebuffernano.readMessage(error);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, callTimeMillis.longValue());
            }
            j = i;
            if (partnerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, partnerId);
            }
            i = j;
            if (requestName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, requestName);
            }
            j = i;
            if (partnerResponse != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, partnerResponse);
            }
            i = j;
            if (success != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, success.booleanValue());
            }
            j = i;
            if (error != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, error);
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
            if (callTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, callTimeMillis.longValue());
            }
            if (partnerId != null)
            {
                codedoutputbytebuffernano.writeString(2, partnerId);
            }
            if (requestName != null)
            {
                codedoutputbytebuffernano.writeString(3, requestName);
            }
            if (partnerResponse != null)
            {
                codedoutputbytebuffernano.writeString(4, partnerResponse);
            }
            if (success != null)
            {
                codedoutputbytebuffernano.writeBool(5, success.booleanValue());
            }
            if (error != null)
            {
                codedoutputbytebuffernano.writeMessage(6, error);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PartnerCallRecord()
        {
            clear();
        }
    }


    public String authToken;
    public Long nextScheduledTimeMillis;
    public PartnerCallRecord partnerCallRecord[];
    public Integer rescheduleErrorCount;
    public String semToken;
    public Integer tsmGetStatusAttempts;
    public String tsmId;

    private PartnerCallRecord clear()
    {
        authToken = null;
        tsmGetStatusAttempts = null;
        rescheduleErrorCount = null;
        partnerCallRecord = PartnerCallRecord.emptyArray();
        nextScheduledTimeMillis = null;
        semToken = null;
        tsmId = null;
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

            case 10: // '\n'
                authToken = codedinputbytebuffernano.readString();
                break;

            case 16: // '\020'
                tsmGetStatusAttempts = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 24: // '\030'
                rescheduleErrorCount = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                PartnerCallRecord apartnercallrecord[];
                int j;
                if (partnerCallRecord == null)
                {
                    j = 0;
                } else
                {
                    j = partnerCallRecord.length;
                }
                apartnercallrecord = new PartnerCallRecord[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(partnerCallRecord, 0, apartnercallrecord, 0, j);
                    k = j;
                }
                for (; k < apartnercallrecord.length - 1; k++)
                {
                    apartnercallrecord[k] = new PartnerCallRecord();
                    codedinputbytebuffernano.readMessage(apartnercallrecord[k]);
                    codedinputbytebuffernano.readTag();
                }

                apartnercallrecord[k] = new PartnerCallRecord();
                codedinputbytebuffernano.readMessage(apartnercallrecord[k]);
                partnerCallRecord = apartnercallrecord;
                break;

            case 40: // '('
                nextScheduledTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 50: // '2'
                semToken = codedinputbytebuffernano.readString();
                break;

            case 58: // ':'
                tsmId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (authToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, authToken);
        }
        j = i;
        if (tsmGetStatusAttempts != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, tsmGetStatusAttempts.intValue());
        }
        i = j;
        if (rescheduleErrorCount != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, rescheduleErrorCount.intValue());
        }
        j = i;
        if (partnerCallRecord != null)
        {
            j = i;
            if (partnerCallRecord.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= partnerCallRecord.length)
                    {
                        break;
                    }
                    PartnerCallRecord partnercallrecord = partnerCallRecord[k];
                    j = i;
                    if (partnercallrecord != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(4, partnercallrecord);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (nextScheduledTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(5, nextScheduledTimeMillis.longValue());
        }
        j = i;
        if (semToken != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, semToken);
        }
        i = j;
        if (tsmId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, tsmId);
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
        if (authToken != null)
        {
            codedoutputbytebuffernano.writeString(1, authToken);
        }
        if (tsmGetStatusAttempts != null)
        {
            codedoutputbytebuffernano.writeInt32(2, tsmGetStatusAttempts.intValue());
        }
        if (rescheduleErrorCount != null)
        {
            codedoutputbytebuffernano.writeInt32(3, rescheduleErrorCount.intValue());
        }
        if (partnerCallRecord != null && partnerCallRecord.length > 0)
        {
            for (int i = 0; i < partnerCallRecord.length; i++)
            {
                PartnerCallRecord partnercallrecord = partnerCallRecord[i];
                if (partnercallrecord != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, partnercallrecord);
                }
            }

        }
        if (nextScheduledTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(5, nextScheduledTimeMillis.longValue());
        }
        if (semToken != null)
        {
            codedoutputbytebuffernano.writeString(6, semToken);
        }
        if (tsmId != null)
        {
            codedoutputbytebuffernano.writeString(7, tsmId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public PartnerCallRecord.clear()
    {
        clear();
    }
}
