// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.customer.cart.definitions;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.customer.cart.definitions:
//            NanoTaxDescriptor

public static final class clear extends ExtendableMessageNano
{

    public Boolean inclusive;
    public String shortName;

    private clear clear()
    {
        inclusive = null;
        shortName = null;
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

            case 8: // '\b'
                inclusive = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 18: // '\022'
                shortName = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (inclusive != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(1, inclusive.booleanValue());
        }
        j = i;
        if (shortName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, shortName);
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
        if (inclusive != null)
        {
            codedoutputbytebuffernano.writeBool(1, inclusive.booleanValue());
        }
        if (shortName != null)
        {
            codedoutputbytebuffernano.writeString(2, shortName);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
