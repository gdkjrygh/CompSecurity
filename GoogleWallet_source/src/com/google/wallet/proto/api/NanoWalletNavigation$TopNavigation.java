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
//            NanoWalletNavigation

public static final class clear extends ExtendableMessageNano
{

    public p navigationGroup[];

    private clear clear()
    {
        navigationGroup = p.emptyArray();
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
                p ap[];
                int j;
                if (navigationGroup == null)
                {
                    j = 0;
                } else
                {
                    j = navigationGroup.length;
                }
                ap = new p[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(navigationGroup, 0, ap, 0, j);
                    k = j;
                }
                for (; k < ap.length - 1; k++)
                {
                    ap[k] = new p();
                    codedinputbytebuffernano.readMessage(ap[k]);
                    codedinputbytebuffernano.readTag();
                }

                ap[k] = new p();
                codedinputbytebuffernano.readMessage(ap[k]);
                navigationGroup = ap;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (navigationGroup != null)
        {
            k = i;
            if (navigationGroup.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= navigationGroup.length)
                    {
                        break;
                    }
                    p p = navigationGroup[j];
                    k = i;
                    if (p != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, p);
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
        if (navigationGroup != null && navigationGroup.length > 0)
        {
            for (int i = 0; i < navigationGroup.length; i++)
            {
                p p = navigationGroup[i];
                if (p != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, p);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public p()
    {
        clear();
    }
}
