// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    public Integer height;
    public Integer width;
    public Integer x;
    public Integer y;

    private clear clear()
    {
        x = null;
        y = null;
        width = null;
        height = null;
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

            case 8: // '\b'
                x = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 16: // '\020'
                y = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 24: // '\030'
                width = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 32: // ' '
                height = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (x != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, x.intValue());
        }
        j = i;
        if (y != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, y.intValue());
        }
        i = j;
        if (width != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, width.intValue());
        }
        j = i;
        if (height != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, height.intValue());
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (x != null)
        {
            codedoutputbytebuffernano.writeInt32(1, x.intValue());
        }
        if (y != null)
        {
            codedoutputbytebuffernano.writeInt32(2, y.intValue());
        }
        if (width != null)
        {
            codedoutputbytebuffernano.writeInt32(3, width.intValue());
        }
        if (height != null)
        {
            codedoutputbytebuffernano.writeInt32(4, height.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
