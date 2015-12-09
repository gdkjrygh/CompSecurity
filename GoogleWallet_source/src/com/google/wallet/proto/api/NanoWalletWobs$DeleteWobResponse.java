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
//            NanoWalletWobs

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.callError callError;
    public com.google.wallet.proto.nse.callError instance;

    private clear clear()
    {
        callError = null;
        instance = null;
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
                if (instance == null)
                {
                    instance = new com.google.wallet.proto.it>();
                }
                codedinputbytebuffernano.readMessage(instance);
                break;

            case 26: // '\032'
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
        if (instance != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, instance);
        }
        j = i;
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(3, callError);
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
        if (instance != null)
        {
            codedoutputbytebuffernano.writeMessage(1, instance);
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(3, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
