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

    public tMismatch amountMismatch;
    public com.google.wallet.proto.mountMismatch callError;
    public String transferIdempotencyId;
    public String transferReceiptId;

    private clear clear()
    {
        callError = null;
        transferIdempotencyId = null;
        amountMismatch = null;
        transferReceiptId = null;
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

            case 18: // '\022'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 26: // '\032'
                transferIdempotencyId = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                if (amountMismatch == null)
                {
                    amountMismatch = new tMismatch();
                }
                codedinputbytebuffernano.readMessage(amountMismatch);
                break;

            case 50: // '2'
                transferReceiptId = codedinputbytebuffernano.readString();
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
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
        }
        j = i;
        if (transferIdempotencyId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(3, transferIdempotencyId);
        }
        i = j;
        if (amountMismatch != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, amountMismatch);
        }
        j = i;
        if (transferReceiptId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, transferReceiptId);
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
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        if (transferIdempotencyId != null)
        {
            codedoutputbytebuffernano.writeString(3, transferIdempotencyId);
        }
        if (amountMismatch != null)
        {
            codedoutputbytebuffernano.writeMessage(5, amountMismatch);
        }
        if (transferReceiptId != null)
        {
            codedoutputbytebuffernano.writeString(6, transferReceiptId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public tMismatch()
    {
        clear();
    }
}
