// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            PlayResponse

public static final class cachedSize extends MessageNano
{

    public serverMetadata commands;
    public serverMetadata payload;
    public serverMetadata preFetch[];
    public serverMetadata serverMetadata;

    public static cachedSize parseFrom(byte abyte0[])
        throws InvalidProtocolBufferNanoException
    {
        return (cachedSize)MessageNano.mergeFrom$1ec43da(new <init>(), abyte0, abyte0.length);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (payload != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, payload);
        }
        i = j;
        if (commands != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, commands);
        }
        j = i;
        if (preFetch != null)
        {
            j = i;
            if (preFetch.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= preFetch.length)
                    {
                        break;
                    }
                    <init> <init>1 = preFetch[k];
                    j = i;
                    if (<init>1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, <init>1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (serverMetadata != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(4, serverMetadata);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (payload == null)
                {
                    payload = new payload();
                }
                codedinputbytebuffernano.readMessage(payload);
                break;

            case 18: // '\022'
                if (commands == null)
                {
                    commands = new init>();
                }
                codedinputbytebuffernano.readMessage(commands);
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                serverMetadata aservermetadata[];
                int j;
                if (preFetch == null)
                {
                    j = 0;
                } else
                {
                    j = preFetch.length;
                }
                aservermetadata = new preFetch[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(preFetch, 0, aservermetadata, 0, j);
                    k = j;
                }
                for (; k < aservermetadata.length - 1; k++)
                {
                    aservermetadata[k] = new preFetch();
                    codedinputbytebuffernano.readMessage(aservermetadata[k]);
                    codedinputbytebuffernano.readTag();
                }

                aservermetadata[k] = new preFetch();
                codedinputbytebuffernano.readMessage(aservermetadata[k]);
                preFetch = aservermetadata;
                break;

            case 34: // '"'
                if (serverMetadata == null)
                {
                    serverMetadata = new init>();
                }
                codedinputbytebuffernano.readMessage(serverMetadata);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (payload != null)
        {
            codedoutputbytebuffernano.writeMessage(1, payload);
        }
        if (commands != null)
        {
            codedoutputbytebuffernano.writeMessage(2, commands);
        }
        if (preFetch != null && preFetch.length > 0)
        {
            for (int i = 0; i < preFetch.length; i++)
            {
                serverMetadata servermetadata = preFetch[i];
                if (servermetadata != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, servermetadata);
                }
            }

        }
        if (serverMetadata != null)
        {
            codedoutputbytebuffernano.writeMessage(4, serverMetadata);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        payload = null;
        commands = null;
        preFetch = ray();
        serverMetadata = null;
        cachedSize = -1;
    }
}
