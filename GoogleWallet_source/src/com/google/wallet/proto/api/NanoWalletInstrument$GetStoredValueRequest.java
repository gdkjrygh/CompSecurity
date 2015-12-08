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
//            NanoWalletInstrument

public static final class clear extends ExtendableMessageNano
{

    public Boolean alwaysIncludePendingTopups;
    public com.google.wallet.proto.est.metadata knownStoredValueId;
    public com.google.wallet.proto.est.metadata metadata;

    private clear clear()
    {
        knownStoredValueId = null;
        alwaysIncludePendingTopups = null;
        metadata = null;
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
                if (knownStoredValueId == null)
                {
                    knownStoredValueId = new com.google.wallet.proto.est.knownStoredValueId();
                }
                codedinputbytebuffernano.readMessage(knownStoredValueId);
                break;

            case 16: // '\020'
                alwaysIncludePendingTopups = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 72002: 
                if (metadata == null)
                {
                    metadata = new com.google.wallet.proto.est.metadata();
                }
                codedinputbytebuffernano.readMessage(metadata);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (knownStoredValueId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, knownStoredValueId);
        }
        j = i;
        if (alwaysIncludePendingTopups != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(2, alwaysIncludePendingTopups.booleanValue());
        }
        i = j;
        if (metadata != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9000, metadata);
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
        if (knownStoredValueId != null)
        {
            codedoutputbytebuffernano.writeMessage(1, knownStoredValueId);
        }
        if (alwaysIncludePendingTopups != null)
        {
            codedoutputbytebuffernano.writeBool(2, alwaysIncludePendingTopups.booleanValue());
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(9000, metadata);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
