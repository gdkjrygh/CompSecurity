// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLocation

public static final class clear extends ExtendableMessageNano
{

    public String collapsedDescription;
    public String expandedDescriptionLines[];
    public String title;

    private clear clear()
    {
        title = null;
        collapsedDescription = null;
        expandedDescriptionLines = WireFormatNano.EMPTY_STRING_ARRAY;
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
                title = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                collapsedDescription = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                String as[];
                int j;
                if (expandedDescriptionLines == null)
                {
                    j = 0;
                } else
                {
                    j = expandedDescriptionLines.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(expandedDescriptionLines, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                expandedDescriptionLines = as;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (title != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        i = j;
        if (collapsedDescription != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, collapsedDescription);
        }
        j = i;
        if (expandedDescriptionLines != null)
        {
            j = i;
            if (expandedDescriptionLines.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < expandedDescriptionLines.length;)
                {
                    String s = expandedDescriptionLines[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
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
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(1, title);
        }
        if (collapsedDescription != null)
        {
            codedoutputbytebuffernano.writeString(2, collapsedDescription);
        }
        if (expandedDescriptionLines != null && expandedDescriptionLines.length > 0)
        {
            for (int i = 0; i < expandedDescriptionLines.length; i++)
            {
                String s = expandedDescriptionLines[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(3, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
