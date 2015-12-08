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

    public  action[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (action != null)
        {
            k = i;
            if (action.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= action.length)
                    {
                        break;
                    }
                      = action[j];
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
                 a[];
                int j;
                if (action == null)
                {
                    j = 0;
                } else
                {
                    j = action.length;
                }
                a = new [k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(action, 0, a, 0, j);
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
                action = a;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (action != null && action.length > 0)
        {
            for (int i = 0; i < action.length; i++)
            {
                  = action[i];
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
        action = .emptyArray();
        cachedSize = -1;
    }
}
