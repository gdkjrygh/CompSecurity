// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.features;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.features:
//            NanoWalletHce

public static final class clear extends ExtendableMessageNano
{

    public byte ivcvc3Track1[];
    public byte ivcvc3Track2[];
    public byte kdcvc3[];

    private clear clear()
    {
        kdcvc3 = null;
        ivcvc3Track1 = null;
        ivcvc3Track2 = null;
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
                kdcvc3 = codedinputbytebuffernano.readBytes();
                break;

            case 26: // '\032'
                ivcvc3Track1 = codedinputbytebuffernano.readBytes();
                break;

            case 34: // '"'
                ivcvc3Track2 = codedinputbytebuffernano.readBytes();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (kdcvc3 != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(2, kdcvc3);
        }
        j = i;
        if (ivcvc3Track1 != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(3, ivcvc3Track1);
        }
        i = j;
        if (ivcvc3Track2 != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(4, ivcvc3Track2);
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
        if (kdcvc3 != null)
        {
            codedoutputbytebuffernano.writeBytes(2, kdcvc3);
        }
        if (ivcvc3Track1 != null)
        {
            codedoutputbytebuffernano.writeBytes(3, ivcvc3Track1);
        }
        if (ivcvc3Track2 != null)
        {
            codedoutputbytebuffernano.writeBytes(4, ivcvc3Track2);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
