// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class FundingSourceType extends ExtendableMessageNano
    {

        public Integer type;

        private FundingSourceType clear()
        {
            type = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FundingSourceType mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                type = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
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
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(1, type.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FundingSourceType()
        {
            clear();
        }
    }


    private static volatile endOfPromotionalPeriodTimestampMillis _emptyArray[];
    public String currencyCode;
    public Long endOfPromotionalPeriodTimestampMillis;
    public ee fee;
    public FundingSourceType fundingSourceType;
    public ype transactionType;
    public Boolean waived;
    public oney waivedRemaining;

    private FundingSourceType.type clear()
    {
        currencyCode = null;
        transactionType = null;
        fundingSourceType = null;
        waived = null;
        fee = null;
        waivedRemaining = null;
        endOfPromotionalPeriodTimestampMillis = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                currencyCode = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (transactionType == null)
                {
                    transactionType = new ype();
                }
                codedinputbytebuffernano.readMessage(transactionType);
                break;

            case 26: // '\032'
                if (fundingSourceType == null)
                {
                    fundingSourceType = new FundingSourceType();
                }
                codedinputbytebuffernano.readMessage(fundingSourceType);
                break;

            case 32: // ' '
                waived = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 42: // '*'
                if (fee == null)
                {
                    fee = new ee();
                }
                codedinputbytebuffernano.readMessage(fee);
                break;

            case 50: // '2'
                if (waivedRemaining == null)
                {
                    waivedRemaining = new oney();
                }
                codedinputbytebuffernano.readMessage(waivedRemaining);
                break;

            case 64: // '@'
                endOfPromotionalPeriodTimestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (currencyCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, currencyCode);
        }
        j = i;
        if (transactionType != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, transactionType);
        }
        i = j;
        if (fundingSourceType != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, fundingSourceType);
        }
        j = i;
        if (waived != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, waived.booleanValue());
        }
        i = j;
        if (fee != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, fee);
        }
        j = i;
        if (waivedRemaining != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, waivedRemaining);
        }
        i = j;
        if (endOfPromotionalPeriodTimestampMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(8, endOfPromotionalPeriodTimestampMillis.longValue());
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
        if (currencyCode != null)
        {
            codedoutputbytebuffernano.writeString(1, currencyCode);
        }
        if (transactionType != null)
        {
            codedoutputbytebuffernano.writeMessage(2, transactionType);
        }
        if (fundingSourceType != null)
        {
            codedoutputbytebuffernano.writeMessage(3, fundingSourceType);
        }
        if (waived != null)
        {
            codedoutputbytebuffernano.writeBool(4, waived.booleanValue());
        }
        if (fee != null)
        {
            codedoutputbytebuffernano.writeMessage(5, fee);
        }
        if (waivedRemaining != null)
        {
            codedoutputbytebuffernano.writeMessage(6, waivedRemaining);
        }
        if (endOfPromotionalPeriodTimestampMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(8, endOfPromotionalPeriodTimestampMillis.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public FundingSourceType.clear()
    {
        clear();
    }
}
