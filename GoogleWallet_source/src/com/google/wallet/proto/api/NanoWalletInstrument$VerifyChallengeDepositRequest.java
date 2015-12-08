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

    public String bankAccountSubId;
    public com.google.wallet.proto.est.depositAmount depositAmount;

    private clear clear()
    {
        bankAccountSubId = null;
        depositAmount = null;
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
                bankAccountSubId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                if (depositAmount == null)
                {
                    depositAmount = new com.google.wallet.proto.est.depositAmount();
                }
                codedinputbytebuffernano.readMessage(depositAmount);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (bankAccountSubId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, bankAccountSubId);
        }
        j = i;
        if (depositAmount != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, depositAmount);
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
        if (bankAccountSubId != null)
        {
            codedoutputbytebuffernano.writeString(1, bankAccountSubId);
        }
        if (depositAmount != null)
        {
            codedoutputbytebuffernano.writeMessage(2, depositAmount);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
