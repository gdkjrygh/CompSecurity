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
    public static final class ByIds extends ExtendableMessageNano
    {

        public String ids[];

        private ByIds clear()
        {
            ids = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ByIds mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public ByIds()
        {
            clear();
        }
    }

    public static final class ByLookupIds extends ExtendableMessageNano
    {

        public String purchaseRecordLookupIds[];

        private ByLookupIds clear()
        {
            purchaseRecordLookupIds = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ByLookupIds mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public ByLookupIds()
        {
            clear();
        }
    }

    public static final class ByPendingState extends ExtendableMessageNano
    {

        public Boolean pending;

        private ByPendingState clear()
        {
            pending = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ByPendingState mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public ByPendingState()
        {
            clear();
        }
    }

    public static final class QueryParams extends ExtendableMessageNano
    {

        private static volatile QueryParams _emptyArray[];
        public ByIds byIds;
        public ByLookupIds byLookupIds;
        public ByPendingState byPendingState;
        public NanoWalletTransaction.PaginationCriteria paginationCriteria;
        public Integer type;

        private QueryParams clear()
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

        public static QueryParams[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new QueryParams[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private QueryParams mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                paginationCriteria = new NanoWalletTransaction.PaginationCriteria();
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
                byLookupIds = new ByLookupIds();
            }
            codedinputbytebuffernano.readMessage(byLookupIds);
            continue; /* Loop/switch isn't completed */
_L6:
            if (byPendingState == null)
            {
                byPendingState = new ByPendingState();
            }
            codedinputbytebuffernano.readMessage(byPendingState);
            continue; /* Loop/switch isn't completed */
_L7:
            if (byIds == null)
            {
                byIds = new ByIds();
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

        public QueryParams()
        {
            clear();
        }
    }

    public static final class SearchCriteria extends ExtendableMessageNano
    {

        public String purchaseRecordLookupIds[];
        public String query;

        private SearchCriteria clear()
        {
            query = null;
            purchaseRecordLookupIds = WireFormatNano.EMPTY_STRING_ARRAY;
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

        public SearchCriteria()
        {
            clear();
        }
    }


    public shouldEnrichMerchant paginationCriteria;
    public QueryParams queries[];
    public com.google.wallet.proto.est.QueryParams renderInfo;
    public SearchCriteria searchCriteria;
    public Boolean shouldEnrichMerchant;
    public String supportedMrfTag[];

    private SearchCriteria.purchaseRecordLookupIds clear()
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
                    searchCriteria = new SearchCriteria();
                }
                codedinputbytebuffernano.readMessage(searchCriteria);
                break;

            case 18: // '\022'
                if (paginationCriteria == null)
                {
                    paginationCriteria = new ();
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
                    renderInfo = new com.google.wallet.proto.est.renderInfo();
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

    public SearchCriteria.clear()
    {
        clear();
    }
}
