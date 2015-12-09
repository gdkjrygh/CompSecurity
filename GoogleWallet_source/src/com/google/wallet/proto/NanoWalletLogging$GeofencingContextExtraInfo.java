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
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public Boolean buzzEnabled;
    public String offerTemplateId;
    public String offerTemplateNamespace;

    private clear clear()
    {
        offerTemplateNamespace = null;
        offerTemplateId = null;
        buzzEnabled = null;
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
                offerTemplateNamespace = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                offerTemplateId = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                buzzEnabled = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (offerTemplateNamespace != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, offerTemplateNamespace);
        }
        j = i;
        if (offerTemplateId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, offerTemplateId);
        }
        i = j;
        if (buzzEnabled != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, buzzEnabled.booleanValue());
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
        if (offerTemplateNamespace != null)
        {
            codedoutputbytebuffernano.writeString(1, offerTemplateNamespace);
        }
        if (offerTemplateId != null)
        {
            codedoutputbytebuffernano.writeString(2, offerTemplateId);
        }
        if (buzzEnabled != null)
        {
            codedoutputbytebuffernano.writeBool(3, buzzEnabled.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
