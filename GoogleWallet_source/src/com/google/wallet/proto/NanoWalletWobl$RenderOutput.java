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
//            NanoWalletWobl

public static final class clear extends ExtendableMessageNano
{

    public To layouts[];

    private clear clear()
    {
        layouts = rray();
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
                cachedSize acachedsize[];
                int j;
                if (layouts == null)
                {
                    j = 0;
                } else
                {
                    j = layouts.length;
                }
                acachedsize = new layouts[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(layouts, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new ();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new ();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                layouts = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (layouts != null)
        {
            k = i;
            if (layouts.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= layouts.length)
                    {
                        break;
                    }
                    layouts layouts1 = layouts[j];
                    k = i;
                    if (layouts1 != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, layouts1);
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
        if (layouts != null && layouts.length > 0)
        {
            for (int i = 0; i < layouts.length; i++)
            {
                mergeFrom mergefrom = layouts[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public _cls9()
    {
        clear();
    }
}
