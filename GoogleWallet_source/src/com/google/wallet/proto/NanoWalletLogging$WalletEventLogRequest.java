// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public Long clientRequestTimeMicros;
    public walletEventLogs deviceContext;
    public walletEventLogs walletContext;
    public walletEventLogs walletEventLogs[];

    private clear clear()
    {
        clientRequestTimeMicros = null;
        deviceContext = null;
        walletContext = null;
        walletEventLogs = ray();
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
                clientRequestTimeMicros = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 18: // '\022'
                if (deviceContext == null)
                {
                    deviceContext = new deviceContext();
                }
                codedinputbytebuffernano.readMessage(deviceContext);
                break;

            case 26: // '\032'
                if (walletContext == null)
                {
                    walletContext = new walletContext();
                }
                codedinputbytebuffernano.readMessage(walletContext);
                break;

            case 34: // '"'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                cachedSize acachedsize[];
                int j;
                if (walletEventLogs == null)
                {
                    j = 0;
                } else
                {
                    j = walletEventLogs.length;
                }
                acachedsize = new walletEventLogs[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(walletEventLogs, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new walletEventLogs();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new walletEventLogs();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                walletEventLogs = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (clientRequestTimeMicros != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientRequestTimeMicros.longValue());
        }
        j = i;
        if (deviceContext != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, deviceContext);
        }
        i = j;
        if (walletContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, walletContext);
        }
        int l = i;
        if (walletEventLogs != null)
        {
            l = i;
            if (walletEventLogs.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= walletEventLogs.length)
                    {
                        break;
                    }
                    walletEventLogs walleteventlogs = walletEventLogs[k];
                    l = i;
                    if (walleteventlogs != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(4, walleteventlogs);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (clientRequestTimeMicros != null)
        {
            codedoutputbytebuffernano.writeInt64(1, clientRequestTimeMicros.longValue());
        }
        if (deviceContext != null)
        {
            codedoutputbytebuffernano.writeMessage(2, deviceContext);
        }
        if (walletContext != null)
        {
            codedoutputbytebuffernano.writeMessage(3, walletContext);
        }
        if (walletEventLogs != null && walletEventLogs.length > 0)
        {
            for (int i = 0; i < walletEventLogs.length; i++)
            {
                mergeFrom mergefrom = walletEventLogs[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, mergefrom);
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
