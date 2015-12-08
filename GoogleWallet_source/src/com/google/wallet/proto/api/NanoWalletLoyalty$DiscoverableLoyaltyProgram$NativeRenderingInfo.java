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
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public String logoImageUrl;
    public String merchantName;
    public String programName;

    private clear clear()
    {
        programName = null;
        merchantName = null;
        logoImageUrl = null;
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
                programName = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                merchantName = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                logoImageUrl = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (programName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, programName);
        }
        j = i;
        if (merchantName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, merchantName);
        }
        i = j;
        if (logoImageUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, logoImageUrl);
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
        if (programName != null)
        {
            codedoutputbytebuffernano.writeString(1, programName);
        }
        if (merchantName != null)
        {
            codedoutputbytebuffernano.writeString(2, merchantName);
        }
        if (logoImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(3, logoImageUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
