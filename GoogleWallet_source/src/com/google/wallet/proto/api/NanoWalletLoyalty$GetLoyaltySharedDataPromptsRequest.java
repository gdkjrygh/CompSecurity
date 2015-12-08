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

    public int sharedDataIds[];

    private clear clear()
    {
        sharedDataIds = WireFormatNano.EMPTY_INT_ARRAY;
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

            case 8: // '\b'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
                int ai[];
                int j;
                if (sharedDataIds == null)
                {
                    j = 0;
                } else
                {
                    j = sharedDataIds.length;
                }
                ai = new int[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(sharedDataIds, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = codedinputbytebuffernano.readInt32();
                    codedinputbytebuffernano.readTag();
                }

                ai[l] = codedinputbytebuffernano.readInt32();
                sharedDataIds = ai;
                break;

            case 10: // '\n'
                int j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int i1 = 0;
                int k = codedinputbytebuffernano.getPosition();
                while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                {
                    codedinputbytebuffernano.readInt32();
                    i1++;
                }
                codedinputbytebuffernano.rewindToPosition(k);
                int ai1[];
                if (sharedDataIds == null)
                {
                    k = 0;
                } else
                {
                    k = sharedDataIds.length;
                }
                ai1 = new int[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(sharedDataIds, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = codedinputbytebuffernano.readInt32();
                }

                sharedDataIds = ai1;
                codedinputbytebuffernano.popLimit(j1);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if (sharedDataIds != null)
        {
            i = k;
            if (sharedDataIds.length > 0)
            {
                int j = 0;
                for (i = 0; i < sharedDataIds.length; i++)
                {
                    j += CodedOutputByteBufferNano.computeInt32SizeNoTag(sharedDataIds[i]);
                }

                i = k + j + sharedDataIds.length * 1;
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
        if (sharedDataIds != null && sharedDataIds.length > 0)
        {
            for (int i = 0; i < sharedDataIds.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(1, sharedDataIds[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
