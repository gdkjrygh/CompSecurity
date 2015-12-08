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
//            NanoWalletWobs

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.rInfo renderInfo;
    public String wobId[];

    private clear clear()
    {
        wobId = WireFormatNano.EMPTY_STRING_ARRAY;
        renderInfo = null;
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                String as[];
                int j;
                if (wobId == null)
                {
                    j = 0;
                } else
                {
                    j = wobId.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(wobId, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                wobId = as;
                break;

            case 18: // '\022'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.rInfo();
                }
                codedinputbytebuffernano.readMessage(renderInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int k1 = super.computeSerializedSize();
        int i = k1;
        if (wobId != null)
        {
            i = k1;
            if (wobId.length > 0)
            {
                int i1 = 0;
                int j = 0;
                for (i = 0; i < wobId.length;)
                {
                    String s = wobId[i];
                    int j1 = i1;
                    int l = j;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    i1 = j1;
                    j = l;
                }

                i = k1 + j + i1 * 1;
            }
        }
        int k = i;
        if (renderInfo != null)
        {
            k = i + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
        }
        return k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (wobId != null && wobId.length > 0)
        {
            for (int i = 0; i < wobId.length; i++)
            {
                String s = wobId[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(1, s);
                }
            }

        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, renderInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public o()
    {
        clear();
    }
}
