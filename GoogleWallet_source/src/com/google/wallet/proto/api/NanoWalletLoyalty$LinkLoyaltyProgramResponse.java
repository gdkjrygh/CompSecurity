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

    public com.google.wallet.proto.nse.invalidDataIds callError;
    public int invalidDataIds[];
    public String merchantMessage;
    public com.google.wallet.proto.nse.invalidDataIds wobInstance;

    private clear clear()
    {
        merchantMessage = null;
        wobInstance = null;
        callError = null;
        invalidDataIds = WireFormatNano.EMPTY_INT_ARRAY;
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

            case 18: // '\022'
                merchantMessage = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                if (wobInstance == null)
                {
                    wobInstance = new com.google.wallet.proto.nse.wobInstance();
                }
                codedinputbytebuffernano.readMessage(wobInstance);
                break;

            case 34: // '"'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
                }
                codedinputbytebuffernano.readMessage(callError);
                break;

            case 40: // '('
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 40);
                int ai[];
                int j;
                if (invalidDataIds == null)
                {
                    j = 0;
                } else
                {
                    j = invalidDataIds.length;
                }
                ai = new int[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(invalidDataIds, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = codedinputbytebuffernano.readInt32();
                    codedinputbytebuffernano.readTag();
                }

                ai[l] = codedinputbytebuffernano.readInt32();
                invalidDataIds = ai;
                break;

            case 42: // '*'
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
                if (invalidDataIds == null)
                {
                    k = 0;
                } else
                {
                    k = invalidDataIds.length;
                }
                ai1 = new int[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(invalidDataIds, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = codedinputbytebuffernano.readInt32();
                }

                invalidDataIds = ai1;
                codedinputbytebuffernano.popLimit(j1);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (merchantMessage != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, merchantMessage);
        }
        j = i;
        if (wobInstance != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(3, wobInstance);
        }
        i = j;
        if (callError != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(4, callError);
        }
        j = i;
        if (invalidDataIds != null)
        {
            j = i;
            if (invalidDataIds.length > 0)
            {
                int k = 0;
                for (j = 0; j < invalidDataIds.length; j++)
                {
                    k += CodedOutputByteBufferNano.computeInt32SizeNoTag(invalidDataIds[j]);
                }

                j = i + k + invalidDataIds.length * 1;
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
        if (merchantMessage != null)
        {
            codedoutputbytebuffernano.writeString(2, merchantMessage);
        }
        if (wobInstance != null)
        {
            codedoutputbytebuffernano.writeMessage(3, wobInstance);
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(4, callError);
        }
        if (invalidDataIds != null && invalidDataIds.length > 0)
        {
            for (int i = 0; i < invalidDataIds.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(5, invalidDataIds[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
