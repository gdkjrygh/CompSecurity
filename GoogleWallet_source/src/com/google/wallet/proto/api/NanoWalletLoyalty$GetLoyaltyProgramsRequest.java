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
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public String programId[];
    public com.google.wallet.proto.est.supportsOptionalData renderInfo;
    public Boolean supportsOptionalData;

    private clear clear()
    {
        programId = WireFormatNano.EMPTY_STRING_ARRAY;
        renderInfo = null;
        supportsOptionalData = null;
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
                if (programId == null)
                {
                    j = 0;
                } else
                {
                    j = programId.length;
                }
                as = new String[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(programId, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[k] = codedinputbytebuffernano.readString();
                programId = as;
                break;

            case 18: // '\022'
                if (renderInfo == null)
                {
                    renderInfo = new com.google.wallet.proto.();
                }
                codedinputbytebuffernano.readMessage(renderInfo);
                break;

            case 24: // '\030'
                supportsOptionalData = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int k1 = super.computeSerializedSize();
        int i = k1;
        if (programId != null)
        {
            i = k1;
            if (programId.length > 0)
            {
                int i1 = 0;
                int j = 0;
                for (i = 0; i < programId.length;)
                {
                    String s = programId[i];
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
        i = k;
        if (supportsOptionalData != null)
        {
            i = k + CodedOutputByteBufferNano.computeBoolSize(3, supportsOptionalData.booleanValue());
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
        if (programId != null && programId.length > 0)
        {
            for (int i = 0; i < programId.length; i++)
            {
                String s = programId[i];
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
        if (supportsOptionalData != null)
        {
            codedoutputbytebuffernano.writeBool(3, supportsOptionalData.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
