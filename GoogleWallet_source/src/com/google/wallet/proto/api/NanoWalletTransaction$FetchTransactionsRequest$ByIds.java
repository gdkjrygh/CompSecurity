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
//            NanoWalletTransaction

public static final class clear extends ExtendableMessageNano
{

    public String ids[];

    private clear clear()
    {
        ids = WireFormatNano.EMPTY_STRING_ARRAY;
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

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                String as[];
                int j;
                if (ids == null)
                {
                    j = 0;
                } else
                {
                    j = ids.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(ids, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                ids = as;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i = j1;
        if (ids != null)
        {
            i = j1;
            if (ids.length > 0)
            {
                int l = 0;
                int j = 0;
                for (i = 0; i < ids.length;)
                {
                    String s = ids[i];
                    int i1 = l;
                    int k = j;
                    if (s != null)
                    {
                        i1 = l + 1;
                        k = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    l = i1;
                    j = k;
                }

                i = j1 + j + l * 1;
            }
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
        if (ids != null && ids.length > 0)
        {
            for (int i = 0; i < ids.length; i++)
            {
                String s = ids[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(2, s);
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
