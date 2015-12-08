// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile description _emptyArray[];
    public String description;
    public boolean hasDescription;
    public description image;

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j;
label0:
        {
            j = super.computeSerializedSize();
            int i = j;
            if (image != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, image);
            }
            if (!hasDescription)
            {
                j = i;
                if (description.equals(""))
                {
                    break label0;
                }
            }
            j = i + CodedOutputByteBufferNano.computeStringSize(2, description);
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

            case 10: // '\n'
                if (image == null)
                {
                    image = new image();
                }
                codedinputbytebuffernano.readMessage(image);
                break;

            case 18: // '\022'
                description = codedinputbytebuffernano.readString();
                hasDescription = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (image != null)
        {
            codedoutputbytebuffernano.writeMessage(1, image);
        }
        if (hasDescription || !description.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, description);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        image = null;
        description = "";
        hasDescription = false;
        cachedSize = -1;
    }
}
