// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    public content content[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (content != null)
        {
            k = i;
            if (content.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= content.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = content[j];
                    k = i;
                    if (cachedsize != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, cachedsize);
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
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                content acontent[];
                int j;
                if (content == null)
                {
                    j = 0;
                } else
                {
                    j = content.length;
                }
                acontent = new content[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(content, 0, acontent, 0, j);
                    k = j;
                }
                for (; k < acontent.length - 1; k++)
                {
                    acontent[k] = new content();
                    codedinputbytebuffernano.readMessage(acontent[k]);
                    codedinputbytebuffernano.readTag();
                }

                acontent[k] = new content();
                codedinputbytebuffernano.readMessage(acontent[k]);
                content = acontent;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (content != null && content.length > 0)
        {
            for (int i = 0; i < content.length; i++)
            {
                content content1 = content[i];
                if (content1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, content1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        content = content();
        cachedSize = -1;
    }
}
