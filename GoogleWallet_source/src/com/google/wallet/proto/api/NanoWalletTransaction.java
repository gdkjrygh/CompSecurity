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

public interface NanoWalletTransaction
{
    public static final class FetchTransactionsRequest extends ExtendableMessageNano
    {

        public PaginationCriteria paginationCriteria;
        public QueryParams queries[];
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public SearchCriteria searchCriteria;
        public Boolean shouldEnrichMerchant;
        public String supportedMrfTag[];

        private FetchTransactionsRequest clear()
        {
            searchCriteria = null;
            paginationCriteria = null;
            queries = QueryParams.emptyArray();
            supportedMrfTag = WireFormatNano.EMPTY_STRING_ARRAY;
            renderInfo = null;
            shouldEnrichMerchant = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchTransactionsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        searchCriteria = new SearchCriteria();
                    }
                    codedinputbytebuffernano.readMessage(searchCriteria);
                    break;

                case 18: // '\022'
                    if (paginationCriteria == null)
                    {
                        paginationCriteria = new PaginationCriteria();
                    }
                    codedinputbytebuffernano.readMessage(paginationCriteria);
                    break;

                case 26: // '\032'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    QueryParams aqueryparams[];
                    int j;
                    if (queries == null)
                    {
                        j = 0;
                    } else
                    {
                        j = queries.length;
                    }
                    aqueryparams = new QueryParams[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(queries, 0, aqueryparams, 0, j);
                        l = j;
                    }
                    for (; l < aqueryparams.length - 1; l++)
                    {
                        aqueryparams[l] = new QueryParams();
                        codedinputbytebuffernano.readMessage(aqueryparams[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    aqueryparams[l] = new QueryParams();
                    codedinputbytebuffernano.readMessage(aqueryparams[l]);
                    queries = aqueryparams;
                    break;

                case 34: // '"'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    String as[];
                    int k;
                    if (supportedMrfTag == null)
                    {
                        k = 0;
                    } else
                    {
                        k = supportedMrfTag.length;
                    }
                    as = new String[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(supportedMrfTag, 0, as, 0, k);
                        i1 = k;
                    }
                    for (; i1 < as.length - 1; i1++)
                    {
                        as[i1] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[i1] = codedinputbytebuffernano.readString();
                    supportedMrfTag = as;
                    break;

                case 42: // '*'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;

                case 48: // '0'
                    shouldEnrichMerchant = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (searchCriteria != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, searchCriteria);
            }
            i = j;
            if (paginationCriteria != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, paginationCriteria);
            }
            j = i;
            if (queries != null)
            {
                j = i;
                if (queries.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= queries.length)
                        {
                            break;
                        }
                        QueryParams queryparams = queries[k];
                        j = i;
                        if (queryparams != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, queryparams);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (supportedMrfTag != null)
            {
                i = j;
                if (supportedMrfTag.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (i = 0; i < supportedMrfTag.length;)
                    {
                        String s = supportedMrfTag[i];
                        int k1 = j1;
                        int i1 = l;
                        if (s != null)
                        {
                            k1 = j1 + 1;
                            i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        j1 = k1;
                        l = i1;
                    }

                    i = j + l + j1 * 1;
                }
            }
            j = i;
            if (renderInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(5, renderInfo);
            }
            i = j;
            if (shouldEnrichMerchant != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(6, shouldEnrichMerchant.booleanValue());
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
            if (searchCriteria != null)
            {
                codedoutputbytebuffernano.writeMessage(1, searchCriteria);
            }
            if (paginationCriteria != null)
            {
                codedoutputbytebuffernano.writeMessage(2, paginationCriteria);
            }
            if (queries != null && queries.length > 0)
            {
                for (int i = 0; i < queries.length; i++)
                {
                    QueryParams queryparams = queries[i];
                    if (queryparams != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, queryparams);
                    }
                }

            }
            if (supportedMrfTag != null && supportedMrfTag.length > 0)
            {
                for (int j = 0; j < supportedMrfTag.length; j++)
                {
                    String s = supportedMrfTag[j];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(4, s);
                    }
                }

            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(5, renderInfo);
            }
            if (shouldEnrichMerchant != null)
            {
                codedoutputbytebuffernano.writeBool(6, shouldEnrichMerchant.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchTransactionsRequest()
        {
            clear();
        }
    }

    public static final class FetchTransactionsRequest.ByIds extends ExtendableMessageNano
    {

        public String ids[];

        private FetchTransactionsRequest.ByIds clear()
        {
            ids = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchTransactionsRequest.ByIds mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public FetchTransactionsRequest.ByIds()
        {
            clear();
        }
    }

    public static final class FetchTransactionsRequest.ByLookupIds extends ExtendableMessageNano
    {

        public String purchaseRecordLookupIds[];

        private FetchTransactionsRequest.ByLookupIds clear()
        {
            purchaseRecordLookupIds = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchTransactionsRequest.ByLookupIds mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (purchaseRecordLookupIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = purchaseRecordLookupIds.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(purchaseRecordLookupIds, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    purchaseRecordLookupIds = as;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j1 = super.computeSerializedSize();
            int i = j1;
            if (purchaseRecordLookupIds != null)
            {
                i = j1;
                if (purchaseRecordLookupIds.length > 0)
                {
                    int l = 0;
                    int j = 0;
                    for (i = 0; i < purchaseRecordLookupIds.length;)
                    {
                        String s = purchaseRecordLookupIds[i];
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
            if (purchaseRecordLookupIds != null && purchaseRecordLookupIds.length > 0)
            {
                for (int i = 0; i < purchaseRecordLookupIds.length; i++)
                {
                    String s = purchaseRecordLookupIds[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchTransactionsRequest.ByLookupIds()
        {
            clear();
        }
    }

    public static final class FetchTransactionsRequest.ByPendingState extends ExtendableMessageNano
    {

        public Boolean pending;

        private FetchTransactionsRequest.ByPendingState clear()
        {
            pending = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchTransactionsRequest.ByPendingState mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    pending = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (pending != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(1, pending.booleanValue());
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
            if (pending != null)
            {
                codedoutputbytebuffernano.writeBool(1, pending.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchTransactionsRequest.ByPendingState()
        {
            clear();
        }
    }

    public static final class FetchTransactionsRequest.QueryParams extends ExtendableMessageNano
    {

        private static volatile FetchTransactionsRequest.QueryParams _emptyArray[];
        public FetchTransactionsRequest.ByIds byIds;
        public FetchTransactionsRequest.ByLookupIds byLookupIds;
        public FetchTransactionsRequest.ByPendingState byPendingState;
        public PaginationCriteria paginationCriteria;
        public Integer type;

        private FetchTransactionsRequest.QueryParams clear()
        {
            paginationCriteria = null;
            type = null;
            byLookupIds = null;
            byIds = null;
            byPendingState = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static FetchTransactionsRequest.QueryParams[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new FetchTransactionsRequest.QueryParams[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private FetchTransactionsRequest.QueryParams mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 104
        //                       26: 178
        //                       34: 207
        //                       50: 236;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            if (paginationCriteria == null)
            {
                paginationCriteria = new PaginationCriteria();
            }
            codedinputbytebuffernano.readMessage(paginationCriteria);
              goto _L8
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 9: // '\t'
            case 10: // '\n'
                type = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (byLookupIds == null)
            {
                byLookupIds = new FetchTransactionsRequest.ByLookupIds();
            }
            codedinputbytebuffernano.readMessage(byLookupIds);
            continue; /* Loop/switch isn't completed */
_L6:
            if (byPendingState == null)
            {
                byPendingState = new FetchTransactionsRequest.ByPendingState();
            }
            codedinputbytebuffernano.readMessage(byPendingState);
            continue; /* Loop/switch isn't completed */
_L7:
            if (byIds == null)
            {
                byIds = new FetchTransactionsRequest.ByIds();
            }
            codedinputbytebuffernano.readMessage(byIds);
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (paginationCriteria != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, paginationCriteria);
            }
            j = i;
            if (type != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, type.intValue());
            }
            i = j;
            if (byLookupIds != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, byLookupIds);
            }
            j = i;
            if (byPendingState != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, byPendingState);
            }
            i = j;
            if (byIds != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(6, byIds);
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
            if (paginationCriteria != null)
            {
                codedoutputbytebuffernano.writeMessage(1, paginationCriteria);
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(2, type.intValue());
            }
            if (byLookupIds != null)
            {
                codedoutputbytebuffernano.writeMessage(3, byLookupIds);
            }
            if (byPendingState != null)
            {
                codedoutputbytebuffernano.writeMessage(4, byPendingState);
            }
            if (byIds != null)
            {
                codedoutputbytebuffernano.writeMessage(6, byIds);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchTransactionsRequest.QueryParams()
        {
            clear();
        }
    }

    public static final class FetchTransactionsRequest.SearchCriteria extends ExtendableMessageNano
    {

        public String purchaseRecordLookupIds[];
        public String query;

        private FetchTransactionsRequest.SearchCriteria clear()
        {
            query = null;
            purchaseRecordLookupIds = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchTransactionsRequest.SearchCriteria mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    query = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    String as[];
                    int j;
                    if (purchaseRecordLookupIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = purchaseRecordLookupIds.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(purchaseRecordLookupIds, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    purchaseRecordLookupIds = as;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (query != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, query);
            }
            j = i;
            if (purchaseRecordLookupIds != null)
            {
                j = i;
                if (purchaseRecordLookupIds.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < purchaseRecordLookupIds.length;)
                    {
                        String s = purchaseRecordLookupIds[j];
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
            if (query != null)
            {
                codedoutputbytebuffernano.writeString(1, query);
            }
            if (purchaseRecordLookupIds != null && purchaseRecordLookupIds.length > 0)
            {
                for (int i = 0; i < purchaseRecordLookupIds.length; i++)
                {
                    String s = purchaseRecordLookupIds[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchTransactionsRequest.SearchCriteria()
        {
            clear();
        }
    }

    public static final class FetchTransactionsResponse extends ExtendableMessageNano
    {

        public String nextPageToken;
        public com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord purchaseRecords[];
        public QueryResponse responses[];

        private FetchTransactionsResponse clear()
        {
            purchaseRecords = com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord.emptyArray();
            nextPageToken = null;
            responses = QueryResponse.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchTransactionsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord clientpurchaserecord = purchaseRecords[l];
                        j = i;
                        if (clientpurchaserecord != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, clientpurchaserecord);
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

        public FetchTransactionsResponse()
        {
            clear();
        }
    }

    public static final class FetchTransactionsResponse.QueryResponse extends ExtendableMessageNano
    {

        private static volatile FetchTransactionsResponse.QueryResponse _emptyArray[];
        public FetchTransactionsRequest.QueryParams associatedQuery;
        public Integer error;
        public String nextPageToken;
        public com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord purchaseRecords[];

        private FetchTransactionsResponse.QueryResponse clear()
        {
            purchaseRecords = com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord.emptyArray();
            nextPageToken = null;
            associatedQuery = null;
            error = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static FetchTransactionsResponse.QueryResponse[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new FetchTransactionsResponse.QueryResponse[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private FetchTransactionsResponse.QueryResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                associatedQuery = new FetchTransactionsRequest.QueryParams();
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

        public FetchTransactionsResponse.QueryResponse()
        {
            clear();
        }
    }

    public static final class PaginationCriteria extends ExtendableMessageNano
    {

        public String continuationToken;
        public Integer maxNumberResults;

        private PaginationCriteria clear()
        {
            continuationToken = null;
            maxNumberResults = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PaginationCriteria mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    continuationToken = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    maxNumberResults = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (continuationToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, continuationToken);
            }
            j = i;
            if (maxNumberResults != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, maxNumberResults.intValue());
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
            if (continuationToken != null)
            {
                codedoutputbytebuffernano.writeString(1, continuationToken);
            }
            if (maxNumberResults != null)
            {
                codedoutputbytebuffernano.writeInt32(2, maxNumberResults.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PaginationCriteria()
        {
            clear();
        }
    }

    public static final class SearchCriteria extends ExtendableMessageNano
    {

        public Boolean includeSearchSuggestions;
        public String query;

        private SearchCriteria clear()
        {
            query = null;
            includeSearchSuggestions = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SearchCriteria mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    query = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    includeSearchSuggestions = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (query != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, query);
            }
            j = i;
            if (includeSearchSuggestions != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(2, includeSearchSuggestions.booleanValue());
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
            if (query != null)
            {
                codedoutputbytebuffernano.writeString(1, query);
            }
            if (includeSearchSuggestions != null)
            {
                codedoutputbytebuffernano.writeBool(2, includeSearchSuggestions.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SearchCriteria()
        {
            clear();
        }
    }

    public static final class SearchSuggestion extends ExtendableMessageNano
    {

        private static volatile SearchSuggestion _emptyArray[];
        public String searchSuggestion;

        private SearchSuggestion clear()
        {
            searchSuggestion = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SearchSuggestion[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SearchSuggestion[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SearchSuggestion mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    searchSuggestion = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (searchSuggestion != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, searchSuggestion);
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
            if (searchSuggestion != null)
            {
                codedoutputbytebuffernano.writeString(1, searchSuggestion);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SearchSuggestion()
        {
            clear();
        }
    }

    public static final class SearchTransactionsRequest extends ExtendableMessageNano
    {

        public PaginationCriteria paginationCriteria;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public SearchCriteria searchCriteria;
        public Boolean shouldEnrichMerchant;

        private SearchTransactionsRequest clear()
        {
            searchCriteria = null;
            paginationCriteria = null;
            renderInfo = null;
            shouldEnrichMerchant = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SearchTransactionsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        searchCriteria = new SearchCriteria();
                    }
                    codedinputbytebuffernano.readMessage(searchCriteria);
                    break;

                case 18: // '\022'
                    if (paginationCriteria == null)
                    {
                        paginationCriteria = new PaginationCriteria();
                    }
                    codedinputbytebuffernano.readMessage(paginationCriteria);
                    break;

                case 26: // '\032'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;

                case 32: // ' '
                    shouldEnrichMerchant = Boolean.valueOf(codedinputbytebuffernano.readBool());
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
            if (paginationCriteria != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, paginationCriteria);
            }
            i = j;
            if (renderInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderInfo);
            }
            j = i;
            if (shouldEnrichMerchant != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, shouldEnrichMerchant.booleanValue());
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
            if (searchCriteria != null)
            {
                codedoutputbytebuffernano.writeMessage(1, searchCriteria);
            }
            if (paginationCriteria != null)
            {
                codedoutputbytebuffernano.writeMessage(2, paginationCriteria);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, renderInfo);
            }
            if (shouldEnrichMerchant != null)
            {
                codedoutputbytebuffernano.writeBool(4, shouldEnrichMerchant.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SearchTransactionsRequest()
        {
            clear();
        }
    }

    public static final class SearchTransactionsResponse extends ExtendableMessageNano
    {

        public String nextPageToken;
        public com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord purchaseRecords[];
        public SearchCriteria searchCriteria;
        public SearchSuggestion searchSuggestions[];

        private SearchTransactionsResponse clear()
        {
            searchCriteria = null;
            purchaseRecords = com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord.emptyArray();
            nextPageToken = null;
            searchSuggestions = SearchSuggestion.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SearchTransactionsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        searchCriteria = new SearchCriteria();
                    }
                    codedinputbytebuffernano.readMessage(searchCriteria);
                    break;

                case 18: // '\022'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
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
                    break;

                case 26: // '\032'
                    nextPageToken = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    SearchSuggestion asearchsuggestion[];
                    int k;
                    if (searchSuggestions == null)
                    {
                        k = 0;
                    } else
                    {
                        k = searchSuggestions.length;
                    }
                    asearchsuggestion = new SearchSuggestion[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(searchSuggestions, 0, asearchsuggestion, 0, k);
                        i1 = k;
                    }
                    for (; i1 < asearchsuggestion.length - 1; i1++)
                    {
                        asearchsuggestion[i1] = new SearchSuggestion();
                        codedinputbytebuffernano.readMessage(asearchsuggestion[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    asearchsuggestion[i1] = new SearchSuggestion();
                    codedinputbytebuffernano.readMessage(asearchsuggestion[i1]);
                    searchSuggestions = asearchsuggestion;
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
                        com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord clientpurchaserecord = purchaseRecords[l];
                        j = i;
                        if (clientpurchaserecord != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, clientpurchaserecord);
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
                        SearchSuggestion searchsuggestion = searchSuggestions[k];
                        i1 = i;
                        if (searchsuggestion != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, searchsuggestion);
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
                    com.google.checkout.commonui.purchaserecord.proto.NanoClientPurchaseRecord.ClientPurchaseRecord clientpurchaserecord = purchaseRecords[i];
                    if (clientpurchaserecord != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, clientpurchaserecord);
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
                    SearchSuggestion searchsuggestion = searchSuggestions[j];
                    if (searchsuggestion != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, searchsuggestion);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SearchTransactionsResponse()
        {
            clear();
        }
    }

    public static final class TransactionGeoMerchantFeedbackRequest extends ExtendableMessageNano
    {

        public Integer feedbackValue;
        public GeoMerchant geoMerchant;
        public String transactionId;

        private TransactionGeoMerchantFeedbackRequest clear()
        {
            transactionId = null;
            geoMerchant = null;
            feedbackValue = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TransactionGeoMerchantFeedbackRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       18: 70
        //                       24: 99;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            transactionId = codedinputbytebuffernano.readString();
              goto _L6
_L4:
            if (geoMerchant == null)
            {
                geoMerchant = new GeoMerchant();
            }
            codedinputbytebuffernano.readMessage(geoMerchant);
              goto _L6
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
                feedbackValue = Integer.valueOf(j);
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (transactionId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, transactionId);
            }
            j = i;
            if (geoMerchant != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, geoMerchant);
            }
            i = j;
            if (feedbackValue != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, feedbackValue.intValue());
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
            if (transactionId != null)
            {
                codedoutputbytebuffernano.writeString(1, transactionId);
            }
            if (geoMerchant != null)
            {
                codedoutputbytebuffernano.writeMessage(2, geoMerchant);
            }
            if (feedbackValue != null)
            {
                codedoutputbytebuffernano.writeInt32(3, feedbackValue.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TransactionGeoMerchantFeedbackRequest()
        {
            clear();
        }
    }

    public static final class TransactionGeoMerchantFeedbackRequest.GeoMerchant extends ExtendableMessageNano
    {

        public Long locationDocid;

        private TransactionGeoMerchantFeedbackRequest.GeoMerchant clear()
        {
            locationDocid = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TransactionGeoMerchantFeedbackRequest.GeoMerchant mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    locationDocid = Long.valueOf(codedinputbytebuffernano.readUInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (locationDocid != null)
            {
                i = j + CodedOutputByteBufferNano.computeUInt64Size(1, locationDocid.longValue());
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
            if (locationDocid != null)
            {
                codedoutputbytebuffernano.writeUInt64(1, locationDocid.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TransactionGeoMerchantFeedbackRequest.GeoMerchant()
        {
            clear();
        }
    }

    public static final class TransactionGeoMerchantFeedbackResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private TransactionGeoMerchantFeedbackResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private TransactionGeoMerchantFeedbackResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TransactionGeoMerchantFeedbackResponse()
        {
            clear();
        }
    }

}
