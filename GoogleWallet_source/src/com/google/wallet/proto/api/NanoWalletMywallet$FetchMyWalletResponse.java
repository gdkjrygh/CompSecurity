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
//            NanoWalletMywallet

public static final class clear extends ExtendableMessageNano
{

    public tileGroups tileGroups[];

    private clear clear()
    {
        tileGroups = rray();
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
                if (tileGroups == null)
                {
                    j = 0;
                } else
                {
                    j = tileGroups.length;
                }
                acachedsize = new tileGroups[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(tileGroups, 0, acachedsize, 0, j);
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
                tileGroups = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (tileGroups != null)
        {
            k = i;
            if (tileGroups.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= tileGroups.length)
                    {
                        break;
                    }
                    tileGroups tilegroups = tileGroups[j];
                    k = i;
                    if (tilegroups != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, tilegroups);
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
        if (tileGroups != null && tileGroups.length > 0)
        {
            for (int i = 0; i < tileGroups.length; i++)
            {
                mergeFrom mergefrom = tileGroups[i];
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
