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
//            NanoWalletCloudPin

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.callError callError;
    public Long pinGeneration;
    public com.google.wallet.proto.nse.callError pinToken;

    private clear clear()
    {
        callError = null;
        pinToken = null;
        pinGeneration = null;
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
                if (pinToken == null)
                {
                    pinToken = new com.google.wallet.proto.nse.pinToken();
                }
                codedinputbytebuffernano.readMessage(pinToken);
                break;

            case 16: // '\020'
                pinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 802: 
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (pinToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, pinToken);
        }
        j = i;
        if (pinGeneration != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, pinGeneration.longValue());
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(100, callError);
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
        if (pinToken != null)
        {
            codedoutputbytebuffernano.writeMessage(1, pinToken);
        }
        if (pinGeneration != null)
        {
            codedoutputbytebuffernano.writeInt64(2, pinGeneration.longValue());
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(100, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
