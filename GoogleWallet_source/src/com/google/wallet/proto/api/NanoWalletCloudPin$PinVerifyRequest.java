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
    public com.google.wallet.proto. encryptedPin;
    public String versionInfo;

    private clear clear()
    {
        encryptedPin = null;
        currentClientTime = null;
        versionInfo = null;
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

            case 16: // '\020'
                currentClientTime = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 26: // '\032'
                versionInfo = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                if (encryptedPin == null)
                {
                    encryptedPin = new com.google.wallet.proto.();
                }
                codedinputbytebuffernano.readMessage(encryptedPin);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (currentClientTime != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(2, currentClientTime.longValue());
        }
        j = i;
        if (versionInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(3, versionInfo);
        }
        i = j;
        if (encryptedPin != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, encryptedPin);
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
        if (currentClientTime != null)
        {
            codedoutputbytebuffernano.writeInt64(2, currentClientTime.longValue());
        }
        if (versionInfo != null)
        {
            codedoutputbytebuffernano.writeString(3, versionInfo);
        }
        if (encryptedPin != null)
        {
            codedoutputbytebuffernano.writeMessage(5, encryptedPin);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
