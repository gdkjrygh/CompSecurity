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

    public com.google.wallet.proto.nse.callError callError;
    public com.google.wallet.proto.nse.callError wob[];

    private clear clear()
    {
        wob = com.google.wallet.proto.tyArray();
        callError = null;
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
                if (wob == null)
                {
                    j = 0;
                } else
                {
                    j = wob.length;
                }
                anse = new com.google.wallet.proto.nse.wob[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(wob, 0, anse, 0, j);
                    k = j;
                }
                for (; k < anse.length - 1; k++)
                {
                    anse[k] = new com.google.wallet.proto.it>();
                    codedinputbytebuffernano.readMessage(anse[k]);
                    codedinputbytebuffernano.readTag();
                }

                anse[k] = new com.google.wallet.proto.it>();
                codedinputbytebuffernano.readMessage(anse[k]);
                wob = anse;
                break;

            case 18: // '\022'
                if (callError == null)
                {
                    callError = new com.google.wallet.proto.nse.callError();
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
                    com.google.wallet.proto.nse nse = wob[k];
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
                com.google.wallet.proto.nse nse = wob[i];
                if (nse != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, nse);
                }
            }

        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
