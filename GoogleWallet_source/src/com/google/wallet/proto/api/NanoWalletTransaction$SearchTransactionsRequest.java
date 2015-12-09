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
//            NanoWalletTransaction

public static final class clear extends ExtendableMessageNano
{

    public shouldEnrichMerchant paginationCriteria;
    public com.google.wallet.proto.est.shouldEnrichMerchant renderInfo;
    public shouldEnrichMerchant searchCriteria;
    public Boolean shouldEnrichMerchant;

    private clear clear()
    {
        searchCriteria = null;
        paginationCriteria = null;
        renderInfo = null;
        shouldEnrichMerchant = null;
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
                if (searchCriteria == null)
                {
                    searchCriteria = new searchCriteria();
                }
                codedinputbytebuffernano.readMessage(searchCriteria);
                break;

            case 18: // '\022'
                if (paginationCriteria == null)
                {
                    paginationCriteria = new paginationCriteria();
                }
                codedinputbytebuffernano.readMessage(paginationCriteria);
                break;

            case 26: // '\032'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.est.renderInfo();
                }
                codedinputbytebuffernano.readMessage(renderInfo);
                break;

            case 32: // ' '
                shouldEnrichMerchant = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (searchCriteria != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, searchCriteria);
        }
        j = i;
        if (paginationCriteria != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, paginationCriteria);
        }
        i = j;
        if (renderInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderInfo);
        }
        j = i;
        if (shouldEnrichMerchant != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, shouldEnrichMerchant.booleanValue());
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
        if (searchCriteria != null)
        {
            codedoutputbytebuffernano.writeMessage(1, searchCriteria);
        }
        if (paginationCriteria != null)
        {
            codedoutputbytebuffernano.writeMessage(2, paginationCriteria);
        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, renderInfo);
        }
        if (shouldEnrichMerchant != null)
        {
            codedoutputbytebuffernano.writeBool(4, shouldEnrichMerchant.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Q()
    {
        clear();
    }
}
