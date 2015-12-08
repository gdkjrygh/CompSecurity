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
//            NanoWalletAnalytics

public static final class clear extends ExtendableMessageNano
{

    public sCustomDimension sessionScopedCustomDimension[];

    private clear clear()
    {
        sessionScopedCustomDimension = sCustomDimension.emptyArray();
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
                sCustomDimension ascustomdimension[];
                int j;
                if (sessionScopedCustomDimension == null)
                {
                    j = 0;
                } else
                {
                    j = sessionScopedCustomDimension.length;
                }
                ascustomdimension = new sCustomDimension[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(sessionScopedCustomDimension, 0, ascustomdimension, 0, j);
                    k = j;
                }
                for (; k < ascustomdimension.length - 1; k++)
                {
                    ascustomdimension[k] = new sCustomDimension();
                    codedinputbytebuffernano.readMessage(ascustomdimension[k]);
                    codedinputbytebuffernano.readTag();
                }

                ascustomdimension[k] = new sCustomDimension();
                codedinputbytebuffernano.readMessage(ascustomdimension[k]);
                sessionScopedCustomDimension = ascustomdimension;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (sessionScopedCustomDimension != null)
        {
            k = i;
            if (sessionScopedCustomDimension.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= sessionScopedCustomDimension.length)
                    {
                        break;
                    }
                    sCustomDimension scustomdimension = sessionScopedCustomDimension[j];
                    k = i;
                    if (scustomdimension != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, scustomdimension);
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
        if (sessionScopedCustomDimension != null && sessionScopedCustomDimension.length > 0)
        {
            for (int i = 0; i < sessionScopedCustomDimension.length; i++)
            {
                sCustomDimension scustomdimension = sessionScopedCustomDimension[i];
                if (scustomdimension != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, scustomdimension);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public sCustomDimension()
    {
        clear();
    }
}
