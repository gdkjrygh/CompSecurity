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
//            NanoWalletFrontingInstrument

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.metadata callError;
    public byte encryptedPaymentBundle[];
    public com.google.wallet.proto.features.ata metadata;

    private clear clear()
    {
        callError = null;
        encryptedPaymentBundle = null;
        metadata = null;
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
                encryptedPaymentBundle = codedinputbytebuffernano.readBytes();
                break;

            case 26: // '\032'
                if (metadata == null)
                {
                    metadata = new com.google.wallet.proto.features.ata();
                }
                codedinputbytebuffernano.readMessage(metadata);
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
        if (encryptedPaymentBundle != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(2, encryptedPaymentBundle);
        }
        i = j;
        if (metadata != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, metadata);
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
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(1, callError);
        }
        if (encryptedPaymentBundle != null)
        {
            codedoutputbytebuffernano.writeBytes(2, encryptedPaymentBundle);
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(3, metadata);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
