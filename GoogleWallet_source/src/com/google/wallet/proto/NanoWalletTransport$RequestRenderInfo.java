// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{

    public  contextParameters;
    public String entrypointNames[];

    private clear clear()
    {
        contextParameters = null;
        entrypointNames = WireFormatNano.EMPTY_STRING_ARRAY;
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
                if (contextParameters == null)
                {
                    contextParameters = new ();
                }
                codedinputbytebuffernano.readMessage(contextParameters);
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                String as[];
                int j;
                if (entrypointNames == null)
                {
                    j = 0;
                } else
                {
                    j = entrypointNames.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(entrypointNames, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                entrypointNames = as;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (contextParameters != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, contextParameters);
        }
        j = i;
        if (entrypointNames != null)
        {
            j = i;
            if (entrypointNames.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < entrypointNames.length;)
                {
                    String s = entrypointNames[j];
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
        if (contextParameters != null)
        {
            codedoutputbytebuffernano.writeMessage(1, contextParameters);
        }
        if (entrypointNames != null && entrypointNames.length > 0)
        {
            for (int i = 0; i < entrypointNames.length; i++)
            {
                String s = entrypointNames[i];
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
