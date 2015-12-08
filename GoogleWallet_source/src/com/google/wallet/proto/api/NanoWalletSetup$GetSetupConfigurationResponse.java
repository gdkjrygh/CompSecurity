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
//            NanoWalletSetup

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.legalDocsForCountries brokerAndRelationships[];
    public com.google.wallet.proto.nse.legalDocsForCountries legalDocsForCountries[];
    public String supportedCountries[];

    private clear clear()
    {
        supportedCountries = WireFormatNano.EMPTY_STRING_ARRAY;
        brokerAndRelationships = com.google.wallet.proto.yArray();
        legalDocsForCountries = com.google.wallet.proto.ray();
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
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                String as[];
                int j;
                if (supportedCountries == null)
                {
                    j = 0;
                } else
                {
                    j = supportedCountries.length;
                }
                as = new String[j + i1];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(supportedCountries, 0, as, 0, j);
                    i1 = j;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = codedinputbytebuffernano.readString();
                    codedinputbytebuffernano.readTag();
                }

                as[i1] = codedinputbytebuffernano.readString();
                supportedCountries = as;
                break;

            case 18: // '\022'
                int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                com.google.wallet.proto.nse anse[];
                int k;
                if (brokerAndRelationships == null)
                {
                    k = 0;
                } else
                {
                    k = brokerAndRelationships.length;
                }
                anse = new com.google.wallet.proto.nse.brokerAndRelationships[k + j1];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(brokerAndRelationships, 0, anse, 0, k);
                    j1 = k;
                }
                for (; j1 < anse.length - 1; j1++)
                {
                    anse[j1] = new com.google.wallet.proto.t>();
                    codedinputbytebuffernano.readMessage(anse[j1]);
                    codedinputbytebuffernano.readTag();
                }

                anse[j1] = new com.google.wallet.proto.t>();
                codedinputbytebuffernano.readMessage(anse[j1]);
                brokerAndRelationships = anse;
                break;

            case 26: // '\032'
                int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                com.google.wallet.proto.nse anse1[];
                int l;
                if (legalDocsForCountries == null)
                {
                    l = 0;
                } else
                {
                    l = legalDocsForCountries.length;
                }
                anse1 = new com.google.wallet.proto.nse.legalDocsForCountries[l + k1];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(legalDocsForCountries, 0, anse1, 0, l);
                    k1 = l;
                }
                for (; k1 < anse1.length - 1; k1++)
                {
                    anse1[k1] = new com.google.wallet.proto.nse.legalDocsForCountries();
                    codedinputbytebuffernano.readMessage(anse1[k1]);
                    codedinputbytebuffernano.readTag();
                }

                anse1[k1] = new com.google.wallet.proto.nse.legalDocsForCountries();
                codedinputbytebuffernano.readMessage(anse1[k1]);
                legalDocsForCountries = anse1;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j2 = super.computeSerializedSize();
        int k = j2;
        if (supportedCountries != null)
        {
            k = j2;
            if (supportedCountries.length > 0)
            {
                int l1 = 0;
                k = 0;
                for (int i = 0; i < supportedCountries.length;)
                {
                    String s = supportedCountries[i];
                    int i2 = l1;
                    int i1 = k;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    i++;
                    l1 = i2;
                    k = i1;
                }

                k = j2 + k + l1 * 1;
            }
        }
        int j = k;
        if (brokerAndRelationships != null)
        {
            j = k;
            if (brokerAndRelationships.length > 0)
            {
                int j1 = 0;
                do
                {
                    j = k;
                    if (j1 >= brokerAndRelationships.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nse nse = brokerAndRelationships[j1];
                    j = k;
                    if (nse != null)
                    {
                        j = k + CodedOutputByteBufferNano.computeMessageSize(2, nse);
                    }
                    j1++;
                    k = j;
                } while (true);
            }
        }
        int k1 = j;
        if (legalDocsForCountries != null)
        {
            k1 = j;
            if (legalDocsForCountries.length > 0)
            {
                int l = 0;
                do
                {
                    k1 = j;
                    if (l >= legalDocsForCountries.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nse nse1 = legalDocsForCountries[l];
                    k1 = j;
                    if (nse1 != null)
                    {
                        k1 = j + CodedOutputByteBufferNano.computeMessageSize(3, nse1);
                    }
                    l++;
                    j = k1;
                } while (true);
            }
        }
        return k1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (supportedCountries != null && supportedCountries.length > 0)
        {
            for (int i = 0; i < supportedCountries.length; i++)
            {
                String s = supportedCountries[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(1, s);
                }
            }

        }
        if (brokerAndRelationships != null && brokerAndRelationships.length > 0)
        {
            for (int j = 0; j < brokerAndRelationships.length; j++)
            {
                com.google.wallet.proto.nse nse = brokerAndRelationships[j];
                if (nse != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, nse);
                }
            }

        }
        if (legalDocsForCountries != null && legalDocsForCountries.length > 0)
        {
            for (int k = 0; k < legalDocsForCountries.length; k++)
            {
                com.google.wallet.proto.nse nse1 = legalDocsForCountries[k];
                if (nse1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, nse1);
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
