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

    public String nextPageToken;
    public com.google.checkout.commonui.purchaserecord.proto.it> purchaseRecords[];
    public ientPurchaseRecord searchCriteria;
    public ientPurchaseRecord searchSuggestions[];

    private clear clear()
    {
        searchCriteria = null;
        purchaseRecords = com.google.checkout.commonui.purchaserecord.proto.tyArray();
        nextPageToken = null;
        searchSuggestions = ();
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
                if (searchCriteria == null)
                {
                    searchCriteria = new searchCriteria();
                }
                codedinputbytebuffernano.readMessage(searchCriteria);
                break;

            case 18: // '\022'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                com.google.checkout.commonui.purchaserecord.proto.tyArray atyarray[];
                int j;
                if (purchaseRecords == null)
                {
                    j = 0;
                } else
                {
                    j = purchaseRecords.length;
                }
                atyarray = new com.google.checkout.commonui.purchaserecord.proto.tyArray[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(purchaseRecords, 0, atyarray, 0, j);
                    l = j;
                }
                for (; l < atyarray.length - 1; l++)
                {
                    atyarray[l] = new com.google.checkout.commonui.purchaserecord.proto.it>();
                    codedinputbytebuffernano.readMessage(atyarray[l]);
                    codedinputbytebuffernano.readTag();
                }

                atyarray[l] = new com.google.checkout.commonui.purchaserecord.proto.it>();
                codedinputbytebuffernano.readMessage(atyarray[l]);
                purchaseRecords = atyarray;
                break;

            case 26: // '\032'
                nextPageToken = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                ientPurchaseRecord aientpurchaserecord[];
                int k;
                if (searchSuggestions == null)
                {
                    k = 0;
                } else
                {
                    k = searchSuggestions.length;
                }
                aientpurchaserecord = new searchSuggestions[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(searchSuggestions, 0, aientpurchaserecord, 0, k);
                    i1 = k;
                }
                for (; i1 < aientpurchaserecord.length - 1; i1++)
                {
                    aientpurchaserecord[i1] = new searchSuggestions();
                    codedinputbytebuffernano.readMessage(aientpurchaserecord[i1]);
                    codedinputbytebuffernano.readTag();
                }

                aientpurchaserecord[i1] = new searchSuggestions();
                codedinputbytebuffernano.readMessage(aientpurchaserecord[i1]);
                searchSuggestions = aientpurchaserecord;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (searchCriteria != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, searchCriteria);
        }
        j = i;
        if (purchaseRecords != null)
        {
            j = i;
            if (purchaseRecords.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= purchaseRecords.length)
                    {
                        break;
                    }
                    com.google.checkout.commonui.purchaserecord.proto.it> it> = purchaseRecords[l];
                    j = i;
                    if (it> != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, it>);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (nextPageToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, nextPageToken);
        }
        int i1 = i;
        if (searchSuggestions != null)
        {
            i1 = i;
            if (searchSuggestions.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= searchSuggestions.length)
                    {
                        break;
                    }
                    ientPurchaseRecord ientpurchaserecord = searchSuggestions[k];
                    i1 = i;
                    if (ientpurchaserecord != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, ientpurchaserecord);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (searchCriteria != null)
        {
            codedoutputbytebuffernano.writeMessage(1, searchCriteria);
        }
        if (purchaseRecords != null && purchaseRecords.length > 0)
        {
            for (int i = 0; i < purchaseRecords.length; i++)
            {
                com.google.checkout.commonui.purchaserecord.proto.it> it> = purchaseRecords[i];
                if (it> != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, it>);
                }
            }

        }
        if (nextPageToken != null)
        {
            codedoutputbytebuffernano.writeString(3, nextPageToken);
        }
        if (searchSuggestions != null && searchSuggestions.length > 0)
        {
            for (int j = 0; j < searchSuggestions.length; j++)
            {
                ientPurchaseRecord ientpurchaserecord = searchSuggestions[j];
                if (ientpurchaserecord != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, ientpurchaserecord);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ientPurchaseRecord()
    {
        clear();
    }
}
