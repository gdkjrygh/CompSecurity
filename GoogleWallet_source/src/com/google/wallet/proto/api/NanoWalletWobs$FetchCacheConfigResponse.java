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
//            NanoWalletWobs

public static final class clear extends ExtendableMessageNano
{

    public int categoryId[];
    public byte configurationId[];
    public int invalidatedCategoryId[];

    private clear clear()
    {
        configurationId = null;
        categoryId = WireFormatNano.EMPTY_INT_ARRAY;
        invalidatedCategoryId = WireFormatNano.EMPTY_INT_ARRAY;
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

    public I()
    {
        clear();
    }
}
