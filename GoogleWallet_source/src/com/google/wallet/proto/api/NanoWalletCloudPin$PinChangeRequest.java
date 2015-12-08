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

    public Long currentClientTime;
    public com.google.wallet.proto. newEncryptedPin;
    public com.google.wallet.proto. oldEncryptedPin;

    private clear clear()
    {
        oldEncryptedPin = null;
        newEncryptedPin = null;
        currentClientTime = null;
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

            case 42: // '*'
                if (oldEncryptedPin == null)
                {
                    oldEncryptedPin = new com.google.wallet.proto.();
                }
                codedinputbytebuffernano.readMessage(oldEncryptedPin);
                break;

            case 50: // '2'
                if (newEncryptedPin == null)
                {
                    newEncryptedPin = new com.google.wallet.proto.();
                }
                codedinputbytebuffernano.readMessage(newEncryptedPin);
                break;

            case 56: // '8'
                currentClientTime = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (oldEncryptedPin != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, oldEncryptedPin);
        }
        j = i;
        if (newEncryptedPin != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, newEncryptedPin);
        }
        i = j;
        if (currentClientTime != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(7, currentClientTime.longValue());
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
        if (oldEncryptedPin != null)
        {
            codedoutputbytebuffernano.writeMessage(5, oldEncryptedPin);
        }
        if (newEncryptedPin != null)
        {
            codedoutputbytebuffernano.writeMessage(6, newEncryptedPin);
        }
        if (currentClientTime != null)
        {
            codedoutputbytebuffernano.writeInt64(7, currentClientTime.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
