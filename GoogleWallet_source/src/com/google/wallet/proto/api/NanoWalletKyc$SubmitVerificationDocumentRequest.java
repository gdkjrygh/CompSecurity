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
//            NanoWalletKyc

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.est.source identityDocument;
    public String mimeType;
    public String source;
    public com.google.wallet.proto.est.source ssnLastFour;

    private clear clear()
    {
        identityDocument = null;
        mimeType = null;
        ssnLastFour = null;
        source = null;
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
                if (identityDocument == null)
                {
                    identityDocument = new com.google.wallet.proto.est.identityDocument();
                }
                codedinputbytebuffernano.readMessage(identityDocument);
                break;

            case 18: // '\022'
                mimeType = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (ssnLastFour == null)
                {
                    ssnLastFour = new com.google.wallet.proto.est.ssnLastFour();
                }
                codedinputbytebuffernano.readMessage(ssnLastFour);
                break;

            case 34: // '"'
                source = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (identityDocument != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, identityDocument);
        }
        j = i;
        if (mimeType != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, mimeType);
        }
        i = j;
        if (ssnLastFour != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, ssnLastFour);
        }
        j = i;
        if (source != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, source);
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
        if (identityDocument != null)
        {
            codedoutputbytebuffernano.writeMessage(1, identityDocument);
        }
        if (mimeType != null)
        {
            codedoutputbytebuffernano.writeString(2, mimeType);
        }
        if (ssnLastFour != null)
        {
            codedoutputbytebuffernano.writeMessage(3, ssnLastFour);
        }
        if (source != null)
        {
            codedoutputbytebuffernano.writeString(4, source);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Q()
    {
        clear();
    }
}
