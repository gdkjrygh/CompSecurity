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

    public String cardNumberLast4;
    public com.google.wallet.proto.est.cardNumberLast4 proxyCardId;

    private clear clear()
    {
        proxyCardId = null;
        cardNumberLast4 = null;
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
                if (proxyCardId == null)
                {
                    proxyCardId = new com.google.wallet.proto.est.proxyCardId();
                }
                codedinputbytebuffernano.readMessage(proxyCardId);
                break;

            case 18: // '\022'
                cardNumberLast4 = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (proxyCardId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, proxyCardId);
        }
        j = i;
        if (cardNumberLast4 != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, cardNumberLast4);
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
        if (proxyCardId != null)
        {
            codedoutputbytebuffernano.writeMessage(1, proxyCardId);
        }
        if (cardNumberLast4 != null)
        {
            codedoutputbytebuffernano.writeString(2, cardNumberLast4);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        clear();
    }
}
