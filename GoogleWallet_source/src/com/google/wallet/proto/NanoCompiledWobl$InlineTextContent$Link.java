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
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    public text tapUri[];
    public String text;
    public text textStyleAttributes;

    private clear clear()
    {
        textStyleAttributes = null;
        tapUri = tapUri();
        text = null;
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
                if (textStyleAttributes == null)
                {
                    textStyleAttributes = new it>();
                }
                codedinputbytebuffernano.readMessage(textStyleAttributes);
                break;

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                cachedSize acachedsize[];
                int j;
                if (tapUri == null)
                {
                    j = 0;
                } else
                {
                    j = tapUri.length;
                }
                acachedsize = new tapUri[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(tapUri, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new tapUri();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new tapUri();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                tapUri = acachedsize;
                break;

            case 26: // '\032'
                text = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (textStyleAttributes != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, textStyleAttributes);
        }
        j = i;
        if (tapUri != null)
        {
            j = i;
            if (tapUri.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= tapUri.length)
                    {
                        break;
                    }
                    text text1 = tapUri[k];
                    j = i;
                    if (text1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, text1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (text != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, text);
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
        if (textStyleAttributes != null)
        {
            codedoutputbytebuffernano.writeMessage(1, textStyleAttributes);
        }
        if (tapUri != null && tapUri.length > 0)
        {
            for (int i = 0; i < tapUri.length; i++)
            {
                mergeFrom mergefrom = tapUri[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
                }
            }

        }
        if (text != null)
        {
            codedoutputbytebuffernano.writeString(3, text);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
