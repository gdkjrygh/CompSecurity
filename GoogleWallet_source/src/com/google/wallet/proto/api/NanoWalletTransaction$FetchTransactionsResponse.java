// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletTransaction

public static final class clear extends ExtendableMessageNano
{
    public static final class QueryResponse extends ExtendableMessageNano
    {

        private static volatile QueryResponse _emptyArray[];
        public NanoWalletTransaction.FetchTransactionsRequest.QueryParams associatedQuery;
        public Integer error;
        public String nextPageToken;
        public com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord purchaseRecords[];

        private QueryResponse clear()
        {
            purchaseRecords = com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord.emptyArray();
            nextPageToken = null;
            associatedQuery = null;
            error = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static QueryResponse[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new QueryResponse[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private QueryResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       18: 191
        //                       26: 202
        //                       32: 231;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord aclientpurchaserecord[];
            int j;
            if (purchaseRecords == null)
            {
                j = 0;
            } else
            {
                j = purchaseRecords.length;
            }
            aclientpurchaserecord = new com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(purchaseRecords, 0, aclientpurchaserecord, 0, j);
                l = j;
            }
            for (; l < aclientpurchaserecord.length - 1; l++)
            {
                aclientpurchaserecord[l] = new com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord();
                codedinputbytebuffernano.readMessage(aclientpurchaserecord[l]);
                codedinputbytebuffernano.readTag();
            }

            aclientpurchaserecord[l] = new com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord();
            codedinputbytebuffernano.readMessage(aclientpurchaserecord[l]);
            purchaseRecords = aclientpurchaserecord;
              goto _L7
_L4:
            nextPageToken = codedinputbytebuffernano.readString();
              goto _L7
_L5:
            if (associatedQuery == null)
            {
                associatedQuery = new NanoWalletTransaction.FetchTransactionsRequest.QueryParams();
            }
            codedinputbytebuffernano.readMessage(associatedQuery);
              goto _L7
_L6:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
                error = Integer.valueOf(k);
                break;
            }
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (purchaseRecords != null)
            {
                j = i;
                if (purchaseRecords.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= purchaseRecords.length)
                        {
                            break;
                        }
                        com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord clientpurchaserecord = purchaseRecords[k];
                        j = i;
                        if (clientpurchaserecord != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, clientpurchaserecord);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (nextPageToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, nextPageToken);
            }
            j = i;
            if (associatedQuery != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, associatedQuery);
            }
            i = j;
            if (error != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, error.intValue());
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
            if (purchaseRecords != null && purchaseRecords.length > 0)
            {
                for (int i = 0; i < purchaseRecords.length; i++)
                {
                    com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord clientpurchaserecord = purchaseRecords[i];
                    if (clientpurchaserecord != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, clientpurchaserecord);
                    }
                }

            }
            if (nextPageToken != null)
            {
                codedoutputbytebuffernano.writeString(2, nextPageToken);
            }
            if (associatedQuery != null)
            {
                codedoutputbytebuffernano.writeMessage(3, associatedQuery);
            }
            if (error != null)
            {
                codedoutputbytebuffernano.writeInt32(4, error.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public QueryResponse()
        {
            clear();
        }
    }


    public String nextPageToken;
    public com.google.checkout.commonui.purchaserecord.proto.nit> purchaseRecords[];
    public QueryResponse responses[];

    private lientPurchaseRecord clear()
    {
        purchaseRecords = com.google.checkout.commonui.purchaserecord.proto.ptyArray();
        nextPageToken = null;
        responses = QueryResponse.emptyArray();
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
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                com.google.checkout.commonui.purchaserecord.proto.ay aay[];
                int j;
                if (purchaseRecords == null)
                {
                    j = 0;
                } else
                {
                    j = purchaseRecords.length;
                }
                aay = new com.google.checkout.commonui.purchaserecord.proto.ay[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(purchaseRecords, 0, aay, 0, j);
                    l = j;
                }
                for (; l < aay.length - 1; l++)
                {
                    aay[l] = new com.google.checkout.commonui.purchaserecord.proto.nit>();
                    codedinputbytebuffernano.readMessage(aay[l]);
                    codedinputbytebuffernano.readTag();
                }

                aay[l] = new com.google.checkout.commonui.purchaserecord.proto.nit>();
                codedinputbytebuffernano.readMessage(aay[l]);
                purchaseRecords = aay;
                break;

            case 18: // '\022'
                nextPageToken = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                QueryResponse aqueryresponse[];
                int k;
                if (responses == null)
                {
                    k = 0;
                } else
                {
                    k = responses.length;
                }
                aqueryresponse = new QueryResponse[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(responses, 0, aqueryresponse, 0, k);
                    i1 = k;
                }
                for (; i1 < aqueryresponse.length - 1; i1++)
                {
                    aqueryresponse[i1] = new QueryResponse();
                    codedinputbytebuffernano.readMessage(aqueryresponse[i1]);
                    codedinputbytebuffernano.readTag();
                }

                aqueryresponse[i1] = new QueryResponse();
                codedinputbytebuffernano.readMessage(aqueryresponse[i1]);
                responses = aqueryresponse;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
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
                    com.google.checkout.commonui.purchaserecord.proto.nit> nit> = purchaseRecords[l];
                    j = i;
                    if (nit> != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, nit>);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (nextPageToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, nextPageToken);
        }
        int i1 = i;
        if (responses != null)
        {
            i1 = i;
            if (responses.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= responses.length)
                    {
                        break;
                    }
                    QueryResponse queryresponse = responses[k];
                    i1 = i;
                    if (queryresponse != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, queryresponse);
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
        if (purchaseRecords != null && purchaseRecords.length > 0)
        {
            for (int i = 0; i < purchaseRecords.length; i++)
            {
                com.google.checkout.commonui.purchaserecord.proto.nit> nit> = purchaseRecords[i];
                if (nit> != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, nit>);
                }
            }

        }
        if (nextPageToken != null)
        {
            codedoutputbytebuffernano.writeString(2, nextPageToken);
        }
        if (responses != null && responses.length > 0)
        {
            for (int j = 0; j < responses.length; j++)
            {
                QueryResponse queryresponse = responses[j];
                if (queryresponse != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, queryresponse);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public QueryResponse.clear()
    {
        clear();
    }
}
