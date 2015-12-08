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
    public byte nextPageToken[];
    public com.google.wallet.proto.nse.callError wob[];

    private clear clear()
    {
        nextPageToken = null;
        wob = com.google.wallet.proto.ray();
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
                nextPageToken = codedinputbytebuffernano.readBytes();
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
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
                    anse[k] = new com.google.wallet.proto.nse.wob();
                    codedinputbytebuffernano.readMessage(anse[k]);
                    codedinputbytebuffernano.readTag();
                }

                anse[k] = new com.google.wallet.proto.();
                codedinputbytebuffernano.readMessage(anse[k]);
                wob = anse;
                break;

            case 26: // '\032'
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
                    com.google.wallet.proto.nse nse = wob[k];
                    j = i;
                    if (nse != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, nse);
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
                com.google.wallet.proto.nse nse = wob[i];
                if (nse != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, nse);
                }
            }

        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(3, callError);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
