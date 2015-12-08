// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.purchaserecord.definitions;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.customer.purchaserecord.definitions:
//            NanoP2pDetails

public static final class P2pMoneyRequestInfo.clear extends ExtendableMessageNano
{
    public static final class P2pMoneyRequestInfo extends ExtendableMessageNano
    {

        public com.google.checkout.customer.common.definitions.NanoDatetime.DateTime moneyRequestCreationTime;
        public String moneyRequestId;
        public String requesterMessage;

        private P2pMoneyRequestInfo clear()
        {
            moneyRequestId = null;
            moneyRequestCreationTime = null;
            requesterMessage = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private P2pMoneyRequestInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    moneyRequestId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (moneyRequestCreationTime == null)
                    {
                        moneyRequestCreationTime = new com.google.checkout.customer.common.definitions.NanoDatetime.DateTime();
                    }
                    codedinputbytebuffernano.readMessage(moneyRequestCreationTime);
                    break;

                case 26: // '\032'
                    requesterMessage = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (moneyRequestId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, moneyRequestId);
            }
            j = i;
            if (moneyRequestCreationTime != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, moneyRequestCreationTime);
            }
            i = j;
            if (requesterMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, requesterMessage);
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
            if (moneyRequestId != null)
            {
                codedoutputbytebuffernano.writeString(1, moneyRequestId);
            }
            if (moneyRequestCreationTime != null)
            {
                codedoutputbytebuffernano.writeMessage(2, moneyRequestCreationTime);
            }
            if (requesterMessage != null)
            {
                codedoutputbytebuffernano.writeString(3, requesterMessage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public P2pMoneyRequestInfo()
  