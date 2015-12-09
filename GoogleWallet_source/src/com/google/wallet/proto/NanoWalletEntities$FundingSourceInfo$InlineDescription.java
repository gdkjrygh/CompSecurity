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

    public String listDescriptionText;
    public String selectedDescriptionText;

    private clear clear()
    {
        selectedDescriptionText = null;
        listDescriptionText = null;
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
                selectedDescriptionText = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                listDescriptionText = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (selectedDescriptionText != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, selectedDescriptionText);
        }
        j = i;
        if (listDescriptionText != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, listDescriptionText);
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
        if (selectedDescriptionText != null)
        {
            codedoutputbytebuffernano.writeString(1, selectedDescriptionText);
        }
        if (listDescriptionText != null)
        {
            codedoutputbytebuffernano.writeString(2, listDescriptionText);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
