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

public interface NanoWalletWobs
{
    public static final class DeleteWobRequest extends ExtendableMessageNano
    {

        public Long holderVersion;
        public String instanceId;
        public Long instanceVersion;

        private DeleteWobRequest clear()
        {
            instanceId = null;
            instanceVersion = null;
            holderVersion = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeleteWobRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    instanceId = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    instanceVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 24: // '\030'
                    holderVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (instanceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, instanceId);
            }
            j = i;
            if (instanceVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, instanceVersion.longValue());
            }
            i = j;
            if (holderVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, holderVersion.longValue());
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
            if (instanceId != null)
            {
                codedoutputbytebuffernano.writeString(1, instanceId);
            }
            if (instanceVersion != null)
            {
                codedoutputbytebuffernano.writeInt64(2, instanceVersion.longValue());
            }
            if (holderVersion != null)
            {
                codedoutputbytebuffernano.writeInt64(3, holderVersion.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeleteWobRequest()
        {
            clear();
        }
    }

    public static final class DeleteWobResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance instance;

        private DeleteWobResponse clear()
        {
            callError = null;
            instance = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DeleteWobResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (instance == null)
                    {
                        instance = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    }
                    codedinputbytebuffernano.readMessage(instance);
                    break;

                case 26: // '\032'
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
            if (instance != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, instance);
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, callError);
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
            if (instance != null)
            {
                codedoutputbytebuffernano.writeMessage(1, instance);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DeleteWobResponse()
        {
            clear();
        }
    }

    public static final class FetchCacheConfigRequest extends ExtendableMessageNano
    {

        public byte configurationId[];

        private FetchCacheConfigRequest clear()
        {
            configurationId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchCacheConfigRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    configurationId = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (configurationId != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, configurationId);
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
            if (configurationId != null)
            {
                codedoutputbytebuffernano.writeBytes(1, configurationId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchCacheConfigRequest()
        {
            clear();
        }
    }

    public static final class FetchCacheConfigResponse extends ExtendableMessageNano
    {

        public int categoryId[];
        public byte configurationId[];
        public int invalidatedCategoryId[];

        private FetchCacheConfigResponse clear()
        {
            configurationId = null;
            categoryId = WireFormatNano.EMPTY_INT_ARRAY;
            invalidatedCategoryId = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchCacheConfigResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    configurationId = codedinputbytebuffernano.readBytes();
                    break;

                case 16: // '\020'
                    int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 16);
                    int ai[];
                    int j;
                    if (categoryId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = categoryId.length;
                    }
                    ai = new int[j + j1];
                    j1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(categoryId, 0, ai, 0, j);
                        j1 = j;
                    }
                    for (; j1 < ai.length - 1; j1++)
                    {
                        ai[j1] = codedinputbytebuffernano.readInt32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai[j1] = codedinputbytebuffernano.readInt32();
                    categoryId = ai;
                    break;

                case 18: // '\022'
                    int j2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int k1 = 0;
                    int k = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt32();
                        k1++;
                    }
                    codedinputbytebuffernano.rewindToPosition(k);
                    int ai1[];
                    if (categoryId == null)
                    {
                        k = 0;
                    } else
                    {
                        k = categoryId.length;
                    }
                    ai1 = new int[k + k1];
                    k1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(categoryId, 0, ai1, 0, k);
                        k1 = k;
                    }
                    for (; k1 < ai1.length; k1++)
                    {
                        ai1[k1] = codedinputbytebuffernano.readInt32();
                    }

                    categoryId = ai1;
                    codedinputbytebuffernano.popLimit(j2);
                    break;

                case 24: // '\030'
                    int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
                    int ai2[];
                    int l;
                    if (invalidatedCategoryId == null)
                    {
                        l = 0;
                    } else
                    {
                        l = invalidatedCategoryId.length;
                    }
                    ai2 = new int[l + l1];
                    l1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(invalidatedCategoryId, 0, ai2, 0, l);
                        l1 = l;
                    }
                    for (; l1 < ai2.length - 1; l1++)
                    {
                        ai2[l1] = codedinputbytebuffernano.readInt32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai2[l1] = codedinputbytebuffernano.readInt32();
                    invalidatedCategoryId = ai2;
                    break;

                case 26: // '\032'
                    int k2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int i2 = 0;
                    int i1 = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt32();
                        i2++;
                    }
                    codedinputbytebuffernano.rewindToPosition(i1);
                    int ai3[];
                    if (invalidatedCategoryId == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = invalidatedCategoryId.length;
                    }
                    ai3 = new int[i1 + i2];
                    i2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(invalidatedCategoryId, 0, ai3, 0, i1);
                        i2 = i1;
                    }
                    for (; i2 < ai3.length; i2++)
                    {
                        ai3[i2] = codedinputbytebuffernano.readInt32();
                    }

                    invalidatedCategoryId = ai3;
                    codedinputbytebuffernano.popLimit(k2);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (configurationId != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, configurationId);
            }
            j = i;
            if (categoryId != null)
            {
                j = i;
                if (categoryId.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < categoryId.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(categoryId[j]);
                    }

                    j = i + k + categoryId.length * 1;
                }
            }
            i = j;
            if (invalidatedCategoryId != null)
            {
                i = j;
                if (invalidatedCategoryId.length > 0)
                {
                    int l = 0;
                    for (i = 0; i < invalidatedCategoryId.length; i++)
                    {
                        l += CodedOutputByteBufferNano.computeInt32SizeNoTag(invalidatedCategoryId[i]);
                    }

                    i = j + l + invalidatedCategoryId.length * 1;
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
            if (configurationId != null)
            {
                codedoutputbytebuffernano.writeBytes(1, configurationId);
            }
            if (categoryId != null && categoryId.length > 0)
            {
                for (int i = 0; i < categoryId.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(2, categoryId[i]);
                }

            }
            if (invalidatedCategoryId != null && invalidatedCategoryId.length > 0)
            {
                for (int j = 0; j < invalidatedCategoryId.length; j++)
                {
                    codedoutputbytebuffernano.writeInt32(3, invalidatedCategoryId[j]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchCacheConfigResponse()
        {
            clear();
        }
    }

    public static final class FetchNextWobsRequest extends ExtendableMessageNano
    {

        public Integer categoryId;
        public byte configurationId[];
        public byte nextPageToken[];
        public Integer pageSize;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;

        private FetchNextWobsRequest clear()
        {
            configurationId = null;
            categoryId = null;
            nextPageToken = null;
            pageSize = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchNextWobsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    configurationId = codedinputbytebuffernano.readBytes();
                    break;

                case 16: // '\020'
                    categoryId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 26: // '\032'
                    nextPageToken = codedinputbytebuffernano.readBytes();
                    break;

                case 32: // ' '
                    pageSize = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 42: // '*'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (configurationId != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, configurationId);
            }
            j = i;
            if (categoryId != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, categoryId.intValue());
            }
            i = j;
            if (nextPageToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(3, nextPageToken);
            }
            j = i;
            if (pageSize != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, pageSize.intValue());
            }
            i = j;
            if (renderInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, renderInfo);
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
            if (configurationId != null)
            {
                codedoutputbytebuffernano.writeBytes(1, configurationId);
            }
            if (categoryId != null)
            {
                codedoutputbytebuffernano.writeInt32(2, categoryId.intValue());
            }
            if (nextPageToken != null)
            {
                codedoutputbytebuffernano.writeBytes(3, nextPageToken);
            }
            if (pageSize != null)
            {
                codedoutputbytebuffernano.writeInt32(4, pageSize.intValue());
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(5, renderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchNextWobsRequest()
        {
            clear();
        }
    }

    public static final class FetchNextWobsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public byte nextPageToken[];
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wob[];

        private FetchNextWobsResponse clear()
        {
            nextPageToken = null;
            wob = com.google.wallet.proto.NanoWalletObjects.WobInstance.emptyArray();
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchNextWobsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    nextPageToken = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[];
                    int j;
                    if (wob == null)
                    {
                        j = 0;
                    } else
                    {
                        j = wob.length;
                    }
                    awobinstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(wob, 0, awobinstance, 0, j);
                        k = j;
                    }
                    for (; k < awobinstance.length - 1; k++)
                    {
                        awobinstance[k] = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                        codedinputbytebuffernano.readMessage(awobinstance[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    awobinstance[k] = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    codedinputbytebuffernano.readMessage(awobinstance[k]);
                    wob = awobinstance;
                    break;

                case 26: // '\032'
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
            if (nextPageToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, nextPageToken);
            }
            j = i;
            if (wob != null)
            {
                j = i;
                if (wob.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= wob.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = wob[k];
                        j = i;
                        if (wobinstance != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, wobinstance);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
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
            if (nextPageToken != null)
            {
                codedoutputbytebuffernano.writeBytes(1, nextPageToken);
            }
            if (wob != null && wob.length > 0)
            {
                for (int i = 0; i < wob.length; i++)
                {
                    com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = wob[i];
                    if (wobinstance != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, wobinstance);
                    }
                }

            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchNextWobsResponse()
        {
            clear();
        }
    }

    public static final class FetchWobsRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public String wobId[];

        private FetchWobsRequest clear()
        {
            wobId = WireFormatNano.EMPTY_STRING_ARRAY;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchWobsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
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

        public FetchWobsRequest()
        {
            clear();
        }
    }

    public static final class FetchWobsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wob[];

        private FetchWobsResponse clear()
        {
            wob = com.google.wallet.proto.NanoWalletObjects.WobInstance.emptyArray();
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FetchWobsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[];
                    int j;
                    if (wob == null)
                    {
                        j = 0;
                    } else
                    {
                        j = wob.length;
                    }
                    awobinstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(wob, 0, awobinstance, 0, j);
                        k = j;
                    }
                    for (; k < awobinstance.length - 1; k++)
                    {
                        awobinstance[k] = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                        codedinputbytebuffernano.readMessage(awobinstance[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    awobinstance[k] = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    codedinputbytebuffernano.readMessage(awobinstance[k]);
                    wob = awobinstance;
                    break;

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
            int i = super.computeSerializedSize();
            int j = i;
            if (wob != null)
            {
                j = i;
                if (wob.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= wob.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = wob[k];
                        j = i;
                        if (wobinstance != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, wobinstance);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
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
            if (wob != null && wob.length > 0)
            {
                for (int i = 0; i < wob.length; i++)
                {
                    com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = wob[i];
                    if (wobinstance != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, wobinstance);
                    }
                }

            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FetchWobsResponse()
        {
            clear();
        }
    }

    public static final class HeadState extends ExtendableMessageNano
    {

        public Integer categoryId;
        public byte metadata[];
        public byte nextPageToken[];

        private HeadState clear()
        {
            categoryId = null;
            metadata = null;
            nextPageToken = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private HeadState mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    categoryId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    metadata = codedinputbytebuffernano.readBytes();
                    break;

                case 26: // '\032'
                    nextPageToken = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (categoryId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, categoryId.intValue());
            }
            j = i;
            if (metadata != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(2, metadata);
            }
            i = j;
            if (nextPageToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(3, nextPageToken);
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
            if (categoryId != null)
            {
                codedoutputbytebuffernano.writeInt32(1, categoryId.intValue());
            }
            if (metadata != null)
            {
                codedoutputbytebuffernano.writeBytes(2, metadata);
            }
            if (nextPageToken != null)
            {
                codedoutputbytebuffernano.writeBytes(3, nextPageToken);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public HeadState()
        {
            clear();
        }
    }

    public static final class PerformWobsActionRequest extends ExtendableMessageNano
    {

        public String actionUri;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;

        private PerformWobsActionRequest clear()
        {
            actionUri = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PerformWobsActionRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    actionUri = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionUri != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, actionUri);
            }
            j = i;
            if (renderInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
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
            if (actionUri != null)
            {
                codedoutputbytebuffernano.writeString(1, actionUri);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, renderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PerformWobsActionRequest()
        {
            clear();
        }
    }

    public static final class PerformWobsActionResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public String redirectUri;
        public String toastMessage;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance updatedWobInstance;

        private PerformWobsActionResponse clear()
        {
            updatedWobInstance = null;
            toastMessage = null;
            callError = null;
            redirectUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PerformWobsActionResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (updatedWobInstance == null)
                    {
                        updatedWobInstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    }
                    codedinputbytebuffernano.readMessage(updatedWobInstance);
                    break;

                case 18: // '\022'
                    toastMessage = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 34: // '"'
                    redirectUri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (updatedWobInstance != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, updatedWobInstance);
            }
            j = i;
            if (toastMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, toastMessage);
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
            }
            j = i;
            if (redirectUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, redirectUri);
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
            if (updatedWobInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(1, updatedWobInstance);
            }
            if (toastMessage != null)
            {
                codedoutputbytebuffernano.writeString(2, toastMessage);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            if (redirectUri != null)
            {
                codedoutputbytebuffernano.writeString(4, redirectUri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PerformWobsActionResponse()
        {
            clear();
        }
    }

    public static final class UpdateCacheHeadRequest extends ExtendableMessageNano
    {

        public byte configurationId[];
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public HeadState state;

        private UpdateCacheHeadRequest clear()
        {
            configurationId = null;
            state = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateCacheHeadRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    configurationId = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    if (state == null)
                    {
                        state = new HeadState();
                    }
                    codedinputbytebuffernano.readMessage(state);
                    break;

                case 26: // '\032'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (configurationId != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, configurationId);
            }
            j = i;
            if (state != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, state);
            }
            i = j;
            if (renderInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderInfo);
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
            if (configurationId != null)
            {
                codedoutputbytebuffernano.writeBytes(1, configurationId);
            }
            if (state != null)
            {
                codedoutputbytebuffernano.writeMessage(2, state);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, renderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateCacheHeadRequest()
        {
            clear();
        }
    }

    public static final class UpdateCacheHeadResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance changedWob[];
        public Boolean isIncremental;
        public String removedWobId[];
        public HeadState state;

        private UpdateCacheHeadResponse clear()
        {
            state = null;
            changedWob = com.google.wallet.proto.NanoWalletObjects.WobInstance.emptyArray();
            removedWobId = WireFormatNano.EMPTY_STRING_ARRAY;
            isIncremental = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateCacheHeadResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (state == null)
                    {
                        state = new HeadState();
                    }
                    codedinputbytebuffernano.readMessage(state);
                    break;

                case 18: // '\022'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[];
                    int j;
                    if (changedWob == null)
                    {
                        j = 0;
                    } else
                    {
                        j = changedWob.length;
                    }
                    awobinstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(changedWob, 0, awobinstance, 0, j);
                        l = j;
                    }
                    for (; l < awobinstance.length - 1; l++)
                    {
                        awobinstance[l] = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                        codedinputbytebuffernano.readMessage(awobinstance[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    awobinstance[l] = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    codedinputbytebuffernano.readMessage(awobinstance[l]);
                    changedWob = awobinstance;
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    String as[];
                    int k;
                    if (removedWobId == null)
                    {
                        k = 0;
                    } else
                    {
                        k = removedWobId.length;
                    }
                    as = new String[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(removedWobId, 0, as, 0, k);
                        i1 = k;
                    }
                    for (; i1 < as.length - 1; i1++)
                    {
                        as[i1] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[i1] = codedinputbytebuffernano.readString();
                    removedWobId = as;
                    break;

                case 32: // ' '
                    isIncremental = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 42: // '*'
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
            if (state != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, state);
            }
            j = i;
            if (changedWob != null)
            {
                j = i;
                if (changedWob.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= changedWob.length)
                        {
                            break;
                        }
                        com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = changedWob[k];
                        j = i;
                        if (wobinstance != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, wobinstance);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (removedWobId != null)
            {
                i = j;
                if (removedWobId.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (i = 0; i < removedWobId.length;)
                    {
                        String s = removedWobId[i];
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
            if (isIncremental != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(4, isIncremental.booleanValue());
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, callError);
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
            if (state != null)
            {
                codedoutputbytebuffernano.writeMessage(1, state);
            }
            if (changedWob != null && changedWob.length > 0)
            {
                for (int i = 0; i < changedWob.length; i++)
                {
                    com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = changedWob[i];
                    if (wobinstance != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, wobinstance);
                    }
                }

            }
            if (removedWobId != null && removedWobId.length > 0)
            {
                for (int j = 0; j < removedWobId.length; j++)
                {
                    String s = removedWobId[j];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            if (isIncremental != null)
            {
                codedoutputbytebuffernano.writeBool(4, isIncremental.booleanValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(5, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateCacheHeadResponse()
        {
            clear();
        }
    }

    public static final class UpdateInstanceNotificationSettingsRequest extends ExtendableMessageNano
    {

        public Long holderVersion;
        public String instanceId;
        public Long instanceVersion;
        public com.google.wallet.proto.NanoWalletObjects.WobNotificationSettings notificationSettings;

        private UpdateInstanceNotificationSettingsRequest clear()
        {
            instanceId = null;
            instanceVersion = null;
            holderVersion = null;
            notificationSettings = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateInstanceNotificationSettingsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    instanceId = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    instanceVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 24: // '\030'
                    holderVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 34: // '"'
                    if (notificationSettings == null)
                    {
                        notificationSettings = new com.google.wallet.proto.NanoWalletObjects.WobNotificationSettings();
                    }
                    codedinputbytebuffernano.readMessage(notificationSettings);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (instanceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, instanceId);
            }
            j = i;
            if (instanceVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, instanceVersion.longValue());
            }
            i = j;
            if (holderVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, holderVersion.longValue());
            }
            j = i;
            if (notificationSettings != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, notificationSettings);
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
            if (instanceId != null)
            {
                codedoutputbytebuffernano.writeString(1, instanceId);
            }
            if (instanceVersion != null)
            {
                codedoutputbytebuffernano.writeInt64(2, instanceVersion.longValue());
            }
            if (holderVersion != null)
            {
                codedoutputbytebuffernano.writeInt64(3, holderVersion.longValue());
            }
            if (notificationSettings != null)
            {
                codedoutputbytebuffernano.writeMessage(4, notificationSettings);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateInstanceNotificationSettingsRequest()
        {
            clear();
        }
    }

    public static final class UpdateInstanceNotificationSettingsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;

        private UpdateInstanceNotificationSettingsResponse clear()
        {
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateInstanceNotificationSettingsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, callError);
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
                codedoutputbytebuffernano.writeMessage(1, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UpdateInstanceNotificationSettingsResponse()
        {
            clear();
        }
    }

}
