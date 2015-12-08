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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public Float accuracy;
    public Double latitude;
    public Double longitude;

    private clear clear()
    {
        latitude = null;
        longitude = null;
        accuracy = null;
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

            case 9: // '\t'
                latitude = Double.valueOf(codedinputbytebuffernano.readDouble());
                break;

            case 17: // '\021'
                longitude = Double.valueOf(codedinputbytebuffernano.readDouble());
                break;

            case 29: // '\035'
                accuracy = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (latitude != null)
        {
            i = j + CodedOutputByteBufferNano.computeDoubleSize(1, latitude.doubleValue());
        }
        j = i;
        if (longitude != null)
        {
            j = i + CodedOutputByteBufferNano.computeDoubleSize(2, longitude.doubleValue());
        }
        i = j;
        if (accuracy != null)
        {
            i = j + CodedOutputByteBufferNano.computeFloatSize(3, accuracy.floatValue());
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
        if (latitude != null)
        {
            codedoutputbytebuffernano.writeDouble(1, latitude.doubleValue());
        }
        if (longitude != null)
        {
            codedoutputbytebuffernano.writeDouble(2, longitude.doubleValue());
        }
        if (accuracy != null)
        {
            codedoutputbytebuffernano.writeFloat(3, accuracy.floatValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        clear();
    }
}
