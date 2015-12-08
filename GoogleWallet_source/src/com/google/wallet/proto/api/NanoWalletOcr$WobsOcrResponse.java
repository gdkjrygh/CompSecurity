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
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    public o debugResponseInfo;
    public ce recognizedInstance[];

    private clear clear()
    {
        recognizedInstance = ce.emptyArray();
        debugResponseInfo = null;
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
                ce ace[];
                int j;
                if (recognizedInstance == null)
                {
                    j = 0;
                } else
                {
                    j = recognizedInstance.length;
                }
                ace = new ce[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(recognizedInstance, 0, ace, 0, j);
                    k = j;
                }
                for (; k < ace.length - 1; k++)
                {
                    ace[k] = new ce();
                    codedinputbytebuffernano.readMessage(ace[k]);
                    codedinputbytebuffernano.readTag();
                }

                ace[k] = new ce();
                codedinputbytebuffernano.readMessage(ace[k]);
                recognizedInstance = ace;
                break;

            case 18: // '\022'
                if (debugResponseInfo == null)
                {
                    debugResponseInfo = new o();
                }
                codedinputbytebuffernano.readMessage(debugResponseInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (recognizedInstance != null)
        {
            j = i;
            if (recognizedInstance.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= recognizedInstance.length)
                    {
                        break;
                    }
                    ce ce = recognizedInstance[k];
                    j = i;
                    if (ce != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, ce);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (debugResponseInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, debugResponseInfo);
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
        if (recognizedInstance != null && recognizedInstance.length > 0)
        {
            for (int i = 0; i < recognizedInstance.length; i++)
            {
                ce ce = recognizedInstance[i];
                if (ce != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, ce);
                }
            }

        }
        if (debugResponseInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, debugResponseInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ce()
    {
        clear();
    }
}
