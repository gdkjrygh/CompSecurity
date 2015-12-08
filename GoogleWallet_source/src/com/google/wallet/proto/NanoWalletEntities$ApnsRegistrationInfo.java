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

    public String bundleId;
    public String gaiaAuthToken;
    public byte token[];

    private clear clear()
    {
        token = null;
        bundleId = null;
        gaiaAuthToken = null;
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
                token = codedinputbytebuffernano.readBytes();
                break;

            case 18: // '\022'
                bundleId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                gaiaAuthToken = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (token != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, token);
        }
        j = i;
        if (bundleId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, bundleId);
        }
        i = j;
        if (gaiaAuthToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, gaiaAuthToken);
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
        if (token != null)
        {
            codedoutputbytebuffernano.writeBytes(1, token);
        }
        if (bundleId != null)
        {
            codedoutputbytebuffernano.writeString(2, bundleId);
        }
        if (gaiaAuthToken != null)
        {
            codedoutputbytebuffernano.writeString(3, gaiaAuthToken);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
