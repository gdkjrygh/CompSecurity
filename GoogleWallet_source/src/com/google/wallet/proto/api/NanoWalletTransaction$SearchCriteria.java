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

    public Boolean includeSearchSuggestions;
    public String query;

    private clear clear()
    {
        query = null;
        includeSearchSuggestions = null;
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
                query = codedinputbytebuffernano.readString();
                break;

            case 16: // '\020'
                includeSearchSuggestions = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (query != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, query);
        }
        j = i;
        if (includeSearchSuggestions != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(2, includeSearchSuggestions.booleanValue());
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
        if (query != null)
        {
            codedoutputbytebuffernano.writeString(1, query);
        }
        if (includeSearchSuggestions != null)
        {
            codedoutputbytebuffernano.writeBool(2, includeSearchSuggestions.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
