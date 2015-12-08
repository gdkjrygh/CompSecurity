// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoP2pFee
{
    public static final class P2pFee extends ExtendableMessageNano
    {

        public Long feePercentageMicros;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money fixedPart;
        public com.google.checkout.customer.common.definitions.NanoMoney.Money totalAmount;

        private P2pFee clear()
        {
            totalAmount = null;
            fixedPart = null;
            feePercentageMicros = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private P2pFee mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (totalAmount == null)
                    {
                        totalAmount = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(totalAmount);
                    break;

                case 18: // '\022'
                    if (fixedPart == null)
                    {
                        fixedPart = new com.google.checkout.customer.common.definitions.NanoMoney.Money();
                    }
                    codedinputbytebuffernano.readMessage(fixedPart);
                    break;

                case 24: // '\030'
                    feePercentageMicros = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (totalAmount != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, totalAmount);
            }
            j = i;
            if (fixedPart != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, fixedPart);
            }
            i = j;
            if (feePercentageMicros != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, feePercentageMicros.longValue());
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
            if (totalAmount != null)
            {
                codedoutputbytebuffernano.writeMessage(1, totalAmount);
            }
            if (fixedPart != null)
            {
                codedoutputbytebuffernano.writeMessage(2, fixedPart);
            }
            if (feePercentageMicros != null)
            {
                codedoutputbytebuffernano.writeInt64(3, feePercentageMicros.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public P2pFee()
        {
            clear();
        }
    }

}
