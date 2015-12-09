// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public String description;
    public String helpUrl;
    public Boolean secureElementCard;

    private clear clear()
    {
        description = null;
        helpUrl = null;
        secureElementCard = null;
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
                description = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                helpUrl = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                secureElementCard = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (description != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, description);
        }
        j = i;
        if (helpUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, helpUrl);
        }
        i = j;
        if (secureElementCard != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, secureElementCard.booleanValue());
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
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(1, description);
        }
        if (helpUrl != null)
        {
            codedoutputbytebuffernano.writeString(2, helpUrl);
        }
        if (secureElementCard != null)
        {
            codedoutputbytebuffernano.writeBool(3, secureElementCard.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
