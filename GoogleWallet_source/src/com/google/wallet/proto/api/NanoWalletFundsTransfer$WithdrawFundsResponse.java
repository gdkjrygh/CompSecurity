// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletFundsTransfer

public static final class clear extends ExtendableMessageNano
{

    public match amountMismatch;
    public com.google.wallet.proto.tMismatch callError;
    public String withdrawalIdempotencyId;
    public String withdrawalReceiptId;

    private clear clear()
    {
        callError = null;
        withdrawalIdempotencyId = null;
        amountMismatch = null;
        withdrawalReceiptId = null;
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
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 18: // '\022'
                withdrawalIdempotencyId = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                if (amountMismatch == null)
                {
                    amountMismatch = new match();
                }
                codedinputbytebuffernano.readMessage(amountMismatch);
                break;

            case 58: // ':'
                withdrawalReceiptId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
        }
        j = i;
        if (withdrawalIdempotencyId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, withdrawalIdempotencyId);
        }
        i = j;
        if (amountMismatch != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(6, amountMismatch);
        }
        j = i;
        if (withdrawalReceiptId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(7, withdrawalReceiptId);
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
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(1, callError);
        }
        if (withdrawalIdempotencyId != null)
        {
            codedoutputbytebuffernano.writeString(2, withdrawalIdempotencyId);
        }
        if (amountMismatch != null)
        {
            codedoutputbytebuffernano.writeMessage(6, amountMismatch);
        }
        if (withdrawalReceiptId != null)
        {
            codedoutputbytebuffernano.writeString(7, withdrawalReceiptId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public match()
    {
        clear();
    }
}
