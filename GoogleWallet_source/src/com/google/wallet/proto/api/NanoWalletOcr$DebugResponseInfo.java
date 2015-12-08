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

    public  experimentalInstance[];

    private clear clear()
    {
        experimentalInstance = .emptyArray();
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
                 a[];
                int j;
                if (experimentalInstance == null)
                {
                    j = 0;
                } else
                {
                    j = experimentalInstance.length;
                }
                a = new [j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(experimentalInstance, 0, a, 0, j);
                    k = j;
                }
                for (; k < a.length - 1; k++)
                {
                    a[k] = new ();
                    codedinputbytebuffernano.readMessage(a[k]);
                    codedinputbytebuffernano.readTag();
                }

                a[k] = new ();
                codedinputbytebuffernano.readMessage(a[k]);
                experimentalInstance = a;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (experimentalInstance != null)
        {
            k = i;
            if (experimentalInstance.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= experimentalInstance.length)
                    {
                        break;
                    }
                      = experimentalInstance[j];
                    k = i;
                    if ( != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, );
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
        if (experimentalInstance != null && experimentalInstance.length > 0)
        {
            for (int i = 0; i < experimentalInstance.length; i++)
            {
                  = experimentalInstance[i];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, );
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
