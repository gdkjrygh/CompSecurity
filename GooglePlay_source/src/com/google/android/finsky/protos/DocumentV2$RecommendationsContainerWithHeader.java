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

    public secondaryFace primaryFace;
    public secondaryFace secondaryFace[];

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (primaryFace != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, primaryFace);
        }
        int l = i;
        if (secondaryFace != null)
        {
            l = i;
            if (secondaryFace.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= secondaryFace.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = secondaryFace[k];
                    l = i;
                    if (cachedsize != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, cachedsize);
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
                if (primaryFace == null)
                {
                    primaryFace = new primaryFace();
                }
                codedinputbytebuffernano.readMessage(primaryFace);
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                secondaryFace asecondaryface[];
                int j;
                if (secondaryFace == null)
                {
                    j = 0;
                } else
                {
                    j = secondaryFace.length;
                }
                asecondaryface = new secondaryFace[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(secondaryFace, 0, asecondaryface, 0, j);
                    k = j;
                }
                for (; k < asecondaryface.length - 1; k++)
                {
                    asecondaryface[k] = new secondaryFace();
                    codedinputbytebuffernano.readMessage(asecondaryface[k]);
                    codedinputbytebuffernano.readTag();
                }

                asecondaryface[k] = new secondaryFace();
                codedinputbytebuffernano.readMessage(asecondaryface[k]);
                secondaryFace = asecondaryface;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (primaryFace != null)
        {
            codedoutputbytebuffernano.writeMessage(1, primaryFace);
        }
        if (secondaryFace != null && secondaryFace.length > 0)
        {
            for (int i = 0; i < secondaryFace.length; i++)
            {
                secondaryFace secondaryface = secondaryFace[i];
                if (secondaryface != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, secondaryface);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        primaryFace = null;
        secondaryFace = secondaryFace();
        cachedSize = -1;
    }
}
