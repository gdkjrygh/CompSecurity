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

    public com.google.wallet.proto.nse.totalAmount callError;
    public com.google.wallet.proto.nse.totalAmount feeAmount;
    public Boolean isWaived;
    public com.google.wallet.proto.nse.totalAmount totalAmount;

    private clear clear()
    {
        callError = null;
        feeAmount = null;
        isWaived = null;
        totalAmount = null;
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
                if (feeAmount == null)
                {
                    feeAmount = new com.google.wallet.proto.nse.feeAmount();
                }
                codedinputbytebuffernano.readMessage(feeAmount);
                break;

            case 32: // ' '
                isWaived = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 50: // '2'
                if (totalAmount == null)
                {
                    totalAmount = new com.google.wallet.proto.nse.totalAmount();
                }
                codedinputbytebuffernano.readMessage(totalAmount);
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
        if (feeAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(3, feeAmount);
        }
        i = j;
        if (isWaived != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(4, isWaived.booleanValue());
        }
        j = i;
        if (totalAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, totalAmount);
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
        if (feeAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(3, feeAmount);
        }
        if (isWaived != null)
        {
            codedoutputbytebuffernano.writeBool(4, isWaived.booleanValue());
        }
        if (totalAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(6, totalAmount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
