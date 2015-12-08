// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoCompiledWobl

public static final class clear extends ExtendableMessageNano
{

    public Integer blue;
    public Integer green;
    public Integer red;

    private clear clear()
    {
        red = null;
        green = null;
        blue = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private no mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                red = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 16: // '\020'
                green = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 24: // '\030'
                blue = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (red != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, red.intValue());
        }
        j = i;
        if (green != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, green.intValue());
        }
        i = j;
        if (blue != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, blue.intValue());
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
        if (red != null)
        {
            codedoutputbytebuffernano.writeInt32(1, red.intValue());
        }
        if (green != null)
        {
            codedoutputbytebuffernano.writeInt32(2, green.intValue());
        }
        if (blue != null)
        {
            codedoutputbytebuffernano.writeInt32(3, blue.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ano()
    {
        clear();
    }
}
