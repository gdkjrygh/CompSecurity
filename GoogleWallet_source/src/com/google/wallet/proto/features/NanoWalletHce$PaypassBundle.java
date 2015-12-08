// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.features:
//            NanoWalletHce

public static final class clear extends ExtendableMessageNano
{

    public nData persoData;
    public nData rotatingAtc[];

    private clear clear()
    {
        persoData = null;
        rotatingAtc = ptyArray();
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

            case 18: // '\022'
                if (persoData == null)
                {
                    persoData = new nData();
                }
                codedinputbytebuffernano.readMessage(persoData);
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                cachedSize acachedsize[];
                int j;
                if (rotatingAtc == null)
                {
                    j = 0;
                } else
                {
                    j = rotatingAtc.length;
                }
                acachedsize = new rotatingAtc[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(rotatingAtc, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new nit>();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new nit>();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                rotatingAtc = acachedsize;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (persoData != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, persoData);
        }
        int l = i;
        if (rotatingAtc != null)
        {
            l = i;
            if (rotatingAtc.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= rotatingAtc.length)
                    {
                        break;
                    }
                    rotatingAtc rotatingatc = rotatingAtc[k];
                    l = i;
                    if (rotatingatc != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, rotatingatc);
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
        if (persoData != null)
        {
            codedoutputbytebuffernano.writeMessage(2, persoData);
        }
        if (rotatingAtc != null && rotatingAtc.length > 0)
        {
            for (int i = 0; i < rotatingAtc.length; i++)
            {
                mergeFrom mergefrom = rotatingAtc[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, mergefrom);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public nData()
    {
        clear();
    }
}
