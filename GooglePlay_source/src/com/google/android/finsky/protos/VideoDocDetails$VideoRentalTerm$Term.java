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
//            VideoDocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile body _emptyArray[];
    public String body;
    public boolean hasBody;
    public boolean hasHeader;
    public String header;

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
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasHeader)
            {
                i = j;
                if (header.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(5, header);
        }
        int k;
label1:
        {
            if (!hasBody)
            {
                k = i;
                if (body.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(6, body);
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

            case 42: // '*'
                header = codedinputbytebuffernano.readString();
                hasHeader = true;
                break;

            case 50: // '2'
                body = codedinputbytebuffernano.readString();
                hasBody = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasHeader || !header.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, header);
        }
        if (hasBody || !body.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, body);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        header = "";
        hasHeader = false;
        body = "";
        hasBody = false;
        cachedSize = -1;
    }
}
