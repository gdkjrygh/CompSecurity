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
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.ass.classAttribution classAttribution[];
    public String discoverableProgramId;
    public String merchantName;

    private clear clear()
    {
        merchantName = null;
        discoverableProgramId = null;
        classAttribution = com.google.wallet.proto.ass.classAttribution();
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
                merchantName = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                discoverableProgramId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                com.google.wallet.proto.ass aass[];
                int j;
                if (classAttribution == null)
                {
                    j = 0;
                } else
                {
                    j = classAttribution.length;
                }
                aass = new com.google.wallet.proto.ass.classAttribution[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(classAttribution, 0, aass, 0, j);
                    k = j;
                }
                for (; k < aass.length - 1; k++)
                {
                    aass[k] = new com.google.wallet.proto.ass.classAttribution();
                    codedinputbytebuffernano.readMessage(aass[k]);
                    codedinputbytebuffernano.readTag();
                }

                aass[k] = new com.google.wallet.proto.ass.classAttribution();
                codedinputbytebuffernano.readMessage(aass[k]);
                classAttribution = aass;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (merchantName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(1, merchantName);
        }
        i = j;
        if (discoverableProgramId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, discoverableProgramId);
        }
        int l = i;
        if (classAttribution != null)
        {
            l = i;
            if (classAttribution.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= classAttribution.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.ass ass = classAttribution[k];
                    l = i;
                    if (ass != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, ass);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (merchantName != null)
        {
            codedoutputbytebuffernano.writeString(1, merchantName);
        }
        if (discoverableProgramId != null)
        {
            codedoutputbytebuffernano.writeString(2, discoverableProgramId);
        }
        if (classAttribution != null && classAttribution.length > 0)
        {
            for (int i = 0; i < classAttribution.length; i++)
            {
                com.google.wallet.proto.ass ass = classAttribution[i];
                if (ass != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, ass);
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
