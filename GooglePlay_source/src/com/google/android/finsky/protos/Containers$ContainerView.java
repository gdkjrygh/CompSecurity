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
import java.util.Arrays;

// Referenced classes of package com.google.android.finsky.protos:
//            Containers

public static final class cachedSize extends MessageNano
{

    private static volatile serverLogsCookie _emptyArray[];
    public boolean hasListUrl;
    public boolean hasSelected;
    public boolean hasServerLogsCookie;
    public boolean hasTitle;
    public String listUrl;
    public boolean selected;
    public byte serverLogsCookie[];
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
            if (!hasSelected)
            {
                i = j;
                if (!selected)
                {
                    break label0;
                }
            }
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
        }
        int k;
label1:
        {
            if (!hasTitle)
            {
                k = i;
                if (title.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
label2:
        {
            if (!hasListUrl)
            {
                i = k;
                if (listUrl.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, listUrl);
        }
label3:
        {
            if (!hasServerLogsCookie)
            {
                k = i;
                if (Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeBytesSize(4, serverLogsCookie);
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

            case 8: // '\b'
                selected = codedinputbytebuffernano.readBool();
                hasSelected = true;
                break;

            case 18: // '\022'
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 26: // '\032'
                listUrl = codedinputbytebuffernano.readString();
                hasListUrl = true;
                break;

            case 34: // '"'
                serverLogsCookie = codedinputbytebuffernano.readBytes();
                hasServerLogsCookie = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasSelected || selected)
        {
            codedoutputbytebuffernano.writeBool(1, selected);
        }
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (hasListUrl || !listUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, listUrl);
        }
        if (hasServerLogsCookie || !Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(4, serverLogsCookie);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        selected = false;
        hasSelected = false;
        title = "";
        hasTitle = false;
        listUrl = "";
        hasListUrl = false;
        serverLogsCookie = WireFormatNano.EMPTY_BYTES;
        hasServerLogsCookie = false;
        cachedSize = -1;
    }
}
