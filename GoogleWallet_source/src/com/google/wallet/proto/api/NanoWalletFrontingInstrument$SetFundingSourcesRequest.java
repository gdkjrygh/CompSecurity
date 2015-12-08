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
//            NanoWalletFrontingInstrument

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.est.backingInstrumentIds backingInstrumentIds[];

    private clear clear()
    {
        backingInstrumentIds = com.google.wallet.proto.est.backingInstrumentIds();
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                com.google.wallet.proto.est aest[];
                int j;
                if (backingInstrumentIds == null)
                {
                    j = 0;
                } else
                {
                    j = backingInstrumentIds.length;
                }
                aest = new com.google.wallet.proto.est.backingInstrumentIds[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(backingInstrumentIds, 0, aest, 0, j);
                    k = j;
                }
                for (; k < aest.length - 1; k++)
                {
                    aest[k] = new com.google.wallet.proto.est.backingInstrumentIds();
                    codedinputbytebuffernano.readMessage(aest[k]);
                    codedinputbytebuffernano.readTag();
                }

                aest[k] = new com.google.wallet.proto.est.backingInstrumentIds();
                codedinputbytebuffernano.readMessage(aest[k]);
                backingInstrumentIds = aest;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (backingInstrumentIds != null)
        {
            k = i;
            if (backingInstrumentIds.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= backingInstrumentIds.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.est est = backingInstrumentIds[j];
                    k = i;
                    if (est != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, est);
                    }
                    j++;
                    i = k;
                } while (true);
            }
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
        if (backingInstrumentIds != null && backingInstrumentIds.length > 0)
        {
            for (int i = 0; i < backingInstrumentIds.length; i++)
            {
                com.google.wallet.proto.est est = backingInstrumentIds[i];
                if (est != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, est);
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
