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
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    private static volatile link _emptyArray[];
    public boolean hasTitle;
    public link link;
    public String title;

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
            if (!hasTitle)
            {
                i = j;
                if (title.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        int k = i;
        if (link != null)
        {
            k = i + CodedOutputByteBufferNano.computeMessageSize(2, link);
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
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 18: // '\022'
                if (link == null)
                {
                    link = new t>();
                }
                codedinputbytebuffernano.readMessage(link);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, title);
        }
        if (link != null)
        {
            codedoutputbytebuffernano.writeMessage(2, link);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        title = "";
        hasTitle = false;
        link = null;
        cachedSize = -1;
    }
}
