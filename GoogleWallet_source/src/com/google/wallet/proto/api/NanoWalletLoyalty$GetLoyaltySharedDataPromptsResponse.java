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
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public sharedDataPrompts sharedDataPrompts[];

    private clear clear()
    {
        sharedDataPrompts = sharedDataPrompts();
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
                if (sharedDataPrompts == null)
                {
                    j = 0;
                } else
                {
                    j = sharedDataPrompts.length;
                }
                acachedsize = new sharedDataPrompts[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(sharedDataPrompts, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new sharedDataPrompts();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new sharedDataPrompts();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                sharedDataPrompts = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (sharedDataPrompts != null)
        {
            k = i;
            if (sharedDataPrompts.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= sharedDataPrompts.length)
                    {
                        break;
                    }
                    sharedDataPrompts shareddataprompts = sharedDataPrompts[j];
                    k = i;
                    if (shareddataprompts != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, shareddataprompts);
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
        if (sharedDataPrompts != null && sharedDataPrompts.length > 0)
        {
            for (int i = 0; i < sharedDataPrompts.length; i++)
            {
                mergeFrom mergefrom = sharedDataPrompts[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
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
