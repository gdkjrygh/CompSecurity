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
//            NanoWalletAddress

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.nse.legalAddressId addresses[];
    public com.google.wallet.proto.nse.legalAddressId legalAddressId;

    private clear clear()
    {
        addresses = com.google.wallet.proto.nse.addresses();
        legalAddressId = null;
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
                if (addresses == null)
                {
                    j = 0;
                } else
                {
                    j = addresses.length;
                }
                anse = new com.google.wallet.proto.nse.addresses[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(addresses, 0, anse, 0, j);
                    k = j;
                }
                for (; k < anse.length - 1; k++)
                {
                    anse[k] = new com.google.wallet.proto.nse.addresses();
                    codedinputbytebuffernano.readMessage(anse[k]);
                    codedinputbytebuffernano.readTag();
                }

                anse[k] = new com.google.wallet.proto.nse.addresses();
                codedinputbytebuffernano.readMessage(anse[k]);
                addresses = anse;
                break;

            case 18: // '\022'
                if (legalAddressId == null)
                {
                    legalAddressId = new com.google.wallet.proto.nse.legalAddressId();
                }
                codedinputbytebuffernano.readMessage(legalAddressId);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (addresses != null)
        {
            j = i;
            if (addresses.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= addresses.length)
                    {
                        break;
                    }
                    com.google.wallet.proto.nse nse = addresses[k];
                    j = i;
                    if (nse != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, nse);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (legalAddressId != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, legalAddressId);
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
        if (addresses != null && addresses.length > 0)
        {
            for (int i = 0; i < addresses.length; i++)
            {
                com.google.wallet.proto.nse nse = addresses[i];
                if (nse != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, nse);
                }
            }

        }
        if (legalAddressId != null)
        {
            codedoutputbytebuffernano.writeMessage(2, legalAddressId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
