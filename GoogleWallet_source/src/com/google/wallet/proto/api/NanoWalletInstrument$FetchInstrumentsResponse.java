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
//            NanoWalletInstrument

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.entities entities[];

    private clear clear()
    {
        entities = com.google.wallet.proto.nse.entities();
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
                com.google.wallet.proto.nse anse[];
                int j;
                if (entities == null)
                {
                    j = 0;
                } else
                {
                    j = entities.length;
                }
                anse = new com.google.wallet.proto.nse.entities[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(entities, 0, anse, 0, j);
                    k = j;
                }
                for (; k < anse.length - 1; k++)
                {
                    anse[k] = new com.google.wallet.proto.nse.entities();
                    codedinputbytebuffernano.readMessage(anse[k]);
                    codedinputbytebuffernano.readTag();
                }

                anse[k] = new com.google.wallet.proto.nse.entities();
                codedinputbytebuffernano.readMessage(anse[k]);
                entities = anse;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (entities != null)
        {
            k = i;
            if (entities.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= entities.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nse nse = entities[j];
                    k = i;
                    if (nse != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, nse);
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
        if (entities != null && entities.length > 0)
        {
            for (int i = 0; i < entities.length; i++)
            {
                com.google.wallet.proto.nse nse = entities[i];
                if (nse != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, nse);
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
