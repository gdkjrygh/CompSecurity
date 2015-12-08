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

    public positiveDismissal neutralDismissal;
    public positiveDismissal positiveDismissal;
    public positiveDismissal reason[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (reason != null)
        {
            j = i;
            if (reason.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= reason.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = reason[k];
                    j = i;
                    if (cachedsize != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, cachedsize);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (neutralDismissal != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(4, neutralDismissal);
        }
        j = i;
        if (positiveDismissal != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(5, positiveDismissal);
        }
        return j;
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

            case 18: // '\022'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                positiveDismissal apositivedismissal[];
                int j;
                if (reason == null)
                {
                    j = 0;
                } else
                {
                    j = reason.length;
                }
                apositivedismissal = new reason[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(reason, 0, apositivedismissal, 0, j);
                    k = j;
                }
                for (; k < apositivedismissal.length - 1; k++)
                {
                    apositivedismissal[k] = new reason();
                    codedinputbytebuffernano.readMessage(apositivedismissal[k]);
                    codedinputbytebuffernano.readTag();
                }

                apositivedismissal[k] = new reason();
                codedinputbytebuffernano.readMessage(apositivedismissal[k]);
                reason = apositivedismissal;
                break;

            case 34: // '"'
                if (neutralDismissal == null)
                {
                    neutralDismissal = new neutralDismissal();
                }
                codedinputbytebuffernano.readMessage(neutralDismissal);
                break;

            case 42: // '*'
                if (positiveDismissal == null)
                {
                    positiveDismissal = new positiveDismissal();
                }
                codedinputbytebuffernano.readMessage(positiveDismissal);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (reason != null && reason.length > 0)
        {
            for (int i = 0; i < reason.length; i++)
            {
                positiveDismissal positivedismissal = reason[i];
                if (positivedismissal != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, positivedismissal);
                }
            }

        }
        if (neutralDismissal != null)
        {
            codedoutputbytebuffernano.writeMessage(4, neutralDismissal);
        }
        if (positiveDismissal != null)
        {
            codedoutputbytebuffernano.writeMessage(5, positiveDismissal);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        neutralDismissal = null;
        positiveDismissal = null;
        reason = reason();
        cachedSize = -1;
    }
}
