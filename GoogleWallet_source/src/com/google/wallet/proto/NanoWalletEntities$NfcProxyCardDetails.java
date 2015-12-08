// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public provisioningInfo provisioningInfo;
    public provisioningInfo proxyCard;

    private clear clear()
    {
        proxyCard = null;
        provisioningInfo = null;
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
                if (proxyCard == null)
                {
                    proxyCard = new proxyCard();
                }
                codedinputbytebuffernano.readMessage(proxyCard);
                break;

            case 18: // '\022'
                if (provisioningInfo == null)
                {
                    provisioningInfo = new it>();
                }
                codedinputbytebuffernano.readMessage(provisioningInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (proxyCard != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, proxyCard);
        }
        j = i;
        if (provisioningInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, provisioningInfo);
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
        if (proxyCard != null)
        {
            codedoutputbytebuffernano.writeMessage(1, proxyCard);
        }
        if (provisioningInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, provisioningInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
