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
    public com.google.wallet.proto.ata encryptedPin;
    public Boolean requirePinForWebP2P;

    private clear clear()
    {
        encryptedPin = null;
        currentClientTime = null;
        requirePinForWebP2P = null;
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

            case 26: // '\032'
                if (encryptedPin == null)
                {
                    encryptedPin = new com.google.wallet.proto.ata();
                }
                codedinputbytebuffernano.readMessage(encryptedPin);
                break;

            case 32: // ' '
                currentClientTime = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 40: // '('
                requirePinForWebP2P = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (encryptedPin != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, encryptedPin);
        }
        j = i;
        if (currentClientTime != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(4, currentClientTime.longValue());
        }
        i = j;
        if (requirePinForWebP2P != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, requirePinForWebP2P.booleanValue());
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
        if (encryptedPin != null)
        {
            codedoutputbytebuffernano.writeMessage(3, encryptedPin);
        }
        if (currentClientTime != null)
        {
            codedoutputbytebuffernano.writeInt64(4, currentClientTime.longValue());
        }
        if (requirePinForWebP2P != null)
        {
            codedoutputbytebuffernano.writeBool(5, requirePinForWebP2P.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
